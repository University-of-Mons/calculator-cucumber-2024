grammar calculator;

// Add "package back.parser;" to the generated files.
@header {
package back.parser;
}

prog: expression;

expression: infix
    | postfix
    | prefix;

imNumber: cartesian | polar | exponential;

cartesian: real=atom op=('+' | '-') im=atom? I;
polar: r=atom '*'? '(' COS '(' theta=atom ')' '+' I SIN '(' theta=atom ')' ')';
exponential: r=atom '*'? EXP '(' theta=atom I ')';

// With ANTLR, precedence is determined by the order of the rules
infix: ((MODULUS infix MODULUS) | ('modulus' '(' infix ')')) # ModulusInfix
    | imNumber                    # ImaginaryInfix
    | infix op=('*'| '/') infix   # MulDivInfix
    | infix op=('+' | '-') infix  # AddSubInfix
    | '(' infix ')'               # ParensInfix
    | imAtom                      # AtomImInfix
    | reAtom                      # AtomReInfix
    ;


// The second part of the rule is there to enforce that we cannot create an expression
// With both comma and space as separators.
prefix: ((MODULUS prefix MODULUS) | ('modulus' '(' prefix ')'))      # ModulusPrefix
    | op=('*' | '/') '(' prefix ( (',' prefix)+  | (prefix)+ ) ')'   # MulDivPrefix
    | op=('+' | '-') '(' prefix ( (',' prefix)+  | (prefix)+) ')'    # AddSubPrefix
    | '(' prefix ')'                                                 # ParensPrefix
    | imNumber                                                       # ImaginaryPrefix
    | imAtom                                                         # AtomImPrefix
    | reAtom                                                         # AtomRePrefix
    ;

postfix : ((MODULUS postfix MODULUS) | ('modulus' '(' postfix ')'))       # ModulusPostfix
    | '(' postfix ( (',' postfix)+  | (postfix)+ ) ')' op=('*' | '/')     # MulDivPostfix
    | '(' postfix ( (',' postfix)+  | (postfix)+) ')' op=('+' | '-')      # AddSubPostfix
    | '(' postfix ')'                                                     # ParensPostfix
    | imNumber                                                            # ImaginaryPostfix
    | imAtom                                                              # AtomImPostfix
    | reAtom                                                              # AtomRePostfix
    ;

// Atoms are only real numbers
atom:  SUB? val=FLOAT E SUB? NUMBER # ENotationAtom
    |  SUB? val=FLOAT               # FloatAtom
    |  SUB? NUMBER                  # IntAtom
    ;

imAtom: atom? I;
reAtom: atom;

// Defined to reference as constants in the Java code
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COMMA: ',';
MODULUS: '|';
DECIMAL: '.';
I: 'i';
E: 'E';
COS: 'cos';
SIN: 'sin';
EXP: 'exp';
NUMBER:[0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip; // skip tabs, newlines