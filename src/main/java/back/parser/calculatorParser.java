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
		DECIMAL=10, I=11, E=12, NUMBER=13, FLOAT=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4, 
		RULE_imaginaryAndReal = 5, RULE_realNumber = 6, RULE_eNotation = 7, RULE_atom = 8;
	public static final String[] ruleNames = {
		"prog", "expression", "infix", "prefix", "postfix", "imaginaryAndReal", 
		"realNumber", "eNotation", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'modulus'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "','", "'|'", 
		"'.'", "'i'", "'E'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ADD", "SUB", "MUL", "DIV", "COMMA", "MODULUS", 
		"DECIMAL", "I", "E", "NUMBER", "FLOAT", "WS"
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
			setState(18);
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
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
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
	public static class RealInfixContext extends InfixContext {
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public RealInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRealInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENotationInfixContext extends InfixContext {
		public ENotationContext eNotation() {
			return getRuleContext(ENotationContext.class,0);
		}
		public ENotationInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitENotationInfix(this);
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
	public static class ImaginaryInfixContext extends InfixContext {
		public ImaginaryAndRealContext imaginaryAndReal() {
			return getRuleContext(ImaginaryAndRealContext.class,0);
		}
		public ImaginaryInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomInfixContext extends InfixContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomInfix(this);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ModulusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(26);
					match(MODULUS);
					setState(27);
					infix(0);
					setState(28);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(30);
					match(T__0);
					setState(31);
					match(T__1);
					setState(32);
					infix(0);
					setState(33);
					match(T__2);
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
				setState(37);
				imaginaryAndReal();
				}
				break;
			case 3:
				{
				_localctx = new RealInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				realNumber();
				}
				break;
			case 4:
				{
				_localctx = new ENotationInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				eNotation();
				}
				break;
			case 5:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__1);
				setState(41);
				infix(0);
				setState(42);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new AtomInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(47);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(48);
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
						setState(49);
						infix(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
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
						setState(52);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(57);
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
	public static class ImaginaryPrefixContext extends PrefixContext {
		public ImaginaryAndRealContext imaginaryAndReal() {
			return getRuleContext(ImaginaryAndRealContext.class,0);
		}
		public ImaginaryPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealPrefixContext extends PrefixContext {
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public RealPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRealPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENotationPrefixContext extends PrefixContext {
		public ENotationContext eNotation() {
			return getRuleContext(ENotationContext.class,0);
		}
		public ENotationPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitENotationPrefix(this);
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
	public static class AtomPrefixContext extends PrefixContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomPrefix(this);
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
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ModulusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(58);
					match(MODULUS);
					setState(59);
					prefix();
					setState(60);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(62);
					match(T__0);
					setState(63);
					match(T__1);
					setState(64);
					prefix();
					setState(65);
					match(T__2);
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
				setState(69);
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
				setState(70);
				match(T__1);
				setState(71);
				prefix();
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(72);
						match(COMMA);
						setState(73);
						prefix();
						}
						}
						setState(76); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__1:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case MODULUS:
				case I:
				case NUMBER:
				case FLOAT:
					{
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(78);
						prefix();
						}
						}
						setState(81); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
				setState(88);
				match(T__1);
				setState(89);
				prefix();
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(90);
						match(COMMA);
						setState(91);
						prefix();
						}
						}
						setState(94); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__1:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case MODULUS:
				case I:
				case NUMBER:
				case FLOAT:
					{
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(96);
						prefix();
						}
						}
						setState(99); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__1);
				setState(106);
				prefix();
				setState(107);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ImaginaryPrefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				imaginaryAndReal();
				}
				break;
			case 6:
				_localctx = new RealPrefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				realNumber();
				}
				break;
			case 7:
				_localctx = new ENotationPrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				eNotation();
				}
				break;
			case 8:
				_localctx = new AtomPrefixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				atom();
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
		public ImaginaryAndRealContext imaginaryAndReal() {
			return getRuleContext(ImaginaryAndRealContext.class,0);
		}
		public ImaginaryPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ENotationPostfixContext extends PostfixContext {
		public ENotationContext eNotation() {
			return getRuleContext(ENotationContext.class,0);
		}
		public ENotationPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitENotationPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealPostfixContext extends PostfixContext {
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public RealPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRealPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomPostfixContext extends PostfixContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtomPostfix(this);
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
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ModulusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(115);
					match(MODULUS);
					setState(116);
					postfix();
					setState(117);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(119);
					match(T__0);
					setState(120);
					match(T__1);
					setState(121);
					postfix();
					setState(122);
					match(T__2);
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
				setState(126);
				match(T__1);
				setState(127);
				postfix();
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(128);
						match(COMMA);
						setState(129);
						postfix();
						}
						}
						setState(132); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__1:
				case SUB:
				case MODULUS:
				case I:
				case NUMBER:
				case FLOAT:
					{
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(134);
						postfix();
						}
						}
						setState(137); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				match(T__2);
				setState(142);
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
				setState(144);
				match(T__1);
				setState(145);
				postfix();
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(146);
						match(COMMA);
						setState(147);
						postfix();
						}
						}
						setState(150); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case T__1:
				case SUB:
				case MODULUS:
				case I:
				case NUMBER:
				case FLOAT:
					{
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(152);
						postfix();
						}
						}
						setState(155); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				match(T__2);
				setState(160);
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
				setState(162);
				match(T__1);
				setState(163);
				postfix();
				setState(164);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ImaginaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				imaginaryAndReal();
				}
				break;
			case 6:
				_localctx = new RealPostfixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				realNumber();
				}
				break;
			case 7:
				_localctx = new ENotationPostfixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				eNotation();
				}
				break;
			case 8:
				_localctx = new AtomPostfixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				atom();
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

	public static class ImaginaryAndRealContext extends ParserRuleContext {
		public Token real;
		public Token op;
		public Token im;
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(calculatorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(calculatorParser.NUMBER, i);
		}
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public ImaginaryAndRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginaryAndReal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryAndReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImaginaryAndRealContext imaginaryAndReal() throws RecognitionException {
		ImaginaryAndRealContext _localctx = new ImaginaryAndRealContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imaginaryAndReal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(172);
				match(SUB);
				}
			}

			setState(175);
			((ImaginaryAndRealContext)_localctx).real = match(NUMBER);
			setState(176);
			((ImaginaryAndRealContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
				((ImaginaryAndRealContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(177);
				((ImaginaryAndRealContext)_localctx).im = match(NUMBER);
				}
			}

			setState(180);
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

	public static class RealNumberContext extends ParserRuleContext {
		public Token val;
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public RealNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealNumberContext realNumber() throws RecognitionException {
		RealNumberContext _localctx = new RealNumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_realNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(182);
				match(SUB);
				}
			}

			setState(185);
			((RealNumberContext)_localctx).val = match(FLOAT);
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

	public static class ENotationContext extends ParserRuleContext {
		public Token val;
		public TerminalNode E() { return getToken(calculatorParser.E, 0); }
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(calculatorParser.FLOAT, 0); }
		public List<TerminalNode> SUB() { return getTokens(calculatorParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(calculatorParser.SUB, i);
		}
		public ENotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eNotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitENotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ENotationContext eNotation() throws RecognitionException {
		ENotationContext _localctx = new ENotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(187);
				match(SUB);
				}
			}

			setState(190);
			((ENotationContext)_localctx).val = match(FLOAT);
			setState(191);
			match(E);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(192);
				match(SUB);
				}
			}

			setState(195);
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
	public static class RealAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public RealAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitRealAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImaginaryAtomContext extends AtomContext {
		public TerminalNode I() { return getToken(calculatorParser.I, 0); }
		public TerminalNode SUB() { return getToken(calculatorParser.SUB, 0); }
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public ImaginaryAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitImaginaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ImaginaryAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(197);
					match(SUB);
					}
				}

				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(200);
					match(NUMBER);
					}
				}

				setState(203);
				match(I);
				}
				break;
			case 2:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(204);
					match(SUB);
					}
				}

				setState(207);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"&\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\6\5M\n\5\r\5\16\5N\3\5\6\5R\n\5\r\5\16\5S\5\5V"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5_\n\5\r\5\16\5`\3\5\6\5d\n\5\r\5\16"+
		"\5e\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\6\3\6\6\6\u0085\n\6"+
		"\r\6\16\6\u0086\3\6\6\6\u008a\n\6\r\6\16\6\u008b\5\6\u008e\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\6\6\u0097\n\6\r\6\16\6\u0098\3\6\6\6\u009c\n\6\r"+
		"\6\16\6\u009d\5\6\u00a0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00ad\n\6\3\7\5\7\u00b0\n\7\3\7\3\7\3\7\5\7\u00b5\n\7\3\7\3\7\3"+
		"\b\5\b\u00ba\n\b\3\b\3\b\3\t\5\t\u00bf\n\t\3\t\3\t\3\t\5\t\u00c4\n\t\3"+
		"\t\3\t\3\n\5\n\u00c9\n\n\3\n\5\n\u00cc\n\n\3\n\3\n\5\n\u00d0\n\n\3\n\5"+
		"\n\u00d3\n\n\3\n\2\3\6\13\2\4\6\b\n\f\16\20\22\2\4\3\2\b\t\3\2\6\7\2\u00fa"+
		"\2\24\3\2\2\2\4\31\3\2\2\2\6/\3\2\2\2\bs\3\2\2\2\n\u00ac\3\2\2\2\f\u00af"+
		"\3\2\2\2\16\u00b9\3\2\2\2\20\u00be\3\2\2\2\22\u00d2\3\2\2\2\24\25\5\4"+
		"\3\2\25\3\3\2\2\2\26\32\5\6\4\2\27\32\5\n\6\2\30\32\5\b\5\2\31\26\3\2"+
		"\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\33%\b\4\1\2\34\35\7\13\2"+
		"\2\35\36\5\6\4\2\36\37\7\13\2\2\37&\3\2\2\2 !\7\3\2\2!\"\7\4\2\2\"#\5"+
		"\6\4\2#$\7\5\2\2$&\3\2\2\2%\34\3\2\2\2% \3\2\2\2&\60\3\2\2\2\'\60\5\f"+
		"\7\2(\60\5\16\b\2)\60\5\20\t\2*+\7\4\2\2+,\5\6\4\2,-\7\5\2\2-\60\3\2\2"+
		"\2.\60\5\22\n\2/\33\3\2\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/"+
		".\3\2\2\2\609\3\2\2\2\61\62\f\t\2\2\62\63\t\2\2\2\638\5\6\4\n\64\65\f"+
		"\5\2\2\65\66\t\3\2\2\668\5\6\4\6\67\61\3\2\2\2\67\64\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2<=\7\13\2\2=>\5\b\5\2>?\7\13"+
		"\2\2?F\3\2\2\2@A\7\3\2\2AB\7\4\2\2BC\5\b\5\2CD\7\5\2\2DF\3\2\2\2E<\3\2"+
		"\2\2E@\3\2\2\2Ft\3\2\2\2GH\t\2\2\2HI\7\4\2\2IU\5\b\5\2JK\7\n\2\2KM\5\b"+
		"\5\2LJ\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PR\5\b\5\2QP\3\2"+
		"\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UL\3\2\2\2UQ\3\2\2\2VW\3\2"+
		"\2\2WX\7\5\2\2Xt\3\2\2\2YZ\t\3\2\2Z[\7\4\2\2[g\5\b\5\2\\]\7\n\2\2]_\5"+
		"\b\5\2^\\\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3\2\2\2bd\5\b\5\2cb"+
		"\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2g^\3\2\2\2gc\3\2\2\2h"+
		"i\3\2\2\2ij\7\5\2\2jt\3\2\2\2kl\7\4\2\2lm\5\b\5\2mn\7\5\2\2nt\3\2\2\2"+
		"ot\5\f\7\2pt\5\16\b\2qt\5\20\t\2rt\5\22\n\2sE\3\2\2\2sG\3\2\2\2sY\3\2"+
		"\2\2sk\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\7"+
		"\13\2\2vw\5\n\6\2wx\7\13\2\2x\177\3\2\2\2yz\7\3\2\2z{\7\4\2\2{|\5\n\6"+
		"\2|}\7\5\2\2}\177\3\2\2\2~u\3\2\2\2~y\3\2\2\2\177\u00ad\3\2\2\2\u0080"+
		"\u0081\7\4\2\2\u0081\u008d\5\n\6\2\u0082\u0083\7\n\2\2\u0083\u0085\5\n"+
		"\6\2\u0084\u0082\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008e\3\2\2\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0089\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\7\5\2\2\u0090\u0091\t\2\2\2\u0091\u00ad\3\2\2\2\u0092"+
		"\u0093\7\4\2\2\u0093\u009f\5\n\6\2\u0094\u0095\7\n\2\2\u0095\u0097\5\n"+
		"\6\2\u0096\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\5\n\6\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\t\3\2\2\u00a3\u00ad\3\2\2\2\u00a4"+
		"\u00a5\7\4\2\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7\5\2\2\u00a7\u00ad\3\2"+
		"\2\2\u00a8\u00ad\5\f\7\2\u00a9\u00ad\5\16\b\2\u00aa\u00ad\5\20\t\2\u00ab"+
		"\u00ad\5\22\n\2\u00ac~\3\2\2\2\u00ac\u0080\3\2\2\2\u00ac\u0092\3\2\2\2"+
		"\u00ac\u00a4\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00b0\7\7\2\2\u00af"+
		"\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\17"+
		"\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\r\3\2\2\2"+
		"\u00b8\u00ba\7\7\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\7\20\2\2\u00bc\17\3\2\2\2\u00bd\u00bf\7\7\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\20"+
		"\2\2\u00c1\u00c3\7\16\2\2\u00c2\u00c4\7\7\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\17\2\2\u00c6\21\3\2\2"+
		"\2\u00c7\u00c9\7\7\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\3\2\2\2\u00ca\u00cc\7\17\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00d3\7\r\2\2\u00ce\u00d0\7\7\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\17\2\2"+
		"\u00d2\u00c8\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\23\3\2\2\2 \31%/\679EN"+
		"SU`egs~\u0086\u008b\u008d\u0098\u009d\u009f\u00ac\u00af\u00b4\u00b9\u00be"+
		"\u00c3\u00c8\u00cb\u00cf\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}