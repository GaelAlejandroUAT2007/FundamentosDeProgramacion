import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_44
 *
 * Enunciado: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
public class Tarea05_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, nota = 0;
        boolean susp = false;

        susp = false;
        for (i = 1; i <= 5; i++) {
            System.out.println("Introduzca la calificación " + i + ":");
            nota = sc.nextInt();
            if (nota < 5) {
                susp = true;
            }
        }
        if (susp) {
            System.out.println("Hay al menos un suspenso");
        } else {
            System.out.println("No hay suspensos");
        }

        sc.close();
    }
}
