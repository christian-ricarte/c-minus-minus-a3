import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends GramaticaCMenosMenosBaseListener {
    FileWriter compiledResult = null;
    Map<String, String> variableBuffer = new HashMap<String, String>();

    public Listener() {
        try {
            compiledResult = new FileWriter(new File("Result.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    // Método para validar se o conteúdo de um child não é null
    public boolean isNotNull(org.antlr.v4.runtime.tree.ParseTree child) {
        return child != null;
    }

    // Método para validar se o conteúdo de um child é igual ao valor do parâmetro
    // especificado
    public boolean isEquals(org.antlr.v4.runtime.tree.ParseTree child, String key) {
        return (child).getText().trim().equalsIgnoreCase(key);
    }

    // Método para avaliar os critérios da expressão condicional e entregar o resultado dela 
    public static Boolean conditionalExpressionEval(int operando1, int operando2, String operator) {
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

    // Método para formatar o operador de uma expressão condicional
    public static String conditionalExpressionFormat(String operator) {
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

    public static boolean isChar(String input) {
        return input.matches("[a-zA-Z]+");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            // Validar a quantidade de childs
            if (ctx.getChildCount() > 0) {
                // Estrutura condicional
                if (isEquals(ctx.getChild(0), "if")) {
                    String firstVariable = ctx.getChild(2).getChild(0).getText();
                    String secondVariable = ctx.getChild(2).getChild(2).getText();
                    String logicalOperator = ctx.getChild(2).getChild(1).getText().trim();
                    // Condição para avaliar a lógica da expressão condicional
                    if (conditionalExpressionEval(
                            // Se for um caracter, no caso, uma variável, o valor associada a ela será buscado no buffer, do contrário, caso seja um valor efetivamente, o expressão seguirá
                            isChar(firstVariable) ? Integer.parseInt(variableBuffer.get(firstVariable))
                                    : Integer.parseInt(firstVariable),
                            isChar(secondVariable) ? Integer.parseInt(variableBuffer.get(secondVariable))
                                    : Integer.parseInt(secondVariable),
                            logicalOperator)) {
                        // Cenário em que a condição seja verdadeira
                        compiledResult.write("SE " + firstVariable + " " + conditionalExpressionFormat(logicalOperator)
                                + " " + secondVariable
                                + " ENTÃO É VERDADEIRO\n");
                    } else {
                        // Cenário em que a condição seja falsa
                        compiledResult.write("SE " + firstVariable + " " + conditionalExpressionFormat(logicalOperator)
                                + " " + secondVariable
                                + " ENTÃO É FALSO\n");
                    }
                }
                // Armazenar valor da variável
                if (isNotNull(ctx.getChild(2)) && isEquals(ctx.getChild(2), "=")) {
                    variableBuffer.put(ctx.getChild(1).getText(), ctx.getChild(3).getText());
                    compiledResult.write("VARIAVEL " + ctx.getChild(1).getText().toLowerCase() + " IGUAL "
                            + ctx.getChild(3).getText() + " PONTO E VIRGULA\n");
                }

                if (isEquals(ctx.getChild(0), "FUNC")) {
                    String varfunc = ctx.getChild(1).getChild(0).getText();
                    variableBuffer.put(varfunc, varfunc);
                    int varpar = (ctx.getChildCount() - 6) / 2;
                    compiledResult.write("Parâmetros: ");
            
                    for (int i = 0; i < varpar; i++) {
                        String parametro = ctx.getChild(3 + i * 2).getChild(0).getText();
                        variableBuffer.put(parametro, "");  
                        compiledResult.write(parametro);
                        
                        if (i < varpar - 1) {
                            compiledResult.write(", ");
                        }
                    }
                }
            }
            compiledResult.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }

    /*
     * @Override
     * public void visitTerminal(TerminalNode node) {
     * try {
     * linguagemFinal.write("Entrando Terminal " + node.getText() + "\n");
     * linguagemFinal.flush();
     * } catch (IOException e) {
     * System.out.println("Erro de escrita ao arquivo");
     * e.printStackTrace();
     * }
     * }
     */

}
