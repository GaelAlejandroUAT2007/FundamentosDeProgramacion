import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_17
 *
 * Enunciado: Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
 * siguiente. Suponer que todos los meses tienen 30 días.
 */
public class Tarea05_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int d = 0, m = 0, a = 0;

        System.out.println("Introduce el día:");
        d = sc.nextInt();
        System.out.println("Introduce el mes:");
        m = sc.nextInt();
        System.out.println("Introduce el año:");
        a = sc.nextInt();
        d = d + 1;
        if (d > 30) {
            d = 1;
            m = m + 1;
            if (m > 12) {
                m = 1;
                a = a + 1;
            }
        }
        System.out.println("Fecha del día siguiente: " + d + "/" + m + "/" + a);

        sc.close();
    }
}
