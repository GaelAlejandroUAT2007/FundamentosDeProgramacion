import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_02
 *
 * Enunciado: Pedir el radio de un círculo y calcular su área. A = π·r².
 */
public class Tarea05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double r = 0.0, a = 0.0;

        System.out.println("Introduce el radio del círculo:");
        r = sc.nextDouble();
        if (r < 0) {
            System.out.println("El radio no puede ser negativo");
        } else {
            a = Math.PI * r * r;
            System.out.println("El área del círculo de radio " + r + " es: " + a);
        }

        sc.close();
    }
}
