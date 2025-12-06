import java.io.*;
import Cminus;


public class Main {
    
    public static void main(String[] args) {
        try {
            parser p = new parser(new Cminus(args[0]));
            Object result = p.parse().value;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
