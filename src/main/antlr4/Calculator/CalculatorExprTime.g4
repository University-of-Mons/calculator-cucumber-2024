grammar CalculatorExprTime;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// members
year : DIGIT DIGIT DIGIT DIGIT
     ;
other : DIGIT DIGIT
      ;

// format

format : other ':' other ':' other (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') DIGIT)?   # TimeOnly
       | year ':' other ':' other ':' other ':' other ':' other (op=('AM' | 'PM'))? (op=('CET+' | 'CET-') DIGIT)?   # TimeDate
       ;

// infix expression

infix : infix op=('+' | '-') infix   # AddSubInfix
      | format                    # timeInfix
      | '(' infix ')'                 # parensInfix
      ;

// prefix expression

prefix : op=('+' | '-') '(' (prefix ((',')?)? prefix)+ ')'   # AddSubPrefix
        | format                                        # timePrefix
        | '(' prefix ')'                                # parensPrefix
        ;

// postfix expression
postfix : '(' (postfix ((',')?)? postfix)+ ')' op=('+' | '-')     # AddSubPostfix
        | format                                           # timePostfix
        | '(' postfix ')'                                   # parensPostfix
        ;

AM : 'AM';
PM : 'PM';
CETADD: 'CET+';
CETSUB : 'CET-';
ADD : '+';
SUB : '-';
DIGIT : [0-9] ;
WS : [ \t\n\r]+ -> skip ;