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
      | 'cis' '(' infix ')'                 # CisInfix
      | 'e' '(' I '*' infix ')'             # ExpInfixComplex
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

prefix :  op=('*' | '/') NUMBER ','? NUMBER 'i' # CompllexPrefix
        | Sub? NUMBER             # intPrefix
        | NUMBER ? 'i'                     # iPrefix
        | 'sqrt' '(' prefix ')'  'i'?       # sqrtPrefix
        | 'cis' '(' prefix ')'              # cisPrefix
        | 'e' '(' 'i' '*' prefix ')'        # expPrefixComplex
        | op=('*' | '/') '(' prefix  ((',')? prefix)+ ')'   # MulDivPrefix
        | op=('+' | '-') '(' prefix ((',')? prefix)+ ')'   # AddSubPrefix
        | '|'  prefix '|'                   # ModulusPrefix
        | '(' prefix ')'                    # ParensComplexPrefix
        | 'intoCartesian' '(' prefix ')'    # IntoCartesianPrefix
        | 'intoPolar' '(' prefix ')'        # IntoPolarPrefix
        | 'intoE' '(' prefix ')'            # IntoEPrefix
        ;



// postfix expression
postfix : NUMBER ','? NUMBER 'i' op=('+'|'-') # ComplexPostfix
        | SUB? NUMBER                        # intPostfix
        | (SUB? NUMBER)? 'i'                 # iPostfix
        | 'sqrt' '(' postfix ')'  'i'?       # sqrtPostfix
        | 'cis' '(' postfix ')'              # cisPostfix
        | 'e' '(' 'i' '*' postfix ')'        # expPostfixComplex
        |'(' postfix ((',')? postfix)+ ')' op=('*' | '/')     # MulDivPostfix
        | '(' postfix ((',')? postfix)+ ')' op=('+' | '-')     # AddSubPostfix
        | '|' postfix '|'                    # ModulusPostfix
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