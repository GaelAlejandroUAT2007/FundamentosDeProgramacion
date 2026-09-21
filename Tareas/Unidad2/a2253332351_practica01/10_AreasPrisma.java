import java.util.Scanner;

public class AreasPrisma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double perimetro, apotema, altura, aTotal, aLateral, aBase;

           System.out.println("Ingresa el perimetro de la Base: ");
           perimetro = entrada.nextDouble();
           System.out.println("Ingresa la apotema: ");
           apotema = entrada.nextDouble();
           System.out.println("Ingresa la altura: ");
           altura = entrada.nextDouble();

           aBase = (perimetro * apotema) / 2;
           aLateral = (perimetro * altura) / 2;
           aTotal = (2 * aBase) + aLateral;

           System.out.println("El área de la base es: " + aBase);
           System.out.println("El área lateral es: " + aLateral);
           System.out.println("El área total es: " + aTotal);
     }
}
