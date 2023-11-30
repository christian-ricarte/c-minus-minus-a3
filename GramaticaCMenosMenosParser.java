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
		INT=1, STRING=2, FUNC=3, PRINT=4, PAR_E=5, PAR_D=6, CHAVE_E=7, CHAVE_D=8, 
		PONTO_E_VIRGULA=9, VIRGULA=10, CRAZE=11, IGUAL=12, MAIS=13, MENOS=14, 
		DIVISAO=15, MULT=16, IF=17, AND=18, OR=19, NOT=20, MAIOR_QUE=21, MENOR_QUE=22, 
		LETRA=23, NUM=24, ESPACO=25;
	public static final int
		RULE_raiz_programa = 0, RULE_operadoresMath = 1, RULE_operadoresLogicos = 2, 
		RULE_operadoresRelacionais = 3, RULE_relacional = 4, RULE_blocoComando = 5, 
		RULE_printcomando = 6, RULE_calcular = 7, RULE_condicional = 8, RULE_declaracaoPrint = 9, 
		RULE_declaracaoVariavel = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "operadoresMath", "operadoresLogicos", "operadoresRelacionais", 
			"relacional", "blocoComando", "printcomando", "calcular", "condicional", 
			"declaracaoPrint", "declaracaoVariavel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "STRING", "FUNC", "PRINT", "PAR_E", "PAR_D", "CHAVE_E", 
			"CHAVE_D", "PONTO_E_VIRGULA", "VIRGULA", "CRAZE", "IGUAL", "MAIS", "MENOS", 
			"DIVISAO", "MULT", "IF", "AND", "OR", "NOT", "MAIOR_QUE", "MENOR_QUE", 
			"LETRA", "NUM", "ESPACO"
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
		public List<CalcularContext> calcular() {
			return getRuleContexts(CalcularContext.class);
		}
		public CalcularContext calcular(int i) {
			return getRuleContext(CalcularContext.class,i);
		}
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
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8520214L) != 0)) {
					{
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(23);
						declaracaoVariavel();
						}
						break;
					case 2:
						{
						setState(24);
						calcular();
						}
						break;
					case 3:
						{
						setState(25);
						blocoComando();
						setState(26);
						match(PONTO_E_VIRGULA);
						}
						break;
					}
					}
					setState(32);
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
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
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
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6295552L) != 0)) ) {
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
	public static class RelacionalContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public OperadoresRelacionaisContext operadoresRelacionais() {
			return getRuleContext(OperadoresRelacionaisContext.class,0);
		}
		public TerminalNode NUM() { return getToken(GramaticaCMenosMenosParser.NUM, 0); }
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public OperadoresLogicosContext operadoresLogicos() {
			return getRuleContext(OperadoresLogicosContext.class,0);
		}
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
		return relacional(0);
	}

	private RelacionalContext relacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelacionalContext _localctx = new RelacionalContext(_ctx, _parentState);
		RelacionalContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_relacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(42);
				match(LETRA);
				setState(43);
				operadoresRelacionais();
				setState(44);
				match(LETRA);
				}
				break;
			case 2:
				{
				setState(46);
				match(LETRA);
				setState(47);
				operadoresRelacionais();
				setState(48);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(50);
				match(NUM);
				setState(51);
				operadoresRelacionais();
				setState(52);
				match(LETRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relacional);
					setState(56);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(57);
					operadoresLogicos();
					setState(58);
					match(LETRA);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoComandoContext extends ParserRuleContext {
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public List<CalcularContext> calcular() {
			return getRuleContexts(CalcularContext.class);
		}
		public CalcularContext calcular(int i) {
			return getRuleContext(CalcularContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<DeclaracaoPrintContext> declaracaoPrint() {
			return getRuleContexts(DeclaracaoPrintContext.class);
		}
		public DeclaracaoPrintContext declaracaoPrint(int i) {
			return getRuleContext(DeclaracaoPrintContext.class,i);
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
		enterRule(_localctx, 10, RULE_blocoComando);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==STRING) {
					{
					{
					setState(65);
					declaracaoVariavel();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETRA) {
					{
					{
					setState(71);
					calcular();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(77);
					condicional();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINT) {
					{
					{
					setState(83);
					declaracaoPrint();
					}
					}
					setState(88);
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
		enterRule(_localctx, 12, RULE_printcomando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CRAZE);
			setState(92);
			match(LETRA);
			setState(93);
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
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public TerminalNode IGUAL() { return getToken(GramaticaCMenosMenosParser.IGUAL, 0); }
		public List<TerminalNode> NUM() { return getTokens(GramaticaCMenosMenosParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GramaticaCMenosMenosParser.NUM, i);
		}
		public OperadoresMathContext operadoresMath() {
			return getRuleContext(OperadoresMathContext.class,0);
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
		enterRule(_localctx, 14, RULE_calcular);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(LETRA);
				setState(96);
				match(IGUAL);
				setState(97);
				match(NUM);
				setState(98);
				operadoresMath();
				setState(99);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(LETRA);
				setState(102);
				match(IGUAL);
				setState(103);
				match(LETRA);
				setState(104);
				operadoresMath();
				setState(105);
				match(LETRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(LETRA);
				setState(108);
				match(IGUAL);
				setState(109);
				match(NUM);
				setState(110);
				operadoresMath();
				setState(111);
				match(LETRA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(LETRA);
				setState(114);
				match(IGUAL);
				setState(115);
				match(LETRA);
				setState(116);
				operadoresMath();
				setState(117);
				match(NUM);
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
		enterRule(_localctx, 16, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF);
			setState(122);
			match(PAR_E);
			setState(123);
			relacional(0);
			setState(124);
			match(PAR_D);
			setState(125);
			match(CHAVE_E);
			setState(126);
			blocoComando();
			setState(127);
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
		enterRule(_localctx, 18, RULE_declaracaoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PRINT);
			setState(130);
			match(PAR_E);
			setState(131);
			printcomando();
			setState(132);
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
		enterRule(_localctx, 20, RULE_declaracaoVariavel);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(INT);
				setState(135);
				match(LETRA);
				setState(136);
				match(IGUAL);
				setState(137);
				match(NUM);
				setState(138);
				match(PONTO_E_VIRGULA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(STRING);
				setState(140);
				match(LETRA);
				setState(141);
				match(IGUAL);
				setState(142);
				match(LETRA);
				setState(143);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return relacional_sempred((RelacionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relacional_sempred(RelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000"+
		"\n\u0000\f\u0000 \t\u0000\u0003\u0000\"\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"7\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0005\u0005\u0005C\b\u0005\n"+
		"\u0005\f\u0005F\t\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005\f\u0005"+
		"L\t\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t\u0005\u0001"+
		"\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0003\u0005Z\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007x\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\n\u0000"+
		"\u0001\b\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0003\u0001\u0000\r\u0010\u0001\u0000\u0012\u0014\u0002\u0000\f\f\u0015"+
		"\u0016\u0099\u0000!\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000"+
		"\u0004%\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u0081"+
		"\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\"\u0005"+
		"\u0000\u0000\u0001\u0017\u001d\u0003\u0014\n\u0000\u0018\u001d\u0003\u000e"+
		"\u0007\u0000\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b\u0005\t\u0000"+
		"\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000"+
		"\u0000\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000"+
		"\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 "+
		"\u001e\u0001\u0000\u0000\u0000!\u0016\u0001\u0000\u0000\u0000!\u001e\u0001"+
		"\u0000\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0007\u0001\u0000\u0000&\u0005"+
		"\u0001\u0000\u0000\u0000\'(\u0007\u0002\u0000\u0000(\u0007\u0001\u0000"+
		"\u0000\u0000)*\u0006\u0004\uffff\uffff\u0000*+\u0005\u0017\u0000\u0000"+
		"+,\u0003\u0006\u0003\u0000,-\u0005\u0017\u0000\u0000-7\u0001\u0000\u0000"+
		"\u0000./\u0005\u0017\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u0018"+
		"\u0000\u000017\u0001\u0000\u0000\u000023\u0005\u0018\u0000\u000034\u0003"+
		"\u0006\u0003\u000045\u0005\u0017\u0000\u000057\u0001\u0000\u0000\u0000"+
		"6)\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u000062\u0001\u0000\u0000"+
		"\u00007>\u0001\u0000\u0000\u000089\n\u0003\u0000\u00009:\u0003\u0004\u0002"+
		"\u0000:;\u0005\u0017\u0000\u0000;=\u0001\u0000\u0000\u0000<8\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AC\u0003\u0014\n\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EZ\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GI\u0003\u000e\u0007\u0000HG\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KZ\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MO\u0003\u0010\b\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QZ\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SU\u0003\u0012\t\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YD\u0001"+
		"\u0000\u0000\u0000YJ\u0001\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000"+
		"YV\u0001\u0000\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005\u000b"+
		"\u0000\u0000\\]\u0005\u0017\u0000\u0000]^\u0005\u000b\u0000\u0000^\r\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0017\u0000\u0000`a\u0005\f\u0000\u0000ab\u0005"+
		"\u0018\u0000\u0000bc\u0003\u0002\u0001\u0000cd\u0005\u0018\u0000\u0000"+
		"dx\u0001\u0000\u0000\u0000ef\u0005\u0017\u0000\u0000fg\u0005\f\u0000\u0000"+
		"gh\u0005\u0017\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005\u0017\u0000"+
		"\u0000jx\u0001\u0000\u0000\u0000kl\u0005\u0017\u0000\u0000lm\u0005\f\u0000"+
		"\u0000mn\u0005\u0018\u0000\u0000no\u0003\u0002\u0001\u0000op\u0005\u0017"+
		"\u0000\u0000px\u0001\u0000\u0000\u0000qr\u0005\u0017\u0000\u0000rs\u0005"+
		"\f\u0000\u0000st\u0005\u0017\u0000\u0000tu\u0003\u0002\u0001\u0000uv\u0005"+
		"\u0018\u0000\u0000vx\u0001\u0000\u0000\u0000w_\u0001\u0000\u0000\u0000"+
		"we\u0001\u0000\u0000\u0000wk\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000"+
		"\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0005\u0011\u0000\u0000z{\u0005"+
		"\u0005\u0000\u0000{|\u0003\b\u0004\u0000|}\u0005\u0006\u0000\u0000}~\u0005"+
		"\u0007\u0000\u0000~\u007f\u0003\n\u0005\u0000\u007f\u0080\u0005\b\u0000"+
		"\u0000\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0004\u0000"+
		"\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000"+
		"\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000"+
		"\u0088\u0089\u0005\f\u0000\u0000\u0089\u008a\u0005\u0018\u0000\u0000\u008a"+
		"\u0091\u0005\t\u0000\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u008d"+
		"\u0005\u0017\u0000\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u008f\u0005"+
		"\u0017\u0000\u0000\u008f\u0091\u0005\t\u0000\u0000\u0090\u0086\u0001\u0000"+
		"\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0091\u0015\u0001\u0000"+
		"\u0000\u0000\f\u001c\u001e!6>DJPVYw\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}