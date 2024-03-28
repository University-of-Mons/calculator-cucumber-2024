grammar calculator;

// Add "package parser;" to the generated files.
@header {
package parser;
}

prog: expression;

expression: infix
    | postfix
    | prefix;

// With ANTLR, precedence is determined by the order of the rules
infix: infix '*' infix
    | infix '/' infix
    | infix '+' infix
    | infix '-' infix
    | '(' infix ')'
    | NUMBER;


// The second part of the rule is there to enforce that we cannot create an expression
// With both comma and space as separators.
prefix: ('*' | '/') '(' prefix ( (',' prefix)+  | (prefix)+ ) ')'
    | ('+' | '-') '(' prefix ( (',' prefix)+  | (prefix)+) ')'
    | '(' prefix ')'
    | NUMBER;

postfix : '(' postfix ( (',' postfix)+  | (postfix)+ ) ')' ('*' | '/')
    | '(' postfix ( (',' postfix)+  | (postfix)+) ')' ('+' | '-')
    | '(' postfix ')'
    | NUMBER;

// Defined to reference as constants in the Java code
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COMMA: ',';

NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip; // skip tabs, newlines

