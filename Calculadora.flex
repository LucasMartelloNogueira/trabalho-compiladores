
%%

%standalone
%class Calculadora
%line
%column

%{
  String word;
%}


WhiteSpace = \s
Integer = [0-9][0-9]*
Float = [0-9]*\.[0-9]*
SumOp = \+
MinusOp = \-
MultOp = \*
DivOp = \/
WholeDivOp = \/\/
ExpOp = \*\*
OpenPar = \(
asdjfasjkldfh = {ClosePar}
ClosePar = \)



%%

<YYINITIAL> {
  {WhiteSpace}  {}
  
  {Integer}     { System.out.println(String.format("token: (%s, <NUM_INT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {Float}       { System.out.println(String.format("token: (%s, <NUM_FLOAT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  
  {SumOp}       { System.out.println(String.format("token: (%s, <SUM_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {MinusOp}     { System.out.println(String.format("token: (%s, <MINUS_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {MultOp}      { System.out.println(String.format("token: (%s, <MULTIPLICATION_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {DivOp}       { System.out.println(String.format("token: (%s, <DIVISION_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {WholeDivOp}  { System.out.println(String.format("token: (%s, <WHOLE_DIVISION_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {ExpOp}       { System.out.println(String.format("token: (%s, <EXP_OP>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {OpenPar}     { System.out.println(String.format("token: (%s, <OPEN_PARENTHESIS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {ClosePar}    { System.out.println(String.format("token: (%s, <CLOSE_PARENTHESIS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }

}

[^]           { System.out.println(String.format("Illegal character %s on position: (%d, %d)", yytext(), yyline, yycolumn)); throw new Error(""); }


