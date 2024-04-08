package calculator.parser;// Generated from Calculator.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, LPAREN=10, 
		RPAREN=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, COMMA=16, POINT=17, POW=18, 
		PI=19, EULER=20, I=21, VARIABLE=22, SCIENTIFIC_NUMBER=23, WS=24;
	public static final int
		RULE_init = 0, RULE_expression = 1, RULE_multiplyingExpression = 2, RULE_powExpression = 3, 
		RULE_postfix_expression = 4, RULE_postfix_multiplyingExpression = 5, RULE_postfix_powExpression = 6, 
		RULE_prefix_expression = 7, RULE_prefix_multiplyingExpression = 8, RULE_prefix_powExpression = 9, 
		RULE_signedAtom = 10, RULE_atom = 11, RULE_scientific = 12, RULE_constant = 13, 
		RULE_variable = 14, RULE_func_ = 15, RULE_funcname = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "expression", "multiplyingExpression", "powExpression", "postfix_expression", 
			"postfix_multiplyingExpression", "postfix_powExpression", "prefix_expression", 
			"prefix_multiplyingExpression", "prefix_powExpression", "signedAtom", 
			"atom", "scientific", "constant", "variable", "func_", "funcname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", 
			"'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "','", "'.'", 
			"'^'", "'pi'", null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", 
			"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "COMMA", "POINT", 
			"POW", "PI", "EULER", "I", "VARIABLE", "SCIENTIFIC_NUMBER", "WS"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				expression(0);
				setState(35);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				postfix_expression();
				setState(38);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				prefix_expression();
				setState(41);
				match(EOF);
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
	public static class ExpressionContext extends ParserRuleContext {
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(46);
			multiplyingExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(48);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(49);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(50);
					multiplyingExpression(0);
					}
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public PowExpressionContext powExpression() {
			return getRuleContext(PowExpressionContext.class,0);
		}
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(CalculatorParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		return multiplyingExpression(0);
	}

	private MultiplyingExpressionContext multiplyingExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, _parentState);
		MultiplyingExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_multiplyingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(57);
			powExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplyingExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyingExpression);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(60);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(61);
					powExpression();
					}
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class PowExpressionContext extends ParserRuleContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public PowExpressionContext powExpression() {
			return getRuleContext(PowExpressionContext.class,0);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			signedAtom();
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(68);
				match(POW);
				setState(69);
				powExpression();
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
	public static class Postfix_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public List<Postfix_multiplyingExpressionContext> postfix_multiplyingExpression() {
			return getRuleContexts(Postfix_multiplyingExpressionContext.class);
		}
		public Postfix_multiplyingExpressionContext postfix_multiplyingExpression(int i) {
			return getRuleContext(Postfix_multiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix_expression);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(LPAREN);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					postfix_multiplyingExpression();
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(74);
						match(COMMA);
						}
					}

					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16267262L) != 0) );
				setState(81);
				match(RPAREN);
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
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
				setState(84);
				postfix_multiplyingExpression();
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
	public static class Postfix_multiplyingExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CalculatorParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public List<Postfix_powExpressionContext> postfix_powExpression() {
			return getRuleContexts(Postfix_powExpressionContext.class);
		}
		public Postfix_powExpressionContext postfix_powExpression(int i) {
			return getRuleContext(Postfix_powExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public Postfix_multiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_multiplyingExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPostfix_multiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_multiplyingExpressionContext postfix_multiplyingExpression() throws RecognitionException {
		Postfix_multiplyingExpressionContext _localctx = new Postfix_multiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postfix_multiplyingExpression);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(LPAREN);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					postfix_powExpression();
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(89);
						match(COMMA);
						}
					}

					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16267262L) != 0) );
				setState(96);
				match(RPAREN);
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
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
				setState(99);
				postfix_powExpression();
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
	public static class Postfix_powExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public TerminalNode COMMA() { return getToken(CalculatorParser.COMMA, 0); }
		public Postfix_powExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_powExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPostfix_powExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_powExpressionContext postfix_powExpression() throws RecognitionException {
		Postfix_powExpressionContext _localctx = new Postfix_powExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postfix_powExpression);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(LPAREN);
				{
				setState(103);
				signedAtom();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(104);
					match(COMMA);
					}
				}

				setState(107);
				signedAtom();
				}
				setState(109);
				match(RPAREN);
				{
				setState(110);
				match(POW);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				signedAtom();
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
	public static class Prefix_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public List<Prefix_multiplyingExpressionContext> prefix_multiplyingExpression() {
			return getRuleContexts(Prefix_multiplyingExpressionContext.class);
		}
		public Prefix_multiplyingExpressionContext prefix_multiplyingExpression(int i) {
			return getRuleContext(Prefix_multiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prefix_expression);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(LPAREN);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					prefix_multiplyingExpression();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(118);
						match(COMMA);
						}
					}

					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16578558L) != 0) );
				setState(125);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				prefix_multiplyingExpression();
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
	public static class Prefix_multiplyingExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode TIMES() { return getToken(CalculatorParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public List<Prefix_powExpressionContext> prefix_powExpression() {
			return getRuleContexts(Prefix_powExpressionContext.class);
		}
		public Prefix_powExpressionContext prefix_powExpression(int i) {
			return getRuleContext(Prefix_powExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public Prefix_multiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_multiplyingExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPrefix_multiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_multiplyingExpressionContext prefix_multiplyingExpression() throws RecognitionException {
		Prefix_multiplyingExpressionContext _localctx = new Prefix_multiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prefix_multiplyingExpression);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				match(LPAREN);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					prefix_powExpression();
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(133);
						match(COMMA);
						}
					}

					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16529406L) != 0) );
				setState(140);
				match(RPAREN);
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
			case LPAREN:
			case PLUS:
			case MINUS:
			case POW:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				prefix_powExpression();
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
	public static class Prefix_powExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalculatorParser.COMMA, 0); }
		public Prefix_powExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_powExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitPrefix_powExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_powExpressionContext prefix_powExpression() throws RecognitionException {
		Prefix_powExpressionContext _localctx = new Prefix_powExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefix_powExpression);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				match(POW);
				}
				setState(146);
				match(LPAREN);
				{
				setState(147);
				signedAtom();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(148);
					match(COMMA);
					}
				}

				setState(151);
				signedAtom();
				}
				setState(153);
				match(RPAREN);
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
			case LPAREN:
			case PLUS:
			case MINUS:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				signedAtom();
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
	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public Func_Context func_() {
			return getRuleContext(Func_Context.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedAtom);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(PLUS);
				setState(159);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(MINUS);
				setState(161);
				signedAtom();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				func_();
				}
				break;
			case LPAREN:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				atom();
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
	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				variable();
				}
				break;
			case PI:
			case EULER:
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				expression(0);
				setState(171);
				match(RPAREN);
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
	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(CalculatorParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SCIENTIFIC_NUMBER);
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(CalculatorParser.PI, 0); }
		public TerminalNode EULER() { return getToken(CalculatorParser.EULER, 0); }
		public TerminalNode I() { return getToken(CalculatorParser.I, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CalculatorParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VARIABLE);
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
	public static class Func_Context extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public Func_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitFunc_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_Context func_() throws RecognitionException {
		Func_Context _localctx = new Func_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			funcname();
			setState(182);
			match(LPAREN);
			setState(183);
			expression(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				expression(0);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RPAREN);
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
	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(CalculatorParser.COS, 0); }
		public TerminalNode TAN() { return getToken(CalculatorParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(CalculatorParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(CalculatorParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(CalculatorParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(CalculatorParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(CalculatorParser.LOG, 0); }
		public TerminalNode LN() { return getToken(CalculatorParser.LN, 0); }
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor) return ((CalculatorVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 2:
			return multiplyingExpression_sempred((MultiplyingExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplyingExpression_sempred(MultiplyingExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000,\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004L\b\u0004\u0004\u0004N\b\u0004\u000b\u0004\f\u0004O\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0004\u0005]\b\u0005\u000b"+
		"\u0005\f\u0005^\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006r\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007x\b\u0007\u0004\u0007z\b\u0007\u000b\u0007\f\u0007{\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0004\b\u0089\b\b\u000b\b\f\b\u008a"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0090\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0096\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009d"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a5\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ae\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00bb\b\u000f\n\u000f\f\u000f\u00be\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0002\u0002"+
		"\u0004\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0004\u0001\u0000\f\r\u0001\u0000\u000e"+
		"\u000f\u0001\u0000\u0013\u0015\u0001\u0000\u0001\t\u00ce\u0000+\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nd\u0001"+
		"\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000"+
		"\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000"+
		"\u0000\u0000\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00ad\u0001\u0000"+
		"\u0000\u0000\u0018\u00af\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000"+
		"\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000"+
		"\u0000\u0000 \u00c1\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000"+
		"#$\u0005\u0000\u0000\u0001$,\u0001\u0000\u0000\u0000%&\u0003\b\u0004\u0000"+
		"&\'\u0005\u0000\u0000\u0001\',\u0001\u0000\u0000\u0000()\u0003\u000e\u0007"+
		"\u0000)*\u0005\u0000\u0000\u0001*,\u0001\u0000\u0000\u0000+\"\u0001\u0000"+
		"\u0000\u0000+%\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,\u0001"+
		"\u0001\u0000\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000./\u0003\u0004"+
		"\u0002\u0000/5\u0001\u0000\u0000\u000001\n\u0001\u0000\u000012\u0007\u0000"+
		"\u0000\u000024\u0003\u0004\u0002\u000030\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0006\u0002"+
		"\uffff\uffff\u00009:\u0003\u0006\u0003\u0000:@\u0001\u0000\u0000\u0000"+
		";<\n\u0001\u0000\u0000<=\u0007\u0001\u0000\u0000=?\u0003\u0006\u0003\u0000"+
		">;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CF\u0003\u0014\n\u0000DE\u0005\u0012\u0000\u0000EG\u0003"+
		"\u0006\u0003\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0007\u0001\u0000\u0000\u0000HM\u0005\n\u0000\u0000IK\u0003\n\u0005"+
		"\u0000JL\u0005\u0010\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0005\u000b\u0000\u0000RS\u0007\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TV\u0003\n\u0005\u0000UH\u0001\u0000\u0000"+
		"\u0000UT\u0001\u0000\u0000\u0000V\t\u0001\u0000\u0000\u0000W\\\u0005\n"+
		"\u0000\u0000XZ\u0003\f\u0006\u0000Y[\u0005\u0010\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\X\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u000b\u0000"+
		"\u0000ab\u0007\u0001\u0000\u0000be\u0001\u0000\u0000\u0000ce\u0003\f\u0006"+
		"\u0000dW\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u000b\u0001"+
		"\u0000\u0000\u0000fg\u0005\n\u0000\u0000gi\u0003\u0014\n\u0000hj\u0005"+
		"\u0010\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0003\u0014\n\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0005\u000b\u0000\u0000no\u0005\u0012\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pr\u0003\u0014\n\u0000qf\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000r\r\u0001\u0000\u0000\u0000st\u0007\u0000\u0000\u0000ty\u0005\n"+
		"\u0000\u0000uw\u0003\u0010\b\u0000vx\u0005\u0010\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yu\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u000b\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u0010\b\u0000"+
		"\u0080s\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u000f\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0001\u0000\u0000\u0083"+
		"\u0088\u0005\n\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000\u0085\u0087"+
		"\u0005\u0010\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0084"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000b\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u0012\t\u0000\u008f\u0082\u0001"+
		"\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0011\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u0012\u0000\u0000\u0092\u0093\u0005"+
		"\n\u0000\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094\u0096\u0005\u0010"+
		"\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0014"+
		"\n\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000b\u0000"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0014\n\u0000"+
		"\u009c\u0091\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u009f\u0005\f\u0000\u0000\u009f"+
		"\u00a5\u0003\u0014\n\u0000\u00a0\u00a1\u0005\r\u0000\u0000\u00a1\u00a5"+
		"\u0003\u0014\n\u0000\u00a2\u00a5\u0003\u001e\u000f\u0000\u00a3\u00a5\u0003"+
		"\u0016\u000b\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00ae\u0003"+
		"\u0018\f\u0000\u00a7\u00ae\u0003\u001c\u000e\u0000\u00a8\u00ae\u0003\u001a"+
		"\r\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0003\u0002\u0001"+
		"\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0017\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0002\u0000"+
		"\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0016\u0000"+
		"\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003 \u0010\u0000"+
		"\u00b6\u00b7\u0005\n\u0000\u0000\u00b7\u00bc\u0003\u0002\u0001\u0000\u00b8"+
		"\u00b9\u0005\u0010\u0000\u0000\u00b9\u00bb\u0003\u0002\u0001\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u000b\u0000\u0000\u00c0\u001f\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0007\u0003\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u0017+5"+
		"@FKOUZ^diqw{\u0080\u0086\u008a\u008f\u0095\u009c\u00a4\u00ad\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}