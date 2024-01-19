// Generated from /workspaces/Flexar-New/Flexar.Grammar/Flexar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlexarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, NAMESPACE=2, EXPORT=3, USE=4, AS=5, BOOLEAN=6, THIS=7, NEW=8, 
		ENUM=9, STRUCT=10, FUNC=11, CLASS=12, INTERFACE=13, EXTENDS=14, IMPLEMENTS=15, 
		PUBLIC=16, PRIVATE=17, PROTECTED=18, STATIC=19, ABSTRACT=20, FINAL=21, 
		OVERRIDE=22, IF=23, ELSE=24, ELIF=25, SWITCH=26, CASE=27, DEFAULT=28, 
		WHILE=29, DO=30, FOR=31, BREAK=32, CONTINUE=33, RETURN=34, CONST=35, READONLY=36, 
		IN=37, IS=38, TRY=39, CATCH=40, FINALLY=41, INT=42, INT8=43, INT16=44, 
		INT32=45, INT64=46, UINT=47, UINT8=48, UINT16=49, UINT32=50, UINT64=51, 
		FLOAT=52, FLOAT32=53, FLOAT64=54, BOOL=55, CHAR=56, STRING=57, INF=58, 
		TUPLE=59, MAP=60, ERROR=61, NULL=62, ANY=63, DYN=64, TEMPLATE_STRING=65, 
		DEFAULT_STRING=66, DISCARD=67, NAME=68, COMMA=69, DOT=70, COLON=71, DOUBLE_COLON=72, 
		ARROW=73, SEMICOLON=74, OPEN_PAREN=75, CLOSE_PAREN=76, OPEN_BRACE=77, 
		CLOSE_BRACE=78, OPEN_BRACKET=79, CLOSE_BRACKET=80, ASSIGN=81, PLUS_ASSIGN=82, 
		MINUS_ASSIGN=83, STAR_ASSIGN=84, MODULE_ASSIGN=85, DIV_ASSIGN=86, EXP_ASSIGN=87, 
		AND_ASSIGN=88, OR_ASSIGN=89, XOR_ASSIGN=90, SHL_ASSIGN=91, SHR_ASSIGN=92, 
		INF_ASSIGN=93, EQUAL=94, NOT_EQUAL=95, LESS=96, LESS_EQUAL=97, GREATER=98, 
		GREATER_EQUAL=99, AND=100, OR=101, XOR=102, NOT=103, BIT_AND=104, BIT_OR=105, 
		BIT_XOR=106, BIT_NOT=107, SHL=108, SHR=109, PLUS=110, MINUS=111, STAR=112, 
		EXP=113, MODULE=114, DIV=115, INC=116, DEC=117, QUESTION=118, RANGE=119, 
		SPREAD=120, INT_NUM=121, FLOAT_NUM=122, COMMENT=123, WS=124, POINTER_OP=125;
	public static final int
		RULE_program = 0, RULE_program_rule = 1, RULE_import_group = 2, RULE_import_rule = 3, 
		RULE_import_namespace = 4, RULE_namespace_name = 5, RULE_namespace = 6, 
		RULE_namespace_call = 7, RULE_class = 8, RULE_class_extends = 9, RULE_class_implements = 10, 
		RULE_class_body = 11, RULE_class_body_rule = 12, RULE_class_attribute = 13, 
		RULE_privacy_modifier = 14, RULE_class_method = 15, RULE_abstract_method = 16, 
		RULE_class_modifier = 17, RULE_constructor = 18, RULE_class_new_instance = 19, 
		RULE_method_call = 20, RULE_attribute_call = 21, RULE_interface = 22, 
		RULE_interface_extends = 23, RULE_interface_body = 24, RULE_interface_body_rule = 25, 
		RULE_interface_method = 26, RULE_interface_attribute = 27, RULE_struct = 28, 
		RULE_struct_body = 29, RULE_struct_attribute = 30, RULE_enum = 31, RULE_enum_body = 32, 
		RULE_enum_attribute = 33, RULE_expression = 34, RULE_composed_value = 35, 
		RULE_list_value = 36, RULE_map_value = 37, RULE_tuple_value = 38, RULE_named_tuple_value = 39, 
		RULE_and_expression = 40, RULE_or_expression = 41, RULE_xor_expression = 42, 
		RULE_not_expression = 43, RULE_expression_math = 44, RULE_term_math = 45, 
		RULE_factor_math = 46, RULE_bitwise_math = 47, RULE_shift_math = 48, RULE_unary_math = 49, 
		RULE_before_unary = 50, RULE_after_unary = 51, RULE_math_value = 52, RULE_parenthesis_expression = 53, 
		RULE_bitwise_operator = 54, RULE_shift_operator = 55, RULE_term_operator = 56, 
		RULE_factor_operator = 57, RULE_comparision_operator = 58, RULE_value = 59, 
		RULE_statement = 60, RULE_new_scope = 61, RULE_for_statement = 62, RULE_for_rule = 63, 
		RULE_for_in = 64, RULE_full_for = 65, RULE_while_statement = 66, RULE_do_while_statement = 67, 
		RULE_switch_statement = 68, RULE_switch_case = 69, RULE_try_statement = 70, 
		RULE_catch_statement = 71, RULE_finally_statement = 72, RULE_if_statement = 73, 
		RULE_elif_statement = 74, RULE_else_statement = 75, RULE_struct_func = 76, 
		RULE_func = 77, RULE_anonymous_func = 78, RULE_func_param = 79, RULE_func_callback = 80, 
		RULE_func_param_callback = 81, RULE_func_param_rule = 82, RULE_func_call = 83, 
		RULE_func_call_params = 84, RULE_func_return = 85, RULE_func_body = 86, 
		RULE_return_statement = 87, RULE_variable_declaration = 88, RULE_variable_assign = 89, 
		RULE_variable_name = 90, RULE_assing = 91, RULE_type = 92, RULE_final_type = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_rule", "import_group", "import_rule", "import_namespace", 
			"namespace_name", "namespace", "namespace_call", "class", "class_extends", 
			"class_implements", "class_body", "class_body_rule", "class_attribute", 
			"privacy_modifier", "class_method", "abstract_method", "class_modifier", 
			"constructor", "class_new_instance", "method_call", "attribute_call", 
			"interface", "interface_extends", "interface_body", "interface_body_rule", 
			"interface_method", "interface_attribute", "struct", "struct_body", "struct_attribute", 
			"enum", "enum_body", "enum_attribute", "expression", "composed_value", 
			"list_value", "map_value", "tuple_value", "named_tuple_value", "and_expression", 
			"or_expression", "xor_expression", "not_expression", "expression_math", 
			"term_math", "factor_math", "bitwise_math", "shift_math", "unary_math", 
			"before_unary", "after_unary", "math_value", "parenthesis_expression", 
			"bitwise_operator", "shift_operator", "term_operator", "factor_operator", 
			"comparision_operator", "value", "statement", "new_scope", "for_statement", 
			"for_rule", "for_in", "full_for", "while_statement", "do_while_statement", 
			"switch_statement", "switch_case", "try_statement", "catch_statement", 
			"finally_statement", "if_statement", "elif_statement", "else_statement", 
			"struct_func", "func", "anonymous_func", "func_param", "func_callback", 
			"func_param_callback", "func_param_rule", "func_call", "func_call_params", 
			"func_return", "func_body", "return_statement", "variable_declaration", 
			"variable_assign", "variable_name", "assing", "type", "final_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'namespace'", "'export'", "'use'", "'as'", null, "'this'", 
			"'new'", "'enum'", "'struct'", "'func'", "'class'", "'interface'", "'extends'", 
			"'implements'", "'public'", "'private'", "'protected'", "'static'", "'abstract'", 
			"'final'", "'override'", "'if'", "'else'", "'elif'", "'switch'", "'case'", 
			"'default'", "'while'", "'do'", "'for'", "'break'", "'continue'", "'return'", 
			"'const'", "'readonly'", "'in'", "'is'", "'try'", "'catch'", "'finally'", 
			"'int'", "'int8'", "'int16'", "'int32'", "'int64'", "'uint'", "'uint8'", 
			"'uint16'", "'uint32'", "'uint64'", "'float'", "'float32'", "'float64'", 
			"'bool'", "'char'", "'string'", "'INF'", "'tuple'", "'map'", "'error'", 
			"'null'", "'any'", "'dyn'", null, null, "'_'", null, "','", "'.'", "':'", 
			"'::'", "'->'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", 
			"'+='", "'-='", "'*='", "'%='", "'/='", "'**='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "':='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'&&'", "'||'", "'^^'", "'!'", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", 
			"'+'", "'-'", "'*'", "'**'", "'%'", "'/'", "'++'", "'--'", "'?'", "'..'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "NAMESPACE", "EXPORT", "USE", "AS", "BOOLEAN", "THIS", 
			"NEW", "ENUM", "STRUCT", "FUNC", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", 
			"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "ABSTRACT", "FINAL", "OVERRIDE", 
			"IF", "ELSE", "ELIF", "SWITCH", "CASE", "DEFAULT", "WHILE", "DO", "FOR", 
			"BREAK", "CONTINUE", "RETURN", "CONST", "READONLY", "IN", "IS", "TRY", 
			"CATCH", "FINALLY", "INT", "INT8", "INT16", "INT32", "INT64", "UINT", 
			"UINT8", "UINT16", "UINT32", "UINT64", "FLOAT", "FLOAT32", "FLOAT64", 
			"BOOL", "CHAR", "STRING", "INF", "TUPLE", "MAP", "ERROR", "NULL", "ANY", 
			"DYN", "TEMPLATE_STRING", "DEFAULT_STRING", "DISCARD", "NAME", "COMMA", 
			"DOT", "COLON", "DOUBLE_COLON", "ARROW", "SEMICOLON", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "MODULE_ASSIGN", "DIV_ASSIGN", 
			"EXP_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "SHL_ASSIGN", 
			"SHR_ASSIGN", "INF_ASSIGN", "EQUAL", "NOT_EQUAL", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "AND", "OR", "XOR", "NOT", "BIT_AND", "BIT_OR", 
			"BIT_XOR", "BIT_NOT", "SHL", "SHR", "PLUS", "MINUS", "STAR", "EXP", "MODULE", 
			"DIV", "INC", "DEC", "QUESTION", "RANGE", "SPREAD", "INT_NUM", "FLOAT_NUM", 
			"COMMENT", "WS", "POINTER_OP"
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
	public String getGrammarFileName() { return "Flexar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlexarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public List<Import_groupContext> import_group() {
			return getRuleContexts(Import_groupContext.class);
		}
		public Import_groupContext import_group(int i) {
			return getRuleContext(Import_groupContext.class,i);
		}
		public List<Program_ruleContext> program_rule() {
			return getRuleContexts(Program_ruleContext.class);
		}
		public Program_ruleContext program_rule(int i) {
			return getRuleContext(Program_ruleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(188);
				import_group();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			namespace();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1064456L) != 0) || _la==OPEN_PAREN) {
				{
				{
				setState(195);
				program_rule();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Program_ruleContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Struct_funcContext struct_func() {
			return getRuleContext(Struct_funcContext.class,0);
		}
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(FlexarParser.EXPORT, 0); }
		public Program_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterProgram_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitProgram_rule(this);
		}
	}

	public final Program_ruleContext program_rule() throws RecognitionException {
		Program_ruleContext _localctx = new Program_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(201);
				match(EXPORT);
				}
			}

			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ABSTRACT:
				{
				setState(204);
				class_();
				}
				break;
			case FUNC:
				{
				setState(205);
				func();
				}
				break;
			case INTERFACE:
				{
				setState(206);
				interface_();
				}
				break;
			case STRUCT:
				{
				setState(207);
				struct();
				}
				break;
			case OPEN_PAREN:
				{
				setState(208);
				struct_func();
				}
				break;
			case ENUM:
				{
				setState(209);
				enum_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Import_groupContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FlexarParser.IMPORT, 0); }
		public Import_ruleContext import_rule() {
			return getRuleContext(Import_ruleContext.class,0);
		}
		public Import_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterImport_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitImport_group(this);
		}
	}

	public final Import_groupContext import_group() throws RecognitionException {
		Import_groupContext _localctx = new Import_groupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IMPORT);
			setState(213);
			import_rule();
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
	public static class Import_ruleContext extends ParserRuleContext {
		public List<Import_namespaceContext> import_namespace() {
			return getRuleContexts(Import_namespaceContext.class);
		}
		public Import_namespaceContext import_namespace(int i) {
			return getRuleContext(Import_namespaceContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FlexarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FlexarParser.SEMICOLON, i);
		}
		public List<TerminalNode> USE() { return getTokens(FlexarParser.USE); }
		public TerminalNode USE(int i) {
			return getToken(FlexarParser.USE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Import_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterImport_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitImport_rule(this);
		}
	}

	public final Import_ruleContext import_rule() throws RecognitionException {
		Import_ruleContext _localctx = new Import_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE) {
					{
					setState(215);
					match(USE);
					}
				}

				setState(218);
				import_namespace();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219);
					match(COMMA);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==USE) {
						{
						setState(220);
						match(USE);
						}
					}

					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NAME) {
						{
						setState(223);
						import_namespace();
						}
					}

					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(SEMICOLON);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USE || _la==NAME );
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
	public static class Import_namespaceContext extends ParserRuleContext {
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(FlexarParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(FlexarParser.AS, 0); }
		public Import_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterImport_namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitImport_namespace(this);
		}
	}

	public final Import_namespaceContext import_namespace() throws RecognitionException {
		Import_namespaceContext _localctx = new Import_namespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			namespace_name();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON) {
				{
				setState(238);
				match(DOUBLE_COLON);
				setState(239);
				match(NAME);
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(242);
				match(AS);
				setState(243);
				match(NAME);
				}
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
	public static class Namespace_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlexarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlexarParser.DOT, i);
		}
		public Namespace_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNamespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNamespace_name(this);
		}
	}

	public final Namespace_nameContext namespace_name() throws RecognitionException {
		Namespace_nameContext _localctx = new Namespace_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespace_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NAME);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(247);
				match(DOT);
				setState(248);
				match(NAME);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(FlexarParser.NAMESPACE, 0); }
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FlexarParser.SEMICOLON, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(NAMESPACE);
			setState(255);
			namespace_name();
			setState(256);
			match(SEMICOLON);
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
	public static class Namespace_callContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(FlexarParser.DOUBLE_COLON, 0); }
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Namespace_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNamespace_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNamespace_call(this);
		}
	}

	public final Namespace_callContext namespace_call() throws RecognitionException {
		Namespace_callContext _localctx = new Namespace_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namespace_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(258);
				namespace_name();
				}
				break;
			case 2:
				{
				setState(259);
				match(NAME);
				}
				break;
			}
			setState(262);
			match(DOUBLE_COLON);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(263);
				func_call();
				}
				break;
			case 2:
				{
				setState(264);
				match(NAME);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FlexarParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(FlexarParser.ABSTRACT, 0); }
		public Class_extendsContext class_extends() {
			return getRuleContext(Class_extendsContext.class,0);
		}
		public Class_implementsContext class_implements() {
			return getRuleContext(Class_implementsContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(267);
				match(ABSTRACT);
				}
			}

			setState(270);
			match(CLASS);
			setState(271);
			match(NAME);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(272);
				class_extends();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(275);
				class_implements();
				}
			}

			setState(278);
			class_body();
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
	public static class Class_extendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(FlexarParser.EXTENDS, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Class_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_extends(this);
		}
	}

	public final Class_extendsContext class_extends() throws RecognitionException {
		Class_extendsContext _localctx = new Class_extendsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(EXTENDS);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(281);
				match(NAME);
				}
				break;
			case OPEN_PAREN:
				{
				setState(282);
				match(OPEN_PAREN);
				setState(283);
				match(NAME);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					match(NAME);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Class_implementsContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(FlexarParser.IMPLEMENTS, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Class_implementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_implements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_implements(this);
		}
	}

	public final Class_implementsContext class_implements() throws RecognitionException {
		Class_implementsContext _localctx = new Class_implementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_implements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IMPLEMENTS);
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(295);
				match(NAME);
				}
				break;
			case OPEN_PAREN:
				{
				setState(296);
				match(OPEN_PAREN);
				setState(297);
				match(NAME);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					match(NAME);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<Class_body_ruleContext> class_body_rule() {
			return getRuleContexts(Class_body_ruleContext.class);
		}
		public Class_body_ruleContext class_body_rule(int i) {
			return getRuleContext(Class_body_ruleContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(OPEN_BRACE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 144115188109414369L) != 0)) {
				{
				{
				setState(309);
				class_body_rule();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(CLOSE_BRACE);
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
	public static class Class_body_ruleContext extends ParserRuleContext {
		public Class_attributeContext class_attribute() {
			return getRuleContext(Class_attributeContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Class_methodContext class_method() {
			return getRuleContext(Class_methodContext.class,0);
		}
		public Class_body_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_body_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_body_rule(this);
		}
	}

	public final Class_body_ruleContext class_body_rule() throws RecognitionException {
		Class_body_ruleContext _localctx = new Class_body_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_body_rule);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				class_attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				constructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				class_method();
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
	public static class Class_attributeContext extends ParserRuleContext {
		public Class_modifierContext class_modifier() {
			return getRuleContext(Class_modifierContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Class_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_attribute(this);
		}
	}

	public final Class_attributeContext class_attribute() throws RecognitionException {
		Class_attributeContext _localctx = new Class_attributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			class_modifier();
			setState(323);
			variable_declaration();
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
	public static class Privacy_modifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(FlexarParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(FlexarParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(FlexarParser.PROTECTED, 0); }
		public Privacy_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privacy_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterPrivacy_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitPrivacy_modifier(this);
		}
	}

	public final Privacy_modifierContext privacy_modifier() throws RecognitionException {
		Privacy_modifierContext _localctx = new Privacy_modifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_privacy_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
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
	public static class Class_methodContext extends ParserRuleContext {
		public Class_modifierContext class_modifier() {
			return getRuleContext(Class_modifierContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Abstract_methodContext abstract_method() {
			return getRuleContext(Abstract_methodContext.class,0);
		}
		public Class_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_method(this);
		}
	}

	public final Class_methodContext class_method() throws RecognitionException {
		Class_methodContext _localctx = new Class_methodContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_class_method);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				class_modifier();
				setState(328);
				func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				abstract_method();
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
	public static class Abstract_methodContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(FlexarParser.ABSTRACT, 0); }
		public TerminalNode FUNC() { return getToken(FlexarParser.FUNC, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Abstract_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAbstract_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAbstract_method(this);
		}
	}

	public final Abstract_methodContext abstract_method() throws RecognitionException {
		Abstract_methodContext _localctx = new Abstract_methodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_abstract_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ABSTRACT);
			setState(334);
			match(FUNC);
			setState(335);
			match(NAME);
			setState(336);
			match(OPEN_PAREN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(337);
				func_param();
				}
			}

			setState(340);
			match(CLOSE_PAREN);
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(341);
				func_return();
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
	public static class Class_modifierContext extends ParserRuleContext {
		public TerminalNode READONLY() { return getToken(FlexarParser.READONLY, 0); }
		public Privacy_modifierContext privacy_modifier() {
			return getRuleContext(Privacy_modifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(FlexarParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(FlexarParser.FINAL, 0); }
		public TerminalNode OVERRIDE() { return getToken(FlexarParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(FlexarParser.ABSTRACT, 0); }
		public Class_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_modifier(this);
		}
	}

	public final Class_modifierContext class_modifier() throws RecognitionException {
		Class_modifierContext _localctx = new Class_modifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==OVERRIDE) {
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==ABSTRACT || _la==OVERRIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(347);
				match(READONLY);
				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
				{
				setState(350);
				privacy_modifier();
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(353);
				match(STATIC);
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(356);
				match(FINAL);
				}
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Privacy_modifierContext privacy_modifier() {
			return getRuleContext(Privacy_modifierContext.class,0);
		}
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
				{
				setState(359);
				privacy_modifier();
				}
			}

			setState(362);
			match(NAME);
			setState(363);
			match(OPEN_PAREN);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(364);
				func_param();
				}
			}

			setState(367);
			match(CLOSE_PAREN);
			setState(368);
			func_body();
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
	public static class Class_new_instanceContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(FlexarParser.NEW, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FlexarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FlexarParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Class_new_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_new_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterClass_new_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitClass_new_instance(this);
		}
	}

	public final Class_new_instanceContext class_new_instance() throws RecognitionException {
		Class_new_instanceContext _localctx = new Class_new_instanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_new_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(NEW);
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(371);
				func_call();
				}
				break;
			case 2:
				{
				setState(372);
				match(NAME);
				setState(373);
				match(OPEN_BRACE);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(374);
					match(NAME);
					setState(375);
					match(ASSIGN);
					setState(376);
					expression(0);
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						match(NAME);
						setState(379);
						match(ASSIGN);
						setState(380);
						expression(0);
						}
						}
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(388);
				match(CLOSE_BRACE);
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
	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(FlexarParser.DOT, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode THIS() { return getToken(FlexarParser.THIS, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(391);
				match(THIS);
				}
				break;
			case 2:
				{
				setState(392);
				variable_name();
				}
				break;
			}
			setState(395);
			match(DOT);
			setState(396);
			func_call();
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
	public static class Attribute_callContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FlexarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FlexarParser.DOT, i);
		}
		public Attribute_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAttribute_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAttribute_call(this);
		}
	}

	public final Attribute_callContext attribute_call() throws RecognitionException {
		Attribute_callContext _localctx = new Attribute_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(398);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(399);
				func_call();
				}
				break;
			}
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(402);
						match(DOT);
						setState(403);
						match(NAME);
						}
						break;
					case NAME:
						{
						setState(404);
						func_call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(FlexarParser.INTERFACE, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Interface_extendsContext interface_extends() {
			return getRuleContext(Interface_extendsContext.class,0);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(INTERFACE);
			setState(411);
			match(NAME);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(412);
				interface_extends();
				}
			}

			setState(415);
			interface_body();
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
	public static class Interface_extendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(FlexarParser.EXTENDS, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Interface_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_extends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface_extends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface_extends(this);
		}
	}

	public final Interface_extendsContext interface_extends() throws RecognitionException {
		Interface_extendsContext _localctx = new Interface_extendsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interface_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(EXTENDS);
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(418);
				match(NAME);
				}
				break;
			case OPEN_PAREN:
				{
				setState(419);
				match(OPEN_PAREN);
				setState(420);
				match(NAME);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(421);
					match(COMMA);
					setState(422);
					match(NAME);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<Interface_body_ruleContext> interface_body_rule() {
			return getRuleContexts(Interface_body_ruleContext.class);
		}
		public Interface_body_ruleContext interface_body_rule(int i) {
			return getRuleContext(Interface_body_ruleContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface_body(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(OPEN_BRACE);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC || _la==NAME) {
				{
				{
				setState(432);
				interface_body_rule();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(CLOSE_BRACE);
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
	public static class Interface_body_ruleContext extends ParserRuleContext {
		public Interface_methodContext interface_method() {
			return getRuleContext(Interface_methodContext.class,0);
		}
		public Interface_attributeContext interface_attribute() {
			return getRuleContext(Interface_attributeContext.class,0);
		}
		public Interface_body_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface_body_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface_body_rule(this);
		}
	}

	public final Interface_body_ruleContext interface_body_rule() throws RecognitionException {
		Interface_body_ruleContext _localctx = new Interface_body_ruleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interface_body_rule);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				interface_method();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				interface_attribute();
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
	public static class Interface_methodContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FlexarParser.FUNC, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Interface_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface_method(this);
		}
	}

	public final Interface_methodContext interface_method() throws RecognitionException {
		Interface_methodContext _localctx = new Interface_methodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interface_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FUNC);
			setState(445);
			match(NAME);
			setState(446);
			match(OPEN_PAREN);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(447);
				func_param();
				}
			}

			setState(450);
			match(CLOSE_PAREN);
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(451);
				func_return();
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
	public static class Interface_attributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Interface_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterInterface_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitInterface_attribute(this);
		}
	}

	public final Interface_attributeContext interface_attribute() throws RecognitionException {
		Interface_attributeContext _localctx = new Interface_attributeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interface_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(NAME);
			{
			setState(455);
			match(COLON);
			setState(456);
			type();
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(FlexarParser.STRUCT, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(STRUCT);
			setState(459);
			match(NAME);
			setState(460);
			struct_body();
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
	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<Struct_attributeContext> struct_attribute() {
			return getRuleContexts(Struct_attributeContext.class);
		}
		public Struct_attributeContext struct_attribute(int i) {
			return getRuleContext(Struct_attributeContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitStruct_body(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(OPEN_BRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(463);
				struct_attribute();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(CLOSE_BRACE);
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
	public static class Struct_attributeContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Struct_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterStruct_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitStruct_attribute(this);
		}
	}

	public final Struct_attributeContext struct_attribute() throws RecognitionException {
		Struct_attributeContext _localctx = new Struct_attributeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_struct_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			variable_declaration();
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
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(FlexarParser.ENUM, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitEnum(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(ENUM);
			setState(474);
			match(NAME);
			setState(475);
			enum_body();
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
	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<Enum_attributeContext> enum_attribute() {
			return getRuleContexts(Enum_attributeContext.class);
		}
		public Enum_attributeContext enum_attribute(int i) {
			return getRuleContext(Enum_attributeContext.class,i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterEnum_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitEnum_body(this);
		}
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enum_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(OPEN_BRACE);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(478);
				enum_attribute();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(CLOSE_BRACE);
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
	public static class Enum_attributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(FlexarParser.ASSIGN, 0); }
		public TerminalNode INT_NUM() { return getToken(FlexarParser.INT_NUM, 0); }
		public Enum_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterEnum_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitEnum_attribute(this);
		}
	}

	public final Enum_attributeContext enum_attribute() throws RecognitionException {
		Enum_attributeContext _localctx = new Enum_attributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enum_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(NAME);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(487);
				match(ASSIGN);
				setState(488);
				match(INT_NUM);
				}
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
	public static class ExpressionContext extends ParserRuleContext {
		public Class_new_instanceContext class_new_instance() {
			return getRuleContext(Class_new_instanceContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode POINTER_OP() { return getToken(FlexarParser.POINTER_OP, 0); }
		public Anonymous_funcContext anonymous_func() {
			return getRuleContext(Anonymous_funcContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Namespace_callContext namespace_call() {
			return getRuleContext(Namespace_callContext.class,0);
		}
		public Attribute_callContext attribute_call() {
			return getRuleContext(Attribute_callContext.class,0);
		}
		public Expression_mathContext expression_math() {
			return getRuleContext(Expression_mathContext.class,0);
		}
		public Composed_valueContext composed_value() {
			return getRuleContext(Composed_valueContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode NULL() { return getToken(FlexarParser.NULL, 0); }
		public Comparision_operatorContext comparision_operator() {
			return getRuleContext(Comparision_operatorContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(FlexarParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public TerminalNode RANGE() { return getToken(FlexarParser.RANGE, 0); }
		public TerminalNode IS() { return getToken(FlexarParser.IS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitExpression(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(492);
				class_new_instance();
				}
				break;
			case 2:
				{
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(493);
					match(POINTER_OP);
					}
				}

				setState(496);
				func_call();
				}
				break;
			case 3:
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(497);
					match(POINTER_OP);
					}
				}

				setState(500);
				anonymous_func();
				}
				break;
			case 4:
				{
				setState(501);
				value();
				}
				break;
			case 5:
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(502);
					match(POINTER_OP);
					}
				}

				setState(505);
				method_call();
				}
				break;
			case 6:
				{
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(506);
					match(POINTER_OP);
					}
				}

				setState(509);
				namespace_call();
				}
				break;
			case 7:
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(510);
					match(POINTER_OP);
					}
				}

				setState(513);
				attribute_call();
				}
				break;
			case 8:
				{
				setState(514);
				expression_math(0);
				}
				break;
			case 9:
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINTER_OP) {
					{
					setState(515);
					match(POINTER_OP);
					}
				}

				setState(518);
				composed_value();
				}
				break;
			case 10:
				{
				setState(519);
				and_expression(0);
				}
				break;
			case 11:
				{
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(520);
					type();
					}
					break;
				case 2:
					{
					setState(521);
					match(NAME);
					}
					break;
				}
				setState(524);
				match(OPEN_PAREN);
				setState(525);
				expression(0);
				setState(526);
				match(CLOSE_PAREN);
				}
				break;
			case 12:
				{
				setState(528);
				match(NAME);
				}
				break;
			case 13:
				{
				setState(529);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(548);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(532);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(533);
						comparision_operator();
						setState(534);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(536);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(537);
						match(QUESTION);
						setState(538);
						expression(0);
						setState(539);
						match(COLON);
						setState(540);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(542);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(543);
						match(RANGE);
						setState(544);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(546);
						match(IS);
						setState(547);
						type();
						}
						break;
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
	public static class Composed_valueContext extends ParserRuleContext {
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public Map_valueContext map_value() {
			return getRuleContext(Map_valueContext.class,0);
		}
		public Tuple_valueContext tuple_value() {
			return getRuleContext(Tuple_valueContext.class,0);
		}
		public Named_tuple_valueContext named_tuple_value() {
			return getRuleContext(Named_tuple_valueContext.class,0);
		}
		public Composed_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composed_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterComposed_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitComposed_value(this);
		}
	}

	public final Composed_valueContext composed_value() throws RecognitionException {
		Composed_valueContext _localctx = new Composed_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_composed_value);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				list_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				map_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				tuple_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				named_tuple_value();
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
	public static class List_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public List_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterList_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitList_value(this);
		}
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(OPEN_BRACE);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(560);
				expression(0);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(561);
					match(COMMA);
					setState(562);
					expression(0);
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(570);
			match(CLOSE_BRACE);
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
	public static class Map_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(FlexarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlexarParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Map_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterMap_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitMap_value(this);
		}
	}

	public final Map_valueContext map_value() throws RecognitionException {
		Map_valueContext _localctx = new Map_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_map_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(OPEN_BRACE);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(573);
				expression(0);
				setState(574);
				match(COLON);
				setState(575);
				expression(0);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(576);
					match(COMMA);
					setState(577);
					expression(0);
					setState(578);
					match(COLON);
					setState(579);
					expression(0);
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(588);
			match(CLOSE_BRACE);
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
	public static class Tuple_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Tuple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterTuple_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitTuple_value(this);
		}
	}

	public final Tuple_valueContext tuple_value() throws RecognitionException {
		Tuple_valueContext _localctx = new Tuple_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tuple_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(OPEN_PAREN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(591);
				expression(0);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(592);
					match(COMMA);
					setState(593);
					expression(0);
					}
					}
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(601);
			match(CLOSE_PAREN);
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
	public static class Named_tuple_valueContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FlexarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FlexarParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Named_tuple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_tuple_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNamed_tuple_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNamed_tuple_value(this);
		}
	}

	public final Named_tuple_valueContext named_tuple_value() throws RecognitionException {
		Named_tuple_valueContext _localctx = new Named_tuple_valueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_named_tuple_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(OPEN_PAREN);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(604);
				match(NAME);
				setState(605);
				match(COLON);
				setState(606);
				expression(0);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(607);
					match(COMMA);
					setState(608);
					match(NAME);
					setState(609);
					match(COLON);
					setState(610);
					expression(0);
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(618);
			match(CLOSE_PAREN);
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
	public static class And_expressionContext extends ParserRuleContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(FlexarParser.AND, 0); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		return and_expression(0);
	}

	private And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState);
		And_expressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(623);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(624);
					match(AND);
					setState(625);
					or_expression(0);
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
	public static class Or_expressionContext extends ParserRuleContext {
		public Xor_expressionContext xor_expression() {
			return getRuleContext(Xor_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(FlexarParser.OR, 0); }
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		return or_expression(0);
	}

	private Or_expressionContext or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, _parentState);
		Or_expressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(632);
			xor_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_or_expression);
					setState(634);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(635);
					match(OR);
					setState(636);
					xor_expression(0);
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
	public static class Xor_expressionContext extends ParserRuleContext {
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public Xor_expressionContext xor_expression() {
			return getRuleContext(Xor_expressionContext.class,0);
		}
		public TerminalNode XOR() { return getToken(FlexarParser.XOR, 0); }
		public Xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterXor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitXor_expression(this);
		}
	}

	public final Xor_expressionContext xor_expression() throws RecognitionException {
		return xor_expression(0);
	}

	private Xor_expressionContext xor_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Xor_expressionContext _localctx = new Xor_expressionContext(_ctx, _parentState);
		Xor_expressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_xor_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(643);
			not_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Xor_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_xor_expression);
					setState(645);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(646);
					match(XOR);
					setState(647);
					not_expression();
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
	public static class Not_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FlexarParser.NOT, 0); }
		public Not_expressionContext not_expression() {
			return getRuleContext(Not_expressionContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(FlexarParser.BOOLEAN, 0); }
		public Not_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNot_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNot_expression(this);
		}
	}

	public final Not_expressionContext not_expression() throws RecognitionException {
		Not_expressionContext _localctx = new Not_expressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_not_expression);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(NOT);
				setState(654);
				not_expression();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(BOOLEAN);
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
	public static class Expression_mathContext extends ParserRuleContext {
		public Term_mathContext term_math() {
			return getRuleContext(Term_mathContext.class,0);
		}
		public Expression_mathContext expression_math() {
			return getRuleContext(Expression_mathContext.class,0);
		}
		public Factor_operatorContext factor_operator() {
			return getRuleContext(Factor_operatorContext.class,0);
		}
		public Expression_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterExpression_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitExpression_math(this);
		}
	}

	public final Expression_mathContext expression_math() throws RecognitionException {
		return expression_math(0);
	}

	private Expression_mathContext expression_math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_mathContext _localctx = new Expression_mathContext(_ctx, _parentState);
		Expression_mathContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(659);
			term_math(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_mathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_math);
					setState(661);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(662);
					factor_operator();
					setState(663);
					term_math(0);
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
	public static class Term_mathContext extends ParserRuleContext {
		public Factor_mathContext factor_math() {
			return getRuleContext(Factor_mathContext.class,0);
		}
		public Term_mathContext term_math() {
			return getRuleContext(Term_mathContext.class,0);
		}
		public Term_operatorContext term_operator() {
			return getRuleContext(Term_operatorContext.class,0);
		}
		public Term_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterTerm_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitTerm_math(this);
		}
	}

	public final Term_mathContext term_math() throws RecognitionException {
		return term_math(0);
	}

	private Term_mathContext term_math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term_mathContext _localctx = new Term_mathContext(_ctx, _parentState);
		Term_mathContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_term_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			factor_math(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_mathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term_math);
					setState(673);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(674);
					term_operator();
					setState(675);
					factor_math(0);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
	public static class Factor_mathContext extends ParserRuleContext {
		public Bitwise_mathContext bitwise_math() {
			return getRuleContext(Bitwise_mathContext.class,0);
		}
		public Factor_mathContext factor_math() {
			return getRuleContext(Factor_mathContext.class,0);
		}
		public TerminalNode EXP() { return getToken(FlexarParser.EXP, 0); }
		public Factor_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFactor_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFactor_math(this);
		}
	}

	public final Factor_mathContext factor_math() throws RecognitionException {
		return factor_math(0);
	}

	private Factor_mathContext factor_math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_mathContext _localctx = new Factor_mathContext(_ctx, _parentState);
		Factor_mathContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_factor_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(683);
			bitwise_math(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor_mathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_factor_math);
					setState(685);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(686);
					match(EXP);
					setState(687);
					bitwise_math(0);
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
	public static class Bitwise_mathContext extends ParserRuleContext {
		public Shift_mathContext shift_math() {
			return getRuleContext(Shift_mathContext.class,0);
		}
		public Bitwise_mathContext bitwise_math() {
			return getRuleContext(Bitwise_mathContext.class,0);
		}
		public Bitwise_operatorContext bitwise_operator() {
			return getRuleContext(Bitwise_operatorContext.class,0);
		}
		public Bitwise_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterBitwise_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitBitwise_math(this);
		}
	}

	public final Bitwise_mathContext bitwise_math() throws RecognitionException {
		return bitwise_math(0);
	}

	private Bitwise_mathContext bitwise_math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_mathContext _localctx = new Bitwise_mathContext(_ctx, _parentState);
		Bitwise_mathContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_bitwise_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(694);
			shift_math(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_mathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_math);
					setState(696);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(697);
					bitwise_operator();
					setState(698);
					shift_math(0);
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
	public static class Shift_mathContext extends ParserRuleContext {
		public Unary_mathContext unary_math() {
			return getRuleContext(Unary_mathContext.class,0);
		}
		public Shift_mathContext shift_math() {
			return getRuleContext(Shift_mathContext.class,0);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Shift_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterShift_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitShift_math(this);
		}
	}

	public final Shift_mathContext shift_math() throws RecognitionException {
		return shift_math(0);
	}

	private Shift_mathContext shift_math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_mathContext _localctx = new Shift_mathContext(_ctx, _parentState);
		Shift_mathContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_shift_math, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(706);
			unary_math();
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_mathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shift_math);
					setState(708);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(709);
					shift_operator();
					setState(710);
					unary_math();
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
	public static class Unary_mathContext extends ParserRuleContext {
		public Before_unaryContext before_unary() {
			return getRuleContext(Before_unaryContext.class,0);
		}
		public After_unaryContext after_unary() {
			return getRuleContext(After_unaryContext.class,0);
		}
		public Math_valueContext math_value() {
			return getRuleContext(Math_valueContext.class,0);
		}
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public Unary_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterUnary_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitUnary_math(this);
		}
	}

	public final Unary_mathContext unary_math() throws RecognitionException {
		Unary_mathContext _localctx = new Unary_mathContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unary_math);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				before_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				after_unary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				math_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				parenthesis_expression();
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
	public static class Before_unaryContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(FlexarParser.INC, 0); }
		public Math_valueContext math_value() {
			return getRuleContext(Math_valueContext.class,0);
		}
		public TerminalNode DEC() { return getToken(FlexarParser.DEC, 0); }
		public TerminalNode BIT_NOT() { return getToken(FlexarParser.BIT_NOT, 0); }
		public Before_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_before_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterBefore_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitBefore_unary(this);
		}
	}

	public final Before_unaryContext before_unary() throws RecognitionException {
		Before_unaryContext _localctx = new Before_unaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_before_unary);
		try {
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(INC);
				setState(724);
				math_value();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(DEC);
				setState(726);
				math_value();
				}
				break;
			case BIT_NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				match(BIT_NOT);
				setState(728);
				math_value();
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
	public static class After_unaryContext extends ParserRuleContext {
		public Math_valueContext math_value() {
			return getRuleContext(Math_valueContext.class,0);
		}
		public TerminalNode INC() { return getToken(FlexarParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FlexarParser.DEC, 0); }
		public After_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAfter_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAfter_unary(this);
		}
	}

	public final After_unaryContext after_unary() throws RecognitionException {
		After_unaryContext _localctx = new After_unaryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_after_unary);
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				math_value();
				setState(732);
				match(INC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				math_value();
				setState(735);
				match(DEC);
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
	public static class Math_valueContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public TerminalNode INT_NUM() { return getToken(FlexarParser.INT_NUM, 0); }
		public Math_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterMath_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitMath_value(this);
		}
	}

	public final Math_valueContext math_value() throws RecognitionException {
		Math_valueContext _localctx = new Math_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_math_value);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case DISCARD:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				variable_name();
				}
				break;
			case INT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(INT_NUM);
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
	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public Expression_mathContext expression_math() {
			return getRuleContext(Expression_mathContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(OPEN_PAREN);
			setState(744);
			expression_math(0);
			setState(745);
			match(CLOSE_PAREN);
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
	public static class Bitwise_operatorContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(FlexarParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(FlexarParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(FlexarParser.BIT_XOR, 0); }
		public Bitwise_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterBitwise_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitBitwise_operator(this);
		}
	}

	public final Bitwise_operatorContext bitwise_operator() throws RecognitionException {
		Bitwise_operatorContext _localctx = new Bitwise_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bitwise_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0)) ) {
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
	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode SHL() { return getToken(FlexarParser.SHL, 0); }
		public TerminalNode SHR() { return getToken(FlexarParser.SHR, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitShift_operator(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !(_la==SHL || _la==SHR) ) {
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
	public static class Term_operatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(FlexarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(FlexarParser.DIV, 0); }
		public TerminalNode MODULE() { return getToken(FlexarParser.MODULE, 0); }
		public Term_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterTerm_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitTerm_operator(this);
		}
	}

	public final Term_operatorContext term_operator() throws RecognitionException {
		Term_operatorContext _localctx = new Term_operatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_term_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 13L) != 0)) ) {
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
	public static class Factor_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FlexarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FlexarParser.MINUS, 0); }
		public Factor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFactor_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFactor_operator(this);
		}
	}

	public final Factor_operatorContext factor_operator() throws RecognitionException {
		Factor_operatorContext _localctx = new Factor_operatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
	public static class Comparision_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(FlexarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(FlexarParser.NOT_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(FlexarParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(FlexarParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(FlexarParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(FlexarParser.GREATER_EQUAL, 0); }
		public Comparision_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparision_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterComparision_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitComparision_operator(this);
		}
	}

	public final Comparision_operatorContext comparision_operator() throws RecognitionException {
		Comparision_operatorContext _localctx = new Comparision_operatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comparision_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 63L) != 0)) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(FlexarParser.BOOLEAN, 0); }
		public TerminalNode INT_NUM() { return getToken(FlexarParser.INT_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(FlexarParser.FLOAT_NUM, 0); }
		public TerminalNode DEFAULT_STRING() { return getToken(FlexarParser.DEFAULT_STRING, 0); }
		public TerminalNode TEMPLATE_STRING() { return getToken(FlexarParser.TEMPLATE_STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 216172782113783811L) != 0)) ) {
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
	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignContext variable_assign() {
			return getRuleContext(Variable_assignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public New_scopeContext new_scope() {
			return getRuleContext(New_scopeContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(FlexarParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(FlexarParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_statement);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				variable_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(762);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(763);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(764);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(765);
				do_while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(766);
				switch_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(767);
				try_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(768);
				new_scope();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(769);
				match(BREAK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(770);
				match(CONTINUE);
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
	public static class New_scopeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public New_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterNew_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitNew_scope(this);
		}
	}

	public final New_scopeContext new_scope() throws RecognitionException {
		New_scopeContext _localctx = new New_scopeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_new_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(OPEN_BRACE);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(774);
				statement();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(CLOSE_BRACE);
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
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FlexarParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public For_ruleContext for_rule() {
			return getRuleContext(For_ruleContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(FOR);
			setState(783);
			match(OPEN_PAREN);
			setState(784);
			for_rule();
			setState(785);
			match(CLOSE_PAREN);
			setState(786);
			match(OPEN_BRACE);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(787);
				statement();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
			match(CLOSE_BRACE);
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
	public static class For_ruleContext extends ParserRuleContext {
		public For_inContext for_in() {
			return getRuleContext(For_inContext.class,0);
		}
		public Full_forContext full_for() {
			return getRuleContext(Full_forContext.class,0);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFor_rule(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_for_rule);
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				for_in();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				full_for();
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
	public static class For_inContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(FlexarParser.COMMA, 0); }
		public TerminalNode IN() { return getToken(FlexarParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> DISCARD() { return getTokens(FlexarParser.DISCARD); }
		public TerminalNode DISCARD(int i) {
			return getToken(FlexarParser.DISCARD, i);
		}
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public For_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFor_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFor_in(this);
		}
	}

	public final For_inContext for_in() throws RecognitionException {
		For_inContext _localctx = new For_inContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_for_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !(_la==DISCARD || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(800);
			match(COMMA);
			setState(801);
			_la = _input.LA(1);
			if ( !(_la==DISCARD || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(802);
			match(IN);
			setState(803);
			expression(0);
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
	public static class Full_forContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FlexarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FlexarParser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Full_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFull_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFull_for(this);
		}
	}

	public final Full_forContext full_for() throws RecognitionException {
		Full_forContext _localctx = new Full_forContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_full_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			variable_declaration();
			setState(806);
			match(SEMICOLON);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(807);
				expression(0);
				}
			}

			setState(810);
			match(SEMICOLON);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(811);
				expression(0);
				}
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
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FlexarParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(WHILE);
			setState(815);
			match(OPEN_PAREN);
			setState(816);
			expression(0);
			setState(817);
			match(CLOSE_PAREN);
			setState(818);
			match(OPEN_BRACE);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(819);
				statement();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			match(CLOSE_BRACE);
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
	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(FlexarParser.DO, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public TerminalNode WHILE() { return getToken(FlexarParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(DO);
			setState(828);
			match(OPEN_BRACE);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(829);
				statement();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			match(CLOSE_BRACE);
			setState(836);
			match(WHILE);
			setState(837);
			match(OPEN_PAREN);
			setState(838);
			expression(0);
			setState(839);
			match(CLOSE_PAREN);
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
	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(FlexarParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(SWITCH);
			setState(842);
			match(OPEN_PAREN);
			setState(843);
			expression(0);
			setState(844);
			match(CLOSE_PAREN);
			setState(845);
			match(OPEN_BRACE);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(846);
				switch_case();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
			match(CLOSE_BRACE);
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
	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FlexarParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(FlexarParser.DEFAULT, 0); }
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitSwitch_case(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_switch_case);
		int _la;
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(CASE);
				setState(855);
				expression(0);
				setState(856);
				match(COLON);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
					{
					{
					setState(857);
					statement();
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(DEFAULT);
				setState(864);
				match(COLON);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
					{
					{
					setState(865);
					statement();
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(FlexarParser.TRY, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(TRY);
			setState(874);
			match(OPEN_BRACE);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(875);
				statement();
				}
				}
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(881);
			match(CLOSE_BRACE);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(882);
				catch_statement();
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(885);
				finally_statement();
				}
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(FlexarParser.CATCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitCatch_statement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_catch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(CATCH);
			setState(889);
			match(OPEN_PAREN);
			setState(890);
			match(NAME);
			setState(891);
			match(COLON);
			setState(892);
			match(NAME);
			setState(893);
			match(CLOSE_PAREN);
			setState(894);
			match(OPEN_BRACE);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(895);
				statement();
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(901);
			match(CLOSE_BRACE);
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
	public static class Finally_statementContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(FlexarParser.FINALLY, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFinally_statement(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_finally_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(FINALLY);
			setState(904);
			match(OPEN_BRACE);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(905);
				statement();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
			match(CLOSE_BRACE);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FlexarParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(IF);
			setState(914);
			match(OPEN_PAREN);
			setState(915);
			expression(0);
			setState(916);
			match(CLOSE_PAREN);
			setState(917);
			match(OPEN_BRACE);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(918);
				statement();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			match(CLOSE_BRACE);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(925);
				elif_statement();
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(931);
				else_statement();
				}
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
	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(FlexarParser.ELIF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitElif_statement(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elif_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(ELIF);
			setState(935);
			match(OPEN_PAREN);
			setState(936);
			expression(0);
			setState(937);
			match(CLOSE_PAREN);
			setState(938);
			match(OPEN_BRACE);
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(939);
				statement();
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
			match(CLOSE_BRACE);
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
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FlexarParser.ELSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(ELSE);
			setState(948);
			match(OPEN_BRACE);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(949);
				statement();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
			match(CLOSE_BRACE);
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
	public static class Struct_funcContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode STAR() { return getToken(FlexarParser.STAR, 0); }
		public Struct_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterStruct_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitStruct_func(this);
		}
	}

	public final Struct_funcContext struct_func() throws RecognitionException {
		Struct_funcContext _localctx = new Struct_funcContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_struct_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(OPEN_PAREN);
			setState(958);
			match(NAME);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(959);
				match(STAR);
				}
			}

			setState(962);
			match(NAME);
			setState(963);
			match(CLOSE_PAREN);
			setState(964);
			func();
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FlexarParser.FUNC, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(FUNC);
			setState(967);
			match(NAME);
			setState(968);
			match(OPEN_PAREN);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(969);
				func_param();
				}
			}

			setState(972);
			match(CLOSE_PAREN);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770688L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 17592186044545L) != 0)) {
				{
				setState(973);
				func_return();
				}
			}

			setState(976);
			func_body();
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
	public static class Anonymous_funcContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FlexarParser.FUNC, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(FlexarParser.ARROW, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_paramContext func_param() {
			return getRuleContext(Func_paramContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Anonymous_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAnonymous_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAnonymous_func(this);
		}
	}

	public final Anonymous_funcContext anonymous_func() throws RecognitionException {
		Anonymous_funcContext _localctx = new Anonymous_funcContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_anonymous_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(FUNC);
			setState(979);
			match(OPEN_PAREN);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(980);
				func_param();
				}
			}

			setState(983);
			match(CLOSE_PAREN);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770688L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 17592186044545L) != 0)) {
				{
				setState(984);
				func_return();
				}
			}

			setState(987);
			match(ARROW);
			setState(988);
			func_body();
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
	public static class Func_paramContext extends ParserRuleContext {
		public List<Func_param_ruleContext> func_param_rule() {
			return getRuleContexts(Func_param_ruleContext.class);
		}
		public Func_param_ruleContext func_param_rule(int i) {
			return getRuleContext(Func_param_ruleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_param(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			func_param_rule();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(991);
				match(COMMA);
				setState(992);
				func_param_rule();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Func_callbackContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(FlexarParser.FUNC, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_param_callbackContext func_param_callback() {
			return getRuleContext(Func_param_callbackContext.class,0);
		}
		public Func_returnContext func_return() {
			return getRuleContext(Func_returnContext.class,0);
		}
		public Func_callbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_callback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_callback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_callback(this);
		}
	}

	public final Func_callbackContext func_callback() throws RecognitionException {
		Func_callbackContext _localctx = new Func_callbackContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_func_callback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(FUNC);
			setState(999);
			match(OPEN_PAREN);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770688L) != 0) || _la==NAME || _la==STAR) {
				{
				setState(1000);
				func_param_callback();
				}
			}

			setState(1003);
			match(CLOSE_PAREN);
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1004);
				func_return();
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
	public static class Func_param_callbackContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Func_param_callbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param_callback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_param_callback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_param_callback(this);
		}
	}

	public final Func_param_callbackContext func_param_callback() throws RecognitionException {
		Func_param_callbackContext _localctx = new Func_param_callbackContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_func_param_callback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			type();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1008);
				match(COMMA);
				setState(1009);
				type();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Func_param_ruleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(FlexarParser.QUESTION, 0); }
		public TerminalNode SPREAD() { return getToken(FlexarParser.SPREAD, 0); }
		public TerminalNode ASSIGN() { return getToken(FlexarParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Func_param_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_param_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_param_rule(this);
		}
	}

	public final Func_param_ruleContext func_param_rule() throws RecognitionException {
		Func_param_ruleContext _localctx = new Func_param_ruleContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_func_param_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(NAME);
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1016);
				match(QUESTION);
				}
			}

			setState(1019);
			match(COLON);
			setState(1020);
			type();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPREAD) {
				{
				setState(1021);
				match(SPREAD);
				}
			}

			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1024);
				match(ASSIGN);
				setState(1025);
				value();
				}
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
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public Func_call_paramsContext func_call_params() {
			return getRuleContext(Func_call_paramsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(NAME);
			setState(1029);
			match(OPEN_PAREN);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4363686770240L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				setState(1030);
				func_call_params();
				}
			}

			setState(1033);
			match(CLOSE_PAREN);
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
	public static class Func_call_paramsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Func_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_call_params(this);
		}
	}

	public final Func_call_paramsContext func_call_params() throws RecognitionException {
		Func_call_paramsContext _localctx = new Func_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_func_call_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			expression(0);
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1036);
				match(COMMA);
				setState(1037);
				expression(0);
				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Func_returnContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(FlexarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(FlexarParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Func_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_return(this);
		}
	}

	public final Func_returnContext func_return() throws RecognitionException {
		Func_returnContext _localctx = new Func_returnContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_func_return);
		int _la;
		try {
			setState(1055);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case CONST:
			case INT:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case UINT:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case FLOAT:
			case FLOAT32:
			case FLOAT64:
			case BOOL:
			case CHAR:
			case STRING:
			case INF:
			case TUPLE:
			case MAP:
			case ERROR:
			case NULL:
			case ANY:
			case NAME:
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				type();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(OPEN_PAREN);
				setState(1045);
				type();
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1046);
					match(COMMA);
					setState(1047);
					type();
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				match(CLOSE_PAREN);
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
	public static class Func_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(FlexarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(FlexarParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(OPEN_BRACE);
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3797212460608L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1375995096574465039L) != 0)) {
				{
				{
				setState(1058);
				statement();
				}
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(1064);
				return_statement();
				}
			}

			setState(1067);
			match(CLOSE_BRACE);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FlexarParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FlexarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FlexarParser.COMMA, i);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(RETURN);
			{
			setState(1070);
			expression(0);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1071);
				match(COMMA);
				setState(1072);
				expression(0);
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(FlexarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FlexarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(FlexarParser.QUESTION, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(NAME);
			{
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1079);
				match(QUESTION);
				}
			}

			setState(1082);
			match(COLON);
			setState(1083);
			type();
			}
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1085);
				match(ASSIGN);
				setState(1086);
				expression(0);
				}
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
	public static class Variable_assignContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public AssingContext assing() {
			return getRuleContext(AssingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterVariable_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitVariable_assign(this);
		}
	}

	public final Variable_assignContext variable_assign() throws RecognitionException {
		Variable_assignContext _localctx = new Variable_assignContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_variable_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			variable_name();
			setState(1090);
			assing();
			setState(1091);
			expression(0);
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
	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public TerminalNode THIS() { return getToken(FlexarParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(FlexarParser.DOT, 0); }
		public TerminalNode DISCARD() { return getToken(FlexarParser.DISCARD, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitVariable_name(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_variable_name);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				match(NAME);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(THIS);
				setState(1095);
				match(DOT);
				setState(1096);
				match(NAME);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(DISCARD);
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
	public static class AssingContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FlexarParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FlexarParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FlexarParser.MINUS_ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(FlexarParser.STAR_ASSIGN, 0); }
		public TerminalNode MODULE_ASSIGN() { return getToken(FlexarParser.MODULE_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FlexarParser.DIV_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(FlexarParser.EXP_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(FlexarParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(FlexarParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(FlexarParser.XOR_ASSIGN, 0); }
		public TerminalNode SHL_ASSIGN() { return getToken(FlexarParser.SHL_ASSIGN, 0); }
		public TerminalNode SHR_ASSIGN() { return getToken(FlexarParser.SHR_ASSIGN, 0); }
		public TerminalNode INF_ASSIGN() { return getToken(FlexarParser.INF_ASSIGN, 0); }
		public AssingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitAssing(this);
		}
	}

	public final AssingContext assing() throws RecognitionException {
		AssingContext _localctx = new AssingContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 8191L) != 0)) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public List<Final_typeContext> final_type() {
			return getRuleContexts(Final_typeContext.class);
		}
		public Final_typeContext final_type(int i) {
			return getRuleContext(Final_typeContext.class,i);
		}
		public TerminalNode CONST() { return getToken(FlexarParser.CONST, 0); }
		public TerminalNode STAR() { return getToken(FlexarParser.STAR, 0); }
		public List<TerminalNode> OPEN_BRACKET() { return getTokens(FlexarParser.OPEN_BRACKET); }
		public TerminalNode OPEN_BRACKET(int i) {
			return getToken(FlexarParser.OPEN_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(FlexarParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(FlexarParser.CLOSE_BRACKET, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(FlexarParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(FlexarParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(FlexarParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(FlexarParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> INT_NUM() { return getTokens(FlexarParser.INT_NUM); }
		public TerminalNode INT_NUM(int i) {
			return getToken(FlexarParser.INT_NUM, i);
		}
		public List<TerminalNode> DYN() { return getTokens(FlexarParser.DYN); }
		public TerminalNode DYN(int i) {
			return getToken(FlexarParser.DYN, i);
		}
		public List<TerminalNode> NAME() { return getTokens(FlexarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(FlexarParser.NAME, i);
		}
		public Func_callbackContext func_callback() {
			return getRuleContext(Func_callbackContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_type);
		int _la;
		try {
			int _alt;
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case INT:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case UINT:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case FLOAT:
			case FLOAT32:
			case FLOAT64:
			case BOOL:
			case CHAR:
			case STRING:
			case INF:
			case TUPLE:
			case MAP:
			case ERROR:
			case NULL:
			case ANY:
			case NAME:
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(1102);
					match(CONST);
					}
				}

				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(1105);
					match(STAR);
					}
				}

				setState(1108);
				final_type();
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(1123);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
						case 1:
							{
							setState(1109);
							match(OPEN_BRACKET);
							setState(1111);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 144115188075855889L) != 0)) {
								{
								setState(1110);
								_la = _input.LA(1);
								if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 144115188075855889L) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(1113);
							match(CLOSE_BRACKET);
							}
							break;
						case 2:
							{
							setState(1114);
							match(OPEN_BRACKET);
							setState(1115);
							final_type();
							setState(1116);
							match(OPEN_PAREN);
							setState(1118);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 144115188075855889L) != 0)) {
								{
								setState(1117);
								_la = _input.LA(1);
								if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 144115188075855889L) != 0)) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(1120);
							match(CLOSE_PAREN);
							setState(1121);
							match(CLOSE_BRACKET);
							}
							break;
						}
						} 
					}
					setState(1127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				func_callback();
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
	public static class Final_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FlexarParser.INT, 0); }
		public TerminalNode INT8() { return getToken(FlexarParser.INT8, 0); }
		public TerminalNode INT16() { return getToken(FlexarParser.INT16, 0); }
		public TerminalNode INT32() { return getToken(FlexarParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(FlexarParser.INT64, 0); }
		public TerminalNode UINT() { return getToken(FlexarParser.UINT, 0); }
		public TerminalNode UINT8() { return getToken(FlexarParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(FlexarParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(FlexarParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(FlexarParser.UINT64, 0); }
		public TerminalNode FLOAT() { return getToken(FlexarParser.FLOAT, 0); }
		public TerminalNode FLOAT32() { return getToken(FlexarParser.FLOAT32, 0); }
		public TerminalNode FLOAT64() { return getToken(FlexarParser.FLOAT64, 0); }
		public TerminalNode BOOL() { return getToken(FlexarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(FlexarParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(FlexarParser.STRING, 0); }
		public TerminalNode INF() { return getToken(FlexarParser.INF, 0); }
		public TerminalNode TUPLE() { return getToken(FlexarParser.TUPLE, 0); }
		public TerminalNode MAP() { return getToken(FlexarParser.MAP, 0); }
		public TerminalNode ERROR() { return getToken(FlexarParser.ERROR, 0); }
		public TerminalNode NULL() { return getToken(FlexarParser.NULL, 0); }
		public TerminalNode ANY() { return getToken(FlexarParser.ANY, 0); }
		public TerminalNode NAME() { return getToken(FlexarParser.NAME, 0); }
		public Final_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).enterFinal_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlexarListener ) ((FlexarListener)listener).exitFinal_type(this);
		}
	}

	public final Final_typeContext final_type() throws RecognitionException {
		Final_typeContext _localctx = new Final_typeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_final_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 71303167L) != 0)) ) {
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
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 40:
			return and_expression_sempred((And_expressionContext)_localctx, predIndex);
		case 41:
			return or_expression_sempred((Or_expressionContext)_localctx, predIndex);
		case 42:
			return xor_expression_sempred((Xor_expressionContext)_localctx, predIndex);
		case 44:
			return expression_math_sempred((Expression_mathContext)_localctx, predIndex);
		case 45:
			return term_math_sempred((Term_mathContext)_localctx, predIndex);
		case 46:
			return factor_math_sempred((Factor_mathContext)_localctx, predIndex);
		case 47:
			return bitwise_math_sempred((Bitwise_mathContext)_localctx, predIndex);
		case 48:
			return shift_math_sempred((Shift_mathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean or_expression_sempred(Or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xor_expression_sempred(Xor_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_math_sempred(Expression_mathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_math_sempred(Term_mathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_math_sempred(Factor_mathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_math_sempred(Bitwise_mathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_math_sempred(Shift_mathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\u046e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0001\u0000\u0005"+
		"\u0000\u00be\b\u0000\n\u0000\f\u0000\u00c1\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00c5\b\u0000\n\u0000\f\u0000\u00c8\t\u0000\u0001\u0001\u0003"+
		"\u0001\u00cb\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00d3\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003\u00d9\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00de\b\u0003\u0001\u0003\u0003\u0003\u00e1\b\u0003"+
		"\u0005\u0003\u00e3\b\u0003\n\u0003\f\u0003\u00e6\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u00ea\b\u0003\u000b\u0003\f\u0003\u00eb\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00f1\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00f5\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00fa\b\u0005\n\u0005\f\u0005\u00fd\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0105\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010a\b\u0007\u0001\b\u0003"+
		"\b\u010d\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0112\b\b\u0001\b\u0003\b"+
		"\u0115\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u011f\b\t\n\t\f\t\u0122\t\t\u0001\t\u0003\t\u0125\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u012d\b\n\n\n\f\n\u0130"+
		"\t\n\u0001\n\u0003\n\u0133\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u0137"+
		"\b\u000b\n\u000b\f\u000b\u013a\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0141\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u014c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0153\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0157\b"+
		"\u0010\u0001\u0011\u0003\u0011\u015a\b\u0011\u0001\u0011\u0003\u0011\u015d"+
		"\b\u0011\u0001\u0011\u0003\u0011\u0160\b\u0011\u0001\u0011\u0003\u0011"+
		"\u0163\b\u0011\u0001\u0011\u0003\u0011\u0166\b\u0011\u0001\u0012\u0003"+
		"\u0012\u0169\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016e"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u017e\b\u0013\n\u0013\f\u0013"+
		"\u0181\t\u0013\u0003\u0013\u0183\b\u0013\u0001\u0013\u0003\u0013\u0186"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u018a\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0191\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0196\b\u0015\n\u0015"+
		"\f\u0015\u0199\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u019e\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a8\b\u0017\n\u0017"+
		"\f\u0017\u01ab\t\u0017\u0001\u0017\u0003\u0017\u01ae\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01b2\b\u0018\n\u0018\f\u0018\u01b5\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01bb\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c1\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01c5\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01d1\b\u001d\n\u001d\f\u001d\u01d4\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u01e0\b \n \f \u01e3\t "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u01ea\b!\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01ef\b\"\u0001\"\u0001\"\u0003\"\u01f3\b\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u01f8\b\"\u0001\"\u0001\"\u0003\"\u01fc\b\"\u0001\"\u0001"+
		"\"\u0003\"\u0200\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u0205\b\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u020b\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0213\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0225\b\"\n\"\f\"\u0228\t\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u022e\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u0234\b$\n"+
		"$\f$\u0237\t$\u0003$\u0239\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0246\b%\n%\f%\u0249\t%\u0003"+
		"%\u024b\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u0253\b&\n"+
		"&\f&\u0256\t&\u0003&\u0258\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0264\b\'\n\'\f\'\u0267\t\'"+
		"\u0003\'\u0269\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0005(\u0273\b(\n(\f(\u0276\t(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u027e\b)\n)\f)\u0281\t)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0289\b*\n*\f*\u028c\t*\u0001+\u0001+\u0001+\u0003+\u0291"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u029a\b,\n"+
		",\f,\u029d\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-"+
		"\u02a6\b-\n-\f-\u02a9\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u02b1\b.\n.\f.\u02b4\t.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u02bd\b/\n/\f/\u02c0\t/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u02c9\b0\n0\f0\u02cc\t0\u00011\u00011\u00011\u00011\u0003"+
		"1\u02d2\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02da\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u02e2\b3\u00014\u00014\u0003"+
		"4\u02e6\b4\u00015\u00015\u00015\u00015\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u0304\b<\u0001=\u0001=\u0005=\u0308\b=\n=\f=\u030b\t=\u0001=\u0001="+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u0315\b>\n>\f>\u0318"+
		"\t>\u0001>\u0001>\u0001?\u0001?\u0003?\u031e\b?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u0329\bA\u0001A\u0001A\u0003"+
		"A\u032d\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0335\bB\n"+
		"B\fB\u0338\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0005C\u033f\bC\nC\f"+
		"C\u0342\tC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0005D\u0350\bD\nD\fD\u0353\tD\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001E\u0005E\u035b\bE\nE\fE\u035e\tE\u0001E\u0001E\u0001"+
		"E\u0005E\u0363\bE\nE\fE\u0366\tE\u0003E\u0368\bE\u0001F\u0001F\u0001F"+
		"\u0005F\u036d\bF\nF\fF\u0370\tF\u0001F\u0001F\u0003F\u0374\bF\u0001F\u0003"+
		"F\u0377\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005"+
		"G\u0381\bG\nG\fG\u0384\tG\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u038b"+
		"\bH\nH\fH\u038e\tH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0005I\u0398\bI\nI\fI\u039b\tI\u0001I\u0001I\u0005I\u039f\bI\nI\fI\u03a2"+
		"\tI\u0001I\u0003I\u03a5\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0005"+
		"J\u03ad\bJ\nJ\fJ\u03b0\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u03b7"+
		"\bK\nK\fK\u03ba\tK\u0001K\u0001K\u0001L\u0001L\u0001L\u0003L\u03c1\bL"+
		"\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0003M\u03cb"+
		"\bM\u0001M\u0001M\u0003M\u03cf\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0003"+
		"N\u03d6\bN\u0001N\u0001N\u0003N\u03da\bN\u0001N\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0005O\u03e2\bO\nO\fO\u03e5\tO\u0001P\u0001P\u0001P\u0003P\u03ea"+
		"\bP\u0001P\u0001P\u0003P\u03ee\bP\u0001Q\u0001Q\u0001Q\u0005Q\u03f3\b"+
		"Q\nQ\fQ\u03f6\tQ\u0001R\u0001R\u0003R\u03fa\bR\u0001R\u0001R\u0001R\u0003"+
		"R\u03ff\bR\u0001R\u0001R\u0003R\u0403\bR\u0001S\u0001S\u0001S\u0003S\u0408"+
		"\bS\u0001S\u0001S\u0001T\u0001T\u0001T\u0005T\u040f\bT\nT\fT\u0412\tT"+
		"\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u0419\bU\nU\fU\u041c\tU\u0001"+
		"U\u0001U\u0003U\u0420\bU\u0001V\u0001V\u0005V\u0424\bV\nV\fV\u0427\tV"+
		"\u0001V\u0003V\u042a\bV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0005"+
		"W\u0432\bW\nW\fW\u0435\tW\u0001X\u0001X\u0003X\u0439\bX\u0001X\u0001X"+
		"\u0001X\u0001X\u0001X\u0003X\u0440\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u044b\bZ\u0001[\u0001[\u0001\\\u0003"+
		"\\\u0450\b\\\u0001\\\u0003\\\u0453\b\\\u0001\\\u0001\\\u0001\\\u0003\\"+
		"\u0458\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u045f\b\\\u0001"+
		"\\\u0001\\\u0001\\\u0005\\\u0464\b\\\n\\\f\\\u0467\t\\\u0001\\\u0003\\"+
		"\u046a\b\\\u0001]\u0001]\u0001]\u0000\tDPRTXZ\\^`^\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u0000\f\u0001\u0000\u0010\u0012\u0002\u0000\u0014\u0014\u0016\u0016"+
		"\u0001\u0000hj\u0001\u0000lm\u0002\u0000pprs\u0001\u0000no\u0001\u0000"+
		"^c\u0003\u0000\u0006\u0006AByz\u0001\u0000CD\u0001\u0000Q]\u0003\u0000"+
		"@@DDyy\u0002\u0000*?DD\u04b6\u0000\u00bf\u0001\u0000\u0000\u0000\u0002"+
		"\u00ca\u0001\u0000\u0000\u0000\u0004\u00d4\u0001\u0000\u0000\u0000\u0006"+
		"\u00e9\u0001\u0000\u0000\u0000\b\u00ed\u0001\u0000\u0000\u0000\n\u00f6"+
		"\u0001\u0000\u0000\u0000\f\u00fe\u0001\u0000\u0000\u0000\u000e\u0104\u0001"+
		"\u0000\u0000\u0000\u0010\u010c\u0001\u0000\u0000\u0000\u0012\u0118\u0001"+
		"\u0000\u0000\u0000\u0014\u0126\u0001\u0000\u0000\u0000\u0016\u0134\u0001"+
		"\u0000\u0000\u0000\u0018\u0140\u0001\u0000\u0000\u0000\u001a\u0142\u0001"+
		"\u0000\u0000\u0000\u001c\u0145\u0001\u0000\u0000\u0000\u001e\u014b\u0001"+
		"\u0000\u0000\u0000 \u014d\u0001\u0000\u0000\u0000\"\u0159\u0001\u0000"+
		"\u0000\u0000$\u0168\u0001\u0000\u0000\u0000&\u0172\u0001\u0000\u0000\u0000"+
		"(\u0189\u0001\u0000\u0000\u0000*\u0190\u0001\u0000\u0000\u0000,\u019a"+
		"\u0001\u0000\u0000\u0000.\u01a1\u0001\u0000\u0000\u00000\u01af\u0001\u0000"+
		"\u0000\u00002\u01ba\u0001\u0000\u0000\u00004\u01bc\u0001\u0000\u0000\u0000"+
		"6\u01c6\u0001\u0000\u0000\u00008\u01ca\u0001\u0000\u0000\u0000:\u01ce"+
		"\u0001\u0000\u0000\u0000<\u01d7\u0001\u0000\u0000\u0000>\u01d9\u0001\u0000"+
		"\u0000\u0000@\u01dd\u0001\u0000\u0000\u0000B\u01e6\u0001\u0000\u0000\u0000"+
		"D\u0212\u0001\u0000\u0000\u0000F\u022d\u0001\u0000\u0000\u0000H\u022f"+
		"\u0001\u0000\u0000\u0000J\u023c\u0001\u0000\u0000\u0000L\u024e\u0001\u0000"+
		"\u0000\u0000N\u025b\u0001\u0000\u0000\u0000P\u026c\u0001\u0000\u0000\u0000"+
		"R\u0277\u0001\u0000\u0000\u0000T\u0282\u0001\u0000\u0000\u0000V\u0290"+
		"\u0001\u0000\u0000\u0000X\u0292\u0001\u0000\u0000\u0000Z\u029e\u0001\u0000"+
		"\u0000\u0000\\\u02aa\u0001\u0000\u0000\u0000^\u02b5\u0001\u0000\u0000"+
		"\u0000`\u02c1\u0001\u0000\u0000\u0000b\u02d1\u0001\u0000\u0000\u0000d"+
		"\u02d9\u0001\u0000\u0000\u0000f\u02e1\u0001\u0000\u0000\u0000h\u02e5\u0001"+
		"\u0000\u0000\u0000j\u02e7\u0001\u0000\u0000\u0000l\u02eb\u0001\u0000\u0000"+
		"\u0000n\u02ed\u0001\u0000\u0000\u0000p\u02ef\u0001\u0000\u0000\u0000r"+
		"\u02f1\u0001\u0000\u0000\u0000t\u02f3\u0001\u0000\u0000\u0000v\u02f5\u0001"+
		"\u0000\u0000\u0000x\u0303\u0001\u0000\u0000\u0000z\u0305\u0001\u0000\u0000"+
		"\u0000|\u030e\u0001\u0000\u0000\u0000~\u031d\u0001\u0000\u0000\u0000\u0080"+
		"\u031f\u0001\u0000\u0000\u0000\u0082\u0325\u0001\u0000\u0000\u0000\u0084"+
		"\u032e\u0001\u0000\u0000\u0000\u0086\u033b\u0001\u0000\u0000\u0000\u0088"+
		"\u0349\u0001\u0000\u0000\u0000\u008a\u0367\u0001\u0000\u0000\u0000\u008c"+
		"\u0369\u0001\u0000\u0000\u0000\u008e\u0378\u0001\u0000\u0000\u0000\u0090"+
		"\u0387\u0001\u0000\u0000\u0000\u0092\u0391\u0001\u0000\u0000\u0000\u0094"+
		"\u03a6\u0001\u0000\u0000\u0000\u0096\u03b3\u0001\u0000\u0000\u0000\u0098"+
		"\u03bd\u0001\u0000\u0000\u0000\u009a\u03c6\u0001\u0000\u0000\u0000\u009c"+
		"\u03d2\u0001\u0000\u0000\u0000\u009e\u03de\u0001\u0000\u0000\u0000\u00a0"+
		"\u03e6\u0001\u0000\u0000\u0000\u00a2\u03ef\u0001\u0000\u0000\u0000\u00a4"+
		"\u03f7\u0001\u0000\u0000\u0000\u00a6\u0404\u0001\u0000\u0000\u0000\u00a8"+
		"\u040b\u0001\u0000\u0000\u0000\u00aa\u041f\u0001\u0000\u0000\u0000\u00ac"+
		"\u0421\u0001\u0000\u0000\u0000\u00ae\u042d\u0001\u0000\u0000\u0000\u00b0"+
		"\u0436\u0001\u0000\u0000\u0000\u00b2\u0441\u0001\u0000\u0000\u0000\u00b4"+
		"\u044a\u0001\u0000\u0000\u0000\u00b6\u044c\u0001\u0000\u0000\u0000\u00b8"+
		"\u0469\u0001\u0000\u0000\u0000\u00ba\u046b\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0003\u0004\u0002\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c6\u0003\f\u0006\u0000\u00c3\u00c5"+
		"\u0003\u0002\u0001\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u0001\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0003\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d2"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d3\u0003\u0010\b\u0000\u00cd\u00d3\u0003"+
		"\u009aM\u0000\u00ce\u00d3\u0003,\u0016\u0000\u00cf\u00d3\u00038\u001c"+
		"\u0000\u00d0\u00d3\u0003\u0098L\u0000\u00d1\u00d3\u0003>\u001f\u0000\u00d2"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u0003\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5"+
		"\u00d6\u0003\u0006\u0003\u0000\u00d6\u0005\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005\u0004\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00e4\u0003\b\u0004\u0000\u00db\u00dd\u0005E\u0000\u0000\u00dc\u00de"+
		"\u0005\u0004\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0003\b\u0004\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00db\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"J\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0007\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f0\u0003\n\u0005\u0000\u00ee\u00ef\u0005H\u0000"+
		"\u0000\u00ef\u00f1\u0005D\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0005\u0000\u0000\u00f3\u00f5\u0005D\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\t\u0001\u0000\u0000\u0000\u00f6\u00fb\u0005D\u0000\u0000\u00f7\u00f8"+
		"\u0005F\u0000\u0000\u00f8\u00fa\u0005D\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u000b\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0002"+
		"\u0000\u0000\u00ff\u0100\u0003\n\u0005\u0000\u0100\u0101\u0005J\u0000"+
		"\u0000\u0101\r\u0001\u0000\u0000\u0000\u0102\u0105\u0003\n\u0005\u0000"+
		"\u0103\u0105\u0005D\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0005H\u0000\u0000\u0107\u010a\u0003\u00a6S\u0000\u0108\u010a\u0005"+
		"D\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u000f\u0001\u0000\u0000\u0000\u010b\u010d\u0005\u0014"+
		"\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005\f\u0000"+
		"\u0000\u010f\u0111\u0005D\u0000\u0000\u0110\u0112\u0003\u0012\t\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0115\u0003\u0014\n\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0016\u000b\u0000\u0117"+
		"\u0011\u0001\u0000\u0000\u0000\u0118\u0124\u0005\u000e\u0000\u0000\u0119"+
		"\u0125\u0005D\u0000\u0000\u011a\u011b\u0005K\u0000\u0000\u011b\u0120\u0005"+
		"D\u0000\u0000\u011c\u011d\u0005E\u0000\u0000\u011d\u011f\u0005D\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0005L\u0000\u0000\u0124\u0119\u0001\u0000\u0000\u0000"+
		"\u0124\u011a\u0001\u0000\u0000\u0000\u0125\u0013\u0001\u0000\u0000\u0000"+
		"\u0126\u0132\u0005\u000f\u0000\u0000\u0127\u0133\u0005D\u0000\u0000\u0128"+
		"\u0129\u0005K\u0000\u0000\u0129\u012e\u0005D\u0000\u0000\u012a\u012b\u0005"+
		"E\u0000\u0000\u012b\u012d\u0005D\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0133\u0005L\u0000\u0000"+
		"\u0132\u0127\u0001\u0000\u0000\u0000\u0132\u0128\u0001\u0000\u0000\u0000"+
		"\u0133\u0015\u0001\u0000\u0000\u0000\u0134\u0138\u0005M\u0000\u0000\u0135"+
		"\u0137\u0003\u0018\f\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0005N\u0000\u0000\u013c\u0017\u0001"+
		"\u0000\u0000\u0000\u013d\u0141\u0003\u001a\r\u0000\u013e\u0141\u0003$"+
		"\u0012\u0000\u013f\u0141\u0003\u001e\u000f\u0000\u0140\u013d\u0001\u0000"+
		"\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0019\u0001\u0000\u0000\u0000\u0142\u0143\u0003\"\u0011"+
		"\u0000\u0143\u0144\u0003\u00b0X\u0000\u0144\u001b\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0007\u0000\u0000\u0000\u0146\u001d\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0003\"\u0011\u0000\u0148\u0149\u0003\u009aM\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u014c\u0003 \u0010\u0000\u014b\u0147"+
		"\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u001f"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0014\u0000\u0000\u014e\u014f"+
		"\u0005\u000b\u0000\u0000\u014f\u0150\u0005D\u0000\u0000\u0150\u0152\u0005"+
		"K\u0000\u0000\u0151\u0153\u0003\u009eO\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0156\u0005L\u0000\u0000\u0155\u0157\u0003\u00aaU\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"!\u0001\u0000\u0000\u0000\u0158\u015a\u0007\u0001\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0001\u0000\u0000\u0000\u015b\u015d\u0005$\u0000\u0000\u015c\u015b\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u0160\u0003\u001c\u000e\u0000\u015f\u015e\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0005\u0013\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0166\u0005\u0015\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166#\u0001\u0000"+
		"\u0000\u0000\u0167\u0169\u0003\u001c\u000e\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005D\u0000\u0000\u016b\u016d\u0005K\u0000\u0000"+
		"\u016c\u016e\u0003\u009eO\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0005L\u0000\u0000\u0170\u0171\u0003\u00acV\u0000\u0171%\u0001"+
		"\u0000\u0000\u0000\u0172\u0185\u0005\b\u0000\u0000\u0173\u0186\u0003\u00a6"+
		"S\u0000\u0174\u0175\u0005D\u0000\u0000\u0175\u0182\u0005M\u0000\u0000"+
		"\u0176\u0177\u0005D\u0000\u0000\u0177\u0178\u0005Q\u0000\u0000\u0178\u017f"+
		"\u0003D\"\u0000\u0179\u017a\u0005E\u0000\u0000\u017a\u017b\u0005D\u0000"+
		"\u0000\u017b\u017c\u0005Q\u0000\u0000\u017c\u017e\u0003D\"\u0000\u017d"+
		"\u0179\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182"+
		"\u0176\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0005N\u0000\u0000\u0185\u0173"+
		"\u0001\u0000\u0000\u0000\u0185\u0174\u0001\u0000\u0000\u0000\u0186\'\u0001"+
		"\u0000\u0000\u0000\u0187\u018a\u0005\u0007\u0000\u0000\u0188\u018a\u0003"+
		"\u00b4Z\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0005F\u0000"+
		"\u0000\u018c\u018d\u0003\u00a6S\u0000\u018d)\u0001\u0000\u0000\u0000\u018e"+
		"\u0191\u0005D\u0000\u0000\u018f\u0191\u0003\u00a6S\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0197\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005F\u0000\u0000\u0193\u0196\u0005D\u0000"+
		"\u0000\u0194\u0196\u0003\u00a6S\u0000\u0195\u0192\u0001\u0000\u0000\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198+\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0005\r\u0000\u0000\u019b\u019d\u0005D\u0000\u0000\u019c\u019e"+
		"\u0003.\u0017\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0003"+
		"0\u0018\u0000\u01a0-\u0001\u0000\u0000\u0000\u01a1\u01ad\u0005\u000e\u0000"+
		"\u0000\u01a2\u01ae\u0005D\u0000\u0000\u01a3\u01a4\u0005K\u0000\u0000\u01a4"+
		"\u01a9\u0005D\u0000\u0000\u01a5\u01a6\u0005E\u0000\u0000\u01a6\u01a8\u0005"+
		"D\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0005L\u0000\u0000\u01ad\u01a2\u0001\u0000\u0000"+
		"\u0000\u01ad\u01a3\u0001\u0000\u0000\u0000\u01ae/\u0001\u0000\u0000\u0000"+
		"\u01af\u01b3\u0005M\u0000\u0000\u01b0\u01b2\u00032\u0019\u0000\u01b1\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0005N\u0000\u0000\u01b71\u0001\u0000\u0000\u0000\u01b8\u01bb\u00034"+
		"\u001a\u0000\u01b9\u01bb\u00036\u001b\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb3\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005\u000b\u0000\u0000\u01bd\u01be\u0005D\u0000\u0000\u01be"+
		"\u01c0\u0005K\u0000\u0000\u01bf\u01c1\u0003\u009eO\u0000\u01c0\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0005L\u0000\u0000\u01c3\u01c5\u0003\u00aa"+
		"U\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c55\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005D\u0000\u0000\u01c7"+
		"\u01c8\u0005G\u0000\u0000\u01c8\u01c9\u0003\u00b8\\\u0000\u01c97\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005\n\u0000\u0000\u01cb\u01cc\u0005D"+
		"\u0000\u0000\u01cc\u01cd\u0003:\u001d\u0000\u01cd9\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d2\u0005M\u0000\u0000\u01cf\u01d1\u0003<\u001e\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0005N\u0000\u0000\u01d6;\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\u00b0"+
		"X\u0000\u01d8=\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\t\u0000\u0000"+
		"\u01da\u01db\u0005D\u0000\u0000\u01db\u01dc\u0003@ \u0000\u01dc?\u0001"+
		"\u0000\u0000\u0000\u01dd\u01e1\u0005M\u0000\u0000\u01de\u01e0\u0003B!"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005N\u0000\u0000\u01e5A\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e9\u0005D\u0000\u0000\u01e7\u01e8\u0005Q\u0000\u0000\u01e8\u01ea\u0005"+
		"y\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01eaC\u0001\u0000\u0000\u0000\u01eb\u01ec\u0006\"\uffff"+
		"\uffff\u0000\u01ec\u0213\u0003&\u0013\u0000\u01ed\u01ef\u0005}\u0000\u0000"+
		"\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u0213\u0003\u00a6S\u0000\u01f1"+
		"\u01f3\u0005}\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u0213"+
		"\u0003\u009cN\u0000\u01f5\u0213\u0003v;\u0000\u01f6\u01f8\u0005}\u0000"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0213\u0003(\u0014\u0000"+
		"\u01fa\u01fc\u0005}\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u0213\u0003\u000e\u0007\u0000\u01fe\u0200\u0005}\u0000\u0000\u01ff\u01fe"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0001\u0000\u0000\u0000\u0201\u0213\u0003*\u0015\u0000\u0202\u0213\u0003"+
		"X,\u0000\u0203\u0205\u0005}\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0213\u0003F#\u0000\u0207\u0213\u0003P(\u0000\u0208\u020b"+
		"\u0003\u00b8\\\u0000\u0209\u020b\u0005D\u0000\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0005K\u0000\u0000\u020d\u020e\u0003D\""+
		"\u0000\u020e\u020f\u0005L\u0000\u0000\u020f\u0213\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0005D\u0000\u0000\u0211\u0213\u0005>\u0000\u0000\u0212\u01eb"+
		"\u0001\u0000\u0000\u0000\u0212\u01ee\u0001\u0000\u0000\u0000\u0212\u01f2"+
		"\u0001\u0000\u0000\u0000\u0212\u01f5\u0001\u0000\u0000\u0000\u0212\u01f7"+
		"\u0001\u0000\u0000\u0000\u0212\u01fb\u0001\u0000\u0000\u0000\u0212\u01ff"+
		"\u0001\u0000\u0000\u0000\u0212\u0202\u0001\u0000\u0000\u0000\u0212\u0204"+
		"\u0001\u0000\u0000\u0000\u0212\u0207\u0001\u0000\u0000\u0000\u0212\u020a"+
		"\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0211"+
		"\u0001\u0000\u0000\u0000\u0213\u0226\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\n\u0006\u0000\u0000\u0215\u0216\u0003t:\u0000\u0216\u0217\u0003D\"\u0007"+
		"\u0217\u0225\u0001\u0000\u0000\u0000\u0218\u0219\n\u0005\u0000\u0000\u0219"+
		"\u021a\u0005v\u0000\u0000\u021a\u021b\u0003D\"\u0000\u021b\u021c\u0005"+
		"G\u0000\u0000\u021c\u021d\u0003D\"\u0006\u021d\u0225\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\n\u0004\u0000\u0000\u021f\u0220\u0005w\u0000\u0000"+
		"\u0220\u0225\u0003D\"\u0005\u0221\u0222\n\u0007\u0000\u0000\u0222\u0223"+
		"\u0005&\u0000\u0000\u0223\u0225\u0003\u00b8\\\u0000\u0224\u0214\u0001"+
		"\u0000\u0000\u0000\u0224\u0218\u0001\u0000\u0000\u0000\u0224\u021e\u0001"+
		"\u0000\u0000\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227E\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0229\u022e\u0003H$\u0000\u022a\u022e\u0003J%\u0000\u022b"+
		"\u022e\u0003L&\u0000\u022c\u022e\u0003N\'\u0000\u022d\u0229\u0001\u0000"+
		"\u0000\u0000\u022d\u022a\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022eG\u0001\u0000\u0000"+
		"\u0000\u022f\u0238\u0005M\u0000\u0000\u0230\u0235\u0003D\"\u0000\u0231"+
		"\u0232\u0005E\u0000\u0000\u0232\u0234\u0003D\"\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0239\u0001"+
		"\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0230\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0005N\u0000\u0000\u023bI\u0001\u0000\u0000"+
		"\u0000\u023c\u024a\u0005M\u0000\u0000\u023d\u023e\u0003D\"\u0000\u023e"+
		"\u023f\u0005G\u0000\u0000\u023f\u0247\u0003D\"\u0000\u0240\u0241\u0005"+
		"E\u0000\u0000\u0241\u0242\u0003D\"\u0000\u0242\u0243\u0005G\u0000\u0000"+
		"\u0243\u0244\u0003D\"\u0000\u0244\u0246\u0001\u0000\u0000\u0000\u0245"+
		"\u0240\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247"+
		"\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a"+
		"\u023d\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0005N\u0000\u0000\u024dK\u0001"+
		"\u0000\u0000\u0000\u024e\u0257\u0005K\u0000\u0000\u024f\u0254\u0003D\""+
		"\u0000\u0250\u0251\u0005E\u0000\u0000\u0251\u0253\u0003D\"\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254"+
		"\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257"+
		"\u024f\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0005L\u0000\u0000\u025aM\u0001"+
		"\u0000\u0000\u0000\u025b\u0268\u0005K\u0000\u0000\u025c\u025d\u0005D\u0000"+
		"\u0000\u025d\u025e\u0005G\u0000\u0000\u025e\u0265\u0003D\"\u0000\u025f"+
		"\u0260\u0005E\u0000\u0000\u0260\u0261\u0005D\u0000\u0000\u0261\u0262\u0005"+
		"G\u0000\u0000\u0262\u0264\u0003D\"\u0000\u0263\u025f\u0001\u0000\u0000"+
		"\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000"+
		"\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u025c\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0005L\u0000\u0000\u026bO\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0006(\uffff\uffff\u0000\u026d\u026e\u0003R)\u0000\u026e\u0274"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\n\u0002\u0000\u0000\u0270\u0271\u0005"+
		"d\u0000\u0000\u0271\u0273\u0003R)\u0000\u0272\u026f\u0001\u0000\u0000"+
		"\u0000\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275Q\u0001\u0000\u0000\u0000"+
		"\u0276\u0274\u0001\u0000\u0000\u0000\u0277\u0278\u0006)\uffff\uffff\u0000"+
		"\u0278\u0279\u0003T*\u0000\u0279\u027f\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\n\u0002\u0000\u0000\u027b\u027c\u0005e\u0000\u0000\u027c\u027e\u0003"+
		"T*\u0000\u027d\u027a\u0001\u0000\u0000\u0000\u027e\u0281\u0001\u0000\u0000"+
		"\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280S\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0006*\uffff\uffff\u0000\u0283\u0284\u0003V+\u0000\u0284"+
		"\u028a\u0001\u0000\u0000\u0000\u0285\u0286\n\u0002\u0000\u0000\u0286\u0287"+
		"\u0005f\u0000\u0000\u0287\u0289\u0003V+\u0000\u0288\u0285\u0001\u0000"+
		"\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028bU\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028e\u0005g\u0000\u0000"+
		"\u028e\u0291\u0003V+\u0000\u028f\u0291\u0005\u0006\u0000\u0000\u0290\u028d"+
		"\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291W\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0006,\uffff\uffff\u0000\u0293\u0294\u0003"+
		"Z-\u0000\u0294\u029b\u0001\u0000\u0000\u0000\u0295\u0296\n\u0002\u0000"+
		"\u0000\u0296\u0297\u0003r9\u0000\u0297\u0298\u0003Z-\u0000\u0298\u029a"+
		"\u0001\u0000\u0000\u0000\u0299\u0295\u0001\u0000\u0000\u0000\u029a\u029d"+
		"\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029cY\u0001\u0000\u0000\u0000\u029d\u029b\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0006-\uffff\uffff\u0000\u029f\u02a0\u0003"+
		"\\.\u0000\u02a0\u02a7\u0001\u0000\u0000\u0000\u02a1\u02a2\n\u0002\u0000"+
		"\u0000\u02a2\u02a3\u0003p8\u0000\u02a3\u02a4\u0003\\.\u0000\u02a4\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a6\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a8[\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0006.\uffff\uffff\u0000\u02ab\u02ac\u0003"+
		"^/\u0000\u02ac\u02b2\u0001\u0000\u0000\u0000\u02ad\u02ae\n\u0002\u0000"+
		"\u0000\u02ae\u02af\u0005q\u0000\u0000\u02af\u02b1\u0003^/\u0000\u02b0"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3"+
		"]\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0006/\uffff\uffff\u0000\u02b6\u02b7\u0003`0\u0000\u02b7\u02be\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\n\u0002\u0000\u0000\u02b9\u02ba\u0003l"+
		"6\u0000\u02ba\u02bb\u0003`0\u0000\u02bb\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000"+
		"\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bf_\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c2\u00060\uffff\uffff\u0000\u02c2\u02c3\u0003b1\u0000\u02c3\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\n\u0002\u0000\u0000\u02c5\u02c6\u0003"+
		"n7\u0000\u02c6\u02c7\u0003b1\u0000\u02c7\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c4\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cba\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd"+
		"\u02d2\u0003d2\u0000\u02ce\u02d2\u0003f3\u0000\u02cf\u02d2\u0003h4\u0000"+
		"\u02d0\u02d2\u0003j5\u0000\u02d1\u02cd\u0001\u0000\u0000\u0000\u02d1\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2c\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005"+
		"t\u0000\u0000\u02d4\u02da\u0003h4\u0000\u02d5\u02d6\u0005u\u0000\u0000"+
		"\u02d6\u02da\u0003h4\u0000\u02d7\u02d8\u0005k\u0000\u0000\u02d8\u02da"+
		"\u0003h4\u0000\u02d9\u02d3\u0001\u0000\u0000\u0000\u02d9\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02dae\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\u0003h4\u0000\u02dc\u02dd\u0005t\u0000\u0000\u02dd"+
		"\u02e2\u0001\u0000\u0000\u0000\u02de\u02df\u0003h4\u0000\u02df\u02e0\u0005"+
		"u\u0000\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02db\u0001\u0000"+
		"\u0000\u0000\u02e1\u02de\u0001\u0000\u0000\u0000\u02e2g\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e6\u0003\u00b4Z\u0000\u02e4\u02e6\u0005y\u0000\u0000\u02e5"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"i\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005K\u0000\u0000\u02e8\u02e9\u0003"+
		"X,\u0000\u02e9\u02ea\u0005L\u0000\u0000\u02eak\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0007\u0002\u0000\u0000\u02ecm\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0007\u0003\u0000\u0000\u02eeo\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0007\u0004\u0000\u0000\u02f0q\u0001\u0000\u0000\u0000\u02f1\u02f2\u0007"+
		"\u0005\u0000\u0000\u02f2s\u0001\u0000\u0000\u0000\u02f3\u02f4\u0007\u0006"+
		"\u0000\u0000\u02f4u\u0001\u0000\u0000\u0000\u02f5\u02f6\u0007\u0007\u0000"+
		"\u0000\u02f6w\u0001\u0000\u0000\u0000\u02f7\u0304\u0003\u00b0X\u0000\u02f8"+
		"\u0304\u0003\u00b2Y\u0000\u02f9\u0304\u0003D\"\u0000\u02fa\u0304\u0003"+
		"|>\u0000\u02fb\u0304\u0003\u0092I\u0000\u02fc\u0304\u0003\u0084B\u0000"+
		"\u02fd\u0304\u0003\u0086C\u0000\u02fe\u0304\u0003\u0088D\u0000\u02ff\u0304"+
		"\u0003\u008cF\u0000\u0300\u0304\u0003z=\u0000\u0301\u0304\u0005 \u0000"+
		"\u0000\u0302\u0304\u0005!\u0000\u0000\u0303\u02f7\u0001\u0000\u0000\u0000"+
		"\u0303\u02f8\u0001\u0000\u0000\u0000\u0303\u02f9\u0001\u0000\u0000\u0000"+
		"\u0303\u02fa\u0001\u0000\u0000\u0000\u0303\u02fb\u0001\u0000\u0000\u0000"+
		"\u0303\u02fc\u0001\u0000\u0000\u0000\u0303\u02fd\u0001\u0000\u0000\u0000"+
		"\u0303\u02fe\u0001\u0000\u0000\u0000\u0303\u02ff\u0001\u0000\u0000\u0000"+
		"\u0303\u0300\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000"+
		"\u0303\u0302\u0001\u0000\u0000\u0000\u0304y\u0001\u0000\u0000\u0000\u0305"+
		"\u0309\u0005M\u0000\u0000\u0306\u0308\u0003x<\u0000\u0307\u0306\u0001"+
		"\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d\u0005"+
		"N\u0000\u0000\u030d{\u0001\u0000\u0000\u0000\u030e\u030f\u0005\u001f\u0000"+
		"\u0000\u030f\u0310\u0005K\u0000\u0000\u0310\u0311\u0003~?\u0000\u0311"+
		"\u0312\u0005L\u0000\u0000\u0312\u0316\u0005M\u0000\u0000\u0313\u0315\u0003"+
		"x<\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000"+
		"\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000"+
		"\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0005N\u0000\u0000\u031a}\u0001\u0000\u0000\u0000\u031b"+
		"\u031e\u0003\u0080@\u0000\u031c\u031e\u0003\u0082A\u0000\u031d\u031b\u0001"+
		"\u0000\u0000\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u007f\u0001"+
		"\u0000\u0000\u0000\u031f\u0320\u0007\b\u0000\u0000\u0320\u0321\u0005E"+
		"\u0000\u0000\u0321\u0322\u0007\b\u0000\u0000\u0322\u0323\u0005%\u0000"+
		"\u0000\u0323\u0324\u0003D\"\u0000\u0324\u0081\u0001\u0000\u0000\u0000"+
		"\u0325\u0326\u0003\u00b0X\u0000\u0326\u0328\u0005J\u0000\u0000\u0327\u0329"+
		"\u0003D\"\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001"+
		"\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0005"+
		"J\u0000\u0000\u032b\u032d\u0003D\"\u0000\u032c\u032b\u0001\u0000\u0000"+
		"\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u0083\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0005\u001d\u0000\u0000\u032f\u0330\u0005K\u0000\u0000"+
		"\u0330\u0331\u0003D\"\u0000\u0331\u0332\u0005L\u0000\u0000\u0332\u0336"+
		"\u0005M\u0000\u0000\u0333\u0335\u0003x<\u0000\u0334\u0333\u0001\u0000"+
		"\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0339\u0001\u0000"+
		"\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339\u033a\u0005N\u0000"+
		"\u0000\u033a\u0085\u0001\u0000\u0000\u0000\u033b\u033c\u0005\u001e\u0000"+
		"\u0000\u033c\u0340\u0005M\u0000\u0000\u033d\u033f\u0003x<\u0000\u033e"+
		"\u033d\u0001\u0000\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341"+
		"\u0343\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343"+
		"\u0344\u0005N\u0000\u0000\u0344\u0345\u0005\u001d\u0000\u0000\u0345\u0346"+
		"\u0005K\u0000\u0000\u0346\u0347\u0003D\"\u0000\u0347\u0348\u0005L\u0000"+
		"\u0000\u0348\u0087\u0001\u0000\u0000\u0000\u0349\u034a\u0005\u001a\u0000"+
		"\u0000\u034a\u034b\u0005K\u0000\u0000\u034b\u034c\u0003D\"\u0000\u034c"+
		"\u034d\u0005L\u0000\u0000\u034d\u0351\u0005M\u0000\u0000\u034e\u0350\u0003"+
		"\u008aE\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0353\u0001\u0000"+
		"\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0354\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0005N\u0000\u0000\u0355\u0089\u0001\u0000\u0000"+
		"\u0000\u0356\u0357\u0005\u001b\u0000\u0000\u0357\u0358\u0003D\"\u0000"+
		"\u0358\u035c\u0005G\u0000\u0000\u0359\u035b\u0003x<\u0000\u035a\u0359"+
		"\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0368"+
		"\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0005\u001c\u0000\u0000\u0360\u0364\u0005G\u0000\u0000\u0361\u0363\u0003"+
		"x<\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000"+
		"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000"+
		"\u0000\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000"+
		"\u0000\u0367\u0356\u0001\u0000\u0000\u0000\u0367\u035f\u0001\u0000\u0000"+
		"\u0000\u0368\u008b\u0001\u0000\u0000\u0000\u0369\u036a\u0005\'\u0000\u0000"+
		"\u036a\u036e\u0005M\u0000\u0000\u036b\u036d\u0003x<\u0000\u036c\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e\u036c"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0371"+
		"\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0373"+
		"\u0005N\u0000\u0000\u0372\u0374\u0003\u008eG\u0000\u0373\u0372\u0001\u0000"+
		"\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376\u0001\u0000"+
		"\u0000\u0000\u0375\u0377\u0003\u0090H\u0000\u0376\u0375\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u008d\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0005(\u0000\u0000\u0379\u037a\u0005K\u0000\u0000\u037a"+
		"\u037b\u0005D\u0000\u0000\u037b\u037c\u0005G\u0000\u0000\u037c\u037d\u0005"+
		"D\u0000\u0000\u037d\u037e\u0005L\u0000\u0000\u037e\u0382\u0005M\u0000"+
		"\u0000\u037f\u0381\u0003x<\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0381"+
		"\u0384\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\u0001\u0000\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384"+
		"\u0382\u0001\u0000\u0000\u0000\u0385\u0386\u0005N\u0000\u0000\u0386\u008f"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0005)\u0000\u0000\u0388\u038c\u0005"+
		"M\u0000\u0000\u0389\u038b\u0003x<\u0000\u038a\u0389\u0001\u0000\u0000"+
		"\u0000\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000"+
		"\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0390\u0005N\u0000\u0000"+
		"\u0390\u0091\u0001\u0000\u0000\u0000\u0391\u0392\u0005\u0017\u0000\u0000"+
		"\u0392\u0393\u0005K\u0000\u0000\u0393\u0394\u0003D\"\u0000\u0394\u0395"+
		"\u0005L\u0000\u0000\u0395\u0399\u0005M\u0000\u0000\u0396\u0398\u0003x"+
		"<\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000\u0000"+
		"\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000"+
		"\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000"+
		"\u0000\u039c\u03a0\u0005N\u0000\u0000\u039d\u039f\u0003\u0094J\u0000\u039e"+
		"\u039d\u0001\u0000\u0000\u0000\u039f\u03a2\u0001\u0000\u0000\u0000\u03a0"+
		"\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a5\u0003\u0096K\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a5\u0093\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0005\u0019\u0000\u0000\u03a7\u03a8\u0005K\u0000\u0000\u03a8\u03a9\u0003"+
		"D\"\u0000\u03a9\u03aa\u0005L\u0000\u0000\u03aa\u03ae\u0005M\u0000\u0000"+
		"\u03ab\u03ad\u0003x<\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ad\u03b0"+
		"\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae\u03af"+
		"\u0001\u0000\u0000\u0000\u03af\u03b1\u0001\u0000\u0000\u0000\u03b0\u03ae"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005N\u0000\u0000\u03b2\u0095\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b4\u0005\u0018\u0000\u0000\u03b4\u03b8\u0005"+
		"M\u0000\u0000\u03b5\u03b7\u0003x<\u0000\u03b6\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b7\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bb\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005N\u0000\u0000"+
		"\u03bc\u0097\u0001\u0000\u0000\u0000\u03bd\u03be\u0005K\u0000\u0000\u03be"+
		"\u03c0\u0005D\u0000\u0000\u03bf\u03c1\u0005p\u0000\u0000\u03c0\u03bf\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c3\u0005D\u0000\u0000\u03c3\u03c4\u0005L\u0000"+
		"\u0000\u03c4\u03c5\u0003\u009aM\u0000\u03c5\u0099\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0005\u000b\u0000\u0000\u03c7\u03c8\u0005D\u0000\u0000\u03c8"+
		"\u03ca\u0005K\u0000\u0000\u03c9\u03cb\u0003\u009eO\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ce\u0005L\u0000\u0000\u03cd\u03cf\u0003\u00aa"+
		"U\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1\u0003\u00acV\u0000"+
		"\u03d1\u009b\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005\u000b\u0000\u0000"+
		"\u03d3\u03d5\u0005K\u0000\u0000\u03d4\u03d6\u0003\u009eO\u0000\u03d5\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d7"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d9\u0005L\u0000\u0000\u03d8\u03da\u0003"+
		"\u00aaU\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03d9\u03da\u0001\u0000"+
		"\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0005I\u0000"+
		"\u0000\u03dc\u03dd\u0003\u00acV\u0000\u03dd\u009d\u0001\u0000\u0000\u0000"+
		"\u03de\u03e3\u0003\u00a4R\u0000\u03df\u03e0\u0005E\u0000\u0000\u03e0\u03e2"+
		"\u0003\u00a4R\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e4\u009f\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0005\u000b\u0000\u0000\u03e7\u03e9\u0005"+
		"K\u0000\u0000\u03e8\u03ea\u0003\u00a2Q\u0000\u03e9\u03e8\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ed\u0005L\u0000\u0000\u03ec\u03ee\u0003\u00aaU\u0000\u03ed"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u00a1\u0001\u0000\u0000\u0000\u03ef\u03f4\u0003\u00b8\\\u0000\u03f0\u03f1"+
		"\u0005E\u0000\u0000\u03f1\u03f3\u0003\u00b8\\\u0000\u03f2\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u00a3\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f9\u0005"+
		"D\u0000\u0000\u03f8\u03fa\u0005v\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fc\u0005G\u0000\u0000\u03fc\u03fe\u0003\u00b8\\\u0000"+
		"\u03fd\u03ff\u0005x\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03fe"+
		"\u03ff\u0001\u0000\u0000\u0000\u03ff\u0402\u0001\u0000\u0000\u0000\u0400"+
		"\u0401\u0005Q\u0000\u0000\u0401\u0403\u0003v;\u0000\u0402\u0400\u0001"+
		"\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u00a5\u0001"+
		"\u0000\u0000\u0000\u0404\u0405\u0005D\u0000\u0000\u0405\u0407\u0005K\u0000"+
		"\u0000\u0406\u0408\u0003\u00a8T\u0000\u0407\u0406\u0001\u0000\u0000\u0000"+
		"\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000"+
		"\u0409\u040a\u0005L\u0000\u0000\u040a\u00a7\u0001\u0000\u0000\u0000\u040b"+
		"\u0410\u0003D\"\u0000\u040c\u040d\u0005E\u0000\u0000\u040d\u040f\u0003"+
		"D\"\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040f\u0412\u0001\u0000"+
		"\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000"+
		"\u0000\u0000\u0411\u00a9\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000"+
		"\u0000\u0000\u0413\u0420\u0003\u00b8\\\u0000\u0414\u0415\u0005K\u0000"+
		"\u0000\u0415\u041a\u0003\u00b8\\\u0000\u0416\u0417\u0005E\u0000\u0000"+
		"\u0417\u0419\u0003\u00b8\\\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0419"+
		"\u041c\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a"+
		"\u041b\u0001\u0000\u0000\u0000\u041b\u041d\u0001\u0000\u0000\u0000\u041c"+
		"\u041a\u0001\u0000\u0000\u0000\u041d\u041e\u0005L\u0000\u0000\u041e\u0420"+
		"\u0001\u0000\u0000\u0000\u041f\u0413\u0001\u0000\u0000\u0000\u041f\u0414"+
		"\u0001\u0000\u0000\u0000\u0420\u00ab\u0001\u0000\u0000\u0000\u0421\u0425"+
		"\u0005M\u0000\u0000\u0422\u0424\u0003x<\u0000\u0423\u0422\u0001\u0000"+
		"\u0000\u0000\u0424\u0427\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000"+
		"\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u0429\u0001\u0000"+
		"\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428\u042a\u0003\u00ae"+
		"W\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000\u0000"+
		"\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042c\u0005N\u0000\u0000"+
		"\u042c\u00ad\u0001\u0000\u0000\u0000\u042d\u042e\u0005\"\u0000\u0000\u042e"+
		"\u0433\u0003D\"\u0000\u042f\u0430\u0005E\u0000\u0000\u0430\u0432\u0003"+
		"D\"\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432\u0435\u0001\u0000"+
		"\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000"+
		"\u0000\u0000\u0434\u00af\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000"+
		"\u0000\u0000\u0436\u0438\u0005D\u0000\u0000\u0437\u0439\u0005v\u0000\u0000"+
		"\u0438\u0437\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000"+
		"\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0005G\u0000\u0000\u043b"+
		"\u043c\u0003\u00b8\\\u0000\u043c\u043f\u0001\u0000\u0000\u0000\u043d\u043e"+
		"\u0005Q\u0000\u0000\u043e\u0440\u0003D\"\u0000\u043f\u043d\u0001\u0000"+
		"\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u00b1\u0001\u0000"+
		"\u0000\u0000\u0441\u0442\u0003\u00b4Z\u0000\u0442\u0443\u0003\u00b6[\u0000"+
		"\u0443\u0444\u0003D\"\u0000\u0444\u00b3\u0001\u0000\u0000\u0000\u0445"+
		"\u044b\u0005D\u0000\u0000\u0446\u0447\u0005\u0007\u0000\u0000\u0447\u0448"+
		"\u0005F\u0000\u0000\u0448\u044b\u0005D\u0000\u0000\u0449\u044b\u0005C"+
		"\u0000\u0000\u044a\u0445\u0001\u0000\u0000\u0000\u044a\u0446\u0001\u0000"+
		"\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u00b5\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0007\t\u0000\u0000\u044d\u00b7\u0001\u0000\u0000"+
		"\u0000\u044e\u0450\u0005#\u0000\u0000\u044f\u044e\u0001\u0000\u0000\u0000"+
		"\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u0452\u0001\u0000\u0000\u0000"+
		"\u0451\u0453\u0005p\u0000\u0000\u0452\u0451\u0001\u0000\u0000\u0000\u0452"+
		"\u0453\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454"+
		"\u0465\u0003\u00ba]\u0000\u0455\u0457\u0005O\u0000\u0000\u0456\u0458\u0007"+
		"\n\u0000\u0000\u0457\u0456\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000"+
		"\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u0464\u0005P\u0000"+
		"\u0000\u045a\u045b\u0005O\u0000\u0000\u045b\u045c\u0003\u00ba]\u0000\u045c"+
		"\u045e\u0005K\u0000\u0000\u045d\u045f\u0007\n\u0000\u0000\u045e\u045d"+
		"\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0460"+
		"\u0001\u0000\u0000\u0000\u0460\u0461\u0005L\u0000\u0000\u0461\u0462\u0005"+
		"P\u0000\u0000\u0462\u0464\u0001\u0000\u0000\u0000\u0463\u0455\u0001\u0000"+
		"\u0000\u0000\u0463\u045a\u0001\u0000\u0000\u0000\u0464\u0467\u0001\u0000"+
		"\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000"+
		"\u0000\u0000\u0466\u046a\u0001\u0000\u0000\u0000\u0467\u0465\u0001\u0000"+
		"\u0000\u0000\u0468\u046a\u0003\u00a0P\u0000\u0469\u044f\u0001\u0000\u0000"+
		"\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u046a\u00b9\u0001\u0000\u0000"+
		"\u0000\u046b\u046c\u0007\u000b\u0000\u0000\u046c\u00bb\u0001\u0000\u0000"+
		"\u0000\u0085\u00bf\u00c6\u00ca\u00d2\u00d8\u00dd\u00e0\u00e4\u00eb\u00f0"+
		"\u00f4\u00fb\u0104\u0109\u010c\u0111\u0114\u0120\u0124\u012e\u0132\u0138"+
		"\u0140\u014b\u0152\u0156\u0159\u015c\u015f\u0162\u0165\u0168\u016d\u017f"+
		"\u0182\u0185\u0189\u0190\u0195\u0197\u019d\u01a9\u01ad\u01b3\u01ba\u01c0"+
		"\u01c4\u01d2\u01e1\u01e9\u01ee\u01f2\u01f7\u01fb\u01ff\u0204\u020a\u0212"+
		"\u0224\u0226\u022d\u0235\u0238\u0247\u024a\u0254\u0257\u0265\u0268\u0274"+
		"\u027f\u028a\u0290\u029b\u02a7\u02b2\u02be\u02ca\u02d1\u02d9\u02e1\u02e5"+
		"\u0303\u0309\u0316\u031d\u0328\u032c\u0336\u0340\u0351\u035c\u0364\u0367"+
		"\u036e\u0373\u0376\u0382\u038c\u0399\u03a0\u03a4\u03ae\u03b8\u03c0\u03ca"+
		"\u03ce\u03d5\u03d9\u03e3\u03e9\u03ed\u03f4\u03f9\u03fe\u0402\u0407\u0410"+
		"\u041a\u041f\u0425\u0429\u0433\u0438\u043f\u044a\u044f\u0452\u0457\u045e"+
		"\u0463\u0465\u0469";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}