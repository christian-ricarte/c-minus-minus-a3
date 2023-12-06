### Universidade Anhembi Morumbi
# Atividade A3 da Disciplina de Teoria da Computação e Compiladores
### Grupo 4:
* Abdallah Yaziji — RA 125111344827
* Alex Costa de Moura — RA 125111355243
* Christian Ricarte Rodrigues — RA 125111363064
* Gabriel José de Castro Torres — RA 125111373414
* Guilherme Parra de Oliveira — RA 125111352877
* Pedro Henrique Molonhoni Nogueira — RA 125111376138
* Vitor Rodrigues Araujo — RA 125111366015

<hr>

### C--
> Linguagem construída com base na sintaxe do C utilizando o ANTLR4 para sua confecção. Seu nome inspirado na linguagem C++, por puro entretenimento.

### Gramática:
- Declaracao de variáveis ✅
- Declaracao de Estrutura Condicional ✅
- Cálculos 
    - `+` ✅
    - `-` ✅
    - `*` ✅
    - `/` ✅
- Tipos de Dados:
    - Int ✅
- Tipos primitivos:
    - Espaco ✅
    - Letra ✅ 
    - Num ✅
- Palavras Reservadas:
    - `for` ✅
    - `print` ✅
    - `if` ✅
- Caracteres Especiais:
    - `(` ✅
    - `)` ✅
    - `{` ✅
    - `}` ✅
    - `;` ✅
    - `,` ✅
    - `+` ✅
    - `-` ✅
    - `*` ✅ 
    - `/` ✅
    - ` ✅
    - `=` ✅
    - `==` ✅
    - `>` ✅
    - `<` ✅

### Requisitos:
- Pacote do **ANTLR4** na sua versão **4.13.1** instalado e configurado no seu ambiente. O .jar está disponível em: `https://www.antlr.org/download.html`
- Estar executando em uma máquina com um sistema operacional Windows, Macosx ou qualquer distribuição do Linux.

### Instruções para Execução:
- Antes de executar o projeto, garanta que a gramática foi compilada adequadamente pelo ANTLR4 através do comando: `antlr4 GramaticaCMenosMenos.g4`
- A classe principal é a `Main`, portanto você deve realizar a inicialização a partir dela.
- O arquivo de entrada é o `Input.txt`, basta escrever as instruções de acordo com a gramática que ela será compilada e o seu resultado poderá ser visto no arquivo `Output.txt`.
- Caso queira alterar o `path` do arquivo de leitura, basta alterar o parâmetro do método `compile`, na classe `Main`.

### Caso tenha o git instalado, basta digitar o seguinte trecho no terminal clonar o repositório e conferir o projeto localmente:
`git clone https://github.com/christian-ricarte/c-minus-minus-a3.git`
