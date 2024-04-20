package calculator.parser;// Generated from C:/Users/sacry_000/Documents/Git/calculator-cucumber-2024/src/main/antlr4/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, XOR=3, NOT=4, IMPLIES=5, BOOLEAN=6, COS=7, SIN=8, TAN=9, 
		ACOS=10, ASIN=11, ATAN=12, LN=13, LOG=14, SQRT=15, LPAREN=16, RPAREN=17, 
		PLUS=18, MINUS=19, TIMES=20, DIV=21, COMMA=22, POINT=23, POW=24, PI=25, 
		EULER=26, I=27, VARIABLE=28, SCIENTIFIC_NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "XOR", "NOT", "IMPLIES", "BOOLEAN", "COS", "SIN", "TAN", 
			"ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", 
			"MINUS", "TIMES", "DIV", "COMMA", "POINT", "POW", "PI", "EULER", "I", 
			"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "SCIENTIFIC_NUMBER", "NUMBER", 
			"E1", "E2", "SIGN", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'|'", "'^'", "'!'", "'=>'", null, "'cos'", "'sin'", "'tan'", 
			"'acos'", "'asin'", "'atan'", "'ln'", "'log'", "'sqrt'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'/'", "','", "'.'", "'**'", "'pi'", null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "XOR", "NOT", "IMPLIES", "BOOLEAN", "COS", "SIN", 
			"TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "TIMES", "DIV", "COMMA", "POINT", "POW", "PI", "EULER", 
			"I", "VARIABLE", "SCIENTIFIC_NUMBER", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u001e\u00d3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!"+
		"\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"^\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u00a3\b\u001b\n\u001b\f\u001b\u00a6\t\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u00ac\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00b1\b\u001e\u0001\u001e\u0003"+
		"\u001e\u00b4\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00b8\b\u001e"+
		"\u0001\u001f\u0004\u001f\u00bb\b\u001f\u000b\u001f\f\u001f\u00bc\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u00c1\b\u001f\u000b\u001f\f\u001f\u00c2"+
		"\u0003\u001f\u00c5\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001#\u0004#\u00ce\b#\u000b#\f#\u00cf\u0001#\u0001#\u0000\u0000$\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u0000;\u0000=\u001d?\u0000A\u0000"+
		"C\u0000E\u0000G\u001e\u0001\u0000\u0003\u0003\u0000AZ__az\u0002\u0000"+
		"++--\u0003\u0000\t\n\r\r  \u00d6\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000G"+
		"\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K\u0001\u0000"+
		"\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000"+
		"\tQ\u0001\u0000\u0000\u0000\u000b]\u0001\u0000\u0000\u0000\r_\u0001\u0000"+
		"\u0000\u0000\u000fc\u0001\u0000\u0000\u0000\u0011g\u0001\u0000\u0000\u0000"+
		"\u0013k\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017u"+
		"\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b}\u0001\u0000"+
		"\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000\u001f\u0086\u0001\u0000"+
		"\u0000\u0000!\u0088\u0001\u0000\u0000\u0000#\u008a\u0001\u0000\u0000\u0000"+
		"%\u008c\u0001\u0000\u0000\u0000\'\u008e\u0001\u0000\u0000\u0000)\u0090"+
		"\u0001\u0000\u0000\u0000+\u0092\u0001\u0000\u0000\u0000-\u0094\u0001\u0000"+
		"\u0000\u0000/\u0096\u0001\u0000\u0000\u00001\u0099\u0001\u0000\u0000\u0000"+
		"3\u009c\u0001\u0000\u0000\u00005\u009e\u0001\u0000\u0000\u00007\u00a0"+
		"\u0001\u0000\u0000\u00009\u00a7\u0001\u0000\u0000\u0000;\u00ab\u0001\u0000"+
		"\u0000\u0000=\u00ad\u0001\u0000\u0000\u0000?\u00ba\u0001\u0000\u0000\u0000"+
		"A\u00c6\u0001\u0000\u0000\u0000C\u00c8\u0001\u0000\u0000\u0000E\u00ca"+
		"\u0001\u0000\u0000\u0000G\u00cd\u0001\u0000\u0000\u0000IJ\u0005&\u0000"+
		"\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005|\u0000\u0000L\u0004\u0001"+
		"\u0000\u0000\u0000MN\u0005^\u0000\u0000N\u0006\u0001\u0000\u0000\u0000"+
		"OP\u0005!\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005=\u0000\u0000"+
		"RS\u0005>\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005t\u0000\u0000"+
		"UV\u0005r\u0000\u0000VW\u0005u\u0000\u0000W^\u0005e\u0000\u0000XY\u0005"+
		"f\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005s\u0000"+
		"\u0000\\^\u0005e\u0000\u0000]T\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000"+
		"\u0000^\f\u0001\u0000\u0000\u0000_`\u0005c\u0000\u0000`a\u0005o\u0000"+
		"\u0000ab\u0005s\u0000\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005s\u0000"+
		"\u0000de\u0005i\u0000\u0000ef\u0005n\u0000\u0000f\u0010\u0001\u0000\u0000"+
		"\u0000gh\u0005t\u0000\u0000hi\u0005a\u0000\u0000ij\u0005n\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000kl\u0005a\u0000\u0000lm\u0005c\u0000\u0000"+
		"mn\u0005o\u0000\u0000no\u0005s\u0000\u0000o\u0014\u0001\u0000\u0000\u0000"+
		"pq\u0005a\u0000\u0000qr\u0005s\u0000\u0000rs\u0005i\u0000\u0000st\u0005"+
		"n\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0005a\u0000\u0000vw\u0005"+
		"t\u0000\u0000wx\u0005a\u0000\u0000xy\u0005n\u0000\u0000y\u0018\u0001\u0000"+
		"\u0000\u0000z{\u0005l\u0000\u0000{|\u0005n\u0000\u0000|\u001a\u0001\u0000"+
		"\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080"+
		"\u0005g\u0000\u0000\u0080\u001c\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"s\u0000\u0000\u0082\u0083\u0005q\u0000\u0000\u0083\u0084\u0005r\u0000"+
		"\u0000\u0084\u0085\u0005t\u0000\u0000\u0085\u001e\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005(\u0000\u0000\u0087 \u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005)\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"+\u0000\u0000\u008b$\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000"+
		"\u0000\u008d&\u0001\u0000\u0000\u0000\u008e\u008f\u0005*\u0000\u0000\u008f"+
		"(\u0001\u0000\u0000\u0000\u0090\u0091\u0005/\u0000\u0000\u0091*\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005,\u0000\u0000\u0093,\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005.\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005*\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u00980\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005p\u0000\u0000\u009a\u009b\u0005i\u0000"+
		"\u0000\u009b2\u0001\u0000\u0000\u0000\u009c\u009d\u0003C!\u0000\u009d"+
		"4\u0001\u0000\u0000\u0000\u009e\u009f\u0005i\u0000\u0000\u009f6\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a4\u00039\u001c\u0000\u00a1\u00a3\u0003;\u001d"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a58\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8:\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u00039\u001c\u0000\u00aa\u00ac\u000209\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac<\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b7\u0003?\u001f\u0000\u00ae\u00b1\u0003A \u0000"+
		"\u00af\u00b1\u0003C!\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0003E\"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003"+
		"?\u001f\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8>\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u000209\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c4\u0001\u0000\u0000\u0000\u00be"+
		"\u00c0\u0005.\u0000\u0000\u00bf\u00c1\u000209\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5@\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005E\u0000"+
		"\u0000\u00c7B\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005e\u0000\u0000\u00c9"+
		"D\u0001\u0000\u0000\u0000\u00ca\u00cb\u0007\u0001\u0000\u0000\u00cbF\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u0007\u0002\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0006#\u0000\u0000\u00d2H\u0001\u0000\u0000"+
		"\u0000\u000b\u0000]\u00a4\u00ab\u00b0\u00b3\u00b7\u00bc\u00c2\u00c4\u00cf"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}