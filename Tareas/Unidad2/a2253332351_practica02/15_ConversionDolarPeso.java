import java.util.Scanner;

public class ConversionDolarPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dolares, tipoCambio, pesos;

         System.out.println("Ingrese la cantidad en dólares: ");
         dolares = entrada.nextDouble();
         System.out.println("Ingrese el tipo de cambio: ");
         tipoCambio = entrada.nextDouble();

         pesos = dolares * tipoCambio;

         System.out.println("La cantidad equivalente en pesos es: " + pesos);
    }
}
