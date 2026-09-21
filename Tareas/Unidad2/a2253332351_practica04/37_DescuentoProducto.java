import java.util.Scanner;

public class DescuentoProducto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio;
        double porcentaje;
        double descuento;
        double totalPagar;

        System.out.print("Ingrese el precio del producto: ");
        precio = entrada.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        porcentaje = entrada.nextDouble();

        descuento = precio * (porcentaje / 100);
        totalPagar = precio - descuento;

        System.out.println("El descuento es: " + descuento);
        System.out.println("El total a pagar es: " + totalPagar);
    }
}
