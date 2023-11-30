grammar GramaticaCMenosMenos;

// Regra principal do programa
raiz_programa: (blocoComando PONTO_E_VIRGULA)* EOF;

// Declarações  
operadoresMath: MAIS | MENOS | DIVISAO | MULT;
operadoresRelacionais: MAIOR_QUE | MENOR_QUE | EQUIVALENTE;

// Expressões matemáticas
expressao: termo (operadoresMath termo)*;
termo: fator (operadoresMath fator)*;
fator: NUM | LETRA | PAR_E expressao PAR_D;

// Expressões relacionais
relacional:
	LETRA operadoresRelacionais LETRA
	| LETRA operadoresRelacionais NUM
	| NUM operadoresRelacionais LETRA;

// Blocos de comandos
blocoComando:
	declaracaoVariavel
	| calcular
	| condicional
	| repeticao
	| declaracaoPrint;

// Comando de impressão
printcomando: CRAZE LETRA CRAZE;

// Comando de cálculo
calcular: LETRA IGUAL expressao;

// Estrutura condicional
condicional: IF PAR_E relacional PAR_D CHAVE_E CHAVE_D;

// Estrutura de repetição
repeticao:
	FOR PAR_E NUM PAR_D CHAVE_E CHAVE_D;

// Comando de impressão
declaracaoPrint: PRINT PAR_E printcomando PAR_D;

// Declaração de variável
declaracaoVariavel: INT LETRA IGUAL NUM;

// Palavras-chave
FOR: 'for' ESPACO;
PRINT: 'print' ESPACO;
IF: 'if' ESPACO;

// Tipos
INT: 'INT' | 'int' ESPACO;

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
MAIOR_QUE: ESPACO '>' ESPACO;
MENOR_QUE: ESPACO '<' ESPACO;
EQUIVALENTE: ESPACO '==' ESPACO;

// Tipos primitivos
LETRA: [a-zA-Z][a-z]*;
NUM: [0-9]+;
ESPACO: [ \t\r\n]+ -> skip;