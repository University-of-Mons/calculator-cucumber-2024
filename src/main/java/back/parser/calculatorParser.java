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
		DECIMAL=10, I=11, NUMBER=12, FLOAT=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4, 
		RULE_imaginaryAndReal = 5, RULE_realNumber = 6, RULE_atom = 7;
	public static final String[] ruleNames = {
		"prog", "expression", "infix", "prefix", "postfix", "imaginaryAndReal", 
		"realNumber", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'modulus'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "','", "'|'", 
		"'.'", "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ADD", "SUB", "MUL", "DIV", "COMMA", "MODULUS", 
		"DECIMAL", "I", "NUMBER", "FLOAT", "WS"
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
			setState(16);
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
				postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ModulusInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(24);
					match(MODULUS);
					setState(25);
					infix(0);
					setState(26);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(28);
					match(T__0);
					setState(29);
					match(T__1);
					setState(30);
					infix(0);
					setState(31);
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
				setState(35);
				imaginaryAndReal();
				}
				break;
			case 3:
				{
				_localctx = new RealInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				realNumber();
				}
				break;
			case 4:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(T__1);
				setState(38);
				infix(0);
				setState(39);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new AtomInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(44);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(45);
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
						setState(46);
						infix(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(47);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(48);
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
						setState(49);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(54);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ModulusPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(55);
					match(MODULUS);
					setState(56);
					prefix();
					setState(57);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(59);
					match(T__0);
					setState(60);
					match(T__1);
					setState(61);
					prefix();
					setState(62);
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
				setState(66);
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
				setState(67);
				match(T__1);
				setState(68);
				prefix();
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(69);
						match(COMMA);
						setState(70);
						prefix();
						}
						}
						setState(73); 
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
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(75);
						prefix();
						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
				setState(85);
				match(T__1);
				setState(86);
				prefix();
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(87);
						match(COMMA);
						setState(88);
						prefix();
						}
						}
						setState(91); 
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
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(93);
						prefix();
						}
						}
						setState(96); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__1);
				setState(103);
				prefix();
				setState(104);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ImaginaryPrefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				imaginaryAndReal();
				}
				break;
			case 6:
				_localctx = new RealPrefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				realNumber();
				}
				break;
			case 7:
				_localctx = new AtomPrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ModulusPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULUS:
					{
					{
					setState(111);
					match(MODULUS);
					setState(112);
					postfix();
					setState(113);
					match(MODULUS);
					}
					}
					break;
				case T__0:
					{
					{
					setState(115);
					match(T__0);
					setState(116);
					match(T__1);
					setState(117);
					postfix();
					setState(118);
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
				setState(122);
				match(T__1);
				setState(123);
				postfix();
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(124);
						match(COMMA);
						setState(125);
						postfix();
						}
						}
						setState(128); 
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
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(130);
						postfix();
						}
						}
						setState(133); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__2);
				setState(138);
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
				setState(140);
				match(T__1);
				setState(141);
				postfix();
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(142);
						match(COMMA);
						setState(143);
						postfix();
						}
						}
						setState(146); 
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
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(148);
						postfix();
						}
						}
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SUB) | (1L << MODULUS) | (1L << I) | (1L << NUMBER) | (1L << FLOAT))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				match(T__2);
				setState(156);
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
				setState(158);
				match(T__1);
				setState(159);
				postfix();
				setState(160);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ImaginaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				imaginaryAndReal();
				}
				break;
			case 6:
				_localctx = new RealPostfixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				realNumber();
				}
				break;
			case 7:
				_localctx = new AtomPostfixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(167);
				match(SUB);
				}
			}

			setState(170);
			((ImaginaryAndRealContext)_localctx).real = match(NUMBER);
			setState(171);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(172);
				((ImaginaryAndRealContext)_localctx).im = match(NUMBER);
				}
			}

			setState(175);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(177);
				match(SUB);
				}
			}

			setState(180);
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
		enterRule(_localctx, 14, RULE_atom);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ImaginaryAtomContext(_localctx);
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

				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(185);
					match(NUMBER);
					}
				}

				setState(188);
				match(I);
				}
				break;
			case 2:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(189);
					match(SUB);
					}
				}

				setState(192);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65\n\4\f"+
		"\4\16\48\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\6\5J\n\5\r\5\16\5K\3\5\6\5O\n\5\r\5\16\5P\5\5S\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\5\6\5a\n\5\r\5\16\5b\5\5e\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\6\6\u0081\n\6\r\6\16\6\u0082\3\6"+
		"\6\6\u0086\n\6\r\6\16\6\u0087\5\6\u008a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6\u0093\n\6\r\6\16\6\u0094\3\6\6\6\u0098\n\6\r\6\16\6\u0099\5\6\u009c"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\7\5\7\u00ab"+
		"\n\7\3\7\3\7\3\7\5\7\u00b0\n\7\3\7\3\7\3\b\5\b\u00b5\n\b\3\b\3\b\3\t\5"+
		"\t\u00ba\n\t\3\t\5\t\u00bd\n\t\3\t\3\t\5\t\u00c1\n\t\3\t\5\t\u00c4\n\t"+
		"\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\4\3\2\b\t\3\2\6\7\2\u00e7\2\22\3\2\2"+
		"\2\4\27\3\2\2\2\6,\3\2\2\2\bo\3\2\2\2\n\u00a7\3\2\2\2\f\u00aa\3\2\2\2"+
		"\16\u00b4\3\2\2\2\20\u00c3\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\30\5"+
		"\6\4\2\25\30\5\n\6\2\26\30\5\b\5\2\27\24\3\2\2\2\27\25\3\2\2\2\27\26\3"+
		"\2\2\2\30\5\3\2\2\2\31#\b\4\1\2\32\33\7\13\2\2\33\34\5\6\4\2\34\35\7\13"+
		"\2\2\35$\3\2\2\2\36\37\7\3\2\2\37 \7\4\2\2 !\5\6\4\2!\"\7\5\2\2\"$\3\2"+
		"\2\2#\32\3\2\2\2#\36\3\2\2\2$-\3\2\2\2%-\5\f\7\2&-\5\16\b\2\'(\7\4\2\2"+
		"()\5\6\4\2)*\7\5\2\2*-\3\2\2\2+-\5\20\t\2,\31\3\2\2\2,%\3\2\2\2,&\3\2"+
		"\2\2,\'\3\2\2\2,+\3\2\2\2-\66\3\2\2\2./\f\b\2\2/\60\t\2\2\2\60\65\5\6"+
		"\4\t\61\62\f\5\2\2\62\63\t\3\2\2\63\65\5\6\4\6\64.\3\2\2\2\64\61\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2\29:"+
		"\7\13\2\2:;\5\b\5\2;<\7\13\2\2<C\3\2\2\2=>\7\3\2\2>?\7\4\2\2?@\5\b\5\2"+
		"@A\7\5\2\2AC\3\2\2\2B9\3\2\2\2B=\3\2\2\2Cp\3\2\2\2DE\t\2\2\2EF\7\4\2\2"+
		"FR\5\b\5\2GH\7\n\2\2HJ\5\b\5\2IG\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LS\3\2\2\2MO\5\b\5\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2"+
		"RI\3\2\2\2RN\3\2\2\2ST\3\2\2\2TU\7\5\2\2Up\3\2\2\2VW\t\3\2\2WX\7\4\2\2"+
		"Xd\5\b\5\2YZ\7\n\2\2Z\\\5\b\5\2[Y\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^e\3\2\2\2_a\5\b\5\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2d[\3\2\2\2d`\3\2\2\2ef\3\2\2\2fg\7\5\2\2gp\3\2\2\2hi\7\4\2\2ij\5\b\5"+
		"\2jk\7\5\2\2kp\3\2\2\2lp\5\f\7\2mp\5\16\b\2np\5\20\t\2oB\3\2\2\2oD\3\2"+
		"\2\2oV\3\2\2\2oh\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qr\7"+
		"\13\2\2rs\5\n\6\2st\7\13\2\2t{\3\2\2\2uv\7\3\2\2vw\7\4\2\2wx\5\n\6\2x"+
		"y\7\5\2\2y{\3\2\2\2zq\3\2\2\2zu\3\2\2\2{\u00a8\3\2\2\2|}\7\4\2\2}\u0089"+
		"\5\n\6\2~\177\7\n\2\2\177\u0081\5\n\6\2\u0080~\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084"+
		"\u0086\5\n\6\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\t\2"+
		"\2\2\u008d\u00a8\3\2\2\2\u008e\u008f\7\4\2\2\u008f\u009b\5\n\6\2\u0090"+
		"\u0091\7\n\2\2\u0091\u0093\5\n\6\2\u0092\u0090\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009c\3\2\2\2\u0096"+
		"\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\5\2\2\u009e\u009f\t\3"+
		"\2\2\u009f\u00a8\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5\n\6\2\u00a2"+
		"\u00a3\7\5\2\2\u00a3\u00a8\3\2\2\2\u00a4\u00a8\5\f\7\2\u00a5\u00a8\5\16"+
		"\b\2\u00a6\u00a8\5\20\t\2\u00a7z\3\2\2\2\u00a7|\3\2\2\2\u00a7\u008e\3"+
		"\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\13\3\2\2\2\u00a9\u00ab\7\7\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad"+
		"\u00af\t\3\2\2\u00ae\u00b0\7\16\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\r\3\2\2\2\u00b3\u00b5"+
		"\7\7\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7\17\2\2\u00b7\17\3\2\2\2\u00b8\u00ba\7\7\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7\16\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c4\7\r"+
		"\2\2\u00bf\u00c1\7\7\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\7\16\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00c0\3"+
		"\2\2\2\u00c4\21\3\2\2\2\36\27#,\64\66BKPR]bdoz\u0082\u0087\u0089\u0094"+
		"\u0099\u009b\u00a7\u00aa\u00af\u00b4\u00b9\u00bc\u00c0\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}