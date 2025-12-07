import java.io.FileReader;
import java_cup.runtime.Symbol;
import ast.*;

public class Main {
    public static void main(String[] args) {
        try {
            parser p = new parser(new CMinus2(new FileReader(args[0])));
            Symbol result = p.parse();
            ProgramNode program = (ProgramNode) result.value;
            if (program != null) {
                System.out.println("=== AST ===");
                program.print();
            } else {
                System.out.println("Erro de Parse");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}