
# C- Scanner (JFlex)

Esse repositório contém um **analisador léxico para a linguagem C-**, implementado usando [JFlex](https://jflex.de).
A gramática é uma simplificação da linguagem C (C-) definido por uma BNF.

## 📂 Estrutura do Projeto
	.
    ├── Calculadora.flex	# JFlex specification for the scanner (Calculadora)
    ├── Calculadora.java	# Generated scanner (after running JFlex)
    ├── CMinus.flex			# JFlex specification for the scanner (C-)
    ├── CMinus.java			# Generated scanner (after running JFlex)
    └── tests/				# Example input programs in C- and for the calculator example
	│   ├── calculadora/
	│   └── cminus/
	├── .gitignore          # Gitignore file
	└── README.md			# Markdown documentation file

## ⚙️ Requisitos

- Java (JDK 8 ou superior)
- [JFlex 1.9.1](https://jflex.de/download.html)

## 🚀 Como compilar
### Calculadora
 1. Gerar o Scanner com o JFlex:
	```bash 
	 jflex-1.9.1/bin/jflex Calculadora.flex
	```
	Isso irá gerar um arquivo `Calculadora.java`
 2. Compilar o código Java gerado
	```bash 
	 javac Calculadora.java
	```
### C-
 1. Gerar o Scanner com o JFlex:
	```bash 
	 jflex-1.9.1/bin/jflex CMinus.flex
	```
	Isso irá gerar um arquivo `Calculadora.java`
 2. Compilar o código Java gerado
	```bash 
	 javac CMinus.java
	```
## ▶️ Como executar
É possível executar o scanner em um arquivo de imput da seguinte forma:
```bash 
java CMinus tests/cminus/test1.cm [> {output_filename}.txt]
```
Alterando o caminho `cminus/test1.cm` com o arquivo que deseja testar e, caso deseje, definindo um arquivo de output (ex.: `> out.txt`)

## 📝Exemplo de Uso
### Exemplo de input
```C-
void main(void)
{
    int i;

    i = 0;

    while (i < 10)
    {
        i = i + 1;
        output(i);
    }
}
```
### Exemplo de output
```txt
(void, <VOID>), found on position (0, 0)
(main, <ID>), found on position (0, 5)
((, <LPAREN>), found on position (0, 9)
(void, <VOID>), found on position (0, 10)
(), <RPAREN>), found on position (0, 14)
({, <LBRACE>), found on position (1, 0)
(int, <INT>), found on position (2, 4)
(i, <ID>), found on position (2, 8)
(;, <SEMI>), found on position (2, 9)
(i, <ID>), found on position (4, 4)
(=, <ASSIGN>), found on position (4, 6)
(0, <NUM>), found on position (4, 8)
(;, <SEMI>), found on position (4, 9)
(while, <WHILE>), found on position (6, 4)
((, <LPAREN>), found on position (6, 10)
(i, <ID>), found on position (6, 11)
(<, <LT>), found on position (6, 13)
(10, <NUM>), found on position (6, 15)
(), <RPAREN>), found on position (6, 17)
({, <LBRACE>), found on position (7, 4)
(i, <ID>), found on position (8, 8)
(=, <ASSIGN>), found on position (8, 10)
(i, <ID>), found on position (8, 12)
(+, <PLUS>), found on position (8, 14)
(1, <NUM>), found on position (8, 16)
(;, <SEMI>), found on position (8, 17)
(output, <ID>), found on position (9, 8)
((, <LPAREN>), found on position (9, 14)
(i, <ID>), found on position (9, 15)
(), <RPAREN>), found on position (9, 16)
(;, <SEMI>), found on position (9, 17)
(}, <RBRACE>), found on position (10, 4)
(}, <RBRACE>), found on position (11, 0)
```
## 🧪 Testes

Alguns exemplos de programas para teste dentro da pasta `tests/cminus`:
-   `test1.cm` – Algoritmo de euclides
-   `test2.cm` – Selection sort
-   `test3.cm` – Definição de Arrays e Funções
-   `test4.cm` - 
-   `test5.cm` – Loops
-   `test6.cm` – Output correto mas incorreto sintaticaente
-   `test7.cm` – Caso de erro (Comentário não fechado)
-   `test8.cm` – Caso de erro (Caracter inválido)
-   `test9.cm` – Caso de erro (Caracter inválido em ID)

## 📖 Referências
-   [JFlex Official Website](https://jflex.de)
-   Dragon Book: _Compilers – Principles, Techniques, and Tools_
