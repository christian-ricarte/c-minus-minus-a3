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
            compiledResult = new FileWriter(new File("Output.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            // Validar a quantidade de childs
            if (ctx.getChildCount() > 0) {
                // Instância da classe que fornece os métodos auxiliares para a formatação de
                // Strings
                StringFormat stringFormat = new StringFormat();
                // Instância da classe que fornece os métodos auxiliares para a lógica da
                // gramática
                LogicalAuxiliary logicalAux = new LogicalAuxiliary();
                // Instância da classe que fornece os métodos auxiliares para a manipulação dos
                // childs
                ChildAuxiliary childAuxiliary = new ChildAuxiliary();

                // Estrutura de Repetição
                if (childAuxiliary.isEquals(ctx.getChild(0), "for")) {
                    for (int i = 1; i <= Integer.parseInt(ctx.getChild(2).getText()); i++) {
                        compiledResult.write("REPETICAO " + Integer.toString(i) + " PONTO E VIRGULA\n");
                    }
                }

                // Cálculo
                if ((ctx.getChild(0).getText().contains("+") || ctx.getChild(0).getText().contains("-")
                        || ctx.getChild(0).getText().contains("*")
                        || ctx.getChild(0).getText().contains("/")) && ctx.getChild(0).getText().contains("=")
                        && childAuxiliary.isNotNull(ctx.getChild(0))) {
                    String firstReferenceChild = ctx.getChild(0).getChild(2).getText().split("\\s+")[0];
                    String secondReferenceChild = ctx.getChild(0).getChild(2).getText().split("\\s+")[2];
                    String operator = ctx.getChild(0).getChild(2).getText().split("\\s+")[1];
                    compiledResult
                            .write("O RESULTADO DE " + firstReferenceChild + stringFormat.mathExpressionFormat(operator)
                                    + secondReferenceChild + " É " + logicalAux.mathExpressionEval(
                                            childAuxiliary.isChar(firstReferenceChild)
                                                    ? Integer.parseInt(variableBuffer.get(firstReferenceChild))
                                                    : Integer.parseInt(firstReferenceChild),
                                            childAuxiliary.isChar(secondReferenceChild)
                                                    ? Integer.parseInt(variableBuffer.get(secondReferenceChild))
                                                    : Integer.parseInt(secondReferenceChild),
                                            operator)
                                    + " PONTO E VIRGULA\n");
                }

                // Impressão
                if (childAuxiliary.isEquals(ctx.getChild(0), "print")) {
                    compiledResult.write("IMPRESSÃO DE: " + ctx.getChild(2).getText() + " PONTO E VIRGULA\n");
                }

                // Estrutura condicional
                if (childAuxiliary.isEquals(ctx.getChild(0), "if")) {
                    String firstReferenceChild = ctx.getChild(2).getChild(0).getText();
                    String secondReferenceChild = ctx.getChild(2).getChild(2).getText();
                    String logicalOperator = ctx.getChild(2).getChild(1).getText().trim();
                    // Condição para avaliar a lógica da expressão condicional
                    if (logicalAux.conditionalExpressionEval(
                            // Se for um caracter, no caso, uma variável, o valor associada a ela será
                            // buscado no buffer, do contrário, caso seja um valor efetivamente, o expressão
                            // seguirá
                            childAuxiliary.isChar(firstReferenceChild)
                                    ? Integer.parseInt(variableBuffer.get(firstReferenceChild))
                                    : Integer.parseInt(firstReferenceChild),
                            childAuxiliary.isChar(secondReferenceChild)
                                    ? Integer.parseInt(variableBuffer.get(secondReferenceChild))
                                    : Integer.parseInt(secondReferenceChild),
                            logicalOperator)) {
                        // Cenário em que a condição seja verdadeira
                        compiledResult.write(
                                "SE " + firstReferenceChild + " "
                                        + stringFormat.conditionalExpressionFormat(logicalOperator)
                                        + " " + secondReferenceChild + " ENTÃO É VERDADEIRO PONTO E VIRGULA\n");
                    } else {
                        // Cenário em que a condição seja falsa
                        compiledResult.write(
                                "SE " + firstReferenceChild + " "
                                        + stringFormat.conditionalExpressionFormat(logicalOperator)
                                        + " " + secondReferenceChild
                                        + " ENTÃO É FALSO PONTO E VIRGULA\n");
                    }
                }
                // Armazenar valor da variável
                if (childAuxiliary.isNotNull(ctx.getChild(2)) && childAuxiliary.isEquals(ctx.getChild(2), "=")) {
                    variableBuffer.put(ctx.getChild(1).getText(), ctx.getChild(3).getText());
                    compiledResult.write("VARIAVEL " + ctx.getChild(1).getText().toLowerCase() + " IGUAL "
                            + ctx.getChild(3).getText() + " PONTO E VIRGULA\n");
                }
            }
            compiledResult.flush();
        } catch (

        IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }
}
