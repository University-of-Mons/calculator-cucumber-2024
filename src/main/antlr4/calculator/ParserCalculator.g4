grammar ParserCalculator;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : infix ('*')? infix
      | infix ('/') infix
      | infix  ('+' | '-') infix
      | NUMBER
      | '(' infix ')'
      ;

// prefix expression

prefix : ('*' | '/') '(' prefix  ((',')? prefix)+ ')'
        | ('+' | '-') '(' prefix ((',')? prefix)+ ')'
        | NUMBER
        | '(' prefix ')'
        ;

// postfix expression
postfix : '(' postfix ((',')? postfix)+ ')' ('*' | '/')
        | '(' postfix ((',')? postfix)+ ')' ('+' | '-')
        | NUMBER
        | '(' postfix ')'
        ;

NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;