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
		INT=1, STRING=2, FUNC=3, PAR_E=4, PAR_D=5, CHAVE_E=6, CHAVE_D=7, PONTO_E_VIRGULA=8, 
		VIRGULA=9, IGUAL=10, MAIS=11, MENOS=12, DIVISAO=13, MULT=14, IF=15, AND=16, 
		OR=17, NOT=18, MAIOR_QUE=19, MENOR_QUE=20, LETRA=21, NUM=22, ESPACO=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "STRING", "FUNC", "PAR_E", "PAR_D", "CHAVE_E", "CHAVE_D", "PONTO_E_VIRGULA", 
			"VIRGULA", "IGUAL", "MAIS", "MENOS", "DIVISAO", "MULT", "IF", "AND", 
			"OR", "NOT", "MAIOR_QUE", "MENOR_QUE", "LETRA", "NUM", "ESPACO"
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
		"\u0004\u0000\u0017\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u00008\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000fu\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010{\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0081\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u008d\b\u0014\n\u0014\f\u0014\u0090\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0094\b\u0015\n\u0015\f\u0015\u0097\t\u0015"+
		"\u0001\u0016\u0004\u0016\u009a\b\u0016\u000b\u0016\f\u0016\u009b\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0004\u0001\u0000AZ\u0001"+
		"\u0000az\u0001\u000009\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003"+
		"9\u0001\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000\u0007J\u0001"+
		"\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000"+
		"\u0000\rP\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011"+
		"T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015Z\u0001"+
		"\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019b\u0001\u0000\u0000"+
		"\u0000\u001bf\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000\u0000\u001f"+
		"t\u0001\u0000\u0000\u0000!z\u0001\u0000\u0000\u0000#\u0080\u0001\u0000"+
		"\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000"+
		"\u0000)\u008a\u0001\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-"+
		"\u0099\u0001\u0000\u0000\u0000/0\u0005I\u0000\u000001\u0005N\u0000\u0000"+
		"18\u0005T\u0000\u000023\u0005i\u0000\u000034\u0005n\u0000\u000045\u0005"+
		"t\u0000\u000056\u0001\u0000\u0000\u000068\u0003-\u0016\u00007/\u0001\u0000"+
		"\u0000\u000072\u0001\u0000\u0000\u00008\u0002\u0001\u0000\u0000\u0000"+
		"9:\u0005S\u0000\u0000:;\u0005t\u0000\u0000;<\u0005r\u0000\u0000<=\u0005"+
		"i\u0000\u0000=>\u0005n\u0000\u0000>?\u0005g\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0003-\u0016\u0000A\u0004\u0001\u0000\u0000\u0000BC\u0003"+
		"-\u0016\u0000CD\u0005F\u0000\u0000DE\u0005U\u0000\u0000EF\u0005N\u0000"+
		"\u0000FG\u0005C\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0003-\u0016\u0000"+
		"I\u0006\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000K\b\u0001\u0000\u0000"+
		"\u0000LM\u0005)\u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0005{\u0000"+
		"\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005}\u0000\u0000Q\u000e\u0001\u0000"+
		"\u0000\u0000RS\u0005;\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005"+
		",\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0003-\u0016\u0000WX\u0005"+
		"=\u0000\u0000XY\u0003-\u0016\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0003"+
		"-\u0016\u0000[\\\u0005+\u0000\u0000\\]\u0003-\u0016\u0000]\u0016\u0001"+
		"\u0000\u0000\u0000^_\u0003-\u0016\u0000_`\u0005-\u0000\u0000`a\u0003-"+
		"\u0016\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0003-\u0016\u0000cd\u0005"+
		"/\u0000\u0000de\u0003-\u0016\u0000e\u001a\u0001\u0000\u0000\u0000fg\u0003"+
		"-\u0016\u0000gh\u0005*\u0000\u0000hi\u0003-\u0016\u0000i\u001c\u0001\u0000"+
		"\u0000\u0000jk\u0005i\u0000\u0000kl\u0005f\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0003-\u0016\u0000n\u001e\u0001\u0000\u0000\u0000op\u0005&\u0000"+
		"\u0000pu\u0005&\u0000\u0000qr\u0005a\u0000\u0000rs\u0005n\u0000\u0000"+
		"su\u0005d\u0000\u0000to\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000"+
		"u \u0001\u0000\u0000\u0000vw\u0005|\u0000\u0000w{\u0005|\u0000\u0000x"+
		"y\u0005o\u0000\u0000y{\u0005r\u0000\u0000zv\u0001\u0000\u0000\u0000zx"+
		"\u0001\u0000\u0000\u0000{\"\u0001\u0000\u0000\u0000|\u0081\u0005!\u0000"+
		"\u0000}~\u0005N\u0000\u0000~\u007f\u0005O\u0000\u0000\u007f\u0081\u0005"+
		"T\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0083\u0003-\u0016\u0000\u0083"+
		"\u0084\u0005>\u0000\u0000\u0084\u0085\u0003-\u0016\u0000\u0085&\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0003-\u0016\u0000\u0087\u0088\u0005<\u0000"+
		"\u0000\u0088\u0089\u0003-\u0016\u0000\u0089(\u0001\u0000\u0000\u0000\u008a"+
		"\u008e\u0007\u0000\u0000\u0000\u008b\u008d\u0007\u0001\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"*\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0095"+
		"\u0007\u0002\u0000\u0000\u0092\u0094\u0007\u0002\u0000\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096,\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0007"+
		"\u0003\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0006"+
		"\u0016\u0000\u0000\u009e.\u0001\u0000\u0000\u0000\b\u00007tz\u0080\u008e"+
		"\u0095\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}