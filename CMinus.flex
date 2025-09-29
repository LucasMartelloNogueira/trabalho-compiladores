%%

%standalone
%class CMinus
%line
%column

// defining a COMMENT state
%state COMMENT

// -------------------- AUXILIARY REGULAR EXPRESSIONS --------------------

letter      = [a-zA-Z]
digit       = [0-9]

ID          = {letter}{letter}*
NUM         = {digit}{digit}*

WHITESPACE  = [ \t\r\n]+

%%

<YYINITIAL> {
  {WHITESPACE}     { /* ignore */ }

  "/*"             { yybegin(COMMENT); }   // enter COMMENT state

  // Keywords
  "else"           { System.out.println(String.format("(%s, <ELSE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "if"             { System.out.println(String.format("(%s, <IF>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "int"            { System.out.println(String.format("(%s, <INT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "return"         { System.out.println(String.format("(%s, <RETURN>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "void"           { System.out.println(String.format("(%s, <VOID>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "while"          { System.out.println(String.format("(%s, <WHILE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }


  // Relational operators
  "<="             { System.out.println(String.format("(%s, <LE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "<"              { System.out.println(String.format("(%s, <LT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  ">="             { System.out.println(String.format("(%s, <GE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  ">"              { System.out.println(String.format("(%s, <GT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "=="             { System.out.println(String.format("(%s, <EQ>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "!="             { System.out.println(String.format("(%s, <NE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }

  // Arithmetic operators
  "+"              { System.out.println(String.format("(%s, <PLUS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "-"              { System.out.println(String.format("(%s, <MINUS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "*"              { System.out.println(String.format("(%s, <TIMES>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "/"              { System.out.println(String.format("(%s, <OVER>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }

  // Assignment and punctuation
  "="              { System.out.println(String.format("(%s, <ASSIGN>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  ";"              { System.out.println(String.format("(%s, <SEMI>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  ","              { System.out.println(String.format("(%s, <COMMA>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "("              { System.out.println(String.format("(%s, <LPAREN>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  ")"              { System.out.println(String.format("(%s, <RPAREN>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "["              { System.out.println(String.format("(%s, <LBRACKET>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "]"              { System.out.println(String.format("(%s, <RBRACKET>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "{"              { System.out.println(String.format("(%s, <LBRACE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  "}"              { System.out.println(String.format("(%s, <RBRACE>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }

  // Identifiers and numbers
  {ID}             { System.out.println(String.format("(%s, <ID>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {NUM}            { System.out.println(String.format("(%s, <NUM>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }

}

// -------------------- RULES FOR COMMENT STATE --------------------

<COMMENT> {

  "*/"             { yybegin(YYINITIAL); }   // close comment and return to initial state

  \n               { /* ignore new line inside comment */ }

  [^*]+            { /* ignore comment content */ }
  "*"              { /* could be part of "*\/", keep scanning */ }

  <<EOF>>          { System.out.println("ERROR: unclosed comment!"); yybegin(YYINITIAL); }

}

[^]                { System.out.println("ERROR: illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }