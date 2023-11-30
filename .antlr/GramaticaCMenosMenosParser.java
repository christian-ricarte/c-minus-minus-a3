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
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public CalcularContext calcular() {
			return getRuleContext(CalcularContext.class,0);
		}
		public BlocoComandoContext blocoComando() {
			return getRuleContext(BlocoComandoContext.class,0);
		}
		public DeclaracaoPrintContext declaracaoPrint() {
			return getRuleContext(DeclaracaoPrintContext.class,0);
		}
		public TerminalNode PONTO_E_VIRGULA() { return getToken(GramaticaCMenosMenosParser.PONTO_E_VIRGULA, 0); }
		public Raiz_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz_programa; }
	}

	public final Raiz_programaContext raiz_programa() throws RecognitionException {
		Raiz_programaContext _localctx = new Raiz_programaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raiz_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(24);
				declaracaoVariavel();
				}
				break;
			case 2:
				{
				setState(25);
				calcular();
				}
				break;
			case 3:
				{
				setState(26);
				blocoComando();
				}
				break;
			case 4:
				{
				setState(27);
				declaracaoPrint();
				setState(28);
				match(PONTO_E_VIRGULA);
				}
				break;
			}
			setState(32);
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
	}

	public final OperadoresMathContext operadoresMath() throws RecognitionException {
		OperadoresMathContext _localctx = new OperadoresMathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operadoresMath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
	}

	public final OperadoresLogicosContext operadoresLogicos() throws RecognitionException {
		OperadoresLogicosContext _localctx = new OperadoresLogicosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operadoresLogicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
	}

	public final OperadoresRelacionaisContext operadoresRelacionais() throws RecognitionException {
		OperadoresRelacionaisContext _localctx = new OperadoresRelacionaisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operadoresRelacionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(41);
				match(LETRA);
				setState(42);
				operadoresRelacionais();
				setState(43);
				match(LETRA);
				}
				break;
			case 2:
				{
				setState(45);
				match(LETRA);
				setState(46);
				operadoresRelacionais();
				setState(47);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(49);
				match(NUM);
				setState(50);
				operadoresRelacionais();
				setState(51);
				match(LETRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relacional);
					setState(55);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(56);
					operadoresLogicos();
					setState(57);
					match(LETRA);
					}
					} 
				}
				setState(63);
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
	}

	public final BlocoComandoContext blocoComando() throws RecognitionException {
		BlocoComandoContext _localctx = new BlocoComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blocoComando);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==STRING) {
					{
					{
					setState(64);
					declaracaoVariavel();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_E || _la==LETRA) {
					{
					{
					setState(70);
					calcular();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(76);
					condicional();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PRINT) {
					{
					{
					setState(82);
					declaracaoPrint();
					}
					}
					setState(87);
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
	}

	public final PrintcomandoContext printcomando() throws RecognitionException {
		PrintcomandoContext _localctx = new PrintcomandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printcomando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CRAZE);
			setState(91);
			match(LETRA);
			setState(92);
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
	}

	public final CalcularContext calcular() throws RecognitionException {
		CalcularContext _localctx = new CalcularContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_calcular);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LETRA);
				setState(95);
				match(IGUAL);
				setState(96);
				match(NUM);
				setState(97);
				operadoresMath();
				setState(98);
				match(NUM);
				setState(99);
				match(PONTO_E_VIRGULA);
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
				setState(106);
				match(PONTO_E_VIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
			setState(112);
			match(PAR_E);
			setState(113);
			calcular();
			setState(114);
			match(PAR_D);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalculoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calculo);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					operadoresMath();
					setState(118);
					calcular();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(126);
			match(PAR_E);
			setState(127);
			relacional(0);
			setState(128);
			match(PAR_D);
			setState(129);
			match(CHAVE_E);
			setState(130);
			blocoComando();
			setState(131);
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
	}

	public final DeclaracaoPrintContext declaracaoPrint() throws RecognitionException {
		DeclaracaoPrintContext _localctx = new DeclaracaoPrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PRINT);
			setState(134);
			match(PAR_E);
			setState(135);
			printcomando();
			setState(136);
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
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoVariavel);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(INT);
				setState(139);
				match(LETRA);
				setState(140);
				match(IGUAL);
				setState(141);
				match(NUM);
				setState(142);
				match(PONTO_E_VIRGULA);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(STRING);
				setState(144);
				match(LETRA);
				setState(145);
				match(IGUAL);
				setState(146);
				match(LETRA);
				setState(147);
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
		"\u0004\u0001\u0019\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001\u0005\u0005\u0005B\b\u0005\n"+
		"\u0005\f\u0005E\t\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005"+
		"K\t\u0005\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001"+
		"\u0005\u0005\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0003\u0005Y\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0095\b\u000b\u0001\u000b\u0000\u0002\b\u0010\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003\u0001\u0000\r\u0010"+
		"\u0001\u0000\u0012\u0014\u0002\u0000\f\f\u0015\u0016\u009b\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004$\u0001"+
		"\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000"+
		"\u0000\nX\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000em\u0001"+
		"\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000"+
		"\u0000\u0018\u001f\u0003\u0016\u000b\u0000\u0019\u001f\u0003\u000e\u0007"+
		"\u0000\u001a\u001f\u0003\n\u0005\u0000\u001b\u001c\u0003\u0014\n\u0000"+
		"\u001c\u001d\u0005\t\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e"+
		"\u0018\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e"+
		"\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000"+
		"\u0000\u0000\"#\u0007\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000"+
		"$%\u0007\u0001\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0007\u0002"+
		"\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0006\u0004\uffff\uffff"+
		"\u0000)*\u0005\u0017\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0017"+
		"\u0000\u0000,6\u0001\u0000\u0000\u0000-.\u0005\u0017\u0000\u0000./\u0003"+
		"\u0006\u0003\u0000/0\u0005\u0018\u0000\u000006\u0001\u0000\u0000\u0000"+
		"12\u0005\u0018\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0017\u0000"+
		"\u000046\u0001\u0000\u0000\u00005(\u0001\u0000\u0000\u00005-\u0001\u0000"+
		"\u0000\u000051\u0001\u0000\u0000\u00006=\u0001\u0000\u0000\u000078\n\u0003"+
		"\u0000\u000089\u0003\u0004\u0002\u00009:\u0005\u0017\u0000\u0000:<\u0001"+
		"\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@B\u0003\u0016\u000b\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DY\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FH\u0003\u000e\u0007\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JY\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003\u0012\t\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RT\u0003\u0014\n\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000XC\u0001\u0000\u0000\u0000XI\u0001\u0000"+
		"\u0000\u0000XO\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\u000b"+
		"\u0001\u0000\u0000\u0000Z[\u0005\u000b\u0000\u0000[\\\u0005\u0017\u0000"+
		"\u0000\\]\u0005\u000b\u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\u0017"+
		"\u0000\u0000_`\u0005\f\u0000\u0000`a\u0005\u0018\u0000\u0000ab\u0003\u0002"+
		"\u0001\u0000bc\u0005\u0018\u0000\u0000cd\u0005\t\u0000\u0000dn\u0001\u0000"+
		"\u0000\u0000ef\u0005\u0017\u0000\u0000fg\u0005\f\u0000\u0000gh\u0005\u0017"+
		"\u0000\u0000hi\u0003\u0002\u0001\u0000ij\u0005\u0017\u0000\u0000jk\u0005"+
		"\t\u0000\u0000kn\u0001\u0000\u0000\u0000ln\u0003\u0010\b\u0000m^\u0001"+
		"\u0000\u0000\u0000me\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"n\u000f\u0001\u0000\u0000\u0000op\u0006\b\uffff\uffff\u0000pq\u0005\u0005"+
		"\u0000\u0000qr\u0003\u000e\u0007\u0000rs\u0005\u0006\u0000\u0000sz\u0001"+
		"\u0000\u0000\u0000tu\n\u0001\u0000\u0000uv\u0003\u0002\u0001\u0000vw\u0003"+
		"\u000e\u0007\u0000wy\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0011\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0011\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0080\u0003\b"+
		"\u0004\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081\u0082\u0005\u0007"+
		"\u0000\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\b\u0000"+
		"\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0004\u0000"+
		"\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000"+
		"\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c\u0005\u0017\u0000\u0000"+
		"\u008c\u008d\u0005\f\u0000\u0000\u008d\u008e\u0005\u0018\u0000\u0000\u008e"+
		"\u0095\u0005\t\u0000\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0091"+
		"\u0005\u0017\u0000\u0000\u0091\u0092\u0005\f\u0000\u0000\u0092\u0093\u0005"+
		"\u0017\u0000\u0000\u0093\u0095\u0005\t\u0000\u0000\u0094\u008a\u0001\u0000"+
		"\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0095\u0017\u0001\u0000"+
		"\u0000\u0000\u000b\u001e5=CIOUXmz\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}