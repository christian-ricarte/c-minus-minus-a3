grammar GramaticaCMenosMenos;

raiz_programa: (blocoComando PONTO_E_VIRGULA)* EOF;

// Declarações  
operadoresMath: MAIS | MENOS | DIVISAO | MULT;
operadoresRelacionais: MAIOR_QUE | MENOR_QUE | EQUIVALENTE;

expressao: termo (operadoresMath termo)*;
termo: fator (operadoresMath fator)*;
fator: NUM | LETRA | PAR_E expressao PAR_D;

relacional:
    LETRA operadoresRelacionais LETRA
    | LETRA operadoresRelacionais NUM
    | NUM operadoresRelacionais LETRA;

blocoComando:
    declaracaoVariavel
    | calcular
    | condicional
    | declaracaoPrint;

printcomando: CRAZE LETRA CRAZE;

calcular: LETRA IGUAL expressao;

condicional:
    IF PAR_E relacional PAR_D CHAVE_E blocoComando CHAVE_D;

declaracaoPrint: PRINT PAR_E printcomando PAR_D;

declaracaoVariavel: INT LETRA IGUAL NUM;

// Tipos
INT: 'INT' | 'int' ESPACO;
PRINT: 'print' ESPACO;
// Caracteres especiais
PAR_E: '(';
PAR_D: ')';
CHAVE_E: '{';
CHAVE_D: '}';
PONTO_E_VIRGULA: ';';
VIRGULA: ',';
CRAZE: '`';
// Operador de atribuição
IGUAL: ESPACO '=' ESPACO;
// Operadores Matemáticos
MAIS: ESPACO '+' ESPACO;
MENOS: ESPACO '-' ESPACO;
DIVISAO: ESPACO '/' ESPACO;
MULT: ESPACO '*' ESPACO;
// Operadores lógicos
IF: 'if' ESPACO;
// Operadores Relacionais
MAIOR_QUE: ESPACO '>' ESPACO;
MENOR_QUE: ESPACO '<' ESPACO;
EQUIVALENTE: ESPACO '==' ESPACO;
// Tipos primitivos
LETRA: [a-zA-Z][a-z]*;
NUM: [0-9]+;
ESPACO: [ \t\r\n]+ -> skip;
