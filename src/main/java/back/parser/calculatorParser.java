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
		T__0=1, T__1=2, ADD=3, SUB=4, MUL=5, DIV=6, COMMA=7, I=8, NUMBER=9, WS=10;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4, 
		RULE_atom = 5;
	public static final String[] ruleNames = {
		"prog", "expression", "infix", "prefix", "postfix", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "','", "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ADD", "SUB", "MUL", "DIV", "COMMA", "I", "NUMBER", 
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
			setState(12);
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
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
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
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20);
				match(T__0);
				setState(21);
				infix(0);
				setState(22);
				match(T__1);
				}
				break;
			case SUB:
			case I:
			case NUMBER:
				{
				_localctx = new AtomInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
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
						setState(29);
						infix(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31);
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
						setState(32);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(37);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new MulDivPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
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
				setState(39);
				match(T__0);
				setState(40);
				prefix();
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41);
						match(COMMA);
						setState(42);
						prefix();
						}
						}
						setState(45); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case I:
				case NUMBER:
					{
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(47);
						prefix();
						}
						}
						setState(50); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << I) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
				setState(57);
				match(T__0);
				setState(58);
				prefix();
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(59);
						match(COMMA);
						setState(60);
						prefix();
						}
						}
						setState(63); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case I:
				case NUMBER:
					{
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(65);
						prefix();
						}
						}
						setState(68); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << I) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__0);
				setState(75);
				prefix();
				setState(76);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new AtomPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
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

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new MulDivPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__0);
				setState(82);
				postfix();
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(83);
						match(COMMA);
						setState(84);
						postfix();
						}
						}
						setState(87); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case SUB:
				case I:
				case NUMBER:
					{
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(89);
						postfix();
						}
						}
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << I) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
				match(T__1);
				setState(97);
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
				setState(99);
				match(T__0);
				setState(100);
				postfix();
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(101);
						match(COMMA);
						setState(102);
						postfix();
						}
						}
						setState(105); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
					break;
				case T__0:
				case SUB:
				case I:
				case NUMBER:
					{
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(107);
						postfix();
						}
						}
						setState(110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << I) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114);
				match(T__1);
				setState(115);
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
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__0);
				setState(118);
				postfix();
				setState(119);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new AtomPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
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
		enterRule(_localctx, 10, RULE_atom);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ImaginaryAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(124);
					match(SUB);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(127);
					match(NUMBER);
					}
				}

				setState(130);
				match(I);
				}
				break;
			case 2:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(131);
					match(SUB);
					}
				}

				setState(134);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u008c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\5\3\24\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\5\3\5\3\5\3\5\3\5\6\5.\n\5\r\5\16\5/\3\5\6\5\63\n\5\r"+
		"\5\16\5\64\5\5\67\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3"+
		"\5\6\5E\n\5\r\5\16\5F\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3"+
		"\6\3\6\3\6\3\6\6\6X\n\6\r\6\16\6Y\3\6\6\6]\n\6\r\6\16\6^\5\6a\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\6\6j\n\6\r\6\16\6k\3\6\6\6o\n\6\r\6\16\6p\5\6"+
		"s\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\5\7\u0080\n\7\3\7\5"+
		"\7\u0083\n\7\3\7\3\7\5\7\u0087\n\7\3\7\5\7\u008a\n\7\3\7\2\3\6\b\2\4\6"+
		"\b\n\f\2\4\3\2\7\b\3\2\5\6\2\u00a0\2\16\3\2\2\2\4\23\3\2\2\2\6\33\3\2"+
		"\2\2\bQ\3\2\2\2\n|\3\2\2\2\f\u0089\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2"+
		"\20\24\5\6\4\2\21\24\5\n\6\2\22\24\5\b\5\2\23\20\3\2\2\2\23\21\3\2\2\2"+
		"\23\22\3\2\2\2\24\5\3\2\2\2\25\26\b\4\1\2\26\27\7\3\2\2\27\30\5\6\4\2"+
		"\30\31\7\4\2\2\31\34\3\2\2\2\32\34\5\f\7\2\33\25\3\2\2\2\33\32\3\2\2\2"+
		"\34%\3\2\2\2\35\36\f\6\2\2\36\37\t\2\2\2\37$\5\6\4\7 !\f\5\2\2!\"\t\3"+
		"\2\2\"$\5\6\4\6#\35\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&"+
		"\7\3\2\2\2\'%\3\2\2\2()\t\2\2\2)*\7\3\2\2*\66\5\b\5\2+,\7\t\2\2,.\5\b"+
		"\5\2-+\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61\63\5\b"+
		"\5\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2"+
		"\2\2\66-\3\2\2\2\66\62\3\2\2\2\678\3\2\2\289\7\4\2\29R\3\2\2\2:;\t\3\2"+
		"\2;<\7\3\2\2<H\5\b\5\2=>\7\t\2\2>@\5\b\5\2?=\3\2\2\2@A\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2BI\3\2\2\2CE\5\b\5\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2GI\3\2\2\2H?\3\2\2\2HD\3\2\2\2IJ\3\2\2\2JK\7\4\2\2KR\3\2\2\2LM\7\3\2"+
		"\2MN\5\b\5\2NO\7\4\2\2OR\3\2\2\2PR\5\f\7\2Q(\3\2\2\2Q:\3\2\2\2QL\3\2\2"+
		"\2QP\3\2\2\2R\t\3\2\2\2ST\7\3\2\2T`\5\n\6\2UV\7\t\2\2VX\5\n\6\2WU\3\2"+
		"\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Za\3\2\2\2[]\5\n\6\2\\[\3\2\2\2]^\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`W\3\2\2\2`\\\3\2\2\2ab\3\2\2\2b"+
		"c\7\4\2\2cd\t\2\2\2d}\3\2\2\2ef\7\3\2\2fr\5\n\6\2gh\7\t\2\2hj\5\n\6\2"+
		"ig\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ls\3\2\2\2mo\5\n\6\2nm\3\2\2\2"+
		"op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2ri\3\2\2\2rn\3\2\2\2st\3\2\2\2"+
		"tu\7\4\2\2uv\t\3\2\2v}\3\2\2\2wx\7\3\2\2xy\5\n\6\2yz\7\4\2\2z}\3\2\2\2"+
		"{}\5\f\7\2|S\3\2\2\2|e\3\2\2\2|w\3\2\2\2|{\3\2\2\2}\13\3\2\2\2~\u0080"+
		"\7\6\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083"+
		"\7\13\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u008a\7\n\2\2\u0085\u0087\7\6\2\2\u0086\u0085\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\13\2\2\u0089\177\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u008a\r\3\2\2\2\30\23\33#%/\64\66AFHQY^`kpr|\177\u0082"+
		"\u0086\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}