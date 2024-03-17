// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/calculator/ParserCalculator.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, WS=9;
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
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ParserCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserCalculatorParser(TokenStream input) {
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
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCalculatorVisitor ) return ((ParserCalculatorVisitor<? extends T>)visitor).visitProg(this);
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
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCalculatorVisitor ) return ((ParserCalculatorVisitor<? extends T>)visitor).visitExp(this);
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
		public TerminalNode NUMBER() { return getToken(ParserCalculatorParser.NUMBER, 0); }
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).enterInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).exitInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCalculatorVisitor ) return ((ParserCalculatorVisitor<? extends T>)visitor).visitInfix(this);
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
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(18);
				match(NUMBER);
				}
				break;
			case T__4:
				{
				setState(19);
				match(T__4);
				setState(20);
				infix(0);
				setState(21);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(25);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(26);
							match(T__0);
							}
						}

						setState(29);
						infix(6);
						}
						break;
					case 2:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(31);
						match(T__1);
						}
						setState(32);
						infix(5);
						}
						break;
					case 3:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(35);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ParserCalculatorParser.NUMBER, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCalculatorVisitor ) return ((ParserCalculatorVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				match(T__4);
				setState(43);
				prefix();
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(44);
						match(T__6);
						}
					}

					setState(47);
					prefix();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 446L) != 0) );
				setState(52);
				match(T__5);
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				match(T__4);
				setState(56);
				prefix();
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(57);
						match(T__6);
						}
					}

					setState(60);
					prefix();
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 446L) != 0) );
				setState(65);
				match(T__5);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(NUMBER);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__4);
				setState(69);
				prefix();
				setState(70);
				match(T__5);
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
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ParserCalculatorParser.NUMBER, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCalculatorListener ) ((ParserCalculatorListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCalculatorVisitor ) return ((ParserCalculatorVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__4);
				setState(75);
				postfix();
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(76);
						match(T__6);
						}
					}

					setState(79);
					postfix();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 416L) != 0) );
				setState(84);
				match(T__5);
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__4);
				setState(88);
				postfix();
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(89);
						match(T__6);
						}
					}

					setState(92);
					postfix();
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 416L) != 0) );
				setState(97);
				match(T__5);
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__4);
				setState(102);
				postfix();
				setState(103);
				match(T__5);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\tl\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0018\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001"+
		"\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u00032\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003"+
		"\u0001\u0003\u0004\u0003>\b\u0003\u000b\u0003\f\u0003?\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003I\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0004\u0004\u0004Q\b\u0004\u000b\u0004\f\u0004R\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b"+
		"\u0004\u0001\u0004\u0004\u0004^\b\u0004\u000b\u0004\f\u0004_\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0000\u0001\u0004\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\u0001\u0002{\u0000\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000"+
		"\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000"+
		"\u0000\bi\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004\u0002\u0000\r\u0010"+
		"\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f\f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0002"+
		"\uffff\uffff\u0000\u0012\u0018\u0005\b\u0000\u0000\u0013\u0014\u0005\u0005"+
		"\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0006"+
		"\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0011\u0001\u0000"+
		"\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0018&\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\n\u0005\u0000\u0000\u001a\u001c\u0005\u0001\u0000\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d%\u0003\u0004\u0002\u0006\u001e"+
		"\u001f\n\u0004\u0000\u0000\u001f \u0005\u0002\u0000\u0000 %\u0003\u0004"+
		"\u0002\u0005!\"\n\u0003\u0000\u0000\"#\u0007\u0000\u0000\u0000#%\u0003"+
		"\u0004\u0002\u0004$\u0019\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000"+
		"\u0000$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)*\u0007\u0001\u0000\u0000*+\u0005\u0005\u0000"+
		"\u0000+0\u0003\u0006\u0003\u0000,.\u0005\u0007\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0003"+
		"\u0006\u0003\u00000-\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005\u0006\u0000\u00005I\u0001\u0000\u0000\u000067\u0007\u0000"+
		"\u0000\u000078\u0005\u0005\u0000\u00008=\u0003\u0006\u0003\u00009;\u0005"+
		"\u0007\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<>\u0003\u0006\u0003\u0000=:\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0006\u0000\u0000BI\u0001"+
		"\u0000\u0000\u0000CI\u0005\b\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0003"+
		"\u0006\u0003\u0000FG\u0005\u0006\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"H)\u0001\u0000\u0000\u0000H6\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000"+
		"\u0000HD\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0005\u0000\u0000KP\u0003\b\u0004\u0000LN\u0005\u0007\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0003\b\u0004\u0000PM\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0006\u0000\u0000UV\u0007\u0001\u0000\u0000Vj\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0005\u0000\u0000X]\u0003\b\u0004\u0000Y[\u0005\u0007"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0003\b\u0004\u0000]Z\u0001\u0000\u0000\u0000^_"+
		"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0006\u0000\u0000bc\u0007\u0000"+
		"\u0000\u0000cj\u0001\u0000\u0000\u0000dj\u0005\b\u0000\u0000ef\u0005\u0005"+
		"\u0000\u0000fg\u0003\b\u0004\u0000gh\u0005\u0006\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000iJ\u0001\u0000\u0000\u0000iW\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000"+
		"\u000f\u000f\u0017\u001b$&-2:?HMRZ_i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}