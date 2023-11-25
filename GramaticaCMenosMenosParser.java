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
		INT=1, STRING=2, FUNC=3, PAR_E=4, PAR_D=5, CHAVE_E=6, CHAVE_D=7, PONTO_E_VIRGULA=8, 
		VIRGULA=9, IGUAL=10, MAIS=11, MENOS=12, DIVISAO=13, MULT=14, IF=15, AND=16, 
		OR=17, NOT=18, MAIOR_QUE=19, MENOR_QUE=20, LETRA=21, NUM=22, ESPACO=23;
	public static final int
		RULE_raiz_programa = 0, RULE_operadoresMath = 1, RULE_operadoresLogicos = 2, 
		RULE_operadoresRelacionais = 3, RULE_calcular = 4, RULE_condicional = 5, 
		RULE_declaracaoVariavel = 6, RULE_declaracaoFunc = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "operadoresMath", "operadoresLogicos", "operadoresRelacionais", 
			"calcular", "condicional", "declaracaoVariavel", "declaracaoFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", null, 
			null, null, null, null, null, "'&& | and'", "'|| | or'", "'! | NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STRING", "FUNC", "PAR_E", "PAR_D", "CHAVE_E", "CHAVE_D", 
			"PONTO_E_VIRGULA", "VIRGULA", "IGUAL", "MAIS", "MENOS", "DIVISAO", "MULT", 
			"IF", "AND", "OR", "NOT", "MAIOR_QUE", "MENOR_QUE", "LETRA", "NUM", "ESPACO"
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
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public List<DeclaracaoFuncContext> declaracaoFunc() {
			return getRuleContexts(DeclaracaoFuncContext.class);
		}
		public DeclaracaoFuncContext declaracaoFunc(int i) {
			return getRuleContext(DeclaracaoFuncContext.class,i);
		}
		public List<CalcularContext> calcular() {
			return getRuleContexts(CalcularContext.class);
		}
		public CalcularContext calcular(int i) {
			return getRuleContext(CalcularContext.class,i);
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
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097422L) != 0)) {
					{
					setState(22);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case STRING:
						{
						setState(17);
						declaracaoVariavel();
						}
						break;
					case FUNC:
						{
						setState(18);
						declaracaoFunc();
						}
						break;
					case PONTO_E_VIRGULA:
					case LETRA:
						{
						setState(19);
						calcular();
						setState(20);
						match(PONTO_E_VIRGULA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(29);
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
	public static class OperadoresLogicosContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GramaticaCMenosMenosParser.AND, 0); }
		public TerminalNode OR() { return getToken(GramaticaCMenosMenosParser.OR, 0); }
		public TerminalNode NOT() { return getToken(GramaticaCMenosMenosParser.NOT, 0); }
		public OperadoresLogicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresLogicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterOperadoresLogicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitOperadoresLogicos(this);
		}
	}

	public final OperadoresLogicosContext operadoresLogicos() throws RecognitionException {
		OperadoresLogicosContext _localctx = new OperadoresLogicosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operadoresLogicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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
	public static class OperadoresRelacionaisContext extends ParserRuleContext {
		public TerminalNode MAIOR_QUE() { return getToken(GramaticaCMenosMenosParser.MAIOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(GramaticaCMenosMenosParser.MENOR_QUE, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
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
		enterRule(_localctx, 6, RULE_operadoresRelacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1573888L) != 0)) ) {
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
	public static class CalcularContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(GramaticaCMenosMenosParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(GramaticaCMenosMenosParser.IGUAL, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GramaticaCMenosMenosParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GramaticaCMenosMenosParser.NUM, i);
		}
		public List<OperadoresMathContext> operadoresMath() {
			return getRuleContexts(OperadoresMathContext.class);
		}
		public OperadoresMathContext operadoresMath(int i) {
			return getRuleContext(OperadoresMathContext.class,i);
		}
		public List<TerminalNode> PONTO_E_VIRGULA() { return getTokens(GramaticaCMenosMenosParser.PONTO_E_VIRGULA); }
		public TerminalNode PONTO_E_VIRGULA(int i) {
			return getToken(GramaticaCMenosMenosParser.PONTO_E_VIRGULA, i);
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
		enterRule(_localctx, 8, RULE_calcular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA) {
				{
				{
				setState(35);
				match(LETRA);
				setState(36);
				match(IGUAL);
				setState(37);
				match(NUM);
				setState(38);
				operadoresMath();
				setState(39);
				match(NUM);
				setState(40);
				match(PONTO_E_VIRGULA);
				}
				}
				setState(46);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaCMenosMenosParser.IF, 0); }
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public TerminalNode CHAVE_E() { return getToken(GramaticaCMenosMenosParser.CHAVE_E, 0); }
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public CalcularContext calcular() {
			return getRuleContext(CalcularContext.class,0);
		}
		public TerminalNode CHAVE_D() { return getToken(GramaticaCMenosMenosParser.CHAVE_D, 0); }
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public List<OperadoresRelacionaisContext> operadoresRelacionais() {
			return getRuleContexts(OperadoresRelacionaisContext.class);
		}
		public OperadoresRelacionaisContext operadoresRelacionais(int i) {
			return getRuleContext(OperadoresRelacionaisContext.class,i);
		}
		public List<OperadoresLogicosContext> operadoresLogicos() {
			return getRuleContexts(OperadoresLogicosContext.class);
		}
		public OperadoresLogicosContext operadoresLogicos(int i) {
			return getRuleContext(OperadoresLogicosContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF);
			setState(48);
			match(PAR_E);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA) {
				{
				{
				setState(49);
				match(LETRA);
				setState(50);
				operadoresRelacionais();
				setState(51);
				match(LETRA);
				setState(52);
				operadoresLogicos();
				setState(53);
				match(LETRA);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(PAR_D);
			setState(61);
			match(CHAVE_E);
			setState(62);
			declaracaoVariavel();
			setState(63);
			calcular();
			setState(64);
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
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaCMenosMenosParser.INT, 0); }
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
		public TerminalNode NUM() { return getToken(GramaticaCMenosMenosParser.NUM, 0); }
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaCMenosMenosParser.PONTO_E_VIRGULA, 0); }
		public TerminalNode STRING() { return getToken(GramaticaCMenosMenosParser.STRING, 0); }
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
		enterRule(_localctx, 12, RULE_declaracaoVariavel);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(INT);
				setState(67);
				match(LETRA);
				setState(68);
				match(IGUAL);
				setState(69);
				match(NUM);
				setState(70);
				match(PONTO_E_VIRGULA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(STRING);
				setState(72);
				match(LETRA);
				setState(73);
				match(IGUAL);
				setState(74);
				match(LETRA);
				setState(75);
				match(PONTO_E_VIRGULA);
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
	public static class DeclaracaoFuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GramaticaCMenosMenosParser.FUNC, 0); }
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
		public TerminalNode CHAVE_E() { return getToken(GramaticaCMenosMenosParser.CHAVE_E, 0); }
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public CalcularContext calcular() {
			return getRuleContext(CalcularContext.class,0);
		}
		public TerminalNode CHAVE_D() { return getToken(GramaticaCMenosMenosParser.CHAVE_D, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(GramaticaCMenosMenosParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(GramaticaCMenosMenosParser.VIRGULA, i);
		}
		public DeclaracaoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterDeclaracaoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitDeclaracaoFunc(this);
		}
	}

	public final DeclaracaoFuncContext declaracaoFunc() throws RecognitionException {
		DeclaracaoFuncContext _localctx = new DeclaracaoFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FUNC);
			setState(79);
			match(LETRA);
			setState(80);
			match(PAR_E);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA) {
				{
				{
				setState(81);
				match(LETRA);
				setState(82);
				match(VIRGULA);
				setState(83);
				match(LETRA);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(PAR_D);
			setState(90);
			match(IGUAL);
			setState(91);
			match(CHAVE_E);
			setState(92);
			declaracaoVariavel();
			setState(93);
			calcular();
			setState(94);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0003\u0000\u001c\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004+\b\u0004\n\u0004\f\u0004.\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006M\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007U\b\u0007\n\u0007\f\u0007X\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\u000b"+
		"\u000e\u0001\u0000\u0010\u0012\u0002\u0000\n\n\u0013\u0014`\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f"+
		"\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\n/\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000e"+
		"N\u0001\u0000\u0000\u0000\u0010\u001c\u0005\u0000\u0000\u0001\u0011\u0017"+
		"\u0003\f\u0006\u0000\u0012\u0017\u0003\u000e\u0007\u0000\u0013\u0014\u0003"+
		"\b\u0004\u0000\u0014\u0015\u0005\b\u0000\u0000\u0015\u0017\u0001\u0000"+
		"\u0000\u0000\u0016\u0011\u0001\u0000\u0000\u0000\u0016\u0012\u0001\u0000"+
		"\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000"+
		"\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001b\u0010\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000"+
		"\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0007\u0000"+
		"\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0007\u0001\u0000"+
		"\u0000 \u0005\u0001\u0000\u0000\u0000!\"\u0007\u0002\u0000\u0000\"\u0007"+
		"\u0001\u0000\u0000\u0000#$\u0005\u0015\u0000\u0000$%\u0005\n\u0000\u0000"+
		"%&\u0005\u0016\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0005\u0016\u0000"+
		"\u0000()\u0005\b\u0000\u0000)+\u0001\u0000\u0000\u0000*#\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-\t\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005"+
		"\u000f\u0000\u000009\u0005\u0004\u0000\u000012\u0005\u0015\u0000\u0000"+
		"23\u0003\u0006\u0003\u000034\u0005\u0015\u0000\u000045\u0003\u0004\u0002"+
		"\u000056\u0005\u0015\u0000\u000068\u0001\u0000\u0000\u000071\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0005\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0003\f\u0006\u0000"+
		"?@\u0003\b\u0004\u0000@A\u0005\u0007\u0000\u0000A\u000b\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0001\u0000\u0000CD\u0005\u0015\u0000\u0000DE\u0005\n\u0000"+
		"\u0000EF\u0005\u0016\u0000\u0000FM\u0005\b\u0000\u0000GH\u0005\u0002\u0000"+
		"\u0000HI\u0005\u0015\u0000\u0000IJ\u0005\n\u0000\u0000JK\u0005\u0015\u0000"+
		"\u0000KM\u0005\b\u0000\u0000LB\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0005\u0015"+
		"\u0000\u0000PV\u0005\u0004\u0000\u0000QR\u0005\u0015\u0000\u0000RS\u0005"+
		"\t\u0000\u0000SU\u0005\u0015\u0000\u0000TQ\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000"+
		"\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]\u0003\f\u0006"+
		"\u0000]^\u0003\b\u0004\u0000^_\u0005\u0007\u0000\u0000_\u000f\u0001\u0000"+
		"\u0000\u0000\u0007\u0016\u0018\u001b,9LV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}