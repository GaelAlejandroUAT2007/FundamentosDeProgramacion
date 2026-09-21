import java.util.Scanner;

public class AreaCirculoDiametro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double diametro, radio, area, circunferencia;
        final double PI = Math.PI;

           System.out.println("Ingrese el diámetro del círculo: ");
           diametro = entrada.nextDouble();

           radio = diametro / 2;
           area = PI * (radio * radio);
           circunferencia = 2 * PI * radio;

           System.out.println("El radio es: " + radio);
           System.out.println("El área es: " + area);
           System.out.println("La circunferencia es: " + circunferencia);
     }
}
