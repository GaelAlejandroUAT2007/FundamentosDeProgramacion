import java.util.Scanner;

public class PropinaRestaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double consumo, porcentajePropina, propina, total;

           System.out.println("Ingrese el consumo: ");
           consumo = entrada.nextDouble();
           System.out.println("Ingrese el porcentaje de propina: ");
           porcentajePropina = entrada.nextDouble();

           propina = consumo * (porcentajePropina / 100);
           total = consumo + propina;

           System.out.println("La propina es: " + propina);
           System.out.println("El total a pagar es: " + total);
     }
}
