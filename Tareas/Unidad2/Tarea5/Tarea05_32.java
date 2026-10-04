import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_32
 *
 * Enunciado: Pedir 15 números y escribir la suma total.
 */
public class Tarea05_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, n = 0, suma = 0;

        suma = 0;
        for (i = 1; i <= 15; i++) {
            System.out.println("Introduzca el número " + i + ":");
            n = sc.nextInt();
            suma = suma + n;
        }
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
