import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_18
 *
 * Enunciado: Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de
 * días (febrero tiene siempre 28 días).
 */
public class Tarea05_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int d = 0, m = 0, a = 0, dm = 0;

        System.out.println("Introduce el día:");
        d = sc.nextInt();
        System.out.println("Introduce el mes:");
        m = sc.nextInt();
        System.out.println("Introduce el año:");
        a = sc.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dm = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dm = 30;
                break;
            default:
                dm = 28;
                break;
        }
        d = d + 1;
        if (d > dm) {
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
