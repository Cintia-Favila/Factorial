import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Un Numero");
        int n = scanner.nextInt();
        long factorial = 1;

        if (n < 0) {
            System.out.println("El numero es negativo y no se puede calcular su factorial");
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}
