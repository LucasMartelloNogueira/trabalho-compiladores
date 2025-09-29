%%

%standalone
%class CMinus
%line
%column

%state COMMENT   // defining a COMMENT state

%%

// -------------------- AUXILIARY REGULAR EXPRESSIONS --------------------

letter      = [a-zA-Z]
digit       = [0-9]

ID          = {letter}{letter}*
NUM         = {digit}{digit}*

WHITESPACE  = [ \t\r\n]+

<YYINITIAL> {
  {WHITESPACE}     { /* ignore */ }

  "/*"             { yybegin(COMMENT); }   // enter COMMENT state

  // Keywords
  "else"           { System.out.println("ELSE"); }
  "if"             { System.out.println("IF"); }
  "int"            { System.out.println("INT"); }
  "return"         { System.out.println("RETURN"); }
  "void"           { System.out.println("VOID"); }
  "while"          { System.out.println("WHILE"); }


  // Relational operators
  "<="             { System.out.println("LE"); }
  "<"              { System.out.println("LT"); }
  ">="             { System.out.println("GE"); }
  ">"              { System.out.println("GT"); }
  "=="             { System.out.println("EQ"); }
  "!="             { System.out.println("NE"); }

  // Arithmetic operators
  "+"              { System.out.println("PLUS"); }
  "-"              { System.out.println("MINUS"); }
  "*"              { System.out.println("TIMES"); }
  "/"              { System.out.println("OVER"); }

  // Assignment and punctuation
  "="              { System.out.println("ASSIGN"); }
  ";"              { System.out.println("SEMI"); }
  ","              { System.out.println("COMMA"); }
  "("              { System.out.println("LPAREN"); }
  ")"              { System.out.println("RPAREN"); }
  "["              { System.out.println("LBRACKET"); }
  "]"              { System.out.println("RBRACKET"); }
  "{"              { System.out.println("LBRACE"); }
  "}"              { System.out.println("RBRACE"); }

  // Identifiers and numbers
  {ID}             { System.out.println("ID(" + yytext() + ")"); }
  {NUM}            { System.out.println("NUM(" + yytext() + ")"); }

}

// -------------------- RULES FOR COMMENT STATE --------------------

<COMMENT> {

  "*/"             { yybegin(YYINITIAL); }   // close comment and return to initial state

  [^*]+            { /* ignore comment content */ }
  "*"              { /* could be part of "*/", keep scanning */ }

  \n               { /* ignore new line inside comment */ }

  <<EOF>>          { System.out.println("ERROR: unclosed comment!"); yybegin(YYINITIAL); }

}

[^]                { System.out.println("ERROR: illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }