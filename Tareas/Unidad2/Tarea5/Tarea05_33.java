import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_33
 *
 * Enunciado: Diseñar un programa que muestre el producto de los 10 primeros números
 * impares.
 */
public class Tarea05_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, prod = 0;

        prod = 1;
        for (i = 1; i <= 10; i++) {
            prod = prod * (2*i - 1);
        }
        System.out.println("El producto de los 10 primeros impares es: " + prod);

        sc.close();
    }
}
