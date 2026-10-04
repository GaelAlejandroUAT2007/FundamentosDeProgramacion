import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_47
 *
 * Enunciado: Realiza una traza del siguiente algoritmo y muestra la salida generada por
 * pantalla:  PARA i ← 1 HASTA 3 { j ← i + 1; MIENTRAS j < 4 { escribir(j − i); j ← j + 1
 * } }
 */
public class Tarea05_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, j = 0;

        for (i = 1; i <= 3; i++) {
            j = i + 1;
            while (j < 4) {
                System.out.println((j - i));
                j = j + 1;
            }
        }

        sc.close();
    }
}
