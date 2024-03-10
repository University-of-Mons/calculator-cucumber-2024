/**
* This is a calculator grammar that demonstrates how to use the parser generator.
*/
grammar ParserCalculator;
// Parser rules
prog: (expre);
// Lexer rules
// expression
expre : expre  ('*'| '/') expre
      | expre  ('+' | '-') expre
      | NUMBER
      | '(' expre ')'
      ;
      //

NUMBER : [0-9]+ ;

WS : [ \t\n\r]+ -> skip ;