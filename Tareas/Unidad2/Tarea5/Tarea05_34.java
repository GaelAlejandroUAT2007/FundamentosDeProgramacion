import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_34
 *
 * Enunciado: Pedir un número y calcular su factorial.
 */
public class Tarea05_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0;
        long fact = 0L;

        System.out.println("Introduzca un número (0 a 20):");
        n = sc.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Número fuera de rango (0 a 20)");
        } else {
            fact = 1;
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("El factorial de " + n + " es " + fact);
        }

        sc.close();
    }
}
