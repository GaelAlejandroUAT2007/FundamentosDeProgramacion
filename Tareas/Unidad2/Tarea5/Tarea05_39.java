import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_39
 *
 * Enunciado: Una empresa de venta de desinfectantes necesita gestionar facturas. En cada
 * factura figura: código del artículo, cantidad vendida en litros y precio por litro. De
 * 5 facturas, mostrar: facturación total, litros vendidos del artículo 1 y cuántas
 * facturas fueron de más de 600 €.
 */
public class Tarea05_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, cod = 0, c600 = 0;
        double lit = 0.0, pre = 0.0, imp = 0.0, total = 0.0, litros1 = 0.0;

        total = 0;
        litros1 = 0;
        c600 = 0;
        for (i = 1; i <= 5; i++) {
            System.out.println("Factura " + i + " - código del artículo:");
            cod = sc.nextInt();
            System.out.println("Factura " + i + " - litros vendidos:");
            lit = sc.nextDouble();
            System.out.println("Factura " + i + " - precio por litro:");
            pre = sc.nextDouble();
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
