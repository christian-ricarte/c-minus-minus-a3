// Generated from GramaticaCMenosMenos.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaCMenosMenosParser}.
 */
public interface GramaticaCMenosMenosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void enterRaiz_programa(GramaticaCMenosMenosParser.Raiz_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#raiz_programa}.
	 * @param ctx the parse tree
	 */
	void exitRaiz_programa(GramaticaCMenosMenosParser.Raiz_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresMath}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresMath(GramaticaCMenosMenosParser.OperadoresMathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresMath}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresMath(GramaticaCMenosMenosParser.OperadoresMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresLogicos}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresLogicos(GramaticaCMenosMenosParser.OperadoresLogicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresLogicos}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresLogicos(GramaticaCMenosMenosParser.OperadoresLogicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresRelacionais}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresRelacionais(GramaticaCMenosMenosParser.OperadoresRelacionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#operadoresRelacionais}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresRelacionais(GramaticaCMenosMenosParser.OperadoresRelacionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(GramaticaCMenosMenosParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(GramaticaCMenosMenosParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#blocoComando}.
	 * @param ctx the parse tree
	 */
	void enterBlocoComando(GramaticaCMenosMenosParser.BlocoComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#blocoComando}.
	 * @param ctx the parse tree
	 */
	void exitBlocoComando(GramaticaCMenosMenosParser.BlocoComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#calcular}.
	 * @param ctx the parse tree
	 */
	void enterCalcular(GramaticaCMenosMenosParser.CalcularContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#calcular}.
	 * @param ctx the parse tree
	 */
	void exitCalcular(GramaticaCMenosMenosParser.CalcularContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#calculo}.
	 * @param ctx the parse tree
	 */
	void enterCalculo(GramaticaCMenosMenosParser.CalculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#calculo}.
	 * @param ctx the parse tree
	 */
	void exitCalculo(GramaticaCMenosMenosParser.CalculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaCMenosMenosParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaCMenosMenosParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(GramaticaCMenosMenosParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(GramaticaCMenosMenosParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCMenosMenosParser#declaracaoFunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFunc(GramaticaCMenosMenosParser.DeclaracaoFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCMenosMenosParser#declaracaoFunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFunc(GramaticaCMenosMenosParser.DeclaracaoFuncContext ctx);
}