grammar GramaticaCMenosMenos;


 raiz_programa: EOF | (declaracaoVariavel | declaracaoFunc  | calcular PONTO_E_VIRGULA)*; 

// Declarações  
operadoresMath: MAIS | MENOS | DIVISAO | MULT;
operadoresLogicos: AND | OR | NOT;
operadoresRelacionais: MAIOR_QUE | MENOR_QUE | IGUAL;
calcular: (LETRA IGUAL NUM operadoresMath NUM PONTO_E_VIRGULA)* ;

condicional: IF PAR_E (LETRA operadoresRelacionais LETRA operadoresLogicos LETRA )*   PAR_D
CHAVE_E
    declaracaoVariavel
    calcular
CHAVE_D
;


declaracaoVariavel: INT LETRA IGUAL NUM PONTO_E_VIRGULA 
| STRING LETRA IGUAL LETRA PONTO_E_VIRGULA;


declaracaoFunc: FUNC LETRA PAR_E (LETRA VIRGULA LETRA)* PAR_D IGUAL
CHAVE_E
    declaracaoVariavel
    calcular
CHAVE_D
; 

// Tipos
INT:'INT | int' ESPACO ;
STRING: 'String' ESPACO ;
FUNC: ESPACO 'FUNC' ESPACO ;
// Caracteres especiais
PAR_E: '(' ; 
PAR_D: ')' ;
CHAVE_E: '{' ;
CHAVE_D: '}';
PONTO_E_VIRGULA: ';' ;
VIRGULA: ',' ;
// Operador de atribução
IGUAL: ESPACO '=' ESPACO ;
// Operadores Matemáticos
MAIS: ESPACO '+' ESPACO ;
MENOS: ESPACO '-' ESPACO ;
DIVISAO: ESPACO '/' ESPACO ;
MULT: ESPACO '*' ESPACO ; 
// Operadores lógicos
IF: 'if' ESPACO ;
AND: '&& | and' ;
OR: '|| | or' ;
NOT: '! | NOT' ;
//Operadores Relacionais
MAIOR_QUE: ESPACO '>' ESPACO ;
MENOR_QUE: ESPACO '<' ESPACO ;
// Tipos primitivos
LETRA: [A-Z][a-z]* ;
NUM: [0-9][0-9]* ;
ESPACO: [ \t\r\n]+ -> skip ;




/*declaracao
    int var = num
    float var = num
    expressao var()
    INT LETRA = NUM
 */
