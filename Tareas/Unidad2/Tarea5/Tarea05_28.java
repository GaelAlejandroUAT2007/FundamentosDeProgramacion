import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_28
 *
 * Enunciado: Pedir números hasta que se teclee un 0, mostrar la suma de todos los
 * números introducidos.
 */
public class Tarea05_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, suma = 0;

        suma = 0;
        System.out.println("Introduzca un número (0 para terminar):");
        n = sc.nextInt();
        while (n != 0) {
            suma = suma + n;
            System.out.println("Introduzca un número (0 para terminar):");
            n = sc.nextInt();
        }
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
