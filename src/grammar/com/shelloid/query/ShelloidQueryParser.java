// Generated from ShelloidQueryParser.g4 by ANTLR 4.5
package com.shelloid.query;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShelloidQueryParser extends Parser {
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
	public static final int
		RULE_query = 0, RULE_samplingClause = 1, RULE_samplingPeriod = 2, RULE_samplingEvents = 3, 
		RULE_priority = 4, RULE_selectClause = 5, RULE_qualifiedName = 6, RULE_simpleName = 7, 
		RULE_literal = 8, RULE_paramList = 9, RULE_selectTerm = 10, RULE_fromClause = 11, 
		RULE_arithExpr = 12, RULE_functionCallExpr = 13, RULE_commonExpr = 14, 
		RULE_relationalExpr = 15, RULE_booleanExpr = 16, RULE_letClause = 17, 
		RULE_whereClause = 18, RULE_setupClause = 19, RULE_teardownClause = 20, 
		RULE_actionClause = 21, RULE_script = 22;
	public static final String[] ruleNames = {
		"query", "samplingClause", "samplingPeriod", "samplingEvents", "priority", 
		"selectClause", "qualifiedName", "simpleName", "literal", "paramList", 
		"selectTerm", "fromClause", "arithExpr", "functionCallExpr", "commonExpr", 
		"relationalExpr", "booleanExpr", "letClause", "whereClause", "setupClause", 
		"teardownClause", "actionClause", "script"
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

	@Override
	public String getGrammarFileName() { return "ShelloidQueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShelloidQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ShelloidQueryParser.SELECT, 0); }
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ShelloidQueryParser.FROM, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode SAMPLE() { return getToken(ShelloidQueryParser.SAMPLE, 0); }
		public SamplingClauseContext samplingClause() {
			return getRuleContext(SamplingClauseContext.class,0);
		}
		public TerminalNode LET() { return getToken(ShelloidQueryParser.LET, 0); }
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ShelloidQueryParser.WHERE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode SETUP() { return getToken(ShelloidQueryParser.SETUP, 0); }
		public SetupClauseContext setupClause() {
			return getRuleContext(SetupClauseContext.class,0);
		}
		public TerminalNode TEARDOWN() { return getToken(ShelloidQueryParser.TEARDOWN, 0); }
		public TeardownClauseContext teardownClause() {
			return getRuleContext(TeardownClauseContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ShelloidQueryParser.ACTION, 0); }
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public TerminalNode PRIORITY() { return getToken(ShelloidQueryParser.PRIORITY, 0); }
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SELECT);
			setState(47);
			selectClause();
			setState(48);
			match(FROM);
			setState(49);
			fromClause();
			setState(52);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(50);
				match(LET);
				setState(51);
				letClause();
				}
			}

			setState(56);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(54);
				match(WHERE);
				setState(55);
				whereClause();
				}
			}

			setState(60);
			_la = _input.LA(1);
			if (_la==SETUP) {
				{
				setState(58);
				match(SETUP);
				setState(59);
				setupClause();
				}
			}

			setState(64);
			_la = _input.LA(1);
			if (_la==TEARDOWN) {
				{
				setState(62);
				match(TEARDOWN);
				setState(63);
				teardownClause();
				}
			}

			setState(68);
			_la = _input.LA(1);
			if (_la==ACTION) {
				{
				setState(66);
				match(ACTION);
				setState(67);
				actionClause();
				}
			}

			setState(70);
			match(SAMPLE);
			setState(71);
			samplingClause();
			setState(74);
			_la = _input.LA(1);
			if (_la==PRIORITY) {
				{
				setState(72);
				match(PRIORITY);
				setState(73);
				priority();
				}
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

	public static class SamplingClauseContext extends ParserRuleContext {
		public TerminalNode EVERY() { return getToken(ShelloidQueryParser.EVERY, 0); }
		public SamplingPeriodContext samplingPeriod() {
			return getRuleContext(SamplingPeriodContext.class,0);
		}
		public TerminalNode ON() { return getToken(ShelloidQueryParser.ON, 0); }
		public SamplingEventsContext samplingEvents() {
			return getRuleContext(SamplingEventsContext.class,0);
		}
		public SamplingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSamplingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSamplingClause(this);
		}
	}

	public final SamplingClauseContext samplingClause() throws RecognitionException {
		SamplingClauseContext _localctx = new SamplingClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_samplingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(76);
				match(EVERY);
				setState(77);
				samplingPeriod();
				}
				break;
			case ON:
				{
				setState(78);
				match(ON);
				setState(79);
				samplingEvents();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SamplingPeriodContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ShelloidQueryParser.INT, 0); }
		public SamplingPeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplingPeriod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSamplingPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSamplingPeriod(this);
		}
	}

	public final SamplingPeriodContext samplingPeriod() throws RecognitionException {
		SamplingPeriodContext _localctx = new SamplingPeriodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_samplingPeriod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INT);
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

	public static class SamplingEventsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ShelloidQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ShelloidQueryParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShelloidQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShelloidQueryParser.COMMA, i);
		}
		public SamplingEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplingEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSamplingEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSamplingEvents(this);
		}
	}

	public final SamplingEventsContext samplingEvents() throws RecognitionException {
		SamplingEventsContext _localctx = new SamplingEventsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_samplingEvents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				match(ID);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PriorityContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ShelloidQueryParser.INT, 0); }
		public PriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitPriority(this);
		}
	}

	public final PriorityContext priority() throws RecognitionException {
		PriorityContext _localctx = new PriorityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(INT);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public List<SelectTermContext> selectTerm() {
			return getRuleContexts(SelectTermContext.class);
		}
		public SelectTermContext selectTerm(int i) {
			return getRuleContext(SelectTermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShelloidQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShelloidQueryParser.COMMA, i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSelectClause(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			selectTerm();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				selectTerm();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ShelloidQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ShelloidQueryParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ShelloidQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ShelloidQueryParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(DOT);
					setState(104);
					match(ID);
					}
					} 
				}
				setState(109);
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
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ShelloidQueryParser.ID, 0); }
		public SimpleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSimpleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSimpleName(this);
		}
	}

	public final SimpleNameContext simpleName() throws RecognitionException {
		SimpleNameContext _localctx = new SimpleNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ShelloidQueryParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ShelloidQueryParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ShelloidQueryParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ParamListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShelloidQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShelloidQueryParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			qualifiedName();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				qualifiedName();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SelectTermContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ShelloidQueryParser.LP, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ShelloidQueryParser.RP, 0); }
		public SelectTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSelectTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSelectTerm(this);
		}
	}

	public final SelectTermContext selectTerm() throws RecognitionException {
		SelectTermContext _localctx = new SelectTermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectTerm);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				simpleName();
				setState(124);
				match(LP);
				setState(125);
				paramList();
				setState(126);
				match(RP);
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

	public static class FromClauseContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			simpleName();
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

	public static class ArithExprContext extends ParserRuleContext {
		public Token op;
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(ShelloidQueryParser.MINUS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public TerminalNode LP() { return getToken(ShelloidQueryParser.LP, 0); }
		public TerminalNode RP() { return getToken(ShelloidQueryParser.RP, 0); }
		public TerminalNode PLUS() { return getToken(ShelloidQueryParser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(ShelloidQueryParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ShelloidQueryParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ShelloidQueryParser.MOD, 0); }
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		return arithExpr(0);
	}

	private ArithExprContext arithExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithExprContext _localctx = new ArithExprContext(_ctx, _parentState);
		ArithExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(133);
				((ArithExprContext)_localctx).op = match(MINUS);
				setState(134);
				arithExpr(2);
				}
				break;
			case 2:
				{
				setState(135);
				qualifiedName();
				}
				break;
			case 3:
				{
				setState(136);
				literal();
				}
				break;
			case 4:
				{
				setState(137);
				functionCallExpr();
				}
				break;
			case 5:
				{
				setState(138);
				match(LP);
				setState(139);
				arithExpr(0);
				setState(140);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ArithExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(144);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(145);
						((ArithExprContext)_localctx).op = match(PLUS);
						setState(146);
						arithExpr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						((ArithExprContext)_localctx).op = match(MINUS);
						setState(149);
						arithExpr(7);
						}
						break;
					case 3:
						{
						_localctx = new ArithExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						((ArithExprContext)_localctx).op = match(MUL);
						setState(152);
						arithExpr(6);
						}
						break;
					case 4:
						{
						_localctx = new ArithExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						((ArithExprContext)_localctx).op = match(DIV);
						setState(155);
						arithExpr(5);
						}
						break;
					case 5:
						{
						_localctx = new ArithExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						((ArithExprContext)_localctx).op = match(MOD);
						setState(158);
						arithExpr(4);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FunctionCallExprContext extends ParserRuleContext {
		public SimpleNameContext simpleName() {
			return getRuleContext(SimpleNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ShelloidQueryParser.LP, 0); }
		public TerminalNode RP() { return getToken(ShelloidQueryParser.RP, 0); }
		public List<CommonExprContext> commonExpr() {
			return getRuleContexts(CommonExprContext.class);
		}
		public CommonExprContext commonExpr(int i) {
			return getRuleContext(CommonExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShelloidQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShelloidQueryParser.COMMA, i);
		}
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitFunctionCallExpr(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			simpleName();
			setState(165);
			match(LP);
			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << MINUS) | (1L << NOT) | (1L << ID))) != 0)) {
				{
				setState(166);
				commonExpr();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				commonExpr();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RP);
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

	public static class CommonExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public CommonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterCommonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitCommonExpr(this);
		}
	}

	public final CommonExprContext commonExpr() throws RecognitionException {
		CommonExprContext _localctx = new CommonExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_commonExpr);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				arithExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				booleanExpr(0);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public Token op;
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(ShelloidQueryParser.GT, 0); }
		public TerminalNode LT() { return getToken(ShelloidQueryParser.LT, 0); }
		public TerminalNode GTE() { return getToken(ShelloidQueryParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(ShelloidQueryParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(ShelloidQueryParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ShelloidQueryParser.NEQ, 0); }
		public TerminalNode LP() { return getToken(ShelloidQueryParser.LP, 0); }
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(ShelloidQueryParser.RP, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitRelationalExpr(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationalExpr);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				arithExpr(0);
				setState(183);
				((RelationalExprContext)_localctx).op = match(GT);
				setState(184);
				arithExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				arithExpr(0);
				setState(187);
				((RelationalExprContext)_localctx).op = match(LT);
				setState(188);
				arithExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				arithExpr(0);
				setState(191);
				((RelationalExprContext)_localctx).op = match(GTE);
				setState(192);
				arithExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				arithExpr(0);
				setState(195);
				((RelationalExprContext)_localctx).op = match(LTE);
				setState(196);
				arithExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				arithExpr(0);
				setState(199);
				((RelationalExprContext)_localctx).op = match(EQ);
				setState(200);
				arithExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				arithExpr(0);
				setState(203);
				((RelationalExprContext)_localctx).op = match(NEQ);
				setState(204);
				arithExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(LP);
				setState(207);
				relationalExpr();
				setState(208);
				match(RP);
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

	public static class BooleanExprContext extends ParserRuleContext {
		public Token op;
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ShelloidQueryParser.NOT, 0); }
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode LP() { return getToken(ShelloidQueryParser.LP, 0); }
		public TerminalNode RP() { return getToken(ShelloidQueryParser.RP, 0); }
		public TerminalNode OR() { return getToken(ShelloidQueryParser.OR, 0); }
		public TerminalNode AND() { return getToken(ShelloidQueryParser.AND, 0); }
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitBooleanExpr(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_booleanExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(213);
				((BooleanExprContext)_localctx).op = match(NOT);
				setState(214);
				booleanExpr(2);
				}
				break;
			case 2:
				{
				setState(215);
				relationalExpr();
				}
				break;
			case 3:
				{
				setState(216);
				match(LP);
				setState(217);
				booleanExpr(0);
				setState(218);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						((BooleanExprContext)_localctx).op = match(OR);
						setState(224);
						booleanExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						((BooleanExprContext)_localctx).op = match(AND);
						setState(227);
						booleanExpr(4);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class LetClauseContext extends ParserRuleContext {
		public List<SimpleNameContext> simpleName() {
			return getRuleContexts(SimpleNameContext.class);
		}
		public SimpleNameContext simpleName(int i) {
			return getRuleContext(SimpleNameContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(ShelloidQueryParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ShelloidQueryParser.EQ, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShelloidQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShelloidQueryParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitLetClause(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			simpleName();
			setState(234);
			match(EQ);
			setState(235);
			literal();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				simpleName();
				setState(238);
				match(EQ);
				setState(239);
				literal();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			booleanExpr(0);
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

	public static class SetupClauseContext extends ParserRuleContext {
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public SetupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterSetupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitSetupClause(this);
		}
	}

	public final SetupClauseContext setupClause() throws RecognitionException {
		SetupClauseContext _localctx = new SetupClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setupClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			actionClause();
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

	public static class TeardownClauseContext extends ParserRuleContext {
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public TeardownClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teardownClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterTeardownClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitTeardownClause(this);
		}
	}

	public final TeardownClauseContext teardownClause() throws RecognitionException {
		TeardownClauseContext _localctx = new TeardownClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_teardownClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			actionClause();
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

	public static class ActionClauseContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(ShelloidQueryParser.LC, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode RC() { return getToken(ShelloidQueryParser.RC, 0); }
		public ActionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterActionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitActionClause(this);
		}
	}

	public final ActionClauseContext actionClause() throws RecognitionException {
		ActionClauseContext _localctx = new ActionClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_actionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LC);
			setState(253);
			script();
			setState(254);
			match(RC);
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

	public static class ScriptContext extends ParserRuleContext {
		public List<FunctionCallExprContext> functionCallExpr() {
			return getRuleContexts(FunctionCallExprContext.class);
		}
		public FunctionCallExprContext functionCallExpr(int i) {
			return getRuleContext(FunctionCallExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ShelloidQueryParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ShelloidQueryParser.SEMI, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShelloidQueryParserListener ) ((ShelloidQueryParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(256);
				functionCallExpr();
				setState(257);
				match(SEMI);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return arithExpr_sempred((ArithExprContext)_localctx, predIndex);
		case 16:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithExpr_sempred(ArithExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\67\n\2\3\2\3\2\5\2;\n\2\3\2\3\2\5\2?\n\2\3\2\3\2\5"+
		"\2C\n\2\3\2\3\2\5\2G\n\2\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\3\5\3"+
		"S\n\3\3\4\3\4\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\7\3\7\3\7"+
		"\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0083\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0091\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\17"+
		"\3\17\3\17\5\17\u00aa\n\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1"+
		"\13\17\3\17\3\17\3\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d5\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00df\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00e7\n\22\f\22\16\22\u00ea\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00f4\n\23\f\23\16\23\u00f7\13\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0106\n\30\f\30"+
		"\16\30\u0109\13\30\3\30\2\4\32\"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\3\3\2\23\25\u0117\2\60\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\b"+
		"V\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16h\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24"+
		"t\3\2\2\2\26\u0082\3\2\2\2\30\u0084\3\2\2\2\32\u0090\3\2\2\2\34\u00a6"+
		"\3\2\2\2\36\u00b6\3\2\2\2 \u00d4\3\2\2\2\"\u00de\3\2\2\2$\u00eb\3\2\2"+
		"\2&\u00f8\3\2\2\2(\u00fa\3\2\2\2*\u00fc\3\2\2\2,\u00fe\3\2\2\2.\u0107"+
		"\3\2\2\2\60\61\7\3\2\2\61\62\5\f\7\2\62\63\7\4\2\2\63\66\5\30\r\2\64\65"+
		"\7\16\2\2\65\67\5$\23\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\289\7\5"+
		"\2\29;\5&\24\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<=\7\b\2\2=?\5(\25\2><\3\2"+
		"\2\2>?\3\2\2\2?B\3\2\2\2@A\7\t\2\2AC\5*\26\2B@\3\2\2\2BC\3\2\2\2CF\3\2"+
		"\2\2DE\7\r\2\2EG\5,\27\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\7\2\2IL\5\4"+
		"\3\2JK\7\f\2\2KM\5\n\6\2LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NO\7\13\2\2OS\5"+
		"\6\4\2PQ\7\n\2\2QS\5\b\5\2RN\3\2\2\2RP\3\2\2\2S\5\3\2\2\2TU\7\23\2\2U"+
		"\7\3\2\2\2V[\7%\2\2WX\7(\2\2XZ\7%\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\t\3\2\2\2][\3\2\2\2^_\7\23\2\2_\13\3\2\2\2`e\5\26\f\2ab\7("+
		"\2\2bd\5\26\f\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3"+
		"\2\2\2hm\7%\2\2ij\7$\2\2jl\7%\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2n\17\3\2\2\2om\3\2\2\2pq\7%\2\2q\21\3\2\2\2rs\t\2\2\2s\23\3\2\2\2"+
		"ty\5\16\b\2uv\7(\2\2vx\5\16\b\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z\25\3\2\2\2{y\3\2\2\2|\u0083\5\16\b\2}~\5\20\t\2~\177\7\21\2\2\177"+
		"\u0080\5\24\13\2\u0080\u0081\7\22\2\2\u0081\u0083\3\2\2\2\u0082|\3\2\2"+
		"\2\u0082}\3\2\2\2\u0083\27\3\2\2\2\u0084\u0085\5\20\t\2\u0085\31\3\2\2"+
		"\2\u0086\u0087\b\16\1\2\u0087\u0088\7\32\2\2\u0088\u0091\5\32\16\4\u0089"+
		"\u0091\5\16\b\2\u008a\u0091\5\22\n\2\u008b\u0091\5\34\17\2\u008c\u008d"+
		"\7\21\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7\22\2\2\u008f\u0091\3\2\2"+
		"\2\u0090\u0086\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b"+
		"\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u00a3\3\2\2\2\u0092\u0093\f\t\2\2\u0093"+
		"\u0094\7\31\2\2\u0094\u00a2\5\32\16\n\u0095\u0096\f\b\2\2\u0096\u0097"+
		"\7\32\2\2\u0097\u00a2\5\32\16\t\u0098\u0099\f\7\2\2\u0099\u009a\7\27\2"+
		"\2\u009a\u00a2\5\32\16\b\u009b\u009c\f\6\2\2\u009c\u009d\7\26\2\2\u009d"+
		"\u00a2\5\32\16\7\u009e\u009f\f\5\2\2\u009f\u00a0\7\30\2\2\u00a0\u00a2"+
		"\5\32\16\6\u00a1\u0092\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3\2\2\2"+
		"\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\5\20\t\2\u00a7\u00a9\7\21\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b3\7\22\2\2\u00b3\35\3\2\2\2\u00b4\u00b7\5\32\16\2\u00b5\u00b7\5\""+
		"\22\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9"+
		"\5\32\16\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\5\32\16\2\u00bb\u00d5\3\2\2"+
		"\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7\37\2\2\u00be\u00bf\5\32\16\2\u00bf"+
		"\u00d5\3\2\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7!\2\2\u00c2\u00c3\5"+
		"\32\16\2\u00c3\u00d5\3\2\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00c6\7\"\2\2"+
		"\u00c6\u00c7\5\32\16\2\u00c7\u00d5\3\2\2\2\u00c8\u00c9\5\32\16\2\u00c9"+
		"\u00ca\7\33\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00d5\3\2\2\2\u00cc\u00cd"+
		"\5\32\16\2\u00cd\u00ce\7#\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d5\3\2\2"+
		"\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d3\7\22\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00c0\3\2"+
		"\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00d7\b\22\1\2\u00d7\u00d8\7\36\2"+
		"\2\u00d8\u00df\5\"\22\4\u00d9\u00df\5 \21\2\u00da\u00db\7\21\2\2\u00db"+
		"\u00dc\5\"\22\2\u00dc\u00dd\7\22\2\2\u00dd\u00df\3\2\2\2\u00de\u00d6\3"+
		"\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0"+
		"\u00e1\f\6\2\2\u00e1\u00e2\7\35\2\2\u00e2\u00e7\5\"\22\7\u00e3\u00e4\f"+
		"\5\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e7\5\"\22\6\u00e6\u00e0\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9#\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed"+
		"\7\33\2\2\u00ed\u00f5\5\22\n\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\5\20\t\2"+
		"\u00f0\u00f1\7\33\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"%\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5\"\22\2\u00f9\'\3\2\2\2\u00fa"+
		"\u00fb\5,\27\2\u00fb)\3\2\2\2\u00fc\u00fd\5,\27\2\u00fd+\3\2\2\2\u00fe"+
		"\u00ff\7\17\2\2\u00ff\u0100\5.\30\2\u0100\u0101\7\20\2\2\u0101-\3\2\2"+
		"\2\u0102\u0103\5\34\17\2\u0103\u0104\7)\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108/\3\2\2\2\u0109\u0107\3\2\2\2\32\66:>BFLR[emy\u0082\u0090\u00a1"+
		"\u00a3\u00a9\u00af\u00b6\u00d4\u00de\u00e6\u00e8\u00f5\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}