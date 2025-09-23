%%

program = {declaration-list}
declaration-list = {declaration-list} {declaration} | {declaration}
declaration = {var-declaration} | {fun-declaration}
var-declaration = {type-specifier} UD ; | {type-specifier} ID [NUM] ;
type-specifier = int | void
fun-declaration

%%