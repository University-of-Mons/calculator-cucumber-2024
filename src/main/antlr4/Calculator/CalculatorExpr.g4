grammar CalculatorExpr;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : infix op=('*' | '/') infix    # MulDivInfix
      | infix op=('+' | '-') infix    # AddSubInfix
      | SUB? NUMBER                   # intInfix
      | '(' infix ')'                 # parensInfix
      ;

// prefix expression

prefix : op=('*' | '/') '(' prefix  ((',')? prefix)+ ')'   # MulDivPrefix
        | op=('+' | '-') '(' prefix ((',')? prefix)+ ')'   # AddSubPrefix
        | SUB? NUMBER                                        # intPrefix
        | '(' prefix ')'                                # parensPrefix
        ;

// postfix expression
postfix : '(' postfix ((',')? postfix)+ ')' op=('*' | '/')     # MulDivPostfix
        | '(' postfix ((',')? postfix)+ ')' op=('+' | '-')     # AddSubPostfix
        | SUB? NUMBER                                            # intPostfix
        | '(' postfix ')'                                   # parensPostfix
        ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;