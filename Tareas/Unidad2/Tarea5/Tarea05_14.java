import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_14
 *
 * Enunciado: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
 * Bien...
 */
public class Tarea05_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int nota = 0;

        System.out.println("Introduzca una nota (0 a 10):");
        nota = sc.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota no válida (debe estar entre 0 y 10)");
                break;
        }

        sc.close();
    }
}
