import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_46
 *
 * Enunciado: Realiza detenidamente una traza al siguiente programa y muestra cuál sería
 * la salida por pantalla:  PARA i ← 1 HASTA 4 { PARA j ← 3 HASTA 0 INC −1 { suma ← i·10
 * + j; escribir(suma) } }
 */
public class Tarea05_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int suma = 0, i = 0, j = 0;

        for (i = 1; i <= 4; i++) {
            for (j = 3; j >= 0; j--) {
                suma = i*10 + j;
                System.out.println(suma);
            }
        }

        sc.close();
    }
}
