public class ChildAuxiliary {
    // Método para validar se o conteúdo de um child não é null
    public boolean isNotNull(org.antlr.v4.runtime.tree.ParseTree child) {
        return child != null;
    }

    // Método para validar se o conteúdo de um child é igual ao valor do parâmetro
    // especificado
    public boolean isEquals(org.antlr.v4.runtime.tree.ParseTree child, String key) {
        return (child).getText().trim().equalsIgnoreCase(key);
    }

    // Método para validar se é um caractere
    public boolean isChar(String input) {
        return input.matches("[a-zA-Z]+");
    }
}
