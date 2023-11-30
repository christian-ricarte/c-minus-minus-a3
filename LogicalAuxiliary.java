import java.io.FileWriter;
import java.io.IOException;

public class LogicalAuxiliary {
    // Método para avaliar os critérios da expressão condicional e entregar o
    // resultado dela
    public Boolean conditionalExpressionEval(int operando1, int operando2, String operator) {
        switch (operator) {
            case ">":
                return operando1 > operando2;
            case "<":
                return operando1 < operando2;
            case "==":
                return operando1 == operando2;
            default:
                return null;
        }
    };

    public Integer mathExpressionEval(int operando1, int operando2, String operator) {
        switch (operator) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                return null;
        }
    };
}
