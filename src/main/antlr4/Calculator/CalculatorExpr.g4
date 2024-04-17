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

infix : complex                       # complexInfix
      | 'sqrt' '(' SUB? NUMBER ')'         # sqrtInfix
      | infix op=('*' | '/') infix    # MulDivInfix
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
//complex expression
complex : NUMBER '+' NUMBER? 'i' # ComplexPlus
        | NUMBER '-' NUMBER? 'i' # ComplexMinus
        | NUMBER? 'i'    # ComplexI
        | '|' complex '|' # Modulus
        | complex op=('*' | '/') complex # MulDivComplex
        | complex op=('+' | '-') complex # AddSubComplex
        | '(' complex ')' # ParensComplex
        ;

MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
NUMBER : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;