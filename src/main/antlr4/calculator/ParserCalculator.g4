grammar ParserCalculator;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    ;

// infix expression

infix : infix op=('*'| '/') infix   # AddSub
      | infix op=('+' | '-') infix  # MulDiv
      | NUMBER                      # Number
      | '(' infix ')'               # infix_exp
      ;

// prefix expression

prefix : op=('*'| '/') '(' prefix (',' prefix)+ ')'
       | op=('+' | '-') '(' prefix (',' prefix)+ ')'
       | NUMBER
       ;

NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;