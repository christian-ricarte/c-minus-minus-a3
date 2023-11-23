grammar GramaticaCMenosMenos;

raiz_programa: EOF | (declaracaoVariavel | declaracaoFunc PONTO_E_VIRGULA)*; 

// Declarações de Expressões Matemáticas 
operadoresMath: MAIS | MENOS | DIVISAO | MULT;
calcular: (NUM operadoresMath NUM PONTO_E_VIRGULA)* ;

// Declarações de Expressões Lógicas
operadoresLogicos: AND | OR | NOT;

// Declaração de Estrutura Condicional
condicional: IF PAR_E (LETRA operadoresLogicos LETRA)* PAR_D
CHAVE_E
    declaracaoVariavel
    calcular
CHAVE_D
;

// Declaração de Variáveis
declaracaoVariavel: INT LETRA IGUAL NUM PONTO_E_VIRGULA 
| STRING LETRA IGUAL LETRA PONTO_E_VIRGULA;


// Declaração de Funções
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
// Tipos primitivos
LETRA: [A-Z][a-z]* ;
NUM: [1-9][0-9]* ;
ESPACO: [ \t\r\n]+ -> skip ;




/*declaracao
    int var = num
    float var = num
    expressao var()
    INT LETRA = NUM
 */