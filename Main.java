import java.io.FileReader;
import java_cup.runtime.Symbol;

public class Main {
    public static void main(String[] args) {
        try {
            parser p = new parser(new CMinus2(new FileReader(args[0])));
            Object result = p.parse();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}