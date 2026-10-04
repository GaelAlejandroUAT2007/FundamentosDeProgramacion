import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_06
 *
 * Enunciado: Pedir dos números y decir si uno es múltiplo del otro.
 */
public class Tarea05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n1 = 0, n2 = 0;

        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número:");
        n2 = sc.nextInt();
        if ((n2 != 0 && n1 % n2 == 0) || (n1 != 0 && n2 % n1 == 0)) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }

        sc.close();
    }
}
