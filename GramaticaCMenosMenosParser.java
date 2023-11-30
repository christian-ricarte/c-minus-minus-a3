// Generated from GramaticaCMenosMenos.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaCMenosMenosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PRINT=2, PAR_E=3, PAR_D=4, CHAVE_E=5, CHAVE_D=6, PONTO_E_VIRGULA=7, 
		VIRGULA=8, CRAZE=9, IGUAL=10, MAIS=11, MENOS=12, DIVISAO=13, MULT=14, 
		IF=15, MAIOR_QUE=16, MENOR_QUE=17, EQUIVALENTE=18, LETRA=19, NUM=20, ESPACO=21;
	public static final int
		RULE_raiz_programa = 0, RULE_operadoresMath = 1, RULE_operadoresRelacionais = 2, 
		RULE_expressao = 3, RULE_termo = 4, RULE_fator = 5, RULE_relacional = 6, 
		RULE_blocoComando = 7, RULE_printcomando = 8, RULE_calcular = 9, RULE_condicional = 10, 
		RULE_declaracaoPrint = 11, RULE_declaracaoVariavel = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "operadoresMath", "operadoresRelacionais", "expressao", 
			"termo", "fator", "relacional", "blocoComando", "printcomando", "calcular", 
			"condicional", "declaracaoPrint", "declaracaoVariavel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "PRINT", "PAR_E", "PAR_D", "CHAVE_E", "CHAVE_D", "PONTO_E_VIRGULA", 
			"VIRGULA", "CRAZE", "IGUAL", "MAIS", "MENOS", "DIVISAO", "MULT", "IF", 
			"MAIOR_QUE", "MENOR_QUE", "EQUIVALENTE", "LETRA", "NUM", "ESPACO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GramaticaCMenosMenos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaCMenosMenosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raiz_programaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GramaticaCMenosMenosParser.EOF, 0); }
		public List<BlocoComandoContext> blocoComando() {
			return getRuleContexts(BlocoComandoContext.class);
		}
		public BlocoComandoContext blocoComando(int i) {
			return getRuleContext(BlocoComandoContext.class,i);
		}
		public List<TerminalNode> PONTO_E_VIRGULA() { return getTokens(GramaticaCMenosMenosParser.PONTO_E_VIRGULA); }
		public TerminalNode PONTO_E_VIRGULA(int i) {
			return getToken(GramaticaCMenosMenosParser.PONTO_E_VIRGULA, i);
		}
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterRaiz_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitRaiz_programa(this);
		}
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 557062L) != 0)) {
				{
				{
				setState(26);
				blocoComando();
				setState(27);
				match(PONTO_E_VIRGULA);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadoresMathContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(GramaticaCMenosMenosParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(GramaticaCMenosMenosParser.MENOS, 0); }
		public TerminalNode DIVISAO() { return getToken(GramaticaCMenosMenosParser.DIVISAO, 0); }
		public TerminalNode MULT() { return getToken(GramaticaCMenosMenosParser.MULT, 0); }
		public OperadoresMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresMath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterOperadoresMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitOperadoresMath(this);
		}
	}

	public final OperadoresMathContext operadoresMath() throws RecognitionException {
		OperadoresMathContext _localctx = new OperadoresMathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operadoresMath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadoresRelacionaisContext extends ParserRuleContext {
		public TerminalNode MAIOR_QUE() { return getToken(GramaticaCMenosMenosParser.MAIOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(GramaticaCMenosMenosParser.MENOR_QUE, 0); }
		public TerminalNode EQUIVALENTE() { return getToken(GramaticaCMenosMenosParser.EQUIVALENTE, 0); }
		public OperadoresRelacionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresRelacionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterOperadoresRelacionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitOperadoresRelacionais(this);
		}
	}

	public final OperadoresRelacionaisContext operadoresRelacionais() throws RecognitionException {
		OperadoresRelacionaisContext _localctx = new OperadoresRelacionaisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operadoresRelacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<OperadoresMathContext> operadoresMath() {
			return getRuleContexts(OperadoresMathContext.class);
		}
		public OperadoresMathContext operadoresMath(int i) {
			return getRuleContext(OperadoresMathContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			termo();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(41);
				operadoresMath();
				setState(42);
				termo();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<OperadoresMathContext> operadoresMath() {
			return getRuleContexts(OperadoresMathContext.class);
		}
		public OperadoresMathContext operadoresMath(int i) {
			return getRuleContext(OperadoresMathContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_termo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			fator();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					operadoresMath();
					setState(51);
					fator();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GramaticaCMenosMenosParser.NUM, 0); }
		public TerminalNode LETRA() { return getToken(GramaticaCMenosMenosParser.LETRA, 0); }
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fator);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(NUM);
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(LETRA);
				}
				break;
			case PAR_E:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(PAR_E);
				setState(61);
				expressao();
				setState(62);
				match(PAR_D);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public OperadoresRelacionaisContext operadoresRelacionais() {
			return getRuleContext(OperadoresRelacionaisContext.class,0);
		}
		public TerminalNode NUM() { return getToken(GramaticaCMenosMenosParser.NUM, 0); }
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitRelacional(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relacional);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(LETRA);
				setState(67);
				operadoresRelacionais();
				setState(68);
				match(LETRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(LETRA);
				setState(71);
				operadoresRelacionais();
				setState(72);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(NUM);
				setState(75);
				operadoresRelacionais();
				setState(76);
				match(LETRA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoComandoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public CalcularContext calcular() {
			return getRuleContext(CalcularContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public DeclaracaoPrintContext declaracaoPrint() {
			return getRuleContext(DeclaracaoPrintContext.class,0);
		}
		public BlocoComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterBlocoComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitBlocoComando(this);
		}
	}

	public final BlocoComandoContext blocoComando() throws RecognitionException {
		BlocoComandoContext _localctx = new BlocoComandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blocoComando);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				declaracaoVariavel();
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				calcular();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				condicional();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				declaracaoPrint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintcomandoContext extends ParserRuleContext {
		public List<TerminalNode> CRAZE() { return getTokens(GramaticaCMenosMenosParser.CRAZE); }
		public TerminalNode CRAZE(int i) {
			return getToken(GramaticaCMenosMenosParser.CRAZE, i);
		}
		public TerminalNode LETRA() { return getToken(GramaticaCMenosMenosParser.LETRA, 0); }
		public PrintcomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printcomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterPrintcomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitPrintcomando(this);
		}
	}

	public final PrintcomandoContext printcomando() throws RecognitionException {
		PrintcomandoContext _localctx = new PrintcomandoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printcomando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(CRAZE);
			setState(87);
			match(LETRA);
			setState(88);
			match(CRAZE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcularContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(GramaticaCMenosMenosParser.LETRA, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CalcularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterCalcular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitCalcular(this);
		}
	}

	public final CalcularContext calcular() throws RecognitionException {
		CalcularContext _localctx = new CalcularContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calcular);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LETRA);
			setState(91);
			match(IGUAL);
			setState(92);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaCMenosMenosParser.IF, 0); }
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public TerminalNode CHAVE_E() { return getToken(GramaticaCMenosMenosParser.CHAVE_E, 0); }
		public BlocoComandoContext blocoComando() {
			return getRuleContext(BlocoComandoContext.class,0);
		}
		public TerminalNode CHAVE_D() { return getToken(GramaticaCMenosMenosParser.CHAVE_D, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			match(PAR_E);
			setState(96);
			relacional();
			setState(97);
			match(PAR_D);
			setState(98);
			match(CHAVE_E);
			setState(99);
			blocoComando();
			setState(100);
			match(CHAVE_D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoPrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GramaticaCMenosMenosParser.PRINT, 0); }
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public PrintcomandoContext printcomando() {
			return getRuleContext(PrintcomandoContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public DeclaracaoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterDeclaracaoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitDeclaracaoPrint(this);
		}
	}

	public final DeclaracaoPrintContext declaracaoPrint() throws RecognitionException {
		DeclaracaoPrintContext _localctx = new DeclaracaoPrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PRINT);
			setState(103);
			match(PAR_E);
			setState(104);
			printcomando();
			setState(105);
			match(PAR_D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaCMenosMenosParser.INT, 0); }
		public TerminalNode LETRA() { return getToken(GramaticaCMenosMenosParser.LETRA, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
		public TerminalNode NUM() { return getToken(GramaticaCMenosMenosParser.NUM, 0); }
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitDeclaracaoVariavel(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracaoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(INT);
			setState(108);
			match(LETRA);
			setState(109);
			match(IGUAL);
			setState(110);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u00046\b\u0004\n\u0004\f\u00049\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005A\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0002\u0001\u0000\u000b\u000e\u0001\u0000\u0010\u0012"+
		"m\u0000\u001f\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b1\u0001\u0000"+
		"\u0000\u0000\n@\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000e"+
		"T\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012Z\u0001"+
		"\u0000\u0000\u0000\u0014^\u0001\u0000\u0000\u0000\u0016f\u0001\u0000\u0000"+
		"\u0000\u0018k\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u000e\u0007\u0000"+
		"\u001b\u001c\u0005\u0007\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001a\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000"+
		"\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0007\u0000\u0000\u0000%\u0003"+
		"\u0001\u0000\u0000\u0000&\'\u0007\u0001\u0000\u0000\'\u0005\u0001\u0000"+
		"\u0000\u0000(.\u0003\b\u0004\u0000)*\u0003\u0002\u0001\u0000*+\u0003\b"+
		"\u0004\u0000+-\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/\u0007\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000017\u0003\n\u0005"+
		"\u000023\u0003\u0002\u0001\u000034\u0003\n\u0005\u000046\u0001\u0000\u0000"+
		"\u000052\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008\t\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:A\u0005\u0014\u0000\u0000;A\u0005\u0013\u0000\u0000"+
		"<=\u0005\u0003\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005\u0004\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0013\u0000\u0000CD\u0003\u0004\u0002\u0000DE\u0005\u0013\u0000"+
		"\u0000EO\u0001\u0000\u0000\u0000FG\u0005\u0013\u0000\u0000GH\u0003\u0004"+
		"\u0002\u0000HI\u0005\u0014\u0000\u0000IO\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0014\u0000\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u0013\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000"+
		"\u0000NJ\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PU\u0003\u0018"+
		"\f\u0000QU\u0003\u0012\t\u0000RU\u0003\u0014\n\u0000SU\u0003\u0016\u000b"+
		"\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000U\u000f\u0001\u0000\u0000\u0000"+
		"VW\u0005\t\u0000\u0000WX\u0005\u0013\u0000\u0000XY\u0005\t\u0000\u0000"+
		"Y\u0011\u0001\u0000\u0000\u0000Z[\u0005\u0013\u0000\u0000[\\\u0005\n\u0000"+
		"\u0000\\]\u0003\u0006\u0003\u0000]\u0013\u0001\u0000\u0000\u0000^_\u0005"+
		"\u000f\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005"+
		"\u0004\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0003\u000e\u0007\u0000"+
		"de\u0005\u0006\u0000\u0000e\u0015\u0001\u0000\u0000\u0000fg\u0005\u0002"+
		"\u0000\u0000gh\u0005\u0003\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u0004"+
		"\u0000\u0000j\u0017\u0001\u0000\u0000\u0000kl\u0005\u0001\u0000\u0000"+
		"lm\u0005\u0013\u0000\u0000mn\u0005\n\u0000\u0000no\u0005\u0014\u0000\u0000"+
		"o\u0019\u0001\u0000\u0000\u0000\u0006\u001f.7@NT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}