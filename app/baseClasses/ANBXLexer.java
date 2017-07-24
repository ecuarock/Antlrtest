// Generated from ANBX.g4 by ANTLR 4.7

    package baseClasses;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ANBX_Identifier=25, ANBX_COMMENT=26, WS=27, ANBX_DELIMITER=28, ANBX_KNOW_RESERVEDWORDS=29, 
		ANBX_KNOW=30, ANBX_KNOW_FUNCTION=31, ANBX_KNOW_CONDITION=32, ANBX_CHANNEL=33, 
		ANBX_OPERATION=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "ANBX_Identifier", 
		"ANBX_COMMENT", "WS", "ANBX_DELIMITER", "ANBX_KNOW_RESERVEDWORDS", "ANBX_KNOW", 
		"ANBX_KNOW_FUNCTION", "ANBX_KNOW_CONDITION", "ANBX_CHANNEL", "ANBX_OPERATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "'Types'", "';'", "'['", "']'", "'Definitions'", "'{'", 
		"'}'", "'|'", "'Knowledge'", "'where'", "'share'", "'agree'", "'Actions'", 
		"'('", "'-'", "')'", "'Goals'", "'weakly'", "'authenticates'", "'on'", 
		"'secret'", "'between'", "'of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ANBX_Identifier", "ANBX_COMMENT", "WS", "ANBX_DELIMITER", "ANBX_KNOW_RESERVEDWORDS", 
		"ANBX_KNOW", "ANBX_KNOW_FUNCTION", "ANBX_KNOW_CONDITION", "ANBX_CHANNEL", 
		"ANBX_OPERATION"
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


	public ANBXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANBX.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32\u00cb"+
		"\n\32\f\32\16\32\u00ce\13\32\3\33\3\33\7\33\u00d2\n\33\f\33\16\33\u00d5"+
		"\13\33\3\33\3\33\3\34\3\34\5\34\u00db\n\34\3\34\6\34\u00de\n\34\r\34\16"+
		"\34\u00df\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u00f0\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u00f7\n\37\7"+
		"\37\u00f9\n\37\f\37\16\37\u00fc\13\37\3\37\5\37\u00ff\n\37\3 \3 \3 \3"+
		" \3 \3 \7 \u0107\n \f \16 \u010a\13 \3 \3 \3 \3 \7 \u0110\n \f \16 \u0113"+
		"\13 \3 \3 \3 \3 \7 \u0119\n \f \16 \u011c\13 \5 \u011e\n \3 \3 \3 \3 "+
		"\3 \3 \3 \7 \u0127\n \f \16 \u012a\13 \3 \3 \3 \3 \7 \u0130\n \f \16 "+
		"\u0133\13 \3 \3 \3 \3 \7 \u0139\n \f \16 \u013c\13 \5 \u013e\n \3 \3 "+
		"\5 \u0142\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u0155\n\"\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\b\5\2C\\aac|\6\2\62;C"+
		"\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\4\2..<=\4\2BB``\2\u016f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5P\3\2\2\2"+
		"\7V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2"+
		"\23l\3\2\2\2\25n\3\2\2\2\27x\3\2\2\2\31~\3\2\2\2\33\u0084\3\2\2\2\35\u008a"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2"+
		"\'\u009e\3\2\2\2)\u00a5\3\2\2\2+\u00b3\3\2\2\2-\u00b6\3\2\2\2/\u00bd\3"+
		"\2\2\2\61\u00c5\3\2\2\2\63\u00c8\3\2\2\2\65\u00cf\3\2\2\2\67\u00dd\3\2"+
		"\2\29\u00e3\3\2\2\2;\u00ef\3\2\2\2=\u00fe\3\2\2\2?\u0141\3\2\2\2A\u0143"+
		"\3\2\2\2C\u0154\3\2\2\2E\u0156\3\2\2\2GH\7R\2\2HI\7t\2\2IJ\7q\2\2JK\7"+
		"v\2\2KL\7q\2\2LM\7e\2\2MN\7q\2\2NO\7n\2\2O\4\3\2\2\2PQ\7V\2\2QR\7{\2\2"+
		"RS\7r\2\2ST\7g\2\2TU\7u\2\2U\6\3\2\2\2VW\7=\2\2W\b\3\2\2\2XY\7]\2\2Y\n"+
		"\3\2\2\2Z[\7_\2\2[\f\3\2\2\2\\]\7F\2\2]^\7g\2\2^_\7h\2\2_`\7k\2\2`a\7"+
		"p\2\2ab\7k\2\2bc\7v\2\2cd\7k\2\2de\7q\2\2ef\7p\2\2fg\7u\2\2g\16\3\2\2"+
		"\2hi\7}\2\2i\20\3\2\2\2jk\7\177\2\2k\22\3\2\2\2lm\7~\2\2m\24\3\2\2\2n"+
		"o\7M\2\2op\7p\2\2pq\7q\2\2qr\7y\2\2rs\7n\2\2st\7g\2\2tu\7f\2\2uv\7i\2"+
		"\2vw\7g\2\2w\26\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7g\2\2{|\7t\2\2|}\7g\2\2}"+
		"\30\3\2\2\2~\177\7u\2\2\177\u0080\7j\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7g\2\2\u0083\32\3\2\2\2\u0084\u0085\7c\2\2\u0085\u0086"+
		"\7i\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7g\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\7C\2\2\u008b\u008c\7e\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7u\2\2"+
		"\u0091\36\3\2\2\2\u0092\u0093\7*\2\2\u0093 \3\2\2\2\u0094\u0095\7/\2\2"+
		"\u0095\"\3\2\2\2\u0096\u0097\7+\2\2\u0097$\3\2\2\2\u0098\u0099\7I\2\2"+
		"\u0099\u009a\7q\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d"+
		"\7u\2\2\u009d&\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7c\2\2\u00a1\u00a2\7m\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7{\2\2\u00a4"+
		"(\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7j\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\u00ad\7k\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7u\2\2\u00b2*\3\2\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7p\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc.\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u00c4\7p\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7"+
		"h\2\2\u00c7\62\3\2\2\2\u00c8\u00cc\t\2\2\2\u00c9\u00cb\t\3\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\64\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\7%\2\2\u00d0\u00d2\n\4\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\33\2\2"+
		"\u00d7\66\3\2\2\2\u00d8\u00de\t\5\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\f\2\2\u00dd"+
		"\u00d8\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\34\2\2\u00e2"+
		"8\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4:\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6"+
		"\u00e7\7j\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00f0\7g\2\2"+
		"\u00ea\u00eb\7c\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0"+
		"<\3\2\2\2\u00f1\u00ff\5\63\32\2\u00f2\u00fa\5\63\32\2\u00f3\u00f6\59\35"+
		"\2\u00f4\u00f7\5\63\32\2\u00f5\u00f7\5? \2\u00f6\u00f4\3\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00ff\5? \2\u00fe\u00f1\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff>\3\2\2\2\u0100\u0101\5\63\32\2\u0101\u011d\7*\2\2\u0102"+
		"\u0108\5\63\32\2\u0103\u0104\59\35\2\u0104\u0105\5\63\32\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u011e\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0111\5?"+
		" \2\u010c\u010d\59\35\2\u010d\u010e\5? \2\u010e\u0110\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u011e\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u011a\5=\37\2\u0115\u0116\59"+
		"\35\2\u0116\u0117\5=\37\2\u0117\u0119\3\2\2\2\u0118\u0115\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u0102\3\2\2\2\u011d\u010b\3\2\2\2\u011d"+
		"\u0114\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7+\2\2\u0120\u0142\3\2"+
		"\2\2\u0121\u013d\7*\2\2\u0122\u0128\5\63\32\2\u0123\u0124\59\35\2\u0124"+
		"\u0125\5\63\32\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u013e\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0131\5? \2\u012c\u012d\59\35\2\u012d\u012e\5? \2"+
		"\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013e\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u013a\5=\37\2\u0135\u0136\59\35\2\u0136\u0137\5=\37\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0122\3\2"+
		"\2\2\u013d\u012b\3\2\2\2\u013d\u0134\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7+\2\2\u0140\u0142\3\2\2\2\u0141\u0100\3\2\2\2\u0141\u0121\3\2"+
		"\2\2\u0142@\3\2\2\2\u0143\u0144\5\63\32\2\u0144\u0145\7#\2\2\u0145\u0146"+
		"\7?\2\2\u0146\u0147\5\63\32\2\u0147B\3\2\2\2\u0148\u0149\7/\2\2\u0149"+
		"\u0155\7@\2\2\u014a\u014b\7,\2\2\u014b\u014c\7/\2\2\u014c\u014d\7@\2\2"+
		"\u014d\u0155\7,\2\2\u014e\u014f\7,\2\2\u014f\u0150\7/\2\2\u0150\u0155"+
		"\7@\2\2\u0151\u0152\7/\2\2\u0152\u0153\7@\2\2\u0153\u0155\7,\2\2\u0154"+
		"\u0148\3\2\2\2\u0154\u014a\3\2\2\2\u0154\u014e\3\2\2\2\u0154\u0151\3\2"+
		"\2\2\u0155D\3\2\2\2\u0156\u0157\t\7\2\2\u0157F\3\2\2\2\26\2\u00cc\u00d3"+
		"\u00da\u00dd\u00df\u00ef\u00f6\u00fa\u00fe\u0108\u0111\u011a\u011d\u0128"+
		"\u0131\u013a\u013d\u0141\u0154\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}