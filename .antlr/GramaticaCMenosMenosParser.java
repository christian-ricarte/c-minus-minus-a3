// Generated from c://Users//Usuario//Desktop//c-minus-minus-a3//GramaticaCMenosMenos.g4 by ANTLR 4.13.1
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
		RULE_operadoresRelacionais = 3, RULE_relacional = 4, RULE_blocoComando = 5, 
		RULE_calcular = 6, RULE_calculo = 7, RULE_condicional = 8, RULE_declaracaoVariavel = 9, 
		RULE_declaracaoFunc = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"raiz_programa", "operadoresMath", "operadoresLogicos", "operadoresRelacionais", 
			"relacional", "blocoComando", "calcular", "calculo", "condicional", "declaracaoVariavel", 
			"declaracaoFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "','"
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097182L) != 0)) {
					{
					setState(28);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case STRING:
						{
						setState(23);
						declaracaoVariavel();
						}
						break;
					case FUNC:
						{
						setState(24);
						declaracaoFunc();
						}
						break;
					case PAR_E:
					case LETRA:
						{
						setState(25);
						calcular();
						setState(26);
						match(PONTO_E_VIRGULA);
						}
						break;
					default:
						throw new NoViableAltException(this);
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
			setState(37);
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
			setState(39);
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
	public static class RelacionalContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(GramaticaCMenosMenosParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GramaticaCMenosMenosParser.LETRA, i);
		}
		public OperadoresRelacionaisContext operadoresRelacionais() {
			return getRuleContext(OperadoresRelacionaisContext.class,0);
		}
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
			{
			setState(42);
			match(LETRA);
			setState(43);
			operadoresRelacionais();
			setState(44);
			match(LETRA);
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relacional);
					setState(46);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(47);
					operadoresLogicos();
					setState(48);
					match(LETRA);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public List<DeclaracaoFuncContext> declaracaoFunc() {
			return getRuleContexts(DeclaracaoFuncContext.class);
		}
		public DeclaracaoFuncContext declaracaoFunc(int i) {
			return getRuleContext(DeclaracaoFuncContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==STRING) {
					{
					{
					setState(55);
					declaracaoVariavel();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_E || _la==LETRA) {
					{
					{
					setState(61);
					calcular();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNC) {
					{
					{
					setState(67);
					declaracaoFunc();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(73);
					condicional();
					}
					}
					setState(78);
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
		enterRule(_localctx, 12, RULE_calcular);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LETRA);
				setState(82);
				match(IGUAL);
				setState(83);
				match(NUM);
				setState(84);
				operadoresMath();
				setState(85);
				match(NUM);
				setState(86);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LETRA);
				setState(89);
				match(IGUAL);
				setState(90);
				match(LETRA);
				setState(91);
				operadoresMath();
				setState(92);
				match(LETRA);
				setState(93);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_calculo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			match(PAR_E);
			setState(100);
			calcular();
			setState(101);
			match(PAR_D);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalculoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calculo);
					setState(103);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(104);
					operadoresMath();
					setState(105);
					calcular();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 16, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF);
			setState(113);
			match(PAR_E);
			setState(114);
			relacional(0);
			setState(115);
			match(PAR_D);
			setState(116);
			match(CHAVE_E);
			setState(117);
			blocoComando();
			setState(118);
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
		enterRule(_localctx, 18, RULE_declaracaoVariavel);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(INT);
				setState(121);
				match(LETRA);
				setState(122);
				match(IGUAL);
				setState(123);
				match(NUM);
				setState(124);
				match(PONTO_E_VIRGULA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(STRING);
				setState(126);
				match(LETRA);
				setState(127);
				match(IGUAL);
				setState(128);
				match(LETRA);
				setState(129);
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
		public BlocoComandoContext blocoComando() {
			return getRuleContext(BlocoComandoContext.class,0);
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
		enterRule(_localctx, 20, RULE_declaracaoFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FUNC);
			setState(133);
			match(LETRA);
			setState(134);
			match(PAR_E);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA) {
				{
				{
				setState(135);
				match(LETRA);
				setState(136);
				match(VIRGULA);
				setState(137);
				match(LETRA);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(PAR_D);
			setState(144);
			match(IGUAL);
			setState(145);
			match(CHAVE_E);
			setState(146);
			blocoComando();
			setState(147);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return relacional_sempred((RelacionalContext)_localctx, predIndex);
		case 7:
			return calculo_sempred((CalculoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relacional_sempred(RelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
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
		"\u0004\u0001\u0017\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000"+
		"\n\u0000\f\u0000 \t\u0000\u0003\u0000\"\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00043\b\u0004\n\u0004\f\u00046\t\u0004\u0001\u0005"+
		"\u0005\u00059\b\u0005\n\u0005\f\u0005<\t\u0005\u0001\u0005\u0005\u0005"+
		"?\b\u0005\n\u0005\f\u0005B\t\u0005\u0001\u0005\u0005\u0005E\b\u0005\n"+
		"\u0005\f\u0005H\t\u0005\u0001\u0005\u0005\u0005K\b\u0005\n\u0005\f\u0005"+
		"N\t\u0005\u0003\u0005P\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006a\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007l\b"+
		"\u0007\n\u0007\f\u0007o\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u008b\b\n\n\n\f\n\u008e\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0002\b\u000e\u000b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001"+
		"\u0000\u000b\u000e\u0001\u0000\u0010\u0012\u0002\u0000\n\n\u0013\u0014"+
		"\u0099\u0000!\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b)\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000e"+
		"b\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012\u0082\u0001"+
		"\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\"\u0005\u0000"+
		"\u0000\u0001\u0017\u001d\u0003\u0012\t\u0000\u0018\u001d\u0003\u0014\n"+
		"\u0000\u0019\u001a\u0003\f\u0006\u0000\u001a\u001b\u0005\b\u0000\u0000"+
		"\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000"+
		"\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!\u0016\u0001\u0000\u0000\u0000!\u001e\u0001\u0000"+
		"\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000"+
		"$\u0003\u0001\u0000\u0000\u0000%&\u0007\u0001\u0000\u0000&\u0005\u0001"+
		"\u0000\u0000\u0000\'(\u0007\u0002\u0000\u0000(\u0007\u0001\u0000\u0000"+
		"\u0000)*\u0006\u0004\uffff\uffff\u0000*+\u0005\u0015\u0000\u0000+,\u0003"+
		"\u0006\u0003\u0000,-\u0005\u0015\u0000\u0000-4\u0001\u0000\u0000\u0000"+
		"./\n\u0001\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005\u0015\u0000\u0000"+
		"13\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\t\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000079\u0003\u0012\t\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;P\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=?\u0003\f\u0006\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CE\u0003\u0014\n\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GL\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003"+
		"\u0010\b\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000O:\u0001\u0000\u0000\u0000O@\u0001\u0000\u0000"+
		"\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0005\u0015\u0000\u0000RS\u0005"+
		"\n\u0000\u0000ST\u0005\u0016\u0000\u0000TU\u0003\u0002\u0001\u0000UV\u0005"+
		"\u0016\u0000\u0000VW\u0005\b\u0000\u0000Wa\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0015\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0005\u0015\u0000\u0000[\\"+
		"\u0003\u0002\u0001\u0000\\]\u0005\u0015\u0000\u0000]^\u0005\b\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_a\u0003\u000e\u0007\u0000`Q\u0001\u0000\u0000"+
		"\u0000`X\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\r\u0001\u0000"+
		"\u0000\u0000bc\u0006\u0007\uffff\uffff\u0000cd\u0005\u0004\u0000\u0000"+
		"de\u0003\f\u0006\u0000ef\u0005\u0005\u0000\u0000fm\u0001\u0000\u0000\u0000"+
		"gh\n\u0001\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0003\f\u0006\u0000"+
		"jl\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000f\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u000f\u0000\u0000"+
		"qr\u0005\u0004\u0000\u0000rs\u0003\b\u0004\u0000st\u0005\u0005\u0000\u0000"+
		"tu\u0005\u0006\u0000\u0000uv\u0003\n\u0005\u0000vw\u0005\u0007\u0000\u0000"+
		"w\u0011\u0001\u0000\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0005\u0015"+
		"\u0000\u0000z{\u0005\n\u0000\u0000{|\u0005\u0016\u0000\u0000|\u0083\u0005"+
		"\b\u0000\u0000}~\u0005\u0002\u0000\u0000~\u007f\u0005\u0015\u0000\u0000"+
		"\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081"+
		"\u0083\u0005\b\u0000\u0000\u0082x\u0001\u0000\u0000\u0000\u0082}\u0001"+
		"\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0003\u0000\u0000\u0085\u0086\u0005\u0015\u0000\u0000\u0086\u008c\u0005"+
		"\u0004\u0000\u0000\u0087\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0005"+
		"\t\u0000\u0000\u0089\u008b\u0005\u0015\u0000\u0000\u008a\u0087\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0005"+
		"\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0005\u0006\u0000"+
		"\u0000\u0092\u0093\u0003\n\u0005\u0000\u0093\u0094\u0005\u0007\u0000\u0000"+
		"\u0094\u0015\u0001\u0000\u0000\u0000\r\u001c\u001e!4:@FLO`m\u0082\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}