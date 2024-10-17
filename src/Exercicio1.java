public class Exercicio1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num = 10;

        if (num < 0) {
            System.out.println("Valor inválido");

        } else {
            while (b < num) {
                int c = a + b;
                a = b;
                b = c;
            }
            if (b == num) {
                System.out.println("Número é Fibonacci");

            } else {
                System.out.println("Número não é Fibonacci");
            }
        }
    }
}