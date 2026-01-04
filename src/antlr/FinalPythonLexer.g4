lexer grammar FinalPythonLexer;

@header {
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
}

@members {
    private Stack<Integer> indentStack = new Stack<>();
    private Queue<Token> tokenQueue = new LinkedList<>();
    private int nestingLevel = 0;
    
    {
        indentStack.push(0);
    }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }
        Token t = super.nextToken();
        if (!tokenQueue.isEmpty()) {
            // If the rule generated extra tokens, return the first one (which might be the rule's token or a replacement)
            // But super.nextToken() returns the token matched by the rule.
            // In our case, NL matches, and we might add INDENT/DEDENT to queue.
            // We return NL (t), and next calls return queue items.
            return t;
        }
        return t;
    }

    private void handleNewline(String text) {
        if (nestingLevel > 0) {
            return;
        }
        // Get the spaces after the last newline
        int lastNewlineIndex = text.lastIndexOf('\n');
        String spaces = text.substring(lastNewlineIndex + 1);
        int currentIndent = spaces.length();
        int previousIndent = indentStack.peek();

        if (currentIndent > previousIndent) {
            indentStack.push(currentIndent);
            CommonToken indentToken = new CommonToken(_tokenFactorySourcePair, INDENT, DEFAULT_TOKEN_CHANNEL, getCharIndex(), getCharIndex());
            indentToken.setText("<INDENT>");
            tokenQueue.add(indentToken);
        } else if (currentIndent < previousIndent) {
            while (currentIndent < indentStack.peek()) {
                indentStack.pop();
                CommonToken dedentToken = new CommonToken(_tokenFactorySourcePair, DEDENT, DEFAULT_TOKEN_CHANNEL, getCharIndex(), getCharIndex());
                dedentToken.setText("<DEDENT>");
                tokenQueue.add(dedentToken);
            }
        }
    }
}

tokens { INDENT, DEDENT }

// Keywords
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
WHILE: 'while';
FOR: 'for';
IN: 'in';
IMPORT: 'import';
FROM: 'from';
CLASS: 'class';
TRY: 'try';
EXCEPT: 'except';
FINALLY: 'finally';
WITH: 'with';
AS: 'as';
PASS: 'pass';
BREAK: 'break';
CONTINUE: 'continue';
LAMBDA: 'lambda';
GLOBAL: 'global';
NONLOCAL: 'nonlocal';
ASSERT: 'assert';
DEL: 'del';
YIELD: 'yield';
RAISE: 'raise';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';
AND: 'and';
OR: 'or';
NOT: 'not';
IS: 'is';

// Flask/Decorators
AT: '@';

// Operators and Punctuation
LPAREN: '(' { nestingLevel++; };
RPAREN: ')' { if (nestingLevel > 0) nestingLevel--; };
LBRACK: '[' { nestingLevel++; };
RBRACK: ']' { if (nestingLevel > 0) nestingLevel--; };
LBRACE: '{' { nestingLevel++; };
RBRACE: '}' { if (nestingLevel > 0) nestingLevel--; };
COLON: ':';
COMMA: ',';
SEMI: ';';
DOT: '.';
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
POWER: '**';
ARROW: '->';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
GG: '>>';
LL : '<<';
AND_SIGN : '&';
CHAPEUX : '^';
OR_SIGN: '|';
DIV_DIV: '//';
TELTA: '~';

// Identifiers and Literals
NAME: [a-zA-Z_] [a-zA-Z0-9_]*;
STRING: ('"' .*? '"' | '\'' .*? '\'');
NUMBER: [0-9]+ ('.' [0-9]+)?;

// Comments and Whitespace
COMMENT: '#' ~[\r\n]* -> skip;
WS: [ \t]+ -> skip; // Skip whitespace within lines

// Newline with Indentation Logic
NL: ('\r'? '\n' [ \t]*)+ { 
    if (nestingLevel > 0) {
        skip();
    } else {
        handleNewline(getText()); 
    }
};
