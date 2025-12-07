import java_cup.runtime.*;

%%

%standalone
%class CMinus2
%line
%cup
%column

// defining a COMMENT state
%state COMMENT

// -------------------- AUXILIARY REGULAR EXPRESSIONS --------------------

letter      = [a-zA-Z]
digit       = [0-9]

ID          = {letter}({letter}|{digit})*
NUM         = {digit}+

WHITESPACE  = [ \t\r\n]+

%%

<YYINITIAL> {
  {WHITESPACE}     { /* ignore */ }

  "/*"             { yybegin(COMMENT); }   // enter COMMENT state

  // Keywords
  "else"           { return new Symbol(sym.ELSE); }
  "if"             { return new Symbol(sym.IF); }
  "int"            { return new Symbol(sym.INT); }
  "return"         { return new Symbol(sym.RETURN); }
  "void"           { return new Symbol(sym.VOID); }
  "while"          { return new Symbol(sym.WHILE); }


  // Relational operators
  "<="             { return new Symbol(sym.LE); }
  "<"              { return new Symbol(sym.LT); }
  ">="             { return new Symbol(sym.GE); }
  ">"              { return new Symbol(sym.GT); }
  "=="             { return new Symbol(sym.EQ); }
  "!="             { return new Symbol(sym.NE); }

  // Arithmetic operators
  "+"              { return new Symbol(sym.PLUS); }
  "-"              { return new Symbol(sym.MINUS); }
  "*"              { return new Symbol(sym.TIMES); }
  "/"              { return new Symbol(sym.OVER); }

  // Assignment and punctuation
  "="              { return new Symbol(sym.ASSIGN); }
  ";"              { return new Symbol(sym.SEMI); }
  ","              { return new Symbol(sym.COMMA); }
  "("              { return new Symbol(sym.LPAREN); }
  ")"              { return new Symbol(sym.RPAREN); }
  "["              { return new Symbol(sym.LBRACKET); }
  "]"              { return new Symbol(sym.RBRACKET); }
  "{"              { return new Symbol(sym.LBRACE); }
  "}"              { return new Symbol(sym.RBRACE); }

  // Identifiers and numbers
  {ID}             { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
  {NUM}            { return new Symbol(sym.NUM, yyline, yycolumn, Integer.valueOf(yytext())); }

  [^]              { throw new RuntimeException("ERROR: illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }

}

// -------------------- RULES FOR COMMENT STATE --------------------

<COMMENT> {

  "*/"             { yybegin(YYINITIAL); }   // close comment and return to initial state

  \n               { /* ignore new line inside comment */ }

  [^*]+            { /* ignore comment content */ }
  "*"              { /* could be part of "*\/", keep scanning */ }

  <<EOF>>          { throw new RuntimeException("unclosed comment"); }

}
