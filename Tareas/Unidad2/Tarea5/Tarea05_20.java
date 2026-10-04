import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_20
 *
 * Enunciado: Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en
 * el segundo siguiente.
 */
public class Tarea05_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int h = 0, mi = 0, s = 0;

        System.out.println("Introduce las horas:");
        h = sc.nextInt();
        System.out.println("Introduce los minutos:");
        mi = sc.nextInt();
        System.out.println("Introduce los segundos:");
        s = sc.nextInt();
        s = s + 1;
        if (s == 60) {
            s = 0;
            mi = mi + 1;
            if (mi == 60) {
                mi = 0;
                h = h + 1;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.print("Hora siguiente: ");
        if (h < 10) {
            System.out.print("0");
        }
        System.out.print(h);
        System.out.print(":");
        if (mi < 10) {
            System.out.print("0");
        }
        System.out.print(mi);
        System.out.print(":");
        if (s < 10) {
            System.out.print("0");
        }
        System.out.println(s);

        sc.close();
    }
}
