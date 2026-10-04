import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_05
 *
 * Enunciado: Pedir un número e indicar si es positivo o negativo.
 */
public class Tarea05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int num = 0;

        System.out.println("Introduce un número:");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        } else if (num > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Cero");
        }

        sc.close();
    }
}
