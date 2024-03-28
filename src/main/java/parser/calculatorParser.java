// Generated from calculator.g4 by ANTLR 4.7.1

package parser;

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
		T__0=1, T__1=2, T__2=3, ADD=4, SUB=5, MUL=6, DIV=7, NUMBER=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4;
	public static final String[] ruleNames = {
		"prog", "expression", "infix", "prefix", "postfix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ADD", "SUB", "MUL", "DIV", "NUMBER", "WS"
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
			setState(10);
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
				postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
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
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitInfix(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(18);
				match(T__0);
				setState(19);
				infix(0);
				setState(20);
				match(T__1);
				}
				break;
			case NUMBER:
				{
				setState(22);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(25);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(26);
						match(MUL);
						setState(27);
						infix(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(28);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(29);
						match(DIV);
						setState(30);
						infix(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(31);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(32);
						match(ADD);
						setState(33);
						infix(5);
						}
						break;
					case 4:
						{
						_localctx = new InfixContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(34);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(35);
						match(SUB);
						setState(36);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(41);
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
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				match(T__0);
				setState(44);
				prefix();
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(45);
						match(T__2);
						setState(46);
						prefix();
						}
						}
						setState(49); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case T__0:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case NUMBER:
					{
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(51);
						prefix();
						}
						}
						setState(54); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58);
				match(T__1);
				}
				break;
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				match(T__0);
				setState(62);
				prefix();
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(63);
						match(T__2);
						setState(64);
						prefix();
						}
						}
						setState(67); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case T__0:
				case ADD:
				case SUB:
				case MUL:
				case DIV:
				case NUMBER:
					{
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(69);
						prefix();
						}
						}
						setState(72); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << NUMBER))) != 0) );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76);
				match(T__1);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__0);
				setState(79);
				prefix();
				setState(80);
				match(T__1);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(NUMBER);
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

	public static class PostfixContext extends ParserRuleContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(calculatorParser.NUMBER, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__0);
				setState(86);
				postfix();
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(87);
						match(T__2);
						setState(88);
						postfix();
						}
						}
						setState(91); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case T__0:
				case NUMBER:
					{
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(93);
						postfix();
						}
						}
						setState(96); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 || _la==NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100);
				match(T__1);
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
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
				setState(103);
				match(T__0);
				setState(104);
				postfix();
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(105);
						match(T__2);
						setState(106);
						postfix();
						}
						}
						setState(109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__2 );
					}
					break;
				case T__0:
				case NUMBER:
					{
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(111);
						postfix();
						}
						}
						setState(114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 || _la==NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				match(T__1);
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
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
				setState(121);
				match(T__0);
				setState(122);
				postfix();
				setState(123);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
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
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\5\3\22\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\32\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\6\5\62\n\5\r\5\16"+
		"\5\63\3\5\6\5\67\n\5\r\5\16\58\5\5;\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6"+
		"\5D\n\5\r\5\16\5E\3\5\6\5I\n\5\r\5\16\5J\5\5M\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\6\6\\\n\6\r\6\16\6]\3\6\6\6a\n\6\r\6"+
		"\16\6b\5\6e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6n\n\6\r\6\16\6o\3\6\6\6"+
		"s\n\6\r\6\16\6t\5\6w\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6"+
		"\3\6\2\3\6\7\2\4\6\b\n\2\4\3\2\b\t\3\2\6\7\2\u0096\2\f\3\2\2\2\4\21\3"+
		"\2\2\2\6\31\3\2\2\2\bU\3\2\2\2\n\u0080\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2"+
		"\16\22\5\6\4\2\17\22\5\n\6\2\20\22\5\b\5\2\21\16\3\2\2\2\21\17\3\2\2\2"+
		"\21\20\3\2\2\2\22\5\3\2\2\2\23\24\b\4\1\2\24\25\7\3\2\2\25\26\5\6\4\2"+
		"\26\27\7\4\2\2\27\32\3\2\2\2\30\32\7\n\2\2\31\23\3\2\2\2\31\30\3\2\2\2"+
		"\32)\3\2\2\2\33\34\f\b\2\2\34\35\7\b\2\2\35(\5\6\4\t\36\37\f\7\2\2\37"+
		" \7\t\2\2 (\5\6\4\b!\"\f\6\2\2\"#\7\6\2\2#(\5\6\4\7$%\f\5\2\2%&\7\7\2"+
		"\2&(\5\6\4\6\'\33\3\2\2\2\'\36\3\2\2\2\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2\2\2,-\t\2\2\2-.\7\3\2\2.:\5\b\5"+
		"\2/\60\7\5\2\2\60\62\5\b\5\2\61/\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64;\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\678\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29;\3\2\2\2:\61\3\2\2\2:\66\3\2\2\2;<\3\2\2\2<=\7\4\2\2"+
		"=V\3\2\2\2>?\t\3\2\2?@\7\3\2\2@L\5\b\5\2AB\7\5\2\2BD\5\b\5\2CA\3\2\2\2"+
		"DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FM\3\2\2\2GI\5\b\5\2HG\3\2\2\2IJ\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LC\3\2\2\2LH\3\2\2\2MN\3\2\2\2NO\7\4\2\2"+
		"OV\3\2\2\2PQ\7\3\2\2QR\5\b\5\2RS\7\4\2\2SV\3\2\2\2TV\7\n\2\2U,\3\2\2\2"+
		"U>\3\2\2\2UP\3\2\2\2UT\3\2\2\2V\t\3\2\2\2WX\7\3\2\2Xd\5\n\6\2YZ\7\5\2"+
		"\2Z\\\5\n\6\2[Y\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^e\3\2\2\2_a\5\n"+
		"\6\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d[\3\2\2\2d`\3\2"+
		"\2\2ef\3\2\2\2fg\7\4\2\2gh\t\2\2\2h\u0081\3\2\2\2ij\7\3\2\2jv\5\n\6\2"+
		"kl\7\5\2\2ln\5\n\6\2mk\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pw\3\2\2\2"+
		"qs\5\n\6\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vm\3\2\2\2"+
		"vr\3\2\2\2wx\3\2\2\2xy\7\4\2\2yz\t\3\2\2z\u0081\3\2\2\2{|\7\3\2\2|}\5"+
		"\n\6\2}~\7\4\2\2~\u0081\3\2\2\2\177\u0081\7\n\2\2\u0080W\3\2\2\2\u0080"+
		"i\3\2\2\2\u0080{\3\2\2\2\u0080\177\3\2\2\2\u0081\13\3\2\2\2\24\21\31\'"+
		")\638:EJLU]bdotv\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}