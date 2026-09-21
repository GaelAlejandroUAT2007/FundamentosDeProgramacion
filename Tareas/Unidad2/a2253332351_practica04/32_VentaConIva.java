// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VentaConIva {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Cantidad vendida: ");
        int cantidad = Integer.parseInt(entrada.readLine());

        System.out.print("Precio unitario: ");
        double precioUnitario = Double.parseDouble(entrada.readLine());

        double subtotal = cantidad * precioUnitario;
        double iva = subtotal * 0.16;
        double total = subtotal + iva;

        System.out.println("El subtotal es: " + subtotal);
        System.out.println("El iva es: " + iva);
        System.out.println("El total es: " + total);
    }
}
