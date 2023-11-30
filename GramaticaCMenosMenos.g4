grammar GramaticaCMenosMenos;

raiz_programa:
	EOF
	| (
		declaracaoVariavel
		| calcular
		| blocoComando PONTO_E_VIRGULA
	)*;

// Declarações  
operadoresMath: MAIS | MENOS | DIVISAO | MULT;
operadoresLogicos: AND | OR | NOT;
operadoresRelacionais: MAIOR_QUE | MENOR_QUE | IGUAL;
relacional:
	LETRA operadoresRelacionais LETRA
	| relacional operadoresLogicos LETRA
	| LETRA operadoresRelacionais NUM
	| NUM operadoresRelacionais LETRA;
blocoComando: (declaracaoVariavel)*
	| (calcular)*
	| (condicional)*
	| (declaracaoPrint)*;
printcomando: CRAZE LETRA CRAZE;

calcular:
	LETRA IGUAL NUM operadoresMath NUM
	| LETRA IGUAL LETRA operadoresMath LETRA
	| LETRA IGUAL NUM operadoresMath LETRA
	| LETRA IGUAL LETRA operadoresMath NUM;

condicional:
	IF PAR_E relacional PAR_D CHAVE_E blocoComando CHAVE_D;

declaracaoPrint: PRINT PAR_E printcomando PAR_D;

declaracaoVariavel:
	INT LETRA IGUAL NUM PONTO_E_VIRGULA
	| STRING LETRA IGUAL LETRA PONTO_E_VIRGULA;

// Tipos
INT: 'INT' | 'int' ESPACO;
STRING: 'String' ESPACO;
FUNC: ESPACO 'FUNC' ESPACO;
PRINT: ESPACO 'Print' ESPACO;
// Caracteres especiais
PAR_E: '(';
PAR_D: ')';
CHAVE_E: '{';
CHAVE_D: '}';
PONTO_E_VIRGULA: ';';
VIRGULA: ',';
CRAZE: '`';
// Operador de atribução
IGUAL: ESPACO '=' ESPACO;
// Operadores Matemáticos
MAIS: ESPACO '+' ESPACO;
MENOS: ESPACO '-' ESPACO;
DIVISAO: ESPACO '/' ESPACO;
MULT: ESPACO '*' ESPACO;
// Operadores lógicos
IF: 'if' ESPACO;
AND: '&&' | 'and';
OR: '||' | 'or';
NOT: '!' | 'NOT';
//Operadores Relacionais
MAIOR_QUE: ESPACO '>' ESPACO;
MENOR_QUE: ESPACO '<' ESPACO;
// Tipos primitivos
LETRA: [a-zA-Z][a-z]*;
NUM: [0-9][0-9]*;
ESPACO: [ \t\r\n]+ -> skip;

/*declaracao
 int var = num float var = num expressao var() INT LETRA = NUM
 */