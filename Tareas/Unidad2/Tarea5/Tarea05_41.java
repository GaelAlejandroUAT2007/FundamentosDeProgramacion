import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_41
 *
 * Enunciado: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados
 * (=4) y suspensos.
 */
public class Tarea05_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, nota = 0, ap = 0, co = 0, su = 0;

        ap = 0;
        co = 0;
        su = 0;
        for (i = 1; i <= 6; i++) {
            System.out.println("Introduzca la nota " + i + ":");
            nota = sc.nextInt();
            if (nota >= 5) {
                ap = ap + 1;
            } else if (nota == 4) {
                co = co + 1;
            } else {
                su = su + 1;
            }
        }
        System.out.println("Aprobados: " + ap);
        System.out.println("Condicionados: " + co);
        System.out.println("Suspensos: " + su);

        sc.close();
    }
}
