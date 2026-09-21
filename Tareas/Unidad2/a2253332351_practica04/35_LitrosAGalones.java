import java.util.Scanner;

public class LitrosAGalones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double litros;
        double galones;

        System.out.print("Ingrese la cantidad de litros: ");
        litros = entrada.nextDouble();

        galones = litros * 0.264172;

        System.out.println("La cantidad equivalente en galones es: " + galones);
    }
}
