// Generated from C:/Users/Reema Ot/IdeaProjects/untitled2/src/CSSLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, COLON=3, SEMICOLON=4, COMMA=5, MEDIA=6, IMPORTANT=7, 
		HASH=8, DOT=9, IDENT=10, NUMBER=11, UNIT=12, STRING=13, WS=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LBRACE", "RBRACE", "COLON", "SEMICOLON", "COMMA", "MEDIA", "IMPORTANT", 
			"HASH", "DOT", "IDENT", "NUMBER", "UNIT", "STRING", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "';'", "','", "'@media'", "'!important'", 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "COLON", "SEMICOLON", "COMMA", "MEDIA", "IMPORTANT", 
			"HASH", "DOT", "IDENT", "NUMBER", "UNIT", "STRING", "WS", "COMMENT"
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


	public CSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSSLexer.g4"; }

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
		"\u0004\u0000\u000f\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0004\u0007>\b\u0007\u000b\u0007\f\u0007?\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\tF\b\t\n\t\f\tI\t\t\u0001\n\u0004\nL\b\n\u000b\n\f\nM\u0001\n"+
		"\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0003\nV\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bd\b\u000b"+
		"\u0001\f\u0001\f\u0005\fh\b\f\n\f\f\fk\t\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\fp\b\f\n\f\f\fs\t\f\u0001\f\u0003\fv\b\f\u0001\r\u0004\ry\b\r\u000b\r"+
		"\f\rz\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0083\b\u000e\n\u000e\f\u000e\u0086\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u0084\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0007\u0003\u000009AZaz\u0003\u0000AZ__az\u0005\u0000"+
		"--09AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'"+
		"\'\u0003\u0000\t\n\r\r  \u009a\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000"+
		"\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b"+
		")\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f;\u0001\u0000"+
		"\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000"+
		"\u0015K\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019u"+
		"\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d~\u0001\u0000"+
		"\u0000\u0000\u001f \u0005{\u0000\u0000 \u0002\u0001\u0000\u0000\u0000"+
		"!\"\u0005}\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005:\u0000"+
		"\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005;\u0000\u0000&\b\u0001\u0000"+
		"\u0000\u0000\'(\u0005,\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005"+
		"@\u0000\u0000*+\u0005m\u0000\u0000+,\u0005e\u0000\u0000,-\u0005d\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005a\u0000\u0000/\f\u0001\u0000\u0000"+
		"\u000001\u0005!\u0000\u000012\u0005i\u0000\u000023\u0005m\u0000\u0000"+
		"34\u0005p\u0000\u000045\u0005o\u0000\u000056\u0005r\u0000\u000067\u0005"+
		"t\u0000\u000078\u0005a\u0000\u000089\u0005n\u0000\u00009:\u0005t\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;=\u0005#\u0000\u0000<>\u0007\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0010\u0001\u0000\u0000"+
		"\u0000AB\u0005.\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CG\u0007\u0001"+
		"\u0000\u0000DF\u0007\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u0014\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0007\u0003"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000"+
		"OQ\u0005.\u0000\u0000PR\u0007\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005p\u0000\u0000Xd\u0005"+
		"x\u0000\u0000YZ\u0005e\u0000\u0000Zd\u0005m\u0000\u0000[\\\u0005r\u0000"+
		"\u0000\\]\u0005e\u0000\u0000]d\u0005m\u0000\u0000^d\u0005%\u0000\u0000"+
		"_`\u0005v\u0000\u0000`d\u0005h\u0000\u0000ab\u0005v\u0000\u0000bd\u0005"+
		"w\u0000\u0000cW\u0001\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000c[\u0001"+
		"\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ei\u0005\"\u0000"+
		"\u0000fh\b\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lv\u0005\"\u0000\u0000mq\u0005\'"+
		"\u0000\u0000np\b\u0005\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0005\'\u0000\u0000ue\u0001"+
		"\u0000\u0000\u0000um\u0001\u0000\u0000\u0000v\u001a\u0001\u0000\u0000"+
		"\u0000wy\u0007\u0006\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0006\r\u0000\u0000}\u001c\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005/\u0000\u0000\u007f\u0080\u0005*\u0000\u0000\u0080\u0084"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\t\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"*\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0006\u000e\u0000\u0000\u008b\u001e\u0001\u0000\u0000"+
		"\u0000\f\u0000?GMSUciquz\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}