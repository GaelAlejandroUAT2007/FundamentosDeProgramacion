import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_35
 *
 * Enunciado: Pedir 10 números. Mostrar la media de los números positivos, la media de
 * los números negativos y la cantidad de ceros.
 */
public class Tarea05_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, cp = 0, cn = 0, cz = 0;
        double n = 0.0, sp = 0.0, sn = 0.0;

        sp = 0;
        sn = 0;
        cp = 0;
        cn = 0;
        cz = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Introduzca el número " + i + ":");
            n = sc.nextDouble();
            if (n > 0) {
                sp = sp + n;
                cp = cp + 1;
            } else if (n < 0) {
                sn = sn + n;
                cn = cn + 1;
            } else {
                cz = cz + 1;
            }
        }
        if (cp > 0) {
            System.out.println("Media de positivos: " + (sp / cp));
        } else {
            System.out.println("No hay números positivos");
        }
        if (cn > 0) {
            System.out.println("Media de negativos: " + (sn / cn));
        } else {
            System.out.println("No hay números negativos");
        }
        System.out.println("Cantidad de ceros: " + cz);

        sc.close();
    }
}
