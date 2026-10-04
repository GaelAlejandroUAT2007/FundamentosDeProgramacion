import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_27
 *
 * Enunciado: Realizar un juego para adivinar un número. Pedir un número N y luego ir
 * pidiendo números indicando «mayor» o «menor» según sea mayor o menor con respecto a N.
 * El proceso termina cuando el usuario acierta.
 */
public class Tarea05_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, x = 0, intentos = 0;

        intentos = 0;
        System.out.println("Jugador 1, introduzca el número a adivinar:");
        n = sc.nextInt();
        do {
            System.out.println("Jugador 2, introduzca un número:");
            x = sc.nextInt();
            intentos = intentos + 1;
            if (x > n) {
                System.out.println("Mayor");
            } else if (x < n) {
                System.out.println("Menor");
            }
        } while (!(x == n));
        System.out.println("¡Acertó! Número de intentos: " + intentos);

        sc.close();
    }
}
