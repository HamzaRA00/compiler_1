
parser grammar HTMLParser;
@header{
package gen;
}
options {
    tokenVocab = HTMLLexer;
}

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME (htmlAttribute | jinjaStatement | jinjaExpression)* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | jinjaStatement
    | jinjaExpression
    | jinjaComment
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment | jinjaStatement | jinjaExpression | jinjaComment) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS (ATTVALUE_VALUE | jinjaExpression | jinjaStatement))?
    ;

jinjaStatement
    : JINJA_STATEMENT
    | TAG_JINJA_STATEMENT
    ;

jinjaExpression
    : JINJA_EXPRESSION
    | TAG_JINJA_EXPRESSION
    ;

jinjaComment
    : JINJA_COMMENT
    | TAG_JINJA_COMMENT
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;