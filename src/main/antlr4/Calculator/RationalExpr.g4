grammar RationalExpr;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : infix op=(MUL | DIV) infix                          # MulDivInfix
      | infix op=(ADD | SUB) infix                          # AddSubInfix
      | rational                                            # rationalInfix
      | '(' infix ')'                                       # parensInfix
      ;

// prefix expression

prefix :  op=(MUL | DIV) '(' prefix  ((',')? prefix)+ ')'   # MulDivPrefix
        | op=(ADD | SUB) '(' prefix ((',')? prefix)+ ')'    # AddSubPrefix
        | rational                                          # rationalPrefix
        | '(' prefix ')'                                    # parensPrefix
        ;

// postfix expression
postfix : '(' postfix ((',')? postfix)+ ')' op=(MUL | DIV)  # MulDivPostfix
        | '(' postfix ((',')? postfix)+ ')' op=(ADD | SUB)  # AddSubPostfix
        | rational                                          # rationalPostfix
        | '(' postfix ')'                                   # parensPostfix
        ;

// Rational numbers

rational: SUB? NUMBER (FRAC (SUB?) NUMBER)?                 # rationalNumber
        ;

MUL : '*';
DIV : '÷';
ADD : '+';
SUB : '-';
FRAC : '/';
NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;