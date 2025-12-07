import java.io.FileReader;
import java_cup.runtime.Symbol;

public class Test {
    public static void main(String[] args) {
        try {
            CMinus2 lexer = new CMinus2(new FileReader("test.cm"));

            Symbol token;
            while ((token = lexer.next_token()).sym != sym.EOF) {
                System.out.println("Token: " + token.sym + " Value: " + token.value);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
