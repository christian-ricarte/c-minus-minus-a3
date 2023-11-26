import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler {
    public void compile(String filePath) {
        CharStream input = null;
        try {
            // Ler o texto a ser convertido transformando em Stream de "char"
            input = CharStreams.fromPath(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Erro de acesso ao arquivo");
            e.printStackTrace();
        }
        
        GramaticaCMenosMenosParser parser = new GramaticaCMenosMenosParser(
            new CommonTokenStream( 
                new GramaticaCMenosMenosLexer(input) // Passar as entradas lidas para o Lexer */
                ) // Passando o resultado da analise Lexica para o processador de Tokens
                ); // Passando os tokens para o parser 

        // Pegar o ponto raiz da gramatica
        GramaticaCMenosMenosParser.Raiz_programaContext tree = parser.raiz_programa();
        // Imprimir a arvore geradora do texto sendo analisado
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(
            new Listener(), // "Caminha" pela arvore disparando os metodos do Listener
            tree
         );        
    }
}
