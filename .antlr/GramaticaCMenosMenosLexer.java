// Generated from c://Users//Usuario//Desktop//c-minus-minus-a3//GramaticaCMenosMenos.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaCMenosMenosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, FUNC=3, PRINT=4, PAR_E=5, PAR_D=6, CHAVE_E=7, CHAVE_D=8, 
		PONTO_E_VIRGULA=9, VIRGULA=10, CRAZE=11, IGUAL=12, MAIS=13, MENOS=14, 
		DIVISAO=15, MULT=16, IF=17, AND=18, OR=19, NOT=20, MAIOR_QUE=21, MENOR_QUE=22, 
		LETRA=23, NUM=24, ESPACO=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "STRING", "FUNC", "PRINT", "PAR_E", "PAR_D", "CHAVE_E", "CHAVE_D", 
			"PONTO_E_VIRGULA", "VIRGULA", "CRAZE", "IGUAL", "MAIS", "MENOS", "DIVISAO", 
			"MULT", "IF", "AND", "OR", "NOT", "MAIOR_QUE", "MENOR_QUE", "LETRA", 
			"NUM", "ESPACO"
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


	public GramaticaCMenosMenosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaCMenosMenos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000<\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0084\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u008a\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0090\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u009c\b\u0016\n\u0016\f\u0016\u009f\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00a3\b\u0017\n\u0017\f\u0017\u00a6\t\u0017\u0001\u0018\u0004"+
		"\u0018\u00a9\b\u0018\u000b\u0018\f\u0018\u00aa\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u0000"+
		"az\u0001\u000009\u0003\u0000\t\n\r\r  \u00b4\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001\u0000"+
		"\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007N\u0001\u0000\u0000\u0000"+
		"\tW\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\r[\u0001\u0000"+
		"\u0000\u0000\u000f]\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000\u0000"+
		"\u0013a\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017e"+
		"\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bm\u0001\u0000"+
		"\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000"+
		"!y\u0001\u0000\u0000\u0000#\u0083\u0001\u0000\u0000\u0000%\u0089\u0001"+
		"\u0000\u0000\u0000\'\u008f\u0001\u0000\u0000\u0000)\u0091\u0001\u0000"+
		"\u0000\u0000+\u0095\u0001\u0000\u0000\u0000-\u0099\u0001\u0000\u0000\u0000"+
		"/\u00a0\u0001\u0000\u0000\u00001\u00a8\u0001\u0000\u0000\u000034\u0005"+
		"I\u0000\u000045\u0005N\u0000\u00005<\u0005T\u0000\u000067\u0005i\u0000"+
		"\u000078\u0005n\u0000\u000089\u0005t\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u00031\u0018\u0000;3\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000"+
		"<\u0002\u0001\u0000\u0000\u0000=>\u0005S\u0000\u0000>?\u0005t\u0000\u0000"+
		"?@\u0005r\u0000\u0000@A\u0005i\u0000\u0000AB\u0005n\u0000\u0000BC\u0005"+
		"g\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u00031\u0018\u0000E\u0004\u0001"+
		"\u0000\u0000\u0000FG\u00031\u0018\u0000GH\u0005F\u0000\u0000HI\u0005U"+
		"\u0000\u0000IJ\u0005N\u0000\u0000JK\u0005C\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u00031\u0018\u0000M\u0006\u0001\u0000\u0000\u0000NO\u00031\u0018"+
		"\u0000OP\u0005P\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005i\u0000\u0000"+
		"RS\u0005n\u0000\u0000ST\u0005t\u0000\u0000TU\u0001\u0000\u0000\u0000U"+
		"V\u00031\u0018\u0000V\b\u0001\u0000\u0000\u0000WX\u0005(\u0000\u0000X"+
		"\n\u0001\u0000\u0000\u0000YZ\u0005)\u0000\u0000Z\f\u0001\u0000\u0000\u0000"+
		"[\\\u0005{\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005}\u0000"+
		"\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005;\u0000\u0000`\u0012\u0001"+
		"\u0000\u0000\u0000ab\u0005,\u0000\u0000b\u0014\u0001\u0000\u0000\u0000"+
		"cd\u0005`\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u00031\u0018\u0000"+
		"fg\u0005=\u0000\u0000gh\u00031\u0018\u0000h\u0018\u0001\u0000\u0000\u0000"+
		"ij\u00031\u0018\u0000jk\u0005+\u0000\u0000kl\u00031\u0018\u0000l\u001a"+
		"\u0001\u0000\u0000\u0000mn\u00031\u0018\u0000no\u0005-\u0000\u0000op\u0003"+
		"1\u0018\u0000p\u001c\u0001\u0000\u0000\u0000qr\u00031\u0018\u0000rs\u0005"+
		"/\u0000\u0000st\u00031\u0018\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0003"+
		"1\u0018\u0000vw\u0005*\u0000\u0000wx\u00031\u0018\u0000x \u0001\u0000"+
		"\u0000\u0000yz\u0005i\u0000\u0000z{\u0005f\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u00031\u0018\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0005&\u0000"+
		"\u0000\u007f\u0084\u0005&\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081"+
		"\u0082\u0005n\u0000\u0000\u0082\u0084\u0005d\u0000\u0000\u0083~\u0001"+
		"\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084$\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005|\u0000\u0000\u0086\u008a\u0005|\u0000\u0000"+
		"\u0087\u0088\u0005o\u0000\u0000\u0088\u008a\u0005r\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a&\u0001"+
		"\u0000\u0000\u0000\u008b\u0090\u0005!\u0000\u0000\u008c\u008d\u0005N\u0000"+
		"\u0000\u008d\u008e\u0005O\u0000\u0000\u008e\u0090\u0005T\u0000\u0000\u008f"+
		"\u008b\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u0090"+
		"(\u0001\u0000\u0000\u0000\u0091\u0092\u00031\u0018\u0000\u0092\u0093\u0005"+
		">\u0000\u0000\u0093\u0094\u00031\u0018\u0000\u0094*\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u00031\u0018\u0000\u0096\u0097\u0005<\u0000\u0000\u0097"+
		"\u0098\u00031\u0018\u0000\u0098,\u0001\u0000\u0000\u0000\u0099\u009d\u0007"+
		"\u0000\u0000\u0000\u009a\u009c\u0007\u0001\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e.\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a4\u0007\u0002"+
		"\u0000\u0000\u00a1\u00a3\u0007\u0002\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a50\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\u0003\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0018\u0000"+
		"\u0000\u00ad2\u0001\u0000\u0000\u0000\b\u0000;\u0083\u0089\u008f\u009d"+
		"\u00a4\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}