public class StringFormat {
    // Método para formatar o operador de uma expressão condicional
    public String conditionalExpressionFormat(String operator) {
        switch (operator) {
            case ">":
                return "MAIOR QUE";
            case "<":
                return "MENOR QUE";
            case "==":
                return "FOR IGUAL A";
            default:
                return "OPERADOR INVÁLIDO";
        }
    }
}
