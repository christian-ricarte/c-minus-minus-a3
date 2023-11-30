public class StringFormat {
    String invalidOperator = "OPERADOR INVÁLIDO";

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
                return invalidOperator;
        }
    }

    public String mathExpressionFormat(String operator) {
        switch (operator) {
            case "+":
                return " MAIS ";
            case "-":
                return " MENOS ";
            case "*":
                return " VEZES ";
            case "/":
                return " DIVIDIDO POR ";
            default:
                return invalidOperator;
        }
    }
}
