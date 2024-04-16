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
		SUB=10, NUMBER=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exp", "infix", "prefix", "postfix"
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
			"SUB", "NUMBER", "WS"
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
			setState(10);
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
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
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
	public static class DateInfixContext extends InfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DateInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDateInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDateInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDateInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeInfixContext extends InfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new TimeInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(NUMBER);
				setState(19);
				match(T__0);
				setState(20);
				match(NUMBER);
				setState(21);
				match(T__0);
				setState(22);
				match(NUMBER);
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(23);
					((TimeInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimeInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(26);
					((TimeInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimeInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(28); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(27);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(30); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new DateInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(NUMBER);
				setState(35);
				match(T__0);
				setState(36);
				match(NUMBER);
				setState(37);
				match(T__0);
				setState(38);
				match(NUMBER);
				setState(39);
				match(T__0);
				setState(40);
				match(NUMBER);
				setState(41);
				match(T__0);
				setState(42);
				match(NUMBER);
				setState(43);
				match(T__0);
				setState(44);
				match(NUMBER);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(45);
					((DateInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DateInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(48);
					((DateInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DateInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(50); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(49);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(52); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__1);
				setState(57);
				infix(0);
				setState(58);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(62);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(63);
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
					setState(64);
					infix(5);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class DatePrefixContext extends PrefixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DatePrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDatePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDatePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDatePrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
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
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
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
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			int _alt;
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
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
				setState(71);
				match(T__1);
				setState(72);
				prefix();
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(73);
						match(T__3);
						}
					}

					setState(76);
					prefix();
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3604L) != 0) );
				setState(81);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new TimePrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(NUMBER);
				setState(84);
				match(T__0);
				setState(85);
				match(NUMBER);
				setState(86);
				match(T__0);
				setState(87);
				match(NUMBER);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(88);
					((TimePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(91);
					((TimePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(93); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(92);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(95); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 3:
				_localctx = new DatePrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(NUMBER);
				setState(100);
				match(T__0);
				setState(101);
				match(NUMBER);
				setState(102);
				match(T__0);
				setState(103);
				match(NUMBER);
				setState(104);
				match(T__0);
				setState(105);
				match(NUMBER);
				setState(106);
				match(T__0);
				setState(107);
				match(NUMBER);
				setState(108);
				match(T__0);
				setState(109);
				match(NUMBER);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(110);
					((DatePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DatePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(113);
					((DatePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DatePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(114);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(117); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__1);
				setState(122);
				prefix();
				setState(123);
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
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
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
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class DatePostfixContext extends PostfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DatePostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDatePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDatePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDatePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			int _alt;
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__1);
				setState(128);
				postfix();
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(129);
						match(T__3);
						}
					}

					setState(132);
					postfix();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2068L) != 0) );
				setState(137);
				match(T__2);
				setState(138);
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
				setState(140);
				match(NUMBER);
				setState(141);
				match(T__0);
				setState(142);
				match(NUMBER);
				setState(143);
				match(T__0);
				setState(144);
				match(NUMBER);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(145);
					((TimePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(148);
					((TimePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(150); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(149);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(152); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 3:
				_localctx = new DatePostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(NUMBER);
				setState(157);
				match(T__0);
				setState(158);
				match(NUMBER);
				setState(159);
				match(T__0);
				setState(160);
				match(NUMBER);
				setState(161);
				match(T__0);
				setState(162);
				match(NUMBER);
				setState(163);
				match(T__0);
				setState(164);
				match(NUMBER);
				setState(165);
				match(T__0);
				setState(166);
				match(NUMBER);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(167);
					((DatePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DatePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(170);
					((DatePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DatePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(171);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(174); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 4:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(T__1);
				setState(179);
				postfix();
				setState(180);
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
		case 2:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0003\u0002!\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0004\u00023\b\u0002\u000b\u0002"+
		"\f\u00024\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003K\b\u0003\u0001\u0003\u0004\u0003N\b\u0003"+
		"\u000b\u0003\f\u0003O\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Z\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003^\b\u0003\u000b\u0003\f\u0003_\u0003"+
		"\u0003b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003t\b\u0003\u000b\u0003\f\u0003u\u0003\u0003x\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003~\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0004\u0004\u0004"+
		"\u0086\b\u0004\u000b\u0004\f\u0004\u0087\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0093\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0097"+
		"\b\u0004\u000b\u0004\f\u0004\u0098\u0003\u0004\u009b\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a9\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00ad\b\u0004\u000b"+
		"\u0004\f\u0004\u00ae\u0003\u0004\u00b1\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b7\b\u0004\u0001\u0004\u0000\u0001"+
		"\u0004\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0005\u0006"+
		"\u0001\u0000\u0007\b\u0001\u0000\t\n\u00d4\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006"+
		"}\u0001\u0000\u0000\u0000\b\u00b6\u0001\u0000\u0000\u0000\n\u000b\u0003"+
		"\u0002\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004"+
		"\u0002\u0000\r\u0010\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004"+
		"\u0000\u000f\f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0006\u0002\uffff\uffff\u0000\u0012\u0013\u0005\u000b\u0000"+
		"\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0005\u000b\u0000"+
		"\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0018\u0005\u000b\u0000"+
		"\u0000\u0017\u0019\u0007\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019 \u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001d\u0005\u000b\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f!\u0001\u0000\u0000\u0000 \u001a\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!=\u0001\u0000\u0000\u0000\"#\u0005\u000b\u0000\u0000"+
		"#$\u0005\u0001\u0000\u0000$%\u0005\u000b\u0000\u0000%&\u0005\u0001\u0000"+
		"\u0000&\'\u0005\u000b\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0005\u000b"+
		"\u0000\u0000)*\u0005\u0001\u0000\u0000*+\u0005\u000b\u0000\u0000+,\u0005"+
		"\u0001\u0000\u0000,.\u0005\u000b\u0000\u0000-/\u0007\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/6\u0001\u0000\u0000"+
		"\u000002\u0007\u0001\u0000\u000013\u0005\u000b\u0000\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u00007=\u0001\u0000\u0000\u000089\u0005\u0002\u0000"+
		"\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0003\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<\u0011\u0001\u0000\u0000\u0000<\"\u0001\u0000\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000=C\u0001\u0000\u0000\u0000>?\n\u0004\u0000\u0000"+
		"?@\u0007\u0002\u0000\u0000@B\u0003\u0004\u0002\u0005A>\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FG\u0007\u0002\u0000\u0000GH\u0005\u0002\u0000\u0000HM\u0003\u0006\u0003"+
		"\u0000IK\u0005\u0004\u0000\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0003\u0006\u0003\u0000MJ\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0003\u0000"+
		"\u0000R~\u0001\u0000\u0000\u0000ST\u0005\u000b\u0000\u0000TU\u0005\u0001"+
		"\u0000\u0000UV\u0005\u000b\u0000\u0000VW\u0005\u0001\u0000\u0000WY\u0005"+
		"\u000b\u0000\u0000XZ\u0007\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Za\u0001\u0000\u0000\u0000[]\u0007\u0001\u0000"+
		"\u0000\\^\u0005\u000b\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b~\u0001\u0000\u0000\u0000cd\u0005\u000b\u0000\u0000de\u0005\u0001\u0000"+
		"\u0000ef\u0005\u000b\u0000\u0000fg\u0005\u0001\u0000\u0000gh\u0005\u000b"+
		"\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005\u000b\u0000\u0000jk\u0005"+
		"\u0001\u0000\u0000kl\u0005\u000b\u0000\u0000lm\u0005\u0001\u0000\u0000"+
		"mo\u0005\u000b\u0000\u0000np\u0007\u0000\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pw\u0001\u0000\u0000\u0000qs\u0007\u0001"+
		"\u0000\u0000rt\u0005\u000b\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000x~\u0001\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z{\u0003\u0006"+
		"\u0003\u0000{|\u0005\u0003\u0000\u0000|~\u0001\u0000\u0000\u0000}F\u0001"+
		"\u0000\u0000\u0000}S\u0001\u0000\u0000\u0000}c\u0001\u0000\u0000\u0000"+
		"}y\u0001\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0002\u0000\u0000\u0080\u0085\u0003\b\u0004\u0000\u0081\u0083\u0005"+
		"\u0004\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0003"+
		"\b\u0004\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003"+
		"\u0000\u0000\u008a\u008b\u0007\u0002\u0000\u0000\u008b\u00b7\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u000b\u0000\u0000\u008d\u008e\u0005\u0001"+
		"\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0090\u0005\u0001"+
		"\u0000\u0000\u0090\u0092\u0005\u000b\u0000\u0000\u0091\u0093\u0007\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u009a\u0001\u0000\u0000\u0000\u0094\u0096\u0007\u0001"+
		"\u0000\u0000\u0095\u0097\u0005\u000b\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000"+
		"\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u00b7\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000b"+
		"\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0005\u000b"+
		"\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a1\u0005\u000b"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a3\u0005\u000b"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4\u00a5\u0005\u000b"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a8\u0005\u000b"+
		"\u0000\u0000\u00a7\u00a9\u0007\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b0\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0007\u0001\u0000\u0000\u00ab\u00ad\u0005\u000b"+
		"\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b4\u0003\b\u0004"+
		"\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u007f\u0001\u0000\u0000\u0000\u00b6\u008c\u0001\u0000\u0000"+
		"\u0000\u00b6\u009c\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b7\t\u0001\u0000\u0000\u0000\u001b\u000f\u0018\u001e .46<CJ"+
		"OY_aouw}\u0082\u0087\u0092\u0098\u009a\u00a8\u00ae\u00b0\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}