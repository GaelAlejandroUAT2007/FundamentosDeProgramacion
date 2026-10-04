import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_50
 *
 * Enunciado: Mostrar un contador de 5 dígitos (X-X-X-X-X) que vaya de 0-0-0-0-0 a
 * 9-9-9-9-9, con la particularidad de que cada vez que aparezca un 3 se sustituya por
 * una E.
 */
public class Tarea05_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        String ta = "", tb = "", tc = "", td = "", te = "";

        for (a = 0; a <= 9; a++) {
            if (a == 3) {
                ta = "E";
            } else {
                ta = String.valueOf(a);
            }
            for (b = 0; b <= 9; b++) {
                if (b == 3) {
                    tb = "E";
                } else {
                    tb = String.valueOf(b);
                }
                for (c = 0; c <= 9; c++) {
                    if (c == 3) {
                        tc = "E";
                    } else {
                        tc = String.valueOf(c);
                    }
                    for (d = 0; d <= 9; d++) {
                        if (d == 3) {
                            td = "E";
                        } else {
                            td = String.valueOf(d);
                        }
                        for (e = 0; e <= 9; e++) {
                            if (e == 3) {
                                te = "E";
                            } else {
                                te = String.valueOf(e);
                            }
                            System.out.println("" + ta + "-" + tb + "-" + tc + "-" + td + "-" + te);
                        }
                    }
                }
            }
        }

        sc.close();
    }
}
