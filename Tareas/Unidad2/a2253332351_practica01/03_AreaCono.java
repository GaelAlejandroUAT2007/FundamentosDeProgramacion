import java.util.Scanner;

public class AreaCono {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, generatriz, altura;
        double aBase, aLado, aTotal, volumen;
        final double PI = Math.PI;

            System.out.println("Ingresa el radio del cono: ");
            radio = entrada.nextDouble();
            System.out.println("Ingresa la generatriz del cono: ");
            generatriz = entrada.nextDouble();
            System.out.println("Ingresa la altura del cono: ");
            altura = entrada.nextDouble();

            aBase = PI * (radio * radio);
            aLado = PI * radio * generatriz;
            aTotal = aBase + aLado;
            volumen = (aBase * altura) / 3;

            System.out.println("El área de la base es: " + aBase);
            System.out.println("El área lateral es: " + aLado);
            System.out.println("El área total es: " + aTotal);
            System.out.println("El volumen es: " + volumen);
     }
}
