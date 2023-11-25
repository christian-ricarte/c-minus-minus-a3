import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends GramaticaCMenosMenosBaseListener{
    FileWriter linguagemFinal = null;
    String ultimoNome = null;
    Map<String, String> minhasVariaveis = new HashMap<String, String>();
    
    public Listener() {
        try {
            linguagemFinal = new FileWriter (new File("LinguagemProc.txt"));
        } catch (IOException e) {
            System.out.println("Erro de criação ao arquivo");
            e.printStackTrace();
        }
    }

    // Método para validar se o conteúdo de um child não é null
    public boolean isNotNull(org.antlr.v4.runtime.tree.ParseTree child) {
        return child != null;
    }

    // Método para validar se o conteúdo de um child é igual ao valor do parâmetro especificado
    public boolean isEquals(org.antlr.v4.runtime.tree.ParseTree child, String key) {
        return (child).getText().trim().equalsIgnoreCase(key);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        try {
            org.antlr.v4.runtime.tree.ParseTree no0 = ctx.getChild(0);             
            if(isNotNull(no0)){
                if(isEquals(no0, "Era uma vez")){
                    if(isNotNull(ctx.getChild(0)) && isNotNull(ctx.getChild(2)) && isNotNull(ctx.getChild(3))){
                        linguagemFinal.write("Era uma vez... " + ctx.getChild(1).getText() + " e " + ctx.getChild(3).getText() + "\n");
                        linguagemFinal.flush();
                    }
                }
                if(isEquals(no0, "se")){
                    String personagem = ctx.getChild(1).getChild(0).getText();
                    String valor      = ctx.getChild(1).getChild(2).getText();
                    String valorArmazenado = minhasVariaveis.get(personagem);
                    if(valor.trim().equalsIgnoreCase(valorArmazenado)){
                        linguagemFinal.write(personagem + " " + ctx.getChild(3).getText() + "\n");  
                    }
                    
                }
            }
            org.antlr.v4.runtime.tree.ParseTree no = ctx.getChild(1);
            if(isNotNull(no)){            
                if(isEquals(no, "andou")){
                    int vezes = Integer.parseInt(ctx.getChild(2).getText());                
                    for(int i=0; i < vezes; i++){
                        linguagemFinal.write(ctx.getChild(0).getText() + " andou a " + (i+1)+ "a vez\n");
                    }
                }
            }
            if(isNotNull(no)){            
                if(isEquals(no, "pesa")){
                    minhasVariaveis.put(ctx.getChild(0).getText(), ctx.getChild(2).getText());
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

    @Override
    public void visitTerminal(TerminalNode node) {       
        /* 
        try {
            //linguagemFinal.write("Entrando Terminal " + node.getText() + "\n");
            //linguagemFinal.flush();
        } catch (IOException e) {
            System.out.println("Erro de escrita ao arquivo");
            e.printStackTrace();
        }*/
    }


    
    
}
