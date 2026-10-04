import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_03
 *
 * Enunciado: Pedir el radio de una circunferencia y calcular su longitud. L = 2·π·r.
 */
public class Tarea05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double r = 0.0, l = 0.0;

        System.out.println("Introduce el radio de la circunferencia:");
        r = sc.nextDouble();
        if (r < 0) {
            System.out.println("El radio no puede ser negativo");
        } else {
            l = 2 * Math.PI * r;
            System.out.println("La longitud de la circunferencia de radio " + r + " es: " + l);
        }

        sc.close();
    }
}
