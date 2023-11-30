// Generated from GramaticaCMenosMenos.g4 by ANTLR 4.13.1
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
		INT=1, PRINT=2, PAR_E=3, PAR_D=4, CHAVE_E=5, CHAVE_D=6, PONTO_E_VIRGULA=7, 
		VIRGULA=8, CRAZE=9, IGUAL=10, MAIS=11, MENOS=12, DIVISAO=13, MULT=14, 
		IF=15, MAIOR_QUE=16, MENOR_QUE=17, EQUIVALENTE=18, LETRA=19, NUM=20, ESPACO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "PRINT", "PAR_E", "PAR_D", "CHAVE_E", "CHAVE_D", "PONTO_E_VIRGULA", 
			"VIRGULA", "CRAZE", "IGUAL", "MAIS", "MENOS", "DIVISAO", "MULT", "IF", 
			"MAIOR_QUE", "MENOR_QUE", "EQUIVALENTE", "LETRA", "NUM", "ESPACO"
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
		"\u0004\u0000\u0015\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u00004\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012u\b\u0012\n\u0012\f\u0012x\t\u0012\u0001\u0013"+
		"\u0004\u0013{\b\u0013\u000b\u0013\f\u0013|\u0001\u0014\u0004\u0014\u0080"+
		"\b\u0014\u000b\u0014\f\u0014\u0081\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0001\u0000az\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  \u0088\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000"+
		"\u0005=\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tA\u0001"+
		"\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000"+
		"\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013"+
		"K\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017S\u0001"+
		"\u0000\u0000\u0000\u0019W\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000"+
		"\u0000\u001d_\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!"+
		"h\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'z\u0001\u0000\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+,\u0005"+
		"I\u0000\u0000,-\u0005N\u0000\u0000-4\u0005T\u0000\u0000./\u0005i\u0000"+
		"\u0000/0\u0005n\u0000\u000001\u0005t\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0003)\u0014\u00003+\u0001\u0000\u0000\u00003.\u0001\u0000\u0000\u0000"+
		"4\u0002\u0001\u0000\u0000\u000056\u0005p\u0000\u000067\u0005r\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005n\u0000\u00009:\u0005t\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0003)\u0014\u0000<\u0004\u0001\u0000\u0000\u0000"+
		"=>\u0005(\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000"+
		"@\b\u0001\u0000\u0000\u0000AB\u0005{\u0000\u0000B\n\u0001\u0000\u0000"+
		"\u0000CD\u0005}\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005;\u0000"+
		"\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005,\u0000\u0000H\u0010\u0001"+
		"\u0000\u0000\u0000IJ\u0005`\u0000\u0000J\u0012\u0001\u0000\u0000\u0000"+
		"KL\u0003)\u0014\u0000LM\u0005=\u0000\u0000MN\u0003)\u0014\u0000N\u0014"+
		"\u0001\u0000\u0000\u0000OP\u0003)\u0014\u0000PQ\u0005+\u0000\u0000QR\u0003"+
		")\u0014\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0003)\u0014\u0000TU\u0005"+
		"-\u0000\u0000UV\u0003)\u0014\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0003"+
		")\u0014\u0000XY\u0005/\u0000\u0000YZ\u0003)\u0014\u0000Z\u001a\u0001\u0000"+
		"\u0000\u0000[\\\u0003)\u0014\u0000\\]\u0005*\u0000\u0000]^\u0003)\u0014"+
		"\u0000^\u001c\u0001\u0000\u0000\u0000_`\u0005i\u0000\u0000`a\u0005f\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0003)\u0014\u0000c\u001e\u0001\u0000"+
		"\u0000\u0000de\u0003)\u0014\u0000ef\u0005>\u0000\u0000fg\u0003)\u0014"+
		"\u0000g \u0001\u0000\u0000\u0000hi\u0003)\u0014\u0000ij\u0005<\u0000\u0000"+
		"jk\u0003)\u0014\u0000k\"\u0001\u0000\u0000\u0000lm\u0003)\u0014\u0000"+
		"mn\u0005=\u0000\u0000no\u0005=\u0000\u0000op\u0001\u0000\u0000\u0000p"+
		"q\u0003)\u0014\u0000q$\u0001\u0000\u0000\u0000rv\u0007\u0000\u0000\u0000"+
		"su\u0007\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w&\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}(\u0001\u0000\u0000\u0000~\u0080\u0007\u0003"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0014\u0000"+
		"\u0000\u0084*\u0001\u0000\u0000\u0000\u0005\u00003v|\u0081\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}