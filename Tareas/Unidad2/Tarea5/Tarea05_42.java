import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_42
 *
 * Enunciado: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */
public class Tarea05_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, i = 0;
        double sueldo = 0.0, max = 0.0;

        System.out.println("¿Cuántos sueldos va a introducir?");
        n = sc.nextInt();
        if (n < 1) {
            System.out.println("N debe ser mayor o igual que 1");
        } else {
            System.out.println("Introduzca el sueldo 1:");
            sueldo = sc.nextDouble();
            max = sueldo;
            for (i = 2; i <= n; i++) {
                System.out.println("Introduzca el sueldo " + i + ":");
                sueldo = sc.nextDouble();
                if (sueldo > max) {
                    max = sueldo;
                }
            }
            System.out.println("El sueldo máximo es: " + max);
        }

        sc.close();
    }
}
