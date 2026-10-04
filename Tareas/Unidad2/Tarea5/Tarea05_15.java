import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_15
 *
 * Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 * Suponiendo todos los meses de 30 días.
 */
public class Tarea05_15 {
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
        if (a >= 1 && m >= 1 && m <= 12 && d >= 1 && d <= 30) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha NO es correcta");
        }

        sc.close();
    }
}
