import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_29
 *
 * Enunciado: Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
public class Tarea05_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int cont = 0;
        double n = 0.0, suma = 0.0, media = 0.0;

        suma = 0;
        cont = 0;
        System.out.println("Introduzca un número (negativo para terminar):");
        n = sc.nextDouble();
        while (n >= 0) {
            suma = suma + n;
            cont = cont + 1;
            System.out.println("Introduzca un número (negativo para terminar):");
            n = sc.nextDouble();
        }
        if (cont == 0) {
            System.out.println("No se introdujeron números");
        } else {
            media = suma / cont;
            System.out.println("La media es: " + media);
        }

        sc.close();
    }
}
