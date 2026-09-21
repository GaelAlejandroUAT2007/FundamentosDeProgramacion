import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, volumen, radio;
        final double PI = Math.PI;

           System.out.println("Introduzca el valor del radio: ");
           radio = entrada.nextDouble();

           area = (4 * PI) * (radio * radio);
           volumen = ((4 * PI) * ((radio * radio) * radio)) / 3;

           System.out.println("El área de la esfera es: " + area);
           System.out.println("El volumen de la esfera es: " + volumen);
     }
}
