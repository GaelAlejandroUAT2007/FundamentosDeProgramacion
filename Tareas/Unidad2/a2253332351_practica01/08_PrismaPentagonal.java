import java.util.Scanner;

public class PrismaPentagonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double perimetro, apotema, altura, aTotal, aLado, aBase, volumen;

            System.out.println("Ingresa el perimetro de la Base: ");
            perimetro = entrada.nextDouble();
            System.out.println("Ingresa la apotema: ");
            apotema = entrada.nextDouble();
            System.out.println("Ingresa la altura: ");
            altura = entrada.nextDouble();

            aBase = (perimetro * apotema) / 2;
            aLado = perimetro * altura;
            aTotal = (2 * aBase) + aLado;
            volumen = aBase * altura;

            System.out.println("El área de la base es: " + aBase);
            System.out.println("El área lateral es: " + aLado);
            System.out.println("El área total es: " + aTotal);
            System.out.println("El volumen del prisma pentagonal es: " + volumen);
      }
}
