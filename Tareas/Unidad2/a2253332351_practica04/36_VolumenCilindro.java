import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159265358979323846;
        double radio;
        double altura;
        double aBase;
        double aLateral;
        double aTotal;
        double volumen;

        System.out.print("Ingrese el radio del cilindro: ");
        radio = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        altura = entrada.nextDouble();

        aBase = PI * (radio * radio);
        aLateral = 2 * PI * radio * altura;
        aTotal = aLateral + (2 * aBase);
        volumen = aBase * altura;

        System.out.println("El área de la base es: " + aBase);
        System.out.println("El área lateral es: " + aLateral);
        System.out.println("El área total es: " + aTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
