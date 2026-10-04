import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_10
 *
 * Enunciado: Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Tarea05_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int a = 0, b = 0, c = 0, aux = 0;

        System.out.println("Introduce el primer número:");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        b = sc.nextInt();
        System.out.println("Introduce el tercer número:");
        c = sc.nextInt();
        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }
        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println("De mayor a menor: " + a + " " + b + " " + c);

        sc.close();
    }
}
