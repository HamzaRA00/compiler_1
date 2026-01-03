parser grammar FinalPythonParser;

options { tokenVocab=FinalPythonLexer; }

program : (statement | NL)* EOF ;

statement
    : compound_stmt   #CompoundStatement
    | simple_stmt     #SimpleStatement
    ;

simple_stmt : small_stmt (SEMI small_stmt)* (SEMI)? NL  ;

small_stmt
    : annotated_assignment    #AnnotatedAssignmentStmt
    | expr_stmt                #ExpressionStmt
    | import_stmt               #ImportStmt
    | pass_stmt                 #PassStmt
    | flow_stmt                 #FlowStmt
    | assert_stmt               #AssertStmt
    | global_stmt               #GlobalStmt
    | nonlocal_stmt             #NonlocalStmt
    | del_stmt                  #DelStmt
    ;

expr_stmt
    : expr         #AssignStmt
    | expr (ASSIGN expr)+   #ExprOnlyStmt
    ;
annotated_assignment
    : NAME COLON expr (ASSIGN expr)?   #AnnotatedAssign
    ;

import_stmt
    : IMPORT dotted_name (AS NAME)? (COMMA dotted_name (AS NAME)?)*  #ImportStmtFull
    | FROM dotted_name IMPORT (STAR | import_as_names)               #FromImportStmt
    ;

import_as_names : import_as_name (COMMA import_as_name)* ;
import_as_name : NAME (AS NAME)? ;
dotted_name : NAME (DOT NAME)* ;

pass_stmt : PASS                                          ;
flow_stmt
    : break_stmt   #BreakStmt
    | continue_stmt  #ContinueStmt
    | return_stmt #ReturnStmt
    | raise_stmt  #RaiseStmt
    | yield_stmt    #YieldStmt
    ;
break_stmt    : BREAK                                          ;
continue_stmt : CONTINUE                                 ;
return_stmt   : RETURN (expr (COMMA expr)*)?             ;
raise_stmt    : RAISE (expr (FROM expr)?)?                   ;
yield_stmt    : YIELD (expr)?                                     ;
assert_stmt   : ASSERT expr (COMMA expr)?                      ;
global_stmt   : GLOBAL NAME (COMMA NAME)*                 ;
nonlocal_stmt : NONLOCAL NAME (COMMA NAME)*               ;
del_stmt      : DEL expr                                         ;

compound_stmt
    : if_stmt  #IfStmt
    | while_stmt  #WhileStmt
    | for_stmt    #ForStmt
    | try_stmt    #TryStmt
    | with_stmt    #WithStmt
    | func_def     #FunctionDef
    | class_def    #ClassDef
    | decorated    #DecoratedDef
    ;

if_stmt     : IF expr COLON suite (ELIF expr COLON suite)* (ELSE COLON suite)?   ;
while_stmt  : WHILE expr COLON suite (ELSE COLON suite)?                                                  ;
for_stmt    : FOR expr IN expr COLON suite (ELSE COLON suite)?                                    ;
try_stmt    : TRY COLON suite (except_clause COLON suite)* (FINALLY COLON suite)?               ;
except_clause : EXCEPT (expr (AS NAME)?)?                                                                          ;
with_stmt   : WITH with_item (COMMA with_item)* COLON suite                                               ;
with_item   : expr (AS expr)?                                                                                    ;

func_def : DEF NAME LPAREN (parameters)? RPAREN (ARROW expr)? COLON suite                               ;
parameters : param (COMMA param)* ;
param : name=NAME (COLON expr)? (ASSIGN expr)? ;

class_def : CLASS NAME (LPAREN (expr (COMMA expr)*)? RPAREN)? COLON suite                            ;

decorated
    : decorators func_def   #DecoratedFunction
    | decorators class_def  #DecoratedClass
    ;
decorators : (AT dotted_name (LPAREN (argument (COMMA argument)*)? RPAREN)? NL)+ ;

suite
    : NL INDENT (statement | NL)+ DEDENT   #BlockSuite
    | simple_stmt                         #SimpleSuite
    ;

argument
    : expr               #PositionalArg
    | NAME ASSIGN expr   #KeywordArg
    ;

expr
    : atom                                                    #AtomExpr
    | expr (LBRACK (expr (COLON expr?)?)? RBRACK
                   | DOT NAME
                   | LPAREN (argument (COMMA argument)*)? RPAREN)+  #PostfixExpr
    | (PLUS|MINUS|NOT|TELTA) expr                             #UnaryExpr
    | expr POWER expr                                         #PowerExpr
    | expr (STAR|SLASH|PERCENT|DIV_DIV) expr                  #MulDivExpr
    | expr (PLUS|MINUS) expr                                  #AddSubExpr
    | expr (LL|GG) expr                                       #ShiftExpr
    | expr AND_SIGN expr                                      #BitAndExpr
    | expr CHAPEUX expr                                       #BitXorExpr
    | expr OR_SIGN expr                                       #BitOrExpr
    | expr (LT|GT|EQ|NEQ|LE|GE|IS|IN) expr                    #CompareExpr
    | expr IS NOT expr                                        #IsNotExpr
    | expr NOT IN expr                                        #NotInExpr
    | NOT expr                                                #NotExpr
    | expr AND expr                                           #LogicalAndExpr
    | expr OR expr                                            #LogicalOrExpr
    | expr IF expr ELSE expr                                  #ConditionalExpr
    ;

atom
    : NAME                                              #NameAtom
    | NUMBER                                            #NumberAtom
    | STRING+                                           #StringAtom
    | NONE                                              #NoneAtom
    | TRUE                                              #TrueAtom
    | FALSE                                             #FalseAtom
    | LBRACK (expr (COMMA expr)*)? RBRACK               #ListLiteral
    | LBRACE (NL)* (entry (COMMA (NL)* entry)*)? (COMMA)? (NL)* RBRACE  #DictLiteral
    | LPAREN expr comp_for RPAREN                       #GeneratorExpr
    | LPAREN (expr (COMMA expr)*)? RPAREN               #TupleOrParen
    | list_comp                                         #ListComp
    | dict_comp                                         #DictComp
    ;

entry : (NL)* expr (NL)* COLON (NL)* expr (NL)* ;

list_comp : LBRACK expr comp_for RBRACK             ;
dict_comp : LBRACE expr COLON expr comp_for RBRACE   ;
comp_for : FOR expr IN expr (IF expr)* ;
