%%

%standalone
%class CMinus
%line
%column

whitespace = \s
open-comment = \/\*
close-comment = \*\/
program = {declaration-list}
declaration-list = {declaration-list} {declaration} | {declaration}
declaration = {var-declaration} | {fun-declaration}
var-declaration = {type-specifier} {ID} ; | {type-specifier} {ID} {open-brac} {NUM} {close-brac} ;
type-specifier = int | void
fun-declaration = {type-specifier} {ID} {open-par} {params} {close-par} {compound-stmt}
params = {param-list} | void
param-list = {param-list} , {param} | {param}
param = {type-specifier} {ID} | {type-specifier} {ID} {open-brac} {close-brac}
compound-stmt = {open-curlybrac} {local-declarations} {statement-list} {close-curlybrac}
local-declarations = {local-declarations} {var-declarations} | {whitespace}
statement-list = {statement-list} {statement} | {whitespace}
statement = {expression-stmt} | {compound-stmt} | {selection-stmt} | {iteration-stmt} | {return-stmt}
expression-stmt = {expression} ; | ;
selection-stmt = if {open-par} {expression} {close-par} {statement} | if {open-par} {expression} {close-par} {statement} else {statement}
iteration-stmt = while {open-par} {expression} {close-par} {statement}
return-stmt = return ; | return {expression} ;
expression = {var} {attr} {expression} | {simple-expression}
var = {ID} | {ID} {open-brac} {expression} {close-brac}
simple-expression = {additive-expression} {relop} {additive-expression} | {additive-expression}
relop = \<\= | \< | \> | \>\= | \=\= | !\=
additive-expression = {additive-expression} {addop} {term} | {term}
addop = \+ | \-
term = {term} {mulop} {factor} | {factor}
mulop = \* | \/
factor = {open-par} {expression} {close-par} | {var} | {call} | {NUM}
call = {ID} {open-par} {args} {close-par}
args = {arg-list} | {whitespace}
arg-list = {arg-list} , {expression} | {expression}
open-curlybrac = \{
close-curlybrac = \}
open-brac = \[
close-brac = \]
open-par = \(
close-par = \)
attr = \=
ID = {letter}{letter}*
NUM = {digit}{digit}*
letter = [a-zA-Z]
digit = [0-9]

%%

<YYINITIAL> {
  {whitespace}      {}
  {open-comment}    { System.out.println(String.format("token: (%s, <OPEN_COMMENT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {close-comment}   { System.out.println(String.format("token: (%s, <CLOSE_COMMENT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }


  {relop}
  {open-curlybrac}  { System.out.println(String.format("token: (%s, <OPEN_CBRACKETS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {open-curlybrac}  { System.out.println(String.format("token: (%s, <CLOSE_CBRACKETS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {open-brac}       { System.out.println(String.format("token: (%s, <OPEN_BRACKETS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {close-brac}      { System.out.println(String.format("token: (%s, <CLOSE_BRACKETS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {open-par}        { System.out.println(String.format("token: (%s, <OPEN_PARENTHESIS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {close-par}       { System.out.println(String.format("token: (%s, <CLOSE_PARENTHESIS>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {attr}            { System.out.println(String.format("token: (%s, <EQUAL>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {ID}              { System.out.println(String.format("token: (%s, <ID>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
  {NUM}             { System.out.println(String.format("token: (%s, <NUM_INT>), found on position (%d, %d)", yytext(), yyline, yycolumn)); }
}

[^]           { System.out.println(String.format("Illegal character %s on position: (%d, %d)", yytext(), yyline, yycolumn)); throw new Error(""); }