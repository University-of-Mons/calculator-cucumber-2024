/**
* This is a calculator grammar that demonstrates how to use the parser generator.
*/
grammar ParserCalculator;
// Parser rules
prog: (expre);
// Lexer rules
// expression
expre : infix|prefix;
// infix expression
infix : infix ('*'| '/') infix
      | infix  ('+' | '-') infix
      | NUMBER
      | '(' infix ')'
      ;
// prefix expression
prefix : ('*'| '/') '(' prefix (',' prefix)+ ')'
        | ('+' | '-') '(' prefix (',' prefix)+ ')'
        | NUMBER
        ;


NUMBER : [0-9]+ ;

WS : [ \t\n\r]+ -> skip ;