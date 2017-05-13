// Generated from ShelloidQueryLexer.g4 by ANTLR 4.5
package com.shelloid.query;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShelloidQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, HAVING=4, SAMPLE=5, SETUP=6, TEARDOWN=7, ON=8, 
		EVERY=9, PRIORITY=10, ACTION=11, LET=12, LC=13, RC=14, LP=15, RP=16, INT=17, 
		STRING=18, FLOAT=19, DIV=20, MUL=21, MOD=22, PLUS=23, MINUS=24, EQ=25, 
		AND=26, OR=27, NOT=28, LT=29, GT=30, GTE=31, LTE=32, NEQ=33, DOT=34, ID=35, 
		WS=36, COMMENT=37, COMMA=38, SEMI=39, LETTER=40, DIGIT=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "HAVING", "SAMPLE", "SETUP", "TEARDOWN", "ON", 
		"EVERY", "PRIORITY", "ACTION", "LET", "LC", "RC", "LP", "RP", "INT", "STRING", 
		"FLOAT", "DIV", "MUL", "MOD", "PLUS", "MINUS", "EQ", "AND", "OR", "NOT", 
		"LT", "GT", "GTE", "LTE", "NEQ", "DOT", "ID", "WS", "COMMENT", "COMMA", 
		"SEMI", "ESC", "LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'HAVING'", "'SAMPLE'", "'SETUP'", 
		"'TEARDOWN'", "'ON'", "'EVERY'", "'PRIORITY'", "'ACTION'", "'LET'", "'{'", 
		"'}'", "'('", "')'", null, null, null, "'/'", "'*'", "'%'", "'+'", "'-'", 
		"'='", "'AND'", "'OR'", "'NOT'", "'<'", "'>'", "'>='", "'<='", "'<>'", 
		"'.'", null, null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "HAVING", "SAMPLE", "SETUP", "TEARDOWN", 
		"ON", "EVERY", "PRIORITY", "ACTION", "LET", "LC", "RC", "LP", "RP", "INT", 
		"STRING", "FLOAT", "DIV", "MUL", "MOD", "PLUS", "MINUS", "EQ", "AND", 
		"OR", "NOT", "LT", "GT", "GTE", "LTE", "NEQ", "DOT", "ID", "WS", "COMMENT", 
		"COMMA", "SEMI", "LETTER", "DIGIT"
	};
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


	public ShelloidQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShelloidQueryLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u012d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\6\22\u00ad\n\22\r\22\16\22\u00ae\3\23\3\23\3\23\7\23\u00b4\n"+
		"\23\f\23\16\23\u00b7\13\23\3\23\3\23\3\24\6\24\u00bc\n\24\r\24\16\24\u00bd"+
		"\3\24\3\24\6\24\u00c2\n\24\r\24\16\24\u00c3\3\24\3\24\6\24\u00c8\n\24"+
		"\r\24\16\24\u00c9\5\24\u00cc\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\5$\u00f6\n$\3$\3$\3$\7$\u00fb\n$\f$\16$\u00fe\13$\3%\6%\u0101\n%\r%"+
		"\16%\u0102\3%\3%\3&\3&\3&\3&\7&\u010b\n&\f&\16&\u010e\13&\3&\3&\3&\3&"+
		"\3&\3&\7&\u0116\n&\f&\16&\u0119\13&\3&\5&\u011c\n&\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3)\3)\5)\u0128\n)\3*\3*\3+\3+\5\u00b5\u010c\u0117\2,\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q\2S*U+\3\2\7\4\2&&aa\7\2##&&//AAaa\5\2\13\f\17\17\"\"\4"+
		"\2C\\c|\3\2\62;\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13p\3"+
		"\2\2\2\rw\3\2\2\2\17}\3\2\2\2\21\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008f"+
		"\3\2\2\2\27\u0098\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3"+
		"\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ac\3\2\2\2%\u00b0\3\2\2\2\'"+
		"\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d3\3\2"+
		"\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00dd\3\2\2"+
		"\29\u00e0\3\2\2\2;\u00e4\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00eb"+
		"\3\2\2\2C\u00ee\3\2\2\2E\u00f1\3\2\2\2G\u00f5\3\2\2\2I\u0100\3\2\2\2K"+
		"\u011b\3\2\2\2M\u011f\3\2\2\2O\u0121\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2"+
		"\2\2U\u012b\3\2\2\2WX\7U\2\2XY\7G\2\2YZ\7N\2\2Z[\7G\2\2[\\\7E\2\2\\]\7"+
		"V\2\2]\4\3\2\2\2^_\7H\2\2_`\7T\2\2`a\7Q\2\2ab\7O\2\2b\6\3\2\2\2cd\7Y\2"+
		"\2de\7J\2\2ef\7G\2\2fg\7T\2\2gh\7G\2\2h\b\3\2\2\2ij\7J\2\2jk\7C\2\2kl"+
		"\7X\2\2lm\7K\2\2mn\7P\2\2no\7I\2\2o\n\3\2\2\2pq\7U\2\2qr\7C\2\2rs\7O\2"+
		"\2st\7R\2\2tu\7N\2\2uv\7G\2\2v\f\3\2\2\2wx\7U\2\2xy\7G\2\2yz\7V\2\2z{"+
		"\7W\2\2{|\7R\2\2|\16\3\2\2\2}~\7V\2\2~\177\7G\2\2\177\u0080\7C\2\2\u0080"+
		"\u0081\7T\2\2\u0081\u0082\7F\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7Y\2\2"+
		"\u0084\u0085\7P\2\2\u0085\20\3\2\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7"+
		"P\2\2\u0088\22\3\2\2\2\u0089\u008a\7G\2\2\u008a\u008b\7X\2\2\u008b\u008c"+
		"\7G\2\2\u008c\u008d\7T\2\2\u008d\u008e\7[\2\2\u008e\24\3\2\2\2\u008f\u0090"+
		"\7R\2\2\u0090\u0091\7T\2\2\u0091\u0092\7K\2\2\u0092\u0093\7Q\2\2\u0093"+
		"\u0094\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7V\2\2\u0096\u0097\7[\2\2"+
		"\u0097\26\3\2\2\2\u0098\u0099\7C\2\2\u0099\u009a\7E\2\2\u009a\u009b\7"+
		"V\2\2\u009b\u009c\7K\2\2\u009c\u009d\7Q\2\2\u009d\u009e\7P\2\2\u009e\30"+
		"\3\2\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7V\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7\177\2\2"+
		"\u00a6\36\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7+\2\2"+
		"\u00aa\"\3\2\2\2\u00ab\u00ad\5U+\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af$\3\2\2\2\u00b0\u00b5"+
		"\7)\2\2\u00b1\u00b4\5Q)\2\u00b2\u00b4\13\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9"+
		"&\3\2\2\2\u00ba\u00bc\5U+\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\60"+
		"\2\2\u00c0\u00c2\5U+\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c7\7\60\2\2"+
		"\u00c6\u00c8\5U+\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00bb\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce*\3\2\2\2\u00cf"+
		"\u00d0\7,\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7\'\2\2\u00d2.\3\2\2\2\u00d3"+
		"\u00d4\7-\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6\62\3\2\2\2\u00d7"+
		"\u00d8\7?\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7P\2\2\u00db"+
		"\u00dc\7F\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7Q\2\2\u00de\u00df\7T\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e1\7P\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7V\2\2\u00e3"+
		":\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7>"+
		"\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea\7?\2\2\u00ea@\3\2\2\2\u00eb\u00ec"+
		"\7>\2\2\u00ec\u00ed\7?\2\2\u00edB\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef\u00f0"+
		"\7@\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2F\3\2\2\2\u00f3\u00f6"+
		"\5S*\2\u00f4\u00f6\t\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00fc\3\2\2\2\u00f7\u00fb\5S*\2\u00f8\u00fb\5U+\2\u00f9\u00fb\t\3\2\2"+
		"\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdH\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\b%\2\2\u0105J\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7,\2\2\u0108"+
		"\u010c\3\2\2\2\u0109\u010b\13\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\7,\2\2\u0110\u011c\7\61\2\2\u0111\u0112\7\61"+
		"\2\2\u0112\u0113\7\61\2\2\u0113\u0117\3\2\2\2\u0114\u0116\13\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7\f\2\2\u011b"+
		"\u0106\3\2\2\2\u011b\u0111\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b&"+
		"\2\2\u011eL\3\2\2\2\u011f\u0120\7.\2\2\u0120N\3\2\2\2\u0121\u0122\7=\2"+
		"\2\u0122P\3\2\2\2\u0123\u0124\7^\2\2\u0124\u0128\7)\2\2\u0125\u0126\7"+
		"^\2\2\u0126\u0128\7^\2\2\u0127\u0123\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"R\3\2\2\2\u0129\u012a\t\5\2\2\u012aT\3\2\2\2\u012b\u012c\t\6\2\2\u012c"+
		"V\3\2\2\2\22\2\u00ae\u00b3\u00b5\u00bd\u00c3\u00c9\u00cb\u00f5\u00fa\u00fc"+
		"\u0102\u010c\u0117\u011b\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}