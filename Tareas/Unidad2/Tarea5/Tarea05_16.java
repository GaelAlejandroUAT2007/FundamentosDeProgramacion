import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_16
 *
 * Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con
 * meses de 28, 30 y 31 días. Sin años bisiestos.
 */
public class Tarea05_16 {
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
        dm = 0;
        if (a >= 1) {
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
                case 2:
                    dm = 28;
                    break;
            }
        }
        if (d >= 1 && d <= dm) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha NO es correcta");
        }

        sc.close();
    }
}
