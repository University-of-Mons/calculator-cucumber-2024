// Generated from calculator.g4 by ANTLR 4.7.1

package back.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ADD=4, SUB=5, MUL=6, DIV=7, COMMA=8, MODULUS=9, 
		DECIMAL=10, I=11, E=12, COS=13, SQRT=14, SIN=15, EXP=16, PI=17, NUMBER=18, 
		FLOAT=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_imNumber = 2, RULE_cartesian = 3, 
		RULE_polar = 4, RULE_exponential = 5, RULE_infix = 6, RULE_prefix = 7, 
		RULE_postfix = 8, RULE_atom = 9, RULE_imAtom = 10, RULE_reAtom = 11;
	public static final String[] ruleNames = {
		"prog", "expression", "imNumber", "cartesian", "polar", "exponential", 
		"infix", "prefix", "postfix", "atom", "imAtom", "reAtom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'modulus'", "'+'", "'-'", "'*'", "'/'", "','", "'|'", 
		"'.'", "'i'", "'E'", "'cos'", "'sqrt'", "'sin'", "'exp'", "'pi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ADD", "SUB", "MUL", "DIV", "COMMA", "MODULUS", 
		"DECIMAL", "I", "E", "COS", "SQRT", "SIN", "EXP", "PI", "NUMBER", "FLOAT", 
		"WS"
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
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				prefix();
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

	public static class ImNumberContext extends ParserRuleContext {
		public CartesianContext cartesian() {
			return getRuleContext(CartesianContext.class,0);
		}
		public PolarContext polar() {
			return getRuleContext(PolarContext.class,0);
		}
		public ExponentialContext exponential() {
			return getRuleContext(ExponentialContext.class,0);
		}
		public ImNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImNumberContext imNumber() throws RecognitionException {
		ImNumberContext _localctx = new ImNumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imNumber);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				cartesian();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				polar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				exponential();
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

	public static class CartesianContext extends ParserRuleContext {
		public AtomContext real;
		public Token op;
		public AtomContext im;
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public CartesianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesian; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCartesian(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CartesianContext cartesian() throws RecognitionException {
		CartesianContext _localctx = new CartesianContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cartesian);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((CartesianContext)_localctx).real = atom();
			setState(37);
			((CartesianContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
				((CartesianContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				setState(38);
				((CartesianContext)_localctx).im = atom();
				}
			}

			setState(41);
			match(I);
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

	public static class PolarContext extends ParserRuleContext {
		public AtomContext r;
		public AtomContext theta1;
		public AtomContext theta2;
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public PolarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPolar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolarContext polar() throws RecognitionException {
		PolarContext _localctx = new PolarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_polar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((PolarContext)_localctx).r = atom();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(44);
				match(MUL);
				}
			}

			setState(47);
			match(T__0);
			setState(48);
			match(COS);
			setState(49);
			match(T__0);
			setState(50);
			((PolarContext)_localctx).theta1 = atom();
			setState(51);
			match(T__1);
			setState(52);
			match(ADD);
			setState(53);
			match(I);
			setState(54);
			match(SIN);
			setState(55);
			match(T__0);
			setState(56);
			((PolarContext)_localctx).theta2 = atom();
			setState(57);
			match(T__1);
			setState(58);
			match(T__1);
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

	public static class ExponentialContext extends ParserRuleContext {
		public AtomContext r;
		public AtomContext theta;
		public TerminalNode EXP() { return getToken(calculatorParser.EXP, 0); }
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public ExponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponential; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExponential(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((ExponentialContext)_localctx).r = atom();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(61);
				match(MUL);
				}
			}

			setState(64);
			match(EXP);
			setState(65);
			match(T__0);
			setState(66);
			((ExponentialContext)_localctx).theta = atom();
			setState(67);
			match(I);
			setState(68);
			match(T__1);
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
	public static class ExpInfixContext extends InfixContext {
		public TerminalNode EXP() { return getToken(calculatorParser.EXP, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ExpInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusInfixContext extends InfixContext {
		public List<TerminalNode> MODULUS() { return getTokens(calculatorParser.MODULUS); }
		public TerminalNode MODULUS(int i) {
			return getToken(calculatorParser.MODULUS, i);
		}
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ModulusInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitModulusInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtInfixContext extends InfixContext {
		public TerminalNode SQRT() { return getToken(calculatorParser.SQRT, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public SqrtInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSqrtInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinInfixContext extends InfixContext {
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public SinInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSinInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public MulDivInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMulDivInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ParensInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParensInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomReInfixContext extends InfixContext {
		public ReAtomContext reAtom() {
			return getRuleContext(ReAtomContext.class,0);
		}
		public AtomReInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomReInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImaginaryInfixContext extends InfixContext {
		public ImNumberContext imNumber() {
			return getRuleContext(ImNumberContext.class,0);
		}
		public ImaginaryInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public AddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAddSubInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosInfixContext extends InfixContext {
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public CosInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCosInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomImInfixContext extends InfixContext {
		public ImAtomContext imAtom() {
			return getRuleContext(ImAtomContext.class,0);
		}
		public AtomImInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomImInfix(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ModulusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(71);
					match(MODULUS);
					setState(72);
					infix(0);
					setState(73);
					match(MODULUS);
					}
					}
					break;
				case T__2:
					{
					{
					setState(75);
					match(T__2);
					setState(76);
					match(T__0);
					setState(77);
					infix(0);
					setState(78);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				_localctx = new ImaginaryInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				imNumber();
				}
				break;
			case 3:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__0);
				setState(84);
				infix(0);
				setState(85);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new AtomImInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				imAtom();
				}
				break;
			case 5:
				{
				_localctx = new AtomReInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				reAtom();
				}
				break;
			case 6:
				{
				_localctx = new SqrtInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(SQRT);
				setState(90);
				match(T__0);
				setState(91);
				infix(0);
				setState(92);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ExpInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(EXP);
				setState(95);
				match(T__0);
				setState(96);
				infix(0);
				setState(97);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new CosInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(COS);
				setState(100);
				match(T__0);
				setState(101);
				infix(0);
				setState(102);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new SinInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(SIN);
				setState(105);
				match(T__0);
				setState(106);
				infix(0);
				setState(107);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(111);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(112);
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
						setState(113);
						infix(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(114);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(115);
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
						setState(116);
						infix(9);
						}
						break;
					}
					} 
				}
				setState(121);
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
	public static class AtomRePrefixContext extends PrefixContext {
		public ReAtomContext reAtom() {
			return getRuleContext(ReAtomContext.class,0);
		}
		public AtomRePrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomRePrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImaginaryPrefixContext extends PrefixContext {
		public ImNumberContext imNumber() {
			return getRuleContext(ImNumberContext.class,0);
		}
		public ImaginaryPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtPrefixContext extends PrefixContext {
		public TerminalNode SQRT() { return getToken(calculatorParser.SQRT, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public SqrtPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSqrtPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosPrefixContext extends PrefixContext {
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public CosPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCosPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinPrefixContext extends PrefixContext {
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public SinPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSinPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomImPrefixContext extends PrefixContext {
		public ImAtomContext imAtom() {
			return getRuleContext(ImAtomContext.class,0);
		}
		public AtomImPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomImPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ParensPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParensPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusPrefixContext extends PrefixContext {
		public List<TerminalNode> MODULUS() { return getTokens(calculatorParser.MODULUS); }
		public TerminalNode MODULUS(int i) {
			return getToken(calculatorParser.MODULUS, i);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ModulusPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitModulusPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPrefixContext extends PrefixContext {
		public TerminalNode EXP() { return getToken(calculatorParser.EXP, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ExpPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public MulDivPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMulDivPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prefix);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ModulusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(122);
					match(MODULUS);
					setState(123);
					prefix();
					setState(124);
					match(MODULUS);
					}
					}
					break;
				case T__2:
					{
					{
					setState(126);
					match(T__2);
					setState(127);
					match(T__0);
					setState(128);
					prefix();
					setState(129);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new MulDivPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
				setState(134);
				match(T__0);
				setState(135);
				prefix();
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(136);
						match(COMMA);
						setState(137);
						prefix();
						}
						}
						setState(140); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__2:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case MODULUS:
				case I:
				case COS:
				case SQRT:
				case SIN:
				case EXP:
				case PI:
				case NUMBER:
				case FLOAT:
					{
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(142);
						prefix();
						}
						}
						setState(145); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << COS) | (1L << SQRT) | (1L << SIN) | (1L << EXP) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
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
				setState(152);
				match(T__0);
				setState(153);
				prefix();
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						match(COMMA);
						setState(155);
						prefix();
						}
						}
						setState(158); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__2:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case MODULUS:
				case I:
				case COS:
				case SQRT:
				case SIN:
				case EXP:
				case PI:
				case NUMBER:
				case FLOAT:
					{
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(160);
						prefix();
						}
						}
						setState(163); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << COS) | (1L << SQRT) | (1L << SIN) | (1L << EXP) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(T__0);
				setState(170);
				prefix();
				setState(171);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ImaginaryPrefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				imNumber();
				}
				break;
			case 6:
				_localctx = new AtomImPrefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				imAtom();
				}
				break;
			case 7:
				_localctx = new AtomRePrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				reAtom();
				}
				break;
			case 8:
				_localctx = new SqrtPrefixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(SQRT);
				setState(177);
				match(T__0);
				setState(178);
				prefix();
				setState(179);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new ExpPrefixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(EXP);
				setState(182);
				match(T__0);
				setState(183);
				prefix();
				setState(184);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new CosPrefixContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(186);
				match(COS);
				setState(187);
				match(T__0);
				setState(188);
				prefix();
				setState(189);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new SinPrefixContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(SIN);
				setState(192);
				match(T__0);
				setState(193);
				prefix();
				setState(194);
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
	public static class MulDivPostfixContext extends PostfixContext {
		public Token op;
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public MulDivPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMulDivPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPostfixContext extends PostfixContext {
		public TerminalNode EXP() { return getToken(calculatorParser.EXP, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ExpPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitExpPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinPostfixContext extends PostfixContext {
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public SinPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSinPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ParensPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitParensPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImaginaryPostfixContext extends PostfixContext {
		public ImNumberContext imNumber() {
			return getRuleContext(ImNumberContext.class,0);
		}
		public ImaginaryPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubPostfixContext extends PostfixContext {
		public Token op;
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomRePostfixContext extends PostfixContext {
		public ReAtomContext reAtom() {
			return getRuleContext(ReAtomContext.class,0);
		}
		public AtomRePostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomRePostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtPostfixContext extends PostfixContext {
		public TerminalNode SQRT() { return getToken(calculatorParser.SQRT, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public SqrtPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSqrtPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomImPostfixContext extends PostfixContext {
		public ImAtomContext imAtom() {
			return getRuleContext(ImAtomContext.class,0);
		}
		public AtomImPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomImPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosPostfixContext extends PostfixContext {
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public CosPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCosPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusPostfixContext extends PostfixContext {
		public List<TerminalNode> MODULUS() { return getTokens(calculatorParser.MODULUS); }
		public TerminalNode MODULUS(int i) {
			return getToken(calculatorParser.MODULUS, i);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ModulusPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitModulusPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_postfix);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ModulusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(198);
					match(MODULUS);
					setState(199);
					postfix();
					setState(200);
					match(MODULUS);
					}
					}
					break;
				case T__2:
					{
					{
					setState(202);
					match(T__2);
					setState(203);
					match(T__0);
					setState(204);
					postfix();
					setState(205);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new MulDivPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__0);
				setState(210);
				postfix();
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(211);
						match(COMMA);
						setState(212);
						postfix();
						}
						}
						setState(215); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__2:
				case SUB:
				case MODULUS:
				case I:
				case COS:
				case SQRT:
				case SIN:
				case EXP:
				case PI:
				case NUMBER:
				case FLOAT:
					{
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(217);
						postfix();
						}
						}
						setState(220); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << COS) | (1L << SQRT) | (1L << SIN) | (1L << EXP) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224);
				match(T__1);
				setState(225);
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
			case 3:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__0);
				setState(228);
				postfix();
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(229);
						match(COMMA);
						setState(230);
						postfix();
						}
						}
						setState(233); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__2:
				case SUB:
				case MODULUS:
				case I:
				case COS:
				case SQRT:
				case SIN:
				case EXP:
				case PI:
				case NUMBER:
				case FLOAT:
					{
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(235);
						postfix();
						}
						}
						setState(238); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << COS) | (1L << SQRT) | (1L << SIN) | (1L << EXP) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242);
				match(T__1);
				setState(243);
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
			case 4:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__0);
				setState(246);
				postfix();
				setState(247);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ImaginaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				imNumber();
				}
				break;
			case 6:
				_localctx = new AtomImPostfixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				imAtom();
				}
				break;
			case 7:
				_localctx = new AtomRePostfixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				reAtom();
				}
				break;
			case 8:
				_localctx = new SqrtPostfixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(SQRT);
				setState(253);
				match(T__0);
				setState(254);
				postfix();
				setState(255);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new ExpPostfixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(EXP);
				setState(258);
				match(T__0);
				setState(259);
				postfix();
				setState(260);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new CosPostfixContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(COS);
				setState(263);
				match(T__0);
				setState(264);
				postfix();
				setState(265);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new SinPostfixContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(267);
				match(SIN);
				setState(268);
				match(T__0);
				setState(269);
				postfix();
				setState(270);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PiAtomContext extends AtomContext {
		public TerminalNode PI() { return getToken(calculatorParser.PI, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public PiAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPiAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENotationAtomContext extends AtomContext {
		public Token val;
		public TerminalNode E() { return getToken(calculatorParser.E, 0); }
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public List<TerminalNode> SUB() { return getTokens(calculatorParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(calculatorParser.SUB, i);
		}
		public ENotationAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitENotationAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatAtomContext extends AtomContext {
		public Token val;
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public FloatAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ENotationAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(274);
					match(SUB);
					}
				}

				setState(277);
				((ENotationAtomContext)_localctx).val = match(FLOAT);
				setState(278);
				match(E);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(279);
					match(SUB);
					}
				}

				setState(282);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(283);
					match(SUB);
					}
				}

				setState(286);
				((FloatAtomContext)_localctx).val = match(FLOAT);
				}
				break;
			case 3:
				_localctx = new PiAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(287);
					match(SUB);
					}
				}

				setState(290);
				match(PI);
				}
				break;
			case 4:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(291);
					match(SUB);
					}
				}

				setState(294);
				match(NUMBER);
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

	public static class ImAtomContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ImAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImAtomContext imAtom() throws RecognitionException {
		ImAtomContext _localctx = new ImAtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << PI) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				setState(297);
				atom();
				}
			}

			setState(300);
			match(I);
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

	public static class ReAtomContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ReAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitReAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReAtomContext reAtom() throws RecognitionException {
		ReAtomContext _localctx = new ReAtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			atom();
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
		case 6:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0133\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\6\3\6\5\6\60\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7A\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16"+
		"\b{\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\6\t\u008d\n\t\r\t\16\t\u008e\3\t\6\t\u0092\n\t\r\t\16\t\u0093"+
		"\5\t\u0096\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u009f\n\t\r\t\16\t\u00a0"+
		"\3\t\6\t\u00a4\n\t\r\t\16\t\u00a5\5\t\u00a8\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00d2\n\n\3\n\3\n\3\n\3\n\6\n\u00d8\n\n\r\n\16\n\u00d9\3\n\6"+
		"\n\u00dd\n\n\r\n\16\n\u00de\5\n\u00e1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u00ea\n\n\r\n\16\n\u00eb\3\n\6\n\u00ef\n\n\r\n\16\n\u00f0\5\n\u00f3"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0113\n\n\3"+
		"\13\5\13\u0116\n\13\3\13\3\13\3\13\5\13\u011b\n\13\3\13\3\13\5\13\u011f"+
		"\n\13\3\13\3\13\5\13\u0123\n\13\3\13\3\13\5\13\u0127\n\13\3\13\5\13\u012a"+
		"\n\13\3\f\5\f\u012d\n\f\3\f\3\f\3\r\3\r\3\r\2\3\16\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\4\3\2\6\7\3\2\b\t\2\u0163\2\32\3\2\2\2\4\37\3\2\2\2\6$"+
		"\3\2\2\2\b&\3\2\2\2\n-\3\2\2\2\f>\3\2\2\2\16o\3\2\2\2\20\u00c6\3\2\2\2"+
		"\22\u0112\3\2\2\2\24\u0129\3\2\2\2\26\u012c\3\2\2\2\30\u0130\3\2\2\2\32"+
		"\33\5\4\3\2\33\3\3\2\2\2\34 \5\16\b\2\35 \5\22\n\2\36 \5\20\t\2\37\34"+
		"\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!%\5\b\5\2\"%\5\n\6\2#"+
		"%\5\f\7\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\5\24\13\2\')\t"+
		"\2\2\2(*\5\24\13\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\r\2\2,\t\3\2\2\2"+
		"-/\5\24\13\2.\60\7\b\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\3"+
		"\2\2\62\63\7\17\2\2\63\64\7\3\2\2\64\65\5\24\13\2\65\66\7\4\2\2\66\67"+
		"\7\6\2\2\678\7\r\2\289\7\21\2\29:\7\3\2\2:;\5\24\13\2;<\7\4\2\2<=\7\4"+
		"\2\2=\13\3\2\2\2>@\5\24\13\2?A\7\b\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2B"+
		"C\7\22\2\2CD\7\3\2\2DE\5\24\13\2EF\7\r\2\2FG\7\4\2\2G\r\3\2\2\2HR\b\b"+
		"\1\2IJ\7\13\2\2JK\5\16\b\2KL\7\13\2\2LS\3\2\2\2MN\7\5\2\2NO\7\3\2\2OP"+
		"\5\16\b\2PQ\7\4\2\2QS\3\2\2\2RI\3\2\2\2RM\3\2\2\2Sp\3\2\2\2Tp\5\6\4\2"+
		"UV\7\3\2\2VW\5\16\b\2WX\7\4\2\2Xp\3\2\2\2Yp\5\26\f\2Zp\5\30\r\2[\\\7\20"+
		"\2\2\\]\7\3\2\2]^\5\16\b\2^_\7\4\2\2_p\3\2\2\2`a\7\22\2\2ab\7\3\2\2bc"+
		"\5\16\b\2cd\7\4\2\2dp\3\2\2\2ef\7\17\2\2fg\7\3\2\2gh\5\16\b\2hi\7\4\2"+
		"\2ip\3\2\2\2jk\7\21\2\2kl\7\3\2\2lm\5\16\b\2mn\7\4\2\2np\3\2\2\2oH\3\2"+
		"\2\2oT\3\2\2\2oU\3\2\2\2oY\3\2\2\2oZ\3\2\2\2o[\3\2\2\2o`\3\2\2\2oe\3\2"+
		"\2\2oj\3\2\2\2py\3\2\2\2qr\f\13\2\2rs\t\3\2\2sx\5\16\b\ftu\f\n\2\2uv\t"+
		"\2\2\2vx\5\16\b\13wq\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z"+
		"\17\3\2\2\2{y\3\2\2\2|}\7\13\2\2}~\5\20\t\2~\177\7\13\2\2\177\u0086\3"+
		"\2\2\2\u0080\u0081\7\5\2\2\u0081\u0082\7\3\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u0084\7\4\2\2\u0084\u0086\3\2\2\2\u0085|\3\2\2\2\u0085\u0080\3\2\2\2"+
		"\u0086\u00c7\3\2\2\2\u0087\u0088\t\3\2\2\u0088\u0089\7\3\2\2\u0089\u0095"+
		"\5\20\t\2\u008a\u008b\7\n\2\2\u008b\u008d\5\20\t\2\u008c\u008a\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096"+
		"\3\2\2\2\u0090\u0092\5\20\t\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\4\2\2\u0098"+
		"\u00c7\3\2\2\2\u0099\u009a\t\2\2\2\u009a\u009b\7\3\2\2\u009b\u00a7\5\20"+
		"\t\2\u009c\u009d\7\n\2\2\u009d\u009f\5\20\t\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a8\3\2"+
		"\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009e\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa"+
		"\u00c7\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7"+
		"\4\2\2\u00ae\u00c7\3\2\2\2\u00af\u00c7\5\6\4\2\u00b0\u00c7\5\26\f\2\u00b1"+
		"\u00c7\5\30\r\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5"+
		"\20\t\2\u00b5\u00b6\7\4\2\2\u00b6\u00c7\3\2\2\2\u00b7\u00b8\7\22\2\2\u00b8"+
		"\u00b9\7\3\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7\4\2\2\u00bb\u00c7\3"+
		"\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5\20\t\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\7"+
		"\3\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7\4\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u0085\3\2\2\2\u00c6\u0087\3\2\2\2\u00c6\u0099\3\2\2\2\u00c6\u00ab\3\2"+
		"\2\2\u00c6\u00af\3\2\2\2\u00c6\u00b0\3\2\2\2\u00c6\u00b1\3\2\2\2\u00c6"+
		"\u00b2\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5\22\n\2\u00ca"+
		"\u00cb\7\13\2\2\u00cb\u00d2\3\2\2\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7"+
		"\3\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\7\4\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\u0113\3\2\2\2\u00d3\u00d4\7\3"+
		"\2\2\u00d4\u00e0\5\22\n\2\u00d5\u00d6\7\n\2\2\u00d6\u00d8\5\22\n\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00e1\3\2\2\2\u00db\u00dd\5\22\n\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\4\2\2\u00e3\u00e4\t\3\2\2\u00e4\u0113\3\2\2\2\u00e5\u00e6\7\3"+
		"\2\2\u00e6\u00f2\5\22\n\2\u00e7\u00e8\7\n\2\2\u00e8\u00ea\5\22\n\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2"+
		"\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\7\4\2\2\u00f5\u00f6\t\2\2\2\u00f6\u0113\3\2\2\2\u00f7\u00f8\7\3"+
		"\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fa\7\4\2\2\u00fa\u0113\3\2\2\2\u00fb"+
		"\u0113\5\6\4\2\u00fc\u0113\5\26\f\2\u00fd\u0113\5\30\r\2\u00fe\u00ff\7"+
		"\20\2\2\u00ff\u0100\7\3\2\2\u0100\u0101\5\22\n\2\u0101\u0102\7\4\2\2\u0102"+
		"\u0113\3\2\2\2\u0103\u0104\7\22\2\2\u0104\u0105\7\3\2\2\u0105\u0106\5"+
		"\22\n\2\u0106\u0107\7\4\2\2\u0107\u0113\3\2\2\2\u0108\u0109\7\17\2\2\u0109"+
		"\u010a\7\3\2\2\u010a\u010b\5\22\n\2\u010b\u010c\7\4\2\2\u010c\u0113\3"+
		"\2\2\2\u010d\u010e\7\21\2\2\u010e\u010f\7\3\2\2\u010f\u0110\5\22\n\2\u0110"+
		"\u0111\7\4\2\2\u0111\u0113\3\2\2\2\u0112\u00d1\3\2\2\2\u0112\u00d3\3\2"+
		"\2\2\u0112\u00e5\3\2\2\2\u0112\u00f7\3\2\2\2\u0112\u00fb\3\2\2\2\u0112"+
		"\u00fc\3\2\2\2\u0112\u00fd\3\2\2\2\u0112\u00fe\3\2\2\2\u0112\u0103\3\2"+
		"\2\2\u0112\u0108\3\2\2\2\u0112\u010d\3\2\2\2\u0113\23\3\2\2\2\u0114\u0116"+
		"\7\7\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7\25\2\2\u0118\u011a\7\16\2\2\u0119\u011b\7\7\2\2\u011a\u0119\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u012a\7\24\2\2\u011d"+
		"\u011f\7\7\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u012a\7\25\2\2\u0121\u0123\7\7\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012a\7\23\2\2\u0125\u0127\7"+
		"\7\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\7\24\2\2\u0129\u0115\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u0122\3"+
		"\2\2\2\u0129\u0126\3\2\2\2\u012a\25\3\2\2\2\u012b\u012d\5\24\13\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\r"+
		"\2\2\u012f\27\3\2\2\2\u0130\u0131\5\24\13\2\u0131\31\3\2\2\2\"\37$)/@"+
		"Rowy\u0085\u008e\u0093\u0095\u00a0\u00a5\u00a7\u00c6\u00d1\u00d9\u00de"+
		"\u00e0\u00eb\u00f0\u00f2\u0112\u0115\u011a\u011e\u0122\u0126\u0129\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}