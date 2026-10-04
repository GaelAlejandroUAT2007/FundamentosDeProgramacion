import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_40
 *
 * Enunciado: Igual que el anterior pero suponiendo que no se introduce el precio por
 * litro. Solo existen tres productos: 1 → 0,6 €/litro, 2 → 3 €/litro y 3 → 1,25 €/litro.
 */
public class Tarea05_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, cod = 0, c600 = 0;
        double lit = 0.0, pre = 0.0, imp = 0.0, total = 0.0, litros1 = 0.0;

        total = 0;
        litros1 = 0;
        c600 = 0;
        for (i = 1; i <= 5; i++) {
            do {
                System.out.println("Factura " + i + " - código del artículo (1, 2 o 3):");
                cod = sc.nextInt();
                if (cod < 1 || cod > 3) {
                    System.out.println("Código no válido");
                }
            } while (!(cod >= 1 && cod <= 3));
            System.out.println("Factura " + i + " - litros vendidos:");
            lit = sc.nextDouble();
            switch (cod) {
                case 1:
                    pre = 0.6;
                    break;
                case 2:
                    pre = 3;
                    break;
                case 3:
                    pre = 1.25;
                    break;
            }
            imp = lit * pre;
            total = total + imp;
            if (cod == 1) {
                litros1 = litros1 + lit;
            }
            if (imp > 600) {
                c600 = c600 + 1;
            }
        }
        System.out.println("Facturación total: " + total);
        System.out.println("Litros del artículo 1: " + litros1);
        System.out.println("Facturas de más de 600 €: " + c600);

        sc.close();
    }
}
