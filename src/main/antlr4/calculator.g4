grammar calculator;

// Add "package parser;" to the generated files.
@header {
package back.parser;
}

prog: expression;

expression: infix
    | postfix
    | prefix;

// With ANTLR, precedence is determined by the order of the rules
infix: ((MODULUS infix MODULUS) | ('modulus' '(' infix ')')) # ModulusInfix
    | infix op=('*'| '/') infix   # MulDivInfix
    | imaginaryAndReal            # ImaginaryInfix
    | realNumber                  # RealInfix
    | eNotation                   # ENotationInfix
    | infix op=('+' | '-') infix  # AddSubInfix
    | '(' infix ')'               # ParensInfix
    | atom                        # AtomInfix
    ;


// The second part of the rule is there to enforce that we cannot create an expression
// With both comma and space as separators.
prefix: ((MODULUS prefix MODULUS) | ('modulus' '(' prefix ')'))      # ModulusPrefix
    | op=('*' | '/') '(' prefix ( (',' prefix)+  | (prefix)+ ) ')'   # MulDivPrefix
    | op=('+' | '-') '(' prefix ( (',' prefix)+  | (prefix)+) ')'    # AddSubPrefix
    | '(' prefix ')'                                                 # ParensPrefix
    | imaginaryAndReal                                               # ImaginaryPrefix
    | realNumber                                                     # RealPrefix
    | eNotation                                                      # ENotationPrefix
    | atom                                                           # AtomPrefix
    ;

postfix : ((MODULUS postfix MODULUS) | ('modulus' '(' postfix ')')) # ModulusPostfix
    | '(' postfix ( (',' postfix)+  | (postfix)+ ) ')' op=('*' | '/') # MulDivPostfix
    | '(' postfix ( (',' postfix)+  | (postfix)+) ')' op=('+' | '-')      # AddSubPostfix
    | '(' postfix ')'                                                     # ParensPostfix
    | imaginaryAndReal                                                   # ImaginaryPostfix
    | realNumber                                                        # RealPostfix
    | eNotation                                                         # ENotationPostfix
    | atom                                                              # AtomPostfix
    ;

imaginaryAndReal: SUB? real=NUMBER op=('+' | '-') im=NUMBER? I;
realNumber: SUB? val=FLOAT;
eNotation: SUB? val=FLOAT E SUB? NUMBER;

// Defined to reference as constants in the Java code
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COMMA: ',';
MODULUS: '|';
DECIMAL: '.';

// Can have real or imaginary numbers
atom: SUB? NUMBER? I # ImaginaryAtom
    |  SUB? NUMBER   # RealAtom
    ;

I: 'i';
E: 'E';
NUMBER:[0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip; // skip tabs, newlines