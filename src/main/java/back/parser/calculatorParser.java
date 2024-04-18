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
		DECIMAL=10, I=11, E=12, COS=13, SIN=14, EXP=15, NUMBER=16, FLOAT=17, WS=18;
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
		"'.'", "'i'", "'E'", "'cos'", "'sin'", "'exp'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ADD", "SUB", "MUL", "DIV", "COMMA", "MODULUS", 
		"DECIMAL", "I", "E", "COS", "SIN", "EXP", "NUMBER", "FLOAT", "WS"
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
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
		public AtomContext theta;
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
			((PolarContext)_localctx).theta = atom();
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
			((PolarContext)_localctx).theta = atom();
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
			setState(89);
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
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
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
						setState(93);
						infix(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
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
						setState(96);
						infix(5);
						}
						break;
					}
					} 
				}
				setState(101);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ModulusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(102);
					match(MODULUS);
					setState(103);
					prefix();
					setState(104);
					match(MODULUS);
					}
					}
					break;
				case T__2:
					{
					{
					setState(106);
					match(T__2);
					setState(107);
					match(T__0);
					setState(108);
					prefix();
					setState(109);
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
				setState(113);
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
				setState(114);
				match(T__0);
				setState(115);
				prefix();
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(116);
						match(COMMA);
						setState(117);
						prefix();
						}
						}
						setState(120); 
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
				case NUMBER:
				case FLOAT:
					{
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(122);
						prefix();
						}
						}
						setState(125); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
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
				setState(132);
				match(T__0);
				setState(133);
				prefix();
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(134);
						match(COMMA);
						setState(135);
						prefix();
						}
						}
						setState(138); 
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
				case NUMBER:
				case FLOAT:
					{
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(140);
						prefix();
						}
						}
						setState(143); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(T__0);
				setState(150);
				prefix();
				setState(151);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ImaginaryPrefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				imNumber();
				}
				break;
			case 6:
				_localctx = new AtomImPrefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				imAtom();
				}
				break;
			case 7:
				_localctx = new AtomRePrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				reAtom();
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ModulusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(158);
					match(MODULUS);
					setState(159);
					postfix();
					setState(160);
					match(MODULUS);
					}
					}
					break;
				case T__2:
					{
					{
					setState(162);
					match(T__2);
					setState(163);
					match(T__0);
					setState(164);
					postfix();
					setState(165);
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
				setState(169);
				match(T__0);
				setState(170);
				postfix();
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(171);
						match(COMMA);
						setState(172);
						postfix();
						}
						}
						setState(175); 
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
				case NUMBER:
				case FLOAT:
					{
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(177);
						postfix();
						}
						}
						setState(180); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				match(T__1);
				setState(185);
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
				setState(187);
				match(T__0);
				setState(188);
				postfix();
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(189);
						match(COMMA);
						setState(190);
						postfix();
						}
						}
						setState(193); 
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
				case NUMBER:
				case FLOAT:
					{
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(195);
						postfix();
						}
						}
						setState(198); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				match(T__1);
				setState(203);
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
				setState(205);
				match(T__0);
				setState(206);
				postfix();
				setState(207);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ImaginaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				imNumber();
				}
				break;
			case 6:
				_localctx = new AtomImPostfixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				imAtom();
				}
				break;
			case 7:
				_localctx = new AtomRePostfixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				reAtom();
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ENotationAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(214);
					match(SUB);
					}
				}

				setState(217);
				((ENotationAtomContext)_localctx).val = match(FLOAT);
				setState(218);
				match(E);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(219);
					match(SUB);
					}
				}

				setState(222);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(223);
					match(SUB);
					}
				}

				setState(226);
				((FloatAtomContext)_localctx).val = match(FLOAT);
				}
				break;
			case 3:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(227);
					match(SUB);
					}
				}

				setState(230);
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
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NUMBER) | (1L << FLOAT))) != 0)) {
				{
				setState(233);
				atom();
				}
			}

			setState(236);
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
			setState(238);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00f3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\3\5\5\5*\n\5\3\5\3\5\3\6\3\6\5\6\60\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7A\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\\\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bd\n\b\f\b\16\bg\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\t\3\t\3\t\3\t\3\t\6\t"+
		"y\n\t\r\t\16\tz\3\t\6\t~\n\t\r\t\16\t\177\5\t\u0082\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u008b\n\t\r\t\16\t\u008c\3\t\6\t\u0090\n\t\r\t\16\t"+
		"\u0091\5\t\u0094\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\n\3\n\3\n\3\n\6\n"+
		"\u00b0\n\n\r\n\16\n\u00b1\3\n\6\n\u00b5\n\n\r\n\16\n\u00b6\5\n\u00b9\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c2\n\n\r\n\16\n\u00c3\3\n\6\n\u00c7"+
		"\n\n\r\n\16\n\u00c8\5\n\u00cb\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00d7\n\n\3\13\5\13\u00da\n\13\3\13\3\13\3\13\5\13\u00df\n\13"+
		"\3\13\3\13\5\13\u00e3\n\13\3\13\3\13\5\13\u00e7\n\13\3\13\5\13\u00ea\n"+
		"\13\3\f\5\f\u00ed\n\f\3\f\3\f\3\r\3\r\3\r\2\3\16\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\4\3\2\6\7\3\2\b\t\2\u0115\2\32\3\2\2\2\4\37\3\2\2\2\6$"+
		"\3\2\2\2\b&\3\2\2\2\n-\3\2\2\2\f>\3\2\2\2\16[\3\2\2\2\20\u009e\3\2\2\2"+
		"\22\u00d6\3\2\2\2\24\u00e9\3\2\2\2\26\u00ec\3\2\2\2\30\u00f0\3\2\2\2\32"+
		"\33\5\4\3\2\33\3\3\2\2\2\34 \5\16\b\2\35 \5\22\n\2\36 \5\20\t\2\37\34"+
		"\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!%\5\b\5\2\"%\5\n\6\2#"+
		"%\5\f\7\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\5\24\13\2\')\t"+
		"\2\2\2(*\5\24\13\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\r\2\2,\t\3\2\2\2"+
		"-/\5\24\13\2.\60\7\b\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\3"+
		"\2\2\62\63\7\17\2\2\63\64\7\3\2\2\64\65\5\24\13\2\65\66\7\4\2\2\66\67"+
		"\7\6\2\2\678\7\r\2\289\7\20\2\29:\7\3\2\2:;\5\24\13\2;<\7\4\2\2<=\7\4"+
		"\2\2=\13\3\2\2\2>@\5\24\13\2?A\7\b\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2B"+
		"C\7\21\2\2CD\7\3\2\2DE\5\24\13\2EF\7\r\2\2FG\7\4\2\2G\r\3\2\2\2HR\b\b"+
		"\1\2IJ\7\13\2\2JK\5\16\b\2KL\7\13\2\2LS\3\2\2\2MN\7\5\2\2NO\7\3\2\2OP"+
		"\5\16\b\2PQ\7\4\2\2QS\3\2\2\2RI\3\2\2\2RM\3\2\2\2S\\\3\2\2\2T\\\5\6\4"+
		"\2UV\7\3\2\2VW\5\16\b\2WX\7\4\2\2X\\\3\2\2\2Y\\\5\26\f\2Z\\\5\30\r\2["+
		"H\3\2\2\2[T\3\2\2\2[U\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\e\3\2\2\2]^\f\7\2\2"+
		"^_\t\3\2\2_d\5\16\b\b`a\f\6\2\2ab\t\2\2\2bd\5\16\b\7c]\3\2\2\2c`\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2\2ge\3\2\2\2hi\7\13\2\2ij\5"+
		"\20\t\2jk\7\13\2\2kr\3\2\2\2lm\7\5\2\2mn\7\3\2\2no\5\20\t\2op\7\4\2\2"+
		"pr\3\2\2\2qh\3\2\2\2ql\3\2\2\2r\u009f\3\2\2\2st\t\3\2\2tu\7\3\2\2u\u0081"+
		"\5\20\t\2vw\7\n\2\2wy\5\20\t\2xv\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{\u0082\3\2\2\2|~\5\20\t\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081x\3\2\2\2\u0081}\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u009f\3\2\2\2\u0085\u0086\t\2\2\2\u0086"+
		"\u0087\7\3\2\2\u0087\u0093\5\20\t\2\u0088\u0089\7\n\2\2\u0089\u008b\5"+
		"\20\t\2\u008a\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0090\5\20\t\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008f\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\7\4\2\2\u0096\u009f\3\2\2\2\u0097\u0098\7\3\2\2\u0098"+
		"\u0099\5\20\t\2\u0099\u009a\7\4\2\2\u009a\u009f\3\2\2\2\u009b\u009f\5"+
		"\6\4\2\u009c\u009f\5\26\f\2\u009d\u009f\5\30\r\2\u009eq\3\2\2\2\u009e"+
		"s\3\2\2\2\u009e\u0085\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009b\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1"+
		"\7\13\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\13\2\2\u00a3\u00aa\3\2\2"+
		"\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5\22\n\2\u00a7"+
		"\u00a8\7\4\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a4\3\2"+
		"\2\2\u00aa\u00d7\3\2\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00b8\5\22\n\2\u00ad"+
		"\u00ae\7\n\2\2\u00ae\u00b0\5\22\n\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b9\3\2\2\2\u00b3"+
		"\u00b5\5\22\n\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\t\3"+
		"\2\2\u00bc\u00d7\3\2\2\2\u00bd\u00be\7\3\2\2\u00be\u00ca\5\22\n\2\u00bf"+
		"\u00c0\7\n\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5"+
		"\u00c7\5\22\n\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\t\2"+
		"\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5\22\n\2\u00d1"+
		"\u00d2\7\4\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d7\5\6\4\2\u00d4\u00d7\5\26"+
		"\f\2\u00d5\u00d7\5\30\r\2\u00d6\u00a9\3\2\2\2\u00d6\u00ab\3\2\2\2\u00d6"+
		"\u00bd\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00da\7\7\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\23\2\2"+
		"\u00dc\u00de\7\16\2\2\u00dd\u00df\7\7\2\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00ea\7\22\2\2\u00e1\u00e3\7\7\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ea"+
		"\7\23\2\2\u00e5\u00e7\7\7\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\22\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00e2"+
		"\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ed\5\24\13\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\r"+
		"\2\2\u00ef\27\3\2\2\2\u00f0\u00f1\5\24\13\2\u00f1\31\3\2\2\2!\37$)/@R"+
		"[ceqz\177\u0081\u008c\u0091\u0093\u009e\u00a9\u00b1\u00b6\u00b8\u00c3"+
		"\u00c8\u00ca\u00d6\u00d9\u00de\u00e2\u00e6\u00e9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}