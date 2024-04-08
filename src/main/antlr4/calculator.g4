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
infix: infix op=('*'| '/') infix  # MulDivInfix
    | infix op=('+' | '-') infix  # AddSubInfix
    | '(' infix ')'               # ParensInfix
    | atom                      # AtomInfix
    ;


// The second part of the rule is there to enforce that we cannot create an expression
// With both comma and space as separators.
prefix: op=('*' | '/') '(' prefix ( (',' prefix)+  | (prefix)+ ) ')' # MulDivPrefix
    | op=('+' | '-') '(' prefix ( (',' prefix)+  | (prefix)+) ')'    # AddSubPrefix
    | '(' prefix ')'                                                 # ParensPrefix
    | atom                                                         # AtomPrefix
    ;

postfix : '(' postfix ( (',' postfix)+  | (postfix)+ ) ')' op=('*' | '/') # MulDivPostfix
    | '(' postfix ( (',' postfix)+  | (postfix)+) ')' op=('+' | '-')      # AddSubPostfix
    | '(' postfix ')'                                                     # ParensPostfix
    | atom                                                              # AtomPostfix
    ;

// Defined to reference as constants in the Java code
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COMMA: ',';

// Can have real or imaginary numbers
atom: SUB? NUMBER? I  # ImaginaryAtom
    | SUB? NUMBER # RealAtom
    ;

I: 'i';
NUMBER:[0-9]+;
WS: [ \t\r\n]+ -> skip; // skip tabs, newlines
