grammar ComplexExpr;
// Parser rules

prog : exp ;

// Lexer rules

// expression

exp : infix
    | prefix
    | postfix
    ;

// infix expression

infix : 'sqrt' '(' infix ')' '+' 'sqrt' '(' infix ')' I # SqrtComplexInfix
      | 'sqrt' '(' infix ')'                # SqrtInfix
      | (NUMBER '*')? 'cis' '(' infix ')'                 # CisInfix
      | (NUMBER '*')? 'e' '(' I '*' infix ')'             # ExpInfixComplex
      | infix op=('*' | '/') infix          # ComplexMulDivInfix
      | infix op=('+' | '-') infix       # ComplexAddSubInfix
      | '|' infix '|'                       # ModulusInfix
      | SUB? NUMBER ADD NUMBER? I    # ComplexPlusInfix
      | SUB? NUMBER SUB NUMBER? I    # ComplexMinusInfix
      | SUB? NUMBER?  I                    # ComplexIInfix
      | SUB? NUMBER                     # IntInfix
      | '(' infix ')'                         # ParensComplexInfix
      | 'intoCartesian' '(' infix ')'         # IntoCartesianInfix
      | 'intoPolar' '(' infix ')'             # IntoPolarInfix
      | 'intoE' '(' infix ')'                 # IntoExpoInfix
      ;

prefix : 'sqrt' '(' prefix ')' '+' 'sqrt' '(' prefix ')' I # SqrtComplexPrefix
        |'sqrt' '(' prefix ')'  # sqrtPrefix
        | (NUMBER '*')?'cis' '(' prefix ')'              # cisPrefix
        | (NUMBER '*')? 'e' '(' 'i' '*' prefix ')'        # expPrefixComplex
        | op=('*' | '/')    '(' prefix ((',')? prefix)+ ')' # MulDivPrefix
        | op=('+' | '-')    '(' prefix ((',')? prefix)+ ')'     # AddSubPrefix
        | '|' prefix '|'                    # ModulusPrefix
        | SUB? NUMBER ADD NUMBER? I    # ComplexPlusPrefix
        | SUB? NUMBER SUB NUMBER? I    # ComplexMinusPrefix
        | SUB? NUMBER?  I                    # ComplexIPrefix
        | SUB? NUMBER                     # intPrefix
        | '(' prefix ')'                        # ParensComplexPrefix
        | 'intoCartesian' '(' prefix ')'    # IntoCartesianPrefix
        | 'intoPolar' '(' prefix ')'        # IntoPolarPrefix
        | 'intoE' '(' prefix ')'            # IntoEPrefix
        ;


// postfix expression
postfix : 'sqrt' '(' postfix ')' '+' 'sqrt' '(' postfix ')' I # SqrtComplexPostfix
        | 'sqrt' '(' postfix ')'  'i'?       # sqrtPostfix
        | (NUMBER '*')? 'cis' '(' postfix ')'              # cisPostfix
        | (NUMBER '*')? 'e' '(' 'i' '*' postfix ')'        # expPostfixComplex
        | op=('*' | '/')    '(' postfix ((',')? postfix)+ ')' # MulDivPostfix
        | op=('+' | '-')    '(' postfix ((',')? postfix)+ ')'     # AddSubPostfix
        | '|' postfix '|'                    # ModulusPostfix
        | SUB? NUMBER ADD NUMBER? I    # ComplexPlusPostfix
        | SUB? NUMBER SUB NUMBER? I    # ComplexMinusPostfix
        | SUB? NUMBER?  I                    # ComplexIPostfix
        | SUB? NUMBER                     # intPostfix
        | '(' postfix ')'                        # ParensComplexPostfix
        | 'intoCartesian' '(' postfix ')'    # IntoCartesianPostfix
        | 'intoPolar' '(' postfix ')'        # IntoPolarPostfix
        | 'intoE' '(' postfix ')'            # IntoEPostfix
        ;


I : 'i';
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
NUMBER : ([0-9]+| 'pi') ;

WS : [ \t\n\r]+ -> skip ;