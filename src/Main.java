import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if(args[0].equals("subtrair")) {
            minus(x, y);
        } else if(args[0].equals("multiplicar")) {
            multiply(x, y);
        } else if(args[0].equals("dividir")) {
            divide(x, y);
        }

    }
    public static void sum(int x, int y) {
        System.out.println(x + y);
    }
    public static void minus(int x, int y) {
        System.out.println(x - y);
    }
    public static void multiply(int x, int y) {
        System.out.println(x * y);
    }
    public static void divide(int x, int y) {
        System.out.println(x / y);
    }
}

// javac Main.java
// java Main. java somar, subtrair, multiplicar, dividir > 5 8 // numero exemplo
