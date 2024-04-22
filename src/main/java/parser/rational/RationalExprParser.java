package parser.rational;// Generated from /Users/romeoibraimovski/Library/Mobile Documents/com~apple~CloudDocs/Codespace/Java Codespace/calculator-cucumber-2024/src/main/antlr4/Calculator/RationalExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RationalExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, FRAC=8, NUMBER=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4, 
		RULE_rational = 5, RULE_integer = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exp", "infix", "prefix", "postfix", "rational", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'\\u00F7'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "FRAC", "NUMBER", 
			"WS"
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
	public String getGrammarFileName() { return "RationalExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RationalExprParser(TokenStream input) {
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
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
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
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
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
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterParensInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitParensInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitParensInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RationalInfixContext extends InfixContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RationalInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterRationalInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitRationalInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitRationalInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RationalExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RationalExprParser.DIV, 0); }
		public MulDivInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterMulDivInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitMulDivInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitMulDivInfix(this);
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
		public TerminalNode ADD() { return getToken(RationalExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(RationalExprParser.SUB, 0); }
		public AddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterAddSubInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitAddSubInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitAddSubInfix(this);
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
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUMBER:
				{
				_localctx = new RationalInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				rational();
				}
				break;
			case T__0:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__0);
				setState(24);
				infix(0);
				setState(25);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						((MulDivInfixContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						infix(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
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
						setState(34);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterParensPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitParensPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitParensPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RationalPrefixContext extends PrefixContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RationalPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterRationalPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitRationalPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitRationalPrefix(this);
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
		public TerminalNode ADD() { return getToken(RationalExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(RationalExprParser.SUB, 0); }
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterAddSubPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitAddSubPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RationalExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RationalExprParser.DIV, 0); }
		public MulDivPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterMulDivPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitMulDivPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitMulDivPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new MulDivPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((MulDivPrefixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivPrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				match(T__0);
				setState(42);
				prefix();
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(43);
						match(T__2);
						}
					}

					setState(46);
					prefix();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 762L) != 0) );
				setState(51);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
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
				setState(54);
				match(T__0);
				setState(55);
				prefix();
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(56);
						match(T__2);
						}
					}

					setState(59);
					prefix();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 762L) != 0) );
				setState(64);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new RationalPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				rational();
				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__0);
				setState(68);
				prefix();
				setState(69);
				match(T__1);
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
	public static class RationalPostfixContext extends PostfixContext {
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RationalPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterRationalPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitRationalPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitRationalPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivPostfixContext extends PostfixContext {
		public Token op;
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RationalExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RationalExprParser.DIV, 0); }
		public MulDivPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterMulDivPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitMulDivPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitMulDivPostfix(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterParensPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitParensPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitParensPostfix(this);
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
		public TerminalNode ADD() { return getToken(RationalExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(RationalExprParser.SUB, 0); }
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterAddSubPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitAddSubPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new MulDivPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__0);
				setState(74);
				postfix();
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(75);
						match(T__2);
						}
					}

					setState(78);
					postfix();
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 650L) != 0) );
				setState(83);
				match(T__1);
				setState(84);
				((MulDivPostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivPostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__0);
				setState(87);
				postfix();
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(88);
						match(T__2);
						}
					}

					setState(91);
					postfix();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 650L) != 0) );
				setState(96);
				match(T__1);
				setState(97);
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
			case 3:
				_localctx = new RationalPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				rational();
				}
				break;
			case 4:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(T__0);
				setState(101);
				postfix();
				setState(102);
				match(T__1);
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
	public static class RationalContext extends ParserRuleContext {
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
	 
		public RationalContext() { }
		public void copyFrom(RationalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RationalNumberContext extends RationalContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode FRAC() { return getToken(RationalExprParser.FRAC, 0); }
		public RationalNumberContext(RationalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterRationalNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitRationalNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitRationalNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rational);
		try {
			_localctx = new RationalNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			integer();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(107);
				match(FRAC);
				setState(108);
				integer();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	 
		public IntegerContext() { }
		public void copyFrom(IntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerNumberContext extends IntegerContext {
		public TerminalNode NUMBER() { return getToken(RationalExprParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(RationalExprParser.SUB, 0); }
		public IntegerNumberContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).enterIntegerNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RationalExprListener ) ((RationalExprListener)listener).exitIntegerNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RationalExprVisitor) return ((RationalExprVisitor<? extends T>)visitor).visitIntegerNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integer);
		int _la;
		try {
			_localctx = new IntegerNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(111);
				match(SUB);
				}
			}

			setState(114);
			match(NUMBER);
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
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\nu\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0003\u0004"+
		"\u00030\b\u0003\u000b\u0003\f\u00031\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003"+
		"\u0004\u0003=\b\u0003\u000b\u0003\f\u0003>\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001"+
		"\u0004\u0004\u0004P\b\u0004\u000b\u0004\f\u0004Q\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004"+
		"\u0001\u0004\u0004\u0004]\b\u0004\u000b\u0004\f\u0004^\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005n\b\u0005\u0001\u0006\u0003\u0006q\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0001\u0004\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\u0002\u0001\u0000\u0004\u0005\u0001\u0000\u0006\u0007\u0082\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u001b"+
		"\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bh\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010"+
		"\u0014\u0003\u0004\u0002\u0000\u0011\u0014\u0003\u0006\u0003\u0000\u0012"+
		"\u0014\u0003\b\u0004\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0003"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0006\u0002\uffff\uffff\u0000\u0016"+
		"\u001c\u0003\n\u0005\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u0019"+
		"\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000\u0000\u001b\u0017"+
		"\u0001\u0000\u0000\u0000\u001c%\u0001\u0000\u0000\u0000\u001d\u001e\n"+
		"\u0004\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f$\u0003\u0004"+
		"\u0002\u0005 !\n\u0003\u0000\u0000!\"\u0007\u0001\u0000\u0000\"$\u0003"+
		"\u0004\u0002\u0004#\u001d\u0001\u0000\u0000\u0000# \u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"()\u0007\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000*/\u0003\u0006\u0003"+
		"\u0000+-\u0005\u0003\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0003\u0006\u0003\u0000/,\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0002\u0000"+
		"\u00004H\u0001\u0000\u0000\u000056\u0007\u0001\u0000\u000067\u0005\u0001"+
		"\u0000\u00007<\u0003\u0006\u0003\u00008:\u0005\u0003\u0000\u000098\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0003\u0006\u0003\u0000<9\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0002\u0000\u0000AH\u0001\u0000\u0000\u0000BH\u0003"+
		"\n\u0005\u0000CD\u0005\u0001\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005"+
		"\u0002\u0000\u0000FH\u0001\u0000\u0000\u0000G(\u0001\u0000\u0000\u0000"+
		"G5\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JO\u0003"+
		"\b\u0004\u0000KM\u0005\u0003\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0003\b\u0004\u0000OL\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0002\u0000"+
		"\u0000TU\u0007\u0000\u0000\u0000Ui\u0001\u0000\u0000\u0000VW\u0005\u0001"+
		"\u0000\u0000W\\\u0003\b\u0004\u0000XZ\u0005\u0003\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u0003\b\u0004\u0000\\Y\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0007\u0001\u0000\u0000bi\u0001"+
		"\u0000\u0000\u0000ci\u0003\n\u0005\u0000de\u0005\u0001\u0000\u0000ef\u0003"+
		"\b\u0004\u0000fg\u0005\u0002\u0000\u0000gi\u0001\u0000\u0000\u0000hI\u0001"+
		"\u0000\u0000\u0000hV\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000i\t\u0001\u0000\u0000\u0000jm\u0003\f\u0006"+
		"\u0000kl\u0005\b\u0000\u0000ln\u0003\f\u0006\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000\u0000oq\u0005"+
		"\u0007\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0005\t\u0000\u0000s\r\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u001b#%,19>GLQY^hmp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}