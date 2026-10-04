import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_19
 *
 * Enunciado: Pedir dos fechas y mostrar el número de días que hay de diferencia.
 * Suponiendo todos los meses de 30 días.
 */
public class Tarea05_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int d1 = 0, m1 = 0, a1 = 0, d2 = 0, m2 = 0, a2 = 0, t1 = 0, t2 = 0, dif = 0;

        System.out.println("Fecha 1 - día:");
        d1 = sc.nextInt();
        System.out.println("Fecha 1 - mes:");
        m1 = sc.nextInt();
        System.out.println("Fecha 1 - año:");
        a1 = sc.nextInt();
        System.out.println("Fecha 2 - día:");
        d2 = sc.nextInt();
        System.out.println("Fecha 2 - mes:");
        m2 = sc.nextInt();
        System.out.println("Fecha 2 - año:");
        a2 = sc.nextInt();
        t1 = a1*360 + m1*30 + d1;
        t2 = a2*360 + m2*30 + d2;
        if (t2 >= t1) {
            dif = t2 - t1;
        } else {
            dif = t1 - t2;
        }
        System.out.println("Diferencia: " + dif + " días");

        sc.close();
    }
}
