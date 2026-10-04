import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_36
 *
 * Enunciado: Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de 1000 €.
 */
public class Tarea05_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, cont = 0;
        double sueldo = 0.0, suma = 0.0;

        suma = 0;
        cont = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Introduzca el sueldo " + i + ":");
            sueldo = sc.nextDouble();
            suma = suma + sueldo;
            if (sueldo > 1000) {
                cont = cont + 1;
            }
        }
        System.out.println("Suma de sueldos: " + suma);
        System.out.println("Sueldos mayores de 1000: " + cont);

        sc.close();
    }
}
