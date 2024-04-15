package parser.time;// Generated from /Users/sam/Documents/MA1/Software Evo/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExprTime.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorExprTimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AM=5, PM=6, CETADD=7, CETSUB=8, ADD=9, 
		SUB=10, DIGIT=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_year = 2, RULE_other = 3, RULE_format = 4, 
		RULE_infix = 5, RULE_prefix = 6, RULE_postfix = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exp", "year", "other", "format", "infix", "prefix", "postfix"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'AM'", "'PM'", "'CET+'", "'CET-'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AM", "PM", "CETADD", "CETSUB", "ADD", 
			"SUB", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "CalculatorExprTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorExprTimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			exp();
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
	public static class ExpContext extends ParserRuleContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				postfix();
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
	public static class YearContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorExprTimeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorExprTimeParser.DIGIT, i);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(DIGIT);
			setState(24);
			match(DIGIT);
			setState(25);
			match(DIGIT);
			setState(26);
			match(DIGIT);
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
	public static class OtherContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(CalculatorExprTimeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CalculatorExprTimeParser.DIGIT, i);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(DIGIT);
			setState(29);
			match(DIGIT);
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
	public static class FormatContext extends ParserRuleContext {
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
	 
		public FormatContext() { }
		public void copyFrom(FormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeDateContext extends FormatContext {
		public Token op;
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public List<OtherContext> other() {
			return getRuleContexts(OtherContext.class);
		}
		public OtherContext other(int i) {
			return getRuleContext(OtherContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(CalculatorExprTimeParser.DIGIT, 0); }
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public TimeDateContext(FormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimeDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimeDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimeDate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeOnlyContext extends FormatContext {
		public Token op;
		public List<OtherContext> other() {
			return getRuleContexts(OtherContext.class);
		}
		public OtherContext other(int i) {
			return getRuleContext(OtherContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(CalculatorExprTimeParser.DIGIT, 0); }
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public TimeOnlyContext(FormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimeOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimeOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimeOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_format);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TimeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				other();
				setState(32);
				match(T__0);
				setState(33);
				other();
				setState(34);
				match(T__0);
				setState(35);
				other();
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(36);
					((TimeOnlyContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimeOnlyContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(39);
					((TimeOnlyContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimeOnlyContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(40);
					match(DIGIT);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new TimeDateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				year();
				setState(44);
				match(T__0);
				setState(45);
				other();
				setState(46);
				match(T__0);
				setState(47);
				other();
				setState(48);
				match(T__0);
				setState(49);
				other();
				setState(50);
				match(T__0);
				setState(51);
				other();
				setState(52);
				match(T__0);
				setState(53);
				other();
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					((TimeDateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimeDateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(57);
					((TimeDateContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimeDateContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(58);
					match(DIGIT);
					}
					break;
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
	public static class InfixContext extends ParserRuleContext {
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
	 
		public InfixContext() { }
		public void copyFrom(InfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ParensInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeInfixContext extends InfixContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TimeInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimeInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimeInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimeInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public AddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixContext infix() throws RecognitionException {
		return infix(0);
	}

	private InfixContext infix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixContext _localctx = new InfixContext(_ctx, _parentState);
		InfixContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new TimeInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				format();
				}
				break;
			case T__1:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__1);
				setState(66);
				infix(0);
				setState(67);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(71);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(72);
					((AddSubInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(73);
					infix(4);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class PrefixContext extends ParserRuleContext {
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	 
		public PrefixContext() { }
		public void copyFrom(PrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ParensPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPrefixContext extends PrefixContext {
		public Token op;
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimePrefixContext extends PrefixContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TimePrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefix);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((AddSubPrefixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddSubPrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				match(T__1);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					prefix();
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(82);
							match(T__3);
							}
						}

						}
						break;
					}
					setState(87);
					prefix();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3588L) != 0) );
				setState(93);
				match(T__2);
				}
				break;
			case DIGIT:
				_localctx = new TimePrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				format();
				}
				break;
			case T__1:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__1);
				setState(97);
				prefix();
				setState(98);
				match(T__2);
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
	public static class PostfixContext extends ParserRuleContext {
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ParensPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPostfixContext extends PostfixContext {
		public Token op;
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimePostfixContext extends PostfixContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TimePostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_postfix);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__1);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					postfix();
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(104);
							match(T__3);
							}
						}

						}
						break;
					}
					setState(109);
					postfix();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 || _la==DIGIT );
				setState(115);
				match(T__2);
				setState(116);
				((AddSubPostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddSubPostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new TimePostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				format();
				}
				break;
			case 3:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__1);
				setState(120);
				postfix();
				setState(121);
				match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004&\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004*\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004<\b\u0004\u0003\u0004>\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005F\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005K\b\u0005\n\u0005\f\u0005"+
		"N\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"T\b\u0006\u0003\u0006V\b\u0006\u0001\u0006\u0001\u0006\u0004\u0006Z\b"+
		"\u0006\u000b\u0006\f\u0006[\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006e\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007j\b\u0007\u0003\u0007l\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007p\b\u0007\u000b\u0007\f\u0007q\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0000\u0001\n\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\u0007\b\u0001\u0000\t\n\u0088\u0000\u0010\u0001\u0000\u0000\u0000"+
		"\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000"+
		"\u0006\u001c\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0016\u0003\n\u0005\u0000\u0013\u0016\u0003\f\u0006\u0000"+
		"\u0014\u0016\u0003\u000e\u0007\u0000\u0015\u0012\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u000b\u0000\u0000"+
		"\u0018\u0019\u0005\u000b\u0000\u0000\u0019\u001a\u0005\u000b\u0000\u0000"+
		"\u001a\u001b\u0005\u000b\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u000b\u0000\u0000\u001d\u001e\u0005\u000b\u0000\u0000"+
		"\u001e\u0007\u0001\u0000\u0000\u0000\u001f \u0003\u0006\u0003\u0000 !"+
		"\u0005\u0001\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005\u0001\u0000"+
		"\u0000#%\u0003\u0006\u0003\u0000$&\u0007\u0000\u0000\u0000%$\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'(\u0007"+
		"\u0001\u0000\u0000(*\u0005\u000b\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*>\u0001\u0000\u0000\u0000+,\u0003\u0004\u0002"+
		"\u0000,-\u0005\u0001\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u0001\u0000\u000012\u0003"+
		"\u0006\u0003\u000023\u0005\u0001\u0000\u000034\u0003\u0006\u0003\u0000"+
		"45\u0005\u0001\u0000\u000057\u0003\u0006\u0003\u000068\u0007\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u00009:\u0007\u0001\u0000\u0000:<\u0005\u000b\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=\u001f\u0001\u0000\u0000\u0000=+\u0001\u0000\u0000\u0000>\t\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0005\uffff\uffff\u0000@F\u0003\b\u0004\u0000AB\u0005"+
		"\u0002\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005\u0003\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000"+
		"FL\u0001\u0000\u0000\u0000GH\n\u0003\u0000\u0000HI\u0007\u0002\u0000\u0000"+
		"IK\u0003\n\u0005\u0004JG\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u000b\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0007\u0002\u0000\u0000PY\u0005"+
		"\u0002\u0000\u0000QU\u0003\f\u0006\u0000RT\u0005\u0004\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0003\f\u0006\u0000XZ\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0003\u0000\u0000^e\u0001"+
		"\u0000\u0000\u0000_e\u0003\b\u0004\u0000`a\u0005\u0002\u0000\u0000ab\u0003"+
		"\f\u0006\u0000bc\u0005\u0003\u0000\u0000ce\u0001\u0000\u0000\u0000dO\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000"+
		"e\r\u0001\u0000\u0000\u0000fo\u0005\u0002\u0000\u0000gk\u0003\u000e\u0007"+
		"\u0000hj\u0005\u0004\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003\u000e\u0007\u0000"+
		"np\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0005\u0003\u0000\u0000tu\u0007\u0002\u0000\u0000u|\u0001"+
		"\u0000\u0000\u0000v|\u0003\b\u0004\u0000wx\u0005\u0002\u0000\u0000xy\u0003"+
		"\u000e\u0007\u0000yz\u0005\u0003\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{f\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000"+
		"\u0000|\u000f\u0001\u0000\u0000\u0000\u0010\u0015%)7;=ELSU[dikq{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}