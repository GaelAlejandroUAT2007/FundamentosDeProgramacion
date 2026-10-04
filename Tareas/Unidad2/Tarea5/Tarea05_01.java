import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_01
 *
 * Enunciado: Pedir los coeficientes de una ecuación de 2º grado y mostrar sus soluciones
 * reales. Si no existen, debe indicarlo.
 */
public class Tarea05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a = 0.0, b = 0.0, c = 0.0, d = 0.0, x1 = 0.0, x2 = 0.0;

        System.out.println("Introduzca primer coeficiente (a):");
        a = sc.nextDouble();
        System.out.println("Introduzca segundo coeficiente (b):");
        b = sc.nextDouble();
        System.out.println("Introduzca tercer coeficiente (c):");
        c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Error: el coeficiente a debe ser diferente de cero");
        } else {
            d = b*b - 4*a*c;
            if (d < 0) {
                System.out.println("No existen soluciones reales");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2*a);
                x2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }

        sc.close();
    }
}
