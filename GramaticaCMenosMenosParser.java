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
		RULE_printcomando = 6, RULE_calcular = 7, RULE_calculo = 8, RULE_condicional = 9, 
		RULE_declaracaoPrint = 10, RULE_declaracaoVariavel = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "operadoresMath", "operadoresLogicos", "operadoresRelacionais", 
			"relacional", "blocoComando", "printcomando", "calcular", "calculo", 
			"condicional", "declaracaoPrint", "declaracaoVariavel"
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8520246L) != 0)) {
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(25);
						declaracaoVariavel();
						}
						break;
					case 2:
						{
						setState(26);
						calcular();
						}
						break;
					case 3:
						{
						setState(27);
						blocoComando();
						setState(28);
						match(PONTO_E_VIRGULA);
						}
						break;
					}
					}
					setState(34);
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
			setState(37);
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
			setState(39);
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
			setState(41);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(44);
				match(LETRA);
				setState(45);
				operadoresRelacionais();
				setState(46);
				match(LETRA);
				}
				break;
			case 2:
				{
				setState(48);
				match(LETRA);
				setState(49);
				operadoresRelacionais();
				setState(50);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(52);
				match(NUM);
				setState(53);
				operadoresRelacionais();
				setState(54);
				match(LETRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
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
					setState(58);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(59);
					operadoresLogicos();
					setState(60);
					match(LETRA);
					}
					} 
				}
				setState(66);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==STRING) {
					{
					{
					setState(67);
					declaracaoVariavel();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_E || _la==LETRA) {
					{
					{
					setState(73);
					calcular();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(79);
					condicional();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINT) {
					{
					{
					setState(85);
					declaracaoPrint();
					}
					}
					setState(90);
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
			setState(93);
			match(CRAZE);
			setState(94);
			match(LETRA);
			setState(95);
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
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaCMenosMenosParser.PONTO_E_VIRGULA, 0); }
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(LETRA);
				setState(98);
				match(IGUAL);
				setState(99);
				match(NUM);
				setState(100);
				operadoresMath();
				setState(101);
				match(NUM);
				setState(102);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(LETRA);
				setState(105);
				match(IGUAL);
				setState(106);
				match(LETRA);
				setState(107);
				operadoresMath();
				setState(108);
				match(LETRA);
				setState(109);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				calculo(0);
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
	public static class CalculoContext extends ParserRuleContext {
		public TerminalNode PAR_E() { return getToken(GramaticaCMenosMenosParser.PAR_E, 0); }
		public CalcularContext calcular() {
			return getRuleContext(CalcularContext.class,0);
		}
		public TerminalNode PAR_D() { return getToken(GramaticaCMenosMenosParser.PAR_D, 0); }
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public OperadoresMathContext operadoresMath() {
			return getRuleContext(OperadoresMathContext.class,0);
		}
		public CalculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).enterCalculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaCMenosMenosListener ) ((GramaticaCMenosMenosListener)listener).exitCalculo(this);
		}
	}

	public final CalculoContext calculo() throws RecognitionException {
		return calculo(0);
	}

	private CalculoContext calculo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalculoContext _localctx = new CalculoContext(_ctx, _parentState);
		CalculoContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_calculo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			match(PAR_E);
			setState(116);
			calcular();
			setState(117);
			match(PAR_D);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalculoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calculo);
					setState(119);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(120);
					operadoresMath();
					setState(121);
					calcular();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 18, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			match(PAR_E);
			setState(130);
			relacional(0);
			setState(131);
			match(PAR_D);
			setState(132);
			match(CHAVE_E);
			setState(133);
			blocoComando();
			setState(134);
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
		enterRule(_localctx, 20, RULE_declaracaoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PRINT);
			setState(137);
			match(PAR_E);
			setState(138);
			printcomando();
			setState(139);
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
		enterRule(_localctx, 22, RULE_declaracaoVariavel);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(INT);
				setState(142);
				match(LETRA);
				setState(143);
				match(IGUAL);
				setState(144);
				match(NUM);
				setState(145);
				match(PONTO_E_VIRGULA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(STRING);
				setState(147);
				match(LETRA);
				setState(148);
				match(IGUAL);
				setState(149);
				match(LETRA);
				setState(150);
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
		case 8:
			return calculo_sempred((CalculoContext)_localctx, predIndex);
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
	private boolean calculo_sempred(CalculoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0003\u0000$\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00049\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0005"+
		"\u0005\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0005\u0005"+
		"K\b\u0005\n\u0005\f\u0005N\t\u0005\u0001\u0005\u0005\u0005Q\b\u0005\n"+
		"\u0005\f\u0005T\t\u0005\u0001\u0005\u0005\u0005W\b\u0005\n\u0005\f\u0005"+
		"Z\t\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007q\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b|\b\b\n\b\f\b\u007f\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001\u000b"+
		"\u0000\u0002\b\u0010\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\u0003\u0001\u0000\r\u0010\u0001\u0000\u0012\u0014\u0002"+
		"\u0000\f\f\u0015\u0016\u009f\u0000#\u0001\u0000\u0000\u0000\u0002%\u0001"+
		"\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000"+
		"\u0000\u0000\b8\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f]"+
		"\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010r\u0001\u0000"+
		"\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000"+
		"\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018$\u0005\u0000\u0000"+
		"\u0001\u0019\u001f\u0003\u0016\u000b\u0000\u001a\u001f\u0003\u000e\u0007"+
		"\u0000\u001b\u001c\u0003\n\u0005\u0000\u001c\u001d\u0005\t\u0000\u0000"+
		"\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000"+
		"\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#\u0018\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000$\u0001\u0001"+
		"\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'(\u0007\u0001\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0007"+
		"\u0002\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0006\u0004\uffff"+
		"\uffff\u0000,-\u0005\u0017\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005"+
		"\u0017\u0000\u0000/9\u0001\u0000\u0000\u000001\u0005\u0017\u0000\u0000"+
		"12\u0003\u0006\u0003\u000023\u0005\u0018\u0000\u000039\u0001\u0000\u0000"+
		"\u000045\u0005\u0018\u0000\u000056\u0003\u0006\u0003\u000067\u0005\u0017"+
		"\u0000\u000079\u0001\u0000\u0000\u00008+\u0001\u0000\u0000\u000080\u0001"+
		"\u0000\u0000\u000084\u0001\u0000\u0000\u00009@\u0001\u0000\u0000\u0000"+
		":;\n\u0003\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005\u0017\u0000\u0000"+
		"=?\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0003\u0016\u000b\u0000DC\u0001"+
		"\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000G\\\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000IK\u0003\u000e\u0007\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\\\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0003\u0012\t\u0000PO\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000S\\\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000UW\u0003\u0014\n\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[F\u0001\u0000\u0000\u0000[L\u0001"+
		"\u0000\u0000\u0000[R\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000"+
		"\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u0017"+
		"\u0000\u0000_`\u0005\u000b\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0017\u0000\u0000bc\u0005\f\u0000\u0000cd\u0005\u0018\u0000\u0000de\u0003"+
		"\u0002\u0001\u0000ef\u0005\u0018\u0000\u0000fg\u0005\t\u0000\u0000gq\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0017\u0000\u0000ij\u0005\f\u0000\u0000jk\u0005"+
		"\u0017\u0000\u0000kl\u0003\u0002\u0001\u0000lm\u0005\u0017\u0000\u0000"+
		"mn\u0005\t\u0000\u0000nq\u0001\u0000\u0000\u0000oq\u0003\u0010\b\u0000"+
		"pa\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0006\b\uffff\uffff\u0000st\u0005"+
		"\u0005\u0000\u0000tu\u0003\u000e\u0007\u0000uv\u0005\u0006\u0000\u0000"+
		"v}\u0001\u0000\u0000\u0000wx\n\u0001\u0000\u0000xy\u0003\u0002\u0001\u0000"+
		"yz\u0003\u000e\u0007\u0000z|\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0011\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081\u0082\u0005\u0005\u0000"+
		"\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u0084\u0005\u0006\u0000\u0000"+
		"\u0084\u0085\u0005\u0007\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086"+
		"\u0087\u0005\b\u0000\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\u0004\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u008b"+
		"\u0003\f\u0006\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u0015\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e\u008f\u0005"+
		"\u0017\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0005\u0018"+
		"\u0000\u0000\u0091\u0098\u0005\t\u0000\u0000\u0092\u0093\u0005\u0002\u0000"+
		"\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000"+
		"\u0095\u0096\u0005\u0017\u0000\u0000\u0096\u0098\u0005\t\u0000\u0000\u0097"+
		"\u008d\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098"+
		"\u0017\u0001\u0000\u0000\u0000\r\u001e #8@FLRX[p}\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}