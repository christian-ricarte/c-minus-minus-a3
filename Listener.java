import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends GramaticaCMenosMenosBaseListener {
    FileWriter linguagemFinal = null;
    String ultimoNome = null;
    Map<String, String> minhasVariaveis = new HashMap<String, String>();

    public Listener() {
        try {
            linguagemFinal = new FileWriter(new File("Result.txt"));
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

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            if (ctx.getChildCount() > 0) {
                if (isEquals(ctx.getChild(0), "IF")) {
                    String var = ctx.getChild(1).getText();
                    String valor = ctx.getChild(3).getText();
                    String valorArmazenado = minhasVariaveis.get(var);
                    if (valor.trim().equalsIgnoreCase(valorArmazenado)) {
                        linguagemFinal.write(var + " " + ctx.getChild(3).getText() + "\n");
                    }

                }
                // Armazenar valor da variável
                if (isNotNull(ctx.getChild(2)) && isEquals(ctx.getChild(2), "=")) {
                    minhasVariaveis.put(ctx.getChild(1).getText(), ctx.getChild(3).getText());
                    linguagemFinal.write("VARIAVEL " + ctx.getChild(1).getText().toLowerCase() + " IGUAL "
                            + ctx.getChild(3).getText() + " PONTO E VIRGULA");
                }
            }
            linguagemFinal.flush();
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
