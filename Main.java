import java.io.FileReader;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) {
        try {
            CMinus2 lexer = new CMinus2(new FileReader("tests//cminus//test1.cm"));
            parser p = new parser(lexer);
            Symbol result = p.parse();
            System.out.println(result);
            // Process the result (e.g., the root of your AST)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}