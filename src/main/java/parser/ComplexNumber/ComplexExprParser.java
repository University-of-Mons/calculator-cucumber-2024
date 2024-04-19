// Generated from /home/administrateur/Documents/cours/Mas1/Q2/Software evolution/calculator-cucumber-2024/src/main/antlr4/Calculator/ComplexExpr.g4 by ANTLR 4.13.1
package parser.ComplexNumber;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ComplexExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, I=11, MUL=12, DIV=13, ADD=14, SUB=15, NUMBER=16, WS=17;
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
			null, "'sqrt'", "'('", "')'", "'cis'", "'e'", "'|'", "'intoCartesian'", 
			"'intoPolar'", "'intoE'", "','", "'i'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "I", 
			"MUL", "DIV", "ADD", "SUB", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ComplexExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComplexExprParser(TokenStream input) {
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
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitProg(this);
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
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitExp(this);
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
	public static class ComplexMinusInfixContext extends InfixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ComplexExprParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ComplexExprParser.SUB, i);
		}
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public ComplexMinusInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexMinusInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexMinusInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexMinusInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexAddSubInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public ComplexAddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexAddSubInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexAddSubInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexAddSubInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ModulusInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterModulusInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitModulusInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitModulusInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpInfixComplexContext extends InfixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public List<TerminalNode> MUL() { return getTokens(ComplexExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ComplexExprParser.MUL, i);
		}
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ExpInfixComplexContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterExpInfixComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitExpInfixComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitExpInfixComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexIInfixContext extends InfixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ComplexIInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexIInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexIInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexIInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntInfixContext extends InfixContext {
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public IntInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexMulDivInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ComplexExprParser.DIV, 0); }
		public ComplexMulDivInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexMulDivInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexMulDivInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexMulDivInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CisInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public CisInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterCisInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitCisInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitCisInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public SqrtInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoCartesianInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public IntoCartesianInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoCartesianInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoCartesianInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoCartesianInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtComplexInfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public SqrtComplexInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtComplexInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtComplexInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtComplexInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensComplexInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ParensComplexInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterParensComplexInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitParensComplexInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitParensComplexInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoExpoInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public IntoExpoInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoExpoInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoExpoInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoExpoInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexPlusInfixContext extends InfixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public ComplexPlusInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexPlusInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexPlusInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexPlusInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoPolarInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public IntoPolarInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoPolarInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoPolarInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoPolarInfix(this);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new SqrtComplexInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(T__0);
				setState(19);
				match(T__1);
				setState(20);
				infix(0);
				setState(21);
				match(T__2);
				setState(22);
				match(ADD);
				setState(23);
				match(T__0);
				setState(24);
				match(T__1);
				setState(25);
				infix(0);
				setState(26);
				match(T__2);
				setState(27);
				match(I);
				}
				break;
			case 2:
				{
				_localctx = new SqrtInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__0);
				setState(30);
				match(T__1);
				setState(31);
				infix(0);
				setState(32);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new CisInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(34);
					match(NUMBER);
					setState(35);
					match(MUL);
					}
				}

				setState(38);
				match(T__3);
				setState(39);
				match(T__1);
				setState(40);
				infix(0);
				setState(41);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new ExpInfixComplexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(43);
					match(NUMBER);
					setState(44);
					match(MUL);
					}
				}

				setState(47);
				match(T__4);
				setState(48);
				match(T__1);
				setState(49);
				match(I);
				setState(50);
				match(MUL);
				setState(51);
				infix(0);
				setState(52);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new ModulusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__5);
				setState(55);
				infix(0);
				setState(56);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new ComplexPlusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(58);
					match(SUB);
					}
				}

				setState(61);
				match(NUMBER);
				setState(62);
				match(ADD);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(63);
					match(NUMBER);
					}
				}

				setState(66);
				match(I);
				}
				break;
			case 7:
				{
				_localctx = new ComplexMinusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(67);
					match(SUB);
					}
				}

				setState(70);
				match(NUMBER);
				setState(71);
				match(SUB);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(72);
					match(NUMBER);
					}
				}

				setState(75);
				match(I);
				}
				break;
			case 8:
				{
				_localctx = new ComplexIInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(76);
					match(SUB);
					}
				}

				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(79);
					match(NUMBER);
					}
				}

				setState(82);
				match(I);
				}
				break;
			case 9:
				{
				_localctx = new IntInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(83);
					match(SUB);
					}
				}

				setState(86);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new ParensComplexInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__1);
				setState(88);
				infix(0);
				setState(89);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new IntoCartesianInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__6);
				setState(92);
				match(T__1);
				setState(93);
				infix(0);
				setState(94);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new IntoPolarInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(T__7);
				setState(97);
				match(T__1);
				setState(98);
				infix(0);
				setState(99);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new IntoExpoInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__8);
				setState(102);
				match(T__1);
				setState(103);
				infix(0);
				setState(104);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ComplexMulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						((ComplexMulDivInfixContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ComplexMulDivInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						infix(12);
						}
						break;
					case 2:
						{
						_localctx = new ComplexAddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						((ComplexAddSubInfixContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ComplexAddSubInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						infix(11);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class IntoEPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public IntoEPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoEPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoEPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoEPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CisPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public CisPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterCisPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitCisPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitCisPrefix(this);
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
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterAddSubPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitAddSubPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexPlusPrefixContext extends PrefixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public ComplexPlusPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexPlusPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexPlusPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexPlusPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexMinusPrefixContext extends PrefixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ComplexExprParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ComplexExprParser.SUB, i);
		}
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public ComplexMinusPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexMinusPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexMinusPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexMinusPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ModulusPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterModulusPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitModulusPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitModulusPrefix(this);
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
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ComplexExprParser.DIV, 0); }
		public MulDivPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterMulDivPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitMulDivPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitMulDivPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensComplexPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ParensComplexPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterParensComplexPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitParensComplexPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitParensComplexPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoPolarPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public IntoPolarPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoPolarPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoPolarPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoPolarPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public SqrtPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoCartesianPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public IntoCartesianPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoCartesianPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoCartesianPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoCartesianPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPrefixComplexContext extends PrefixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public List<TerminalNode> MUL() { return getTokens(ComplexExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ComplexExprParser.MUL, i);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ExpPrefixComplexContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterExpPrefixComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitExpPrefixComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitExpPrefixComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtComplexPrefixContext extends PrefixContext {
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public SqrtComplexPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtComplexPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtComplexPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtComplexPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexIPrefixContext extends PrefixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ComplexIPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexIPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexIPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexIPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntPrefixContext extends PrefixContext {
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public IntPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SqrtComplexPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__0);
				setState(120);
				match(T__1);
				setState(121);
				prefix();
				setState(122);
				match(T__2);
				setState(123);
				match(ADD);
				setState(124);
				match(T__0);
				setState(125);
				match(T__1);
				setState(126);
				prefix();
				setState(127);
				match(T__2);
				setState(128);
				match(I);
				}
				break;
			case 2:
				_localctx = new SqrtPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__0);
				setState(131);
				match(T__1);
				setState(132);
				prefix();
				setState(133);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CisPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(135);
					match(NUMBER);
					setState(136);
					match(MUL);
					}
				}

				setState(139);
				match(T__3);
				setState(140);
				match(T__1);
				setState(141);
				prefix();
				setState(142);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new ExpPrefixComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(144);
					match(NUMBER);
					setState(145);
					match(MUL);
					}
				}

				setState(148);
				match(T__4);
				setState(149);
				match(T__1);
				setState(150);
				match(I);
				setState(151);
				match(MUL);
				setState(152);
				prefix();
				setState(153);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new MulDivPrefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
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
				setState(156);
				match(T__1);
				setState(157);
				prefix();
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(158);
						match(T__9);
						}
					}

					setState(161);
					prefix();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131062L) != 0) );
				setState(166);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
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
				setState(169);
				match(T__1);
				setState(170);
				prefix();
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(171);
						match(T__9);
						}
					}

					setState(174);
					prefix();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131062L) != 0) );
				setState(179);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new ModulusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				match(T__5);
				setState(182);
				prefix();
				setState(183);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new ComplexPlusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(185);
					match(SUB);
					}
				}

				setState(188);
				match(NUMBER);
				setState(189);
				match(ADD);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(190);
					match(NUMBER);
					}
				}

				setState(193);
				match(I);
				}
				break;
			case 9:
				_localctx = new ComplexMinusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(194);
					match(SUB);
					}
				}

				setState(197);
				match(NUMBER);
				setState(198);
				match(SUB);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(199);
					match(NUMBER);
					}
				}

				setState(202);
				match(I);
				}
				break;
			case 10:
				_localctx = new ComplexIPrefixContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(203);
					match(SUB);
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(206);
					match(NUMBER);
					}
				}

				setState(209);
				match(I);
				}
				break;
			case 11:
				_localctx = new IntPrefixContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(210);
					match(SUB);
					}
				}

				setState(213);
				match(NUMBER);
				}
				break;
			case 12:
				_localctx = new ParensComplexPrefixContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(214);
				match(T__1);
				setState(215);
				prefix();
				setState(216);
				match(T__2);
				}
				break;
			case 13:
				_localctx = new IntoCartesianPrefixContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(218);
				match(T__6);
				setState(219);
				match(T__1);
				setState(220);
				prefix();
				setState(221);
				match(T__2);
				}
				break;
			case 14:
				_localctx = new IntoPolarPrefixContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(223);
				match(T__7);
				setState(224);
				match(T__1);
				setState(225);
				prefix();
				setState(226);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new IntoEPrefixContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(228);
				match(T__8);
				setState(229);
				match(T__1);
				setState(230);
				prefix();
				setState(231);
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
	public static class SqrtComplexPostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public SqrtComplexPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtComplexPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtComplexPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtComplexPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexIPostfixContext extends PostfixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ComplexIPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexIPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexIPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexIPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoPolarPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public IntoPolarPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoPolarPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoPolarPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoPolarPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SqrtPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public SqrtPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterSqrtPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitSqrtPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitSqrtPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoEPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public IntoEPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoEPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoEPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoEPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPostfixComplexContext extends PostfixContext {
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public List<TerminalNode> MUL() { return getTokens(ComplexExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ComplexExprParser.MUL, i);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public ExpPostfixComplexContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterExpPostfixComplex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitExpPostfixComplex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitExpPostfixComplex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexPlusPostfixContext extends PostfixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public ComplexPlusPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexPlusPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexPlusPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexPlusPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexMinusPostfixContext extends PostfixContext {
		public List<TerminalNode> NUMBER() { return getTokens(ComplexExprParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ComplexExprParser.NUMBER, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ComplexExprParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ComplexExprParser.SUB, i);
		}
		public TerminalNode I() { return getToken(ComplexExprParser.I, 0); }
		public ComplexMinusPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterComplexMinusPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitComplexMinusPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitComplexMinusPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CisPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public CisPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterCisPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitCisPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitCisPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntPostfixContext extends PostfixContext {
		public TerminalNode NUMBER() { return getToken(ComplexExprParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public IntPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntPostfix(this);
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
		public TerminalNode MUL() { return getToken(ComplexExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ComplexExprParser.DIV, 0); }
		public MulDivPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterMulDivPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitMulDivPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitMulDivPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntoCartesianPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public IntoCartesianPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterIntoCartesianPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitIntoCartesianPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitIntoCartesianPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensComplexPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ParensComplexPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterParensComplexPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitParensComplexPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitParensComplexPostfix(this);
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
		public TerminalNode ADD() { return getToken(ComplexExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ComplexExprParser.SUB, 0); }
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterAddSubPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitAddSubPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ModulusPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).enterModulusPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplexExprListener ) ((ComplexExprListener)listener).exitModulusPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComplexExprVisitor ) return ((ComplexExprVisitor<? extends T>)visitor).visitModulusPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new SqrtComplexPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__0);
				setState(236);
				match(T__1);
				setState(237);
				postfix();
				setState(238);
				match(T__2);
				setState(239);
				match(ADD);
				setState(240);
				match(T__0);
				setState(241);
				match(T__1);
				setState(242);
				postfix();
				setState(243);
				match(T__2);
				setState(244);
				match(I);
				}
				break;
			case 2:
				_localctx = new SqrtPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__0);
				setState(247);
				match(T__1);
				setState(248);
				postfix();
				setState(249);
				match(T__2);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(250);
					match(I);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CisPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(253);
					match(NUMBER);
					setState(254);
					match(MUL);
					}
				}

				setState(257);
				match(T__3);
				setState(258);
				match(T__1);
				setState(259);
				postfix();
				setState(260);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new ExpPostfixComplexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(262);
					match(NUMBER);
					setState(263);
					match(MUL);
					}
				}

				setState(266);
				match(T__4);
				setState(267);
				match(T__1);
				setState(268);
				match(I);
				setState(269);
				match(MUL);
				setState(270);
				postfix();
				setState(271);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new MulDivPostfixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
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
				setState(274);
				match(T__1);
				setState(275);
				postfix();
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(276);
						match(T__9);
						}
					}

					setState(279);
					postfix();
					}
					}
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131062L) != 0) );
				setState(284);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
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
				setState(287);
				match(T__1);
				setState(288);
				postfix();
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(289);
						match(T__9);
						}
					}

					setState(292);
					postfix();
					}
					}
					setState(295); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131062L) != 0) );
				setState(297);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new ModulusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(T__5);
				setState(300);
				postfix();
				setState(301);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new ComplexPlusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(303);
					match(SUB);
					}
				}

				setState(306);
				match(NUMBER);
				setState(307);
				match(ADD);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(308);
					match(NUMBER);
					}
				}

				setState(311);
				match(I);
				}
				break;
			case 9:
				_localctx = new ComplexMinusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(312);
					match(SUB);
					}
				}

				setState(315);
				match(NUMBER);
				setState(316);
				match(SUB);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(317);
					match(NUMBER);
					}
				}

				setState(320);
				match(I);
				}
				break;
			case 10:
				_localctx = new ComplexIPostfixContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(321);
					match(SUB);
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(324);
					match(NUMBER);
					}
				}

				setState(327);
				match(I);
				}
				break;
			case 11:
				_localctx = new IntPostfixContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(328);
					match(SUB);
					}
				}

				setState(331);
				match(NUMBER);
				}
				break;
			case 12:
				_localctx = new ParensComplexPostfixContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(332);
				match(T__1);
				setState(333);
				postfix();
				setState(334);
				match(T__2);
				}
				break;
			case 13:
				_localctx = new IntoCartesianPostfixContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(336);
				match(T__6);
				setState(337);
				match(T__1);
				setState(338);
				postfix();
				setState(339);
				match(T__2);
				}
				break;
			case 14:
				_localctx = new IntoPolarPostfixContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(341);
				match(T__7);
				setState(342);
				match(T__1);
				setState(343);
				postfix();
				setState(344);
				match(T__2);
				}
				break;
			case 15:
				_localctx = new IntoEPostfixContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(346);
				match(T__8);
				setState(347);
				match(T__1);
				setState(348);
				postfix();
				setState(349);
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
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0010\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		".\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"k\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002s\b\u0002\n\u0002\f\u0002v\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u008a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0093\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0003"+
		"\u0004\u0003\u00a3\b\u0003\u000b\u0003\f\u0003\u00a4\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ad"+
		"\b\u0003\u0001\u0003\u0004\u0003\u00b0\b\u0003\u000b\u0003\f\u0003\u00b1"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00c0\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c4\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c9\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00cd\b\u0003\u0001\u0003\u0003\u0003\u00d0"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00ea\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00fc\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0100\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0109\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0116\b\u0004\u0001\u0004"+
		"\u0004\u0004\u0119\b\u0004\u000b\u0004\f\u0004\u011a\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0123"+
		"\b\u0004\u0001\u0004\u0004\u0004\u0126\b\u0004\u000b\u0004\f\u0004\u0127"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0131\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0136\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u013a\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u013f\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0143\b\u0004\u0001\u0004\u0003\u0004\u0146"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u014a\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0160\b\u0004\u0001\u0004\u0000\u0001\u0004\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\f\r\u0001\u0000\u000e"+
		"\u000f\u01ac\u0000\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000"+
		"\u0000\u0004j\u0001\u0000\u0000\u0000\u0006\u00e9\u0001\u0000\u0000\u0000"+
		"\b\u015f\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004\u0002\u0000\r\u0010"+
		"\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f\f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0002"+
		"\uffff\uffff\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0005"+
		"\u0002\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005"+
		"\u0003\u0000\u0000\u0016\u0017\u0005\u000e\u0000\u0000\u0017\u0018\u0005"+
		"\u0001\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003"+
		"\u0004\u0002\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0005"+
		"\u000b\u0000\u0000\u001ck\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001"+
		"\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0003\u0004\u0002"+
		"\u0000 !\u0005\u0003\u0000\u0000!k\u0001\u0000\u0000\u0000\"#\u0005\u0010"+
		"\u0000\u0000#%\u0005\f\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000"+
		"\'(\u0005\u0002\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005\u0003\u0000"+
		"\u0000*k\u0001\u0000\u0000\u0000+,\u0005\u0010\u0000\u0000,.\u0005\f\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0005\u0000\u000001\u0005\u0002\u0000\u000012\u0005"+
		"\u000b\u0000\u000023\u0005\f\u0000\u000034\u0003\u0004\u0002\u000045\u0005"+
		"\u0003\u0000\u00005k\u0001\u0000\u0000\u000067\u0005\u0006\u0000\u0000"+
		"78\u0003\u0004\u0002\u000089\u0005\u0006\u0000\u00009k\u0001\u0000\u0000"+
		"\u0000:<\u0005\u000f\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0010\u0000\u0000>@\u0005"+
		"\u000e\u0000\u0000?A\u0005\u0010\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000Bk\u0005\u000b\u0000"+
		"\u0000CE\u0005\u000f\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0010\u0000\u0000GI\u0005"+
		"\u000f\u0000\u0000HJ\u0005\u0010\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000Kk\u0005\u000b\u0000"+
		"\u0000LN\u0005\u000f\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NP\u0001\u0000\u0000\u0000OQ\u0005\u0010\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"Rk\u0005\u000b\u0000\u0000SU\u0005\u000f\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000Vk\u0005\u0010"+
		"\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005"+
		"\u0003\u0000\u0000Zk\u0001\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000"+
		"\\]\u0005\u0002\u0000\u0000]^\u0003\u0004\u0002\u0000^_\u0005\u0003\u0000"+
		"\u0000_k\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005\u0002\u0000"+
		"\u0000bc\u0003\u0004\u0002\u0000cd\u0005\u0003\u0000\u0000dk\u0001\u0000"+
		"\u0000\u0000ef\u0005\t\u0000\u0000fg\u0005\u0002\u0000\u0000gh\u0003\u0004"+
		"\u0002\u0000hi\u0005\u0003\u0000\u0000ik\u0001\u0000\u0000\u0000j\u0011"+
		"\u0001\u0000\u0000\u0000j\u001d\u0001\u0000\u0000\u0000j$\u0001\u0000"+
		"\u0000\u0000j-\u0001\u0000\u0000\u0000j6\u0001\u0000\u0000\u0000j;\u0001"+
		"\u0000\u0000\u0000jD\u0001\u0000\u0000\u0000jM\u0001\u0000\u0000\u0000"+
		"jT\u0001\u0000\u0000\u0000jW\u0001\u0000\u0000\u0000j[\u0001\u0000\u0000"+
		"\u0000j`\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000kt\u0001\u0000"+
		"\u0000\u0000lm\n\u000b\u0000\u0000mn\u0007\u0000\u0000\u0000ns\u0003\u0004"+
		"\u0002\fop\n\n\u0000\u0000pq\u0007\u0001\u0000\u0000qs\u0003\u0004\u0002"+
		"\u000brl\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0005"+
		"\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0001\u0000"+
		"\u0000xy\u0005\u0002\u0000\u0000yz\u0003\u0006\u0003\u0000z{\u0005\u0003"+
		"\u0000\u0000{|\u0005\u000e\u0000\u0000|}\u0005\u0001\u0000\u0000}~\u0005"+
		"\u0002\u0000\u0000~\u007f\u0003\u0006\u0003\u0000\u007f\u0080\u0005\u0003"+
		"\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u00ea\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0084\u0005\u0002"+
		"\u0000\u0000\u0084\u0085\u0003\u0006\u0003\u0000\u0085\u0086\u0005\u0003"+
		"\u0000\u0000\u0086\u00ea\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0010"+
		"\u0000\u0000\u0088\u008a\u0005\f\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u008d\u0005\u0002\u0000"+
		"\u0000\u008d\u008e\u0003\u0006\u0003\u0000\u008e\u008f\u0005\u0003\u0000"+
		"\u0000\u008f\u00ea\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0010\u0000"+
		"\u0000\u0091\u0093\u0005\f\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0096\u0005\u0002\u0000\u0000"+
		"\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098"+
		"\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a"+
		"\u00ea\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u0002\u0000\u0000\u009d\u00a2\u0003\u0006\u0003\u0000\u009e"+
		"\u00a0\u0005\n\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3"+
		"\u0003\u0006\u0003\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0003\u0000\u0000\u00a7\u00ea\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0007\u0001\u0000\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u00af"+
		"\u0003\u0006\u0003\u0000\u00ab\u00ad\u0005\n\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0003\u0006\u0003\u0000\u00af\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00ea\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6\u00b7\u0003"+
		"\u0006\u0003\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0005\u000f\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00bf\u0005"+
		"\u000e\u0000\u0000\u00be\u00c0\u0005\u0010\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00ea\u0005\u000b\u0000\u0000\u00c2\u00c4\u0005"+
		"\u000f\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0010\u0000\u0000\u00c6\u00c8\u0005\u000f\u0000\u0000\u00c7\u00c9\u0005"+
		"\u0010\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00ea\u0005"+
		"\u000b\u0000\u0000\u00cb\u00cd\u0005\u000f\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0005\u0010\u0000\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ea\u0005\u000b\u0000\u0000\u00d2\u00d4\u0005"+
		"\u000f\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00ea\u0005"+
		"\u0010\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00d8\u0003"+
		"\u0006\u0003\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0007\u0000\u0000\u00db\u00dc\u0005"+
		"\u0002\u0000\u0000\u00dc\u00dd\u0003\u0006\u0003\u0000\u00dd\u00de\u0005"+
		"\u0003\u0000\u0000\u00de\u00ea\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\b\u0000\u0000\u00e0\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e2\u0003\u0006"+
		"\u0003\u0000\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e6\u0005\u0002\u0000"+
		"\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000\u00e7\u00e8\u0005\u0003\u0000"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9w\u0001\u0000\u0000\u0000"+
		"\u00e9\u0082\u0001\u0000\u0000\u0000\u00e9\u0089\u0001\u0000\u0000\u0000"+
		"\u00e9\u0092\u0001\u0000\u0000\u0000\u00e9\u009b\u0001\u0000\u0000\u0000"+
		"\u00e9\u00a8\u0001\u0000\u0000\u0000\u00e9\u00b5\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ba\u0001\u0000\u0000\u0000\u00e9\u00c3\u0001\u0000\u0000\u0000"+
		"\u00e9\u00cc\u0001\u0000\u0000\u0000\u00e9\u00d3\u0001\u0000\u0000\u0000"+
		"\u00e9\u00d6\u0001\u0000\u0000\u0000\u00e9\u00da\u0001\u0000\u0000\u0000"+
		"\u00e9\u00df\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000"+
		"\u00ea\u0007\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000\u0000"+
		"\u00ec\u00ed\u0005\u0002\u0000\u0000\u00ed\u00ee\u0003\b\u0004\u0000\u00ee"+
		"\u00ef\u0005\u0003\u0000\u0000\u00ef\u00f0\u0005\u000e\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0001\u0000\u0000\u00f1\u00f2\u0005\u0002\u0000\u0000\u00f2"+
		"\u00f3\u0003\b\u0004\u0000\u00f3\u00f4\u0005\u0003\u0000\u0000\u00f4\u00f5"+
		"\u0005\u000b\u0000\u0000\u00f5\u0160\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0001\u0000\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8\u00f9"+
		"\u0003\b\u0004\u0000\u00f9\u00fb\u0005\u0003\u0000\u0000\u00fa\u00fc\u0005"+
		"\u000b\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u0160\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0010\u0000\u0000\u00fe\u0100\u0005\f\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0005\u0002"+
		"\u0000\u0000\u0103\u0104\u0003\b\u0004\u0000\u0104\u0105\u0005\u0003\u0000"+
		"\u0000\u0105\u0160\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0010\u0000"+
		"\u0000\u0107\u0109\u0005\f\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005\u0005\u0000\u0000\u010b\u010c\u0005\u0002\u0000\u0000"+
		"\u010c\u010d\u0005\u000b\u0000\u0000\u010d\u010e\u0005\f\u0000\u0000\u010e"+
		"\u010f\u0003\b\u0004\u0000\u010f\u0110\u0005\u0003\u0000\u0000\u0110\u0160"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0000\u0000\u0000\u0112\u0113"+
		"\u0005\u0002\u0000\u0000\u0113\u0118\u0003\b\u0004\u0000\u0114\u0116\u0005"+
		"\n\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0003\b\u0004"+
		"\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0003\u0000"+
		"\u0000\u011d\u0160\u0001\u0000\u0000\u0000\u011e\u011f\u0007\u0001\u0000"+
		"\u0000\u011f\u0120\u0005\u0002\u0000\u0000\u0120\u0125\u0003\b\u0004\u0000"+
		"\u0121\u0123\u0005\n\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0003\b\u0004\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u0003\u0000\u0000\u012a\u0160\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005\u0006\u0000\u0000\u012c\u012d\u0003\b\u0004\u0000\u012d\u012e\u0005"+
		"\u0006\u0000\u0000\u012e\u0160\u0001\u0000\u0000\u0000\u012f\u0131\u0005"+
		"\u000f\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"\u0010\u0000\u0000\u0133\u0135\u0005\u000e\u0000\u0000\u0134\u0136\u0005"+
		"\u0010\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0160\u0005"+
		"\u000b\u0000\u0000\u0138\u013a\u0005\u000f\u0000\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0010\u0000\u0000\u013c\u013e\u0005"+
		"\u000f\u0000\u0000\u013d\u013f\u0005\u0010\u0000\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0160\u0005\u000b\u0000\u0000\u0141\u0143\u0005"+
		"\u000f\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0005"+
		"\u0010\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0160\u0005"+
		"\u000b\u0000\u0000\u0148\u014a\u0005\u000f\u0000\u0000\u0149\u0148\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u0160\u0005\u0010\u0000\u0000\u014c\u014d\u0005"+
		"\u0002\u0000\u0000\u014d\u014e\u0003\b\u0004\u0000\u014e\u014f\u0005\u0003"+
		"\u0000\u0000\u014f\u0160\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0007"+
		"\u0000\u0000\u0151\u0152\u0005\u0002\u0000\u0000\u0152\u0153\u0003\b\u0004"+
		"\u0000\u0153\u0154\u0005\u0003\u0000\u0000\u0154\u0160\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005\b\u0000\u0000\u0156\u0157\u0005\u0002\u0000\u0000"+
		"\u0157\u0158\u0003\b\u0004\u0000\u0158\u0159\u0005\u0003\u0000\u0000\u0159"+
		"\u0160\u0001\u0000\u0000\u0000\u015a\u015b\u0005\t\u0000\u0000\u015b\u015c"+
		"\u0005\u0002\u0000\u0000\u015c\u015d\u0003\b\u0004\u0000\u015d\u015e\u0005"+
		"\u0003\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u00eb\u0001"+
		"\u0000\u0000\u0000\u015f\u00f6\u0001\u0000\u0000\u0000\u015f\u00ff\u0001"+
		"\u0000\u0000\u0000\u015f\u0108\u0001\u0000\u0000\u0000\u015f\u0111\u0001"+
		"\u0000\u0000\u0000\u015f\u011e\u0001\u0000\u0000\u0000\u015f\u012b\u0001"+
		"\u0000\u0000\u0000\u015f\u0130\u0001\u0000\u0000\u0000\u015f\u0139\u0001"+
		"\u0000\u0000\u0000\u015f\u0142\u0001\u0000\u0000\u0000\u015f\u0149\u0001"+
		"\u0000\u0000\u0000\u015f\u014c\u0001\u0000\u0000\u0000\u015f\u0150\u0001"+
		"\u0000\u0000\u0000\u015f\u0155\u0001\u0000\u0000\u0000\u015f\u015a\u0001"+
		"\u0000\u0000\u0000\u0160\t\u0001\u0000\u0000\u0000*\u000f$-;@DIMPTjrt"+
		"\u0089\u0092\u009f\u00a4\u00ac\u00b1\u00ba\u00bf\u00c3\u00c8\u00cc\u00cf"+
		"\u00d3\u00e9\u00fb\u00ff\u0108\u0115\u011a\u0122\u0127\u0130\u0135\u0139"+
		"\u013e\u0142\u0145\u0149\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}