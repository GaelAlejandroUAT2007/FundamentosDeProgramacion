import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_22
 *
 * Enunciado: Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
 * mostrar: cincuenta y seis.
 */
public class Tarea05_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = 0, d = 0, u = 0;
        String ds = "", us = "";

        System.out.println("Introduce un número de 0 a 99:");
        n = sc.nextInt();
        if (n < 0 || n > 99) {
            System.out.println("Número fuera de rango (0 a 99)");
        } else {
            d = n / 10;
            u = n % 10;
            if (n < 30) {
                switch (n) {
                    case 0:
                        System.out.println("cero");
                        break;
                    case 1:
                        System.out.println("uno");
                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;
                    case 7:
                        System.out.println("siete");
                        break;
                    case 8:
                        System.out.println("ocho");
                        break;
                    case 9:
                        System.out.println("nueve");
                        break;
                    case 10:
                        System.out.println("diez");
                        break;
                    case 11:
                        System.out.println("once");
                        break;
                    case 12:
                        System.out.println("doce");
                        break;
                    case 13:
                        System.out.println("trece");
                        break;
                    case 14:
                        System.out.println("catorce");
                        break;
                    case 15:
                        System.out.println("quince");
                        break;
                    case 16:
                        System.out.println("dieciséis");
                        break;
                    case 17:
                        System.out.println("diecisiete");
                        break;
                    case 18:
                        System.out.println("dieciocho");
                        break;
                    case 19:
                        System.out.println("diecinueve");
                        break;
                    case 20:
                        System.out.println("veinte");
                        break;
                    case 21:
                        System.out.println("veintiuno");
                        break;
                    case 22:
                        System.out.println("veintidós");
                        break;
                    case 23:
                        System.out.println("veintitrés");
                        break;
                    case 24:
                        System.out.println("veinticuatro");
                        break;
                    case 25:
                        System.out.println("veinticinco");
                        break;
                    case 26:
                        System.out.println("veintiséis");
                        break;
                    case 27:
                        System.out.println("veintisiete");
                        break;
                    case 28:
                        System.out.println("veintiocho");
                        break;
                    case 29:
                        System.out.println("veintinueve");
                        break;
                }
            } else {
                switch (d) {
                    case 3:
                        ds = "treinta";
                        break;
                    case 4:
                        ds = "cuarenta";
                        break;
                    case 5:
                        ds = "cincuenta";
                        break;
                    case 6:
                        ds = "sesenta";
                        break;
                    case 7:
                        ds = "setenta";
                        break;
                    case 8:
                        ds = "ochenta";
                        break;
                    case 9:
                        ds = "noventa";
                        break;
                }
                if (u == 0) {
                    System.out.println(ds);
                } else {
                    switch (u) {
                        case 1:
                            us = "uno";
                            break;
                        case 2:
                            us = "dos";
                            break;
                        case 3:
                            us = "tres";
                            break;
                        case 4:
                            us = "cuatro";
                            break;
                        case 5:
                            us = "cinco";
                            break;
                        case 6:
                            us = "seis";
                            break;
                        case 7:
                            us = "siete";
                            break;
                        case 8:
                            us = "ocho";
                            break;
                        case 9:
                            us = "nueve";
                            break;
                    }
                    System.out.println("" + ds + " y " + us);
                }
            }
        }

        sc.close();
    }
}
