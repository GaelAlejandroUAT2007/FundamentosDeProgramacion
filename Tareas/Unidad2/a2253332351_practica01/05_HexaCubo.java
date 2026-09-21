import java.util.Scanner;

public class HexaCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, aBase, aLado, aTotal, volumen;

           System.out.println("Ingrese el valor del lado del Hexaedro o Cubo: ");
           lado = entrada.nextDouble();

           aBase = lado * lado;
           aLado = 4 * (lado * lado);
           aTotal = 6 * lado * lado;
           volumen = lado * lado * lado;

           System.out.println("El Área de la Base es: " + aBase);
           System.out.println("El Área Lateral es: " + aLado);
           System.out.println("El Área Total es: " + aTotal);
           System.out.println("El Volumen es: " + volumen);
     }
}
