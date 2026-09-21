import java.util.Scanner;

public class TrianguloSuperficie {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3, area;

           System.out.println("Ingresa la cordenada de x1: ");
           x1 = entrada.nextDouble();
           System.out.println("Ingresa la cordenada de y1: ");
           y1 = entrada.nextDouble();
           System.out.println("Ingresa la cordenada de x2: ");
           x2 = entrada.nextDouble();
           System.out.println("Ingresa la cordenada de y2: ");
           y2 = entrada.nextDouble();
           System.out.println("Ingresa la cordenada de x3: ");
           x3 = entrada.nextDouble();
           System.out.println("Ingresa la cordenada de y3: ");
           y3 = entrada.nextDouble();

        area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2
* y1))) / 2;

           System.out.println("El área del triángulo es: " + area);
     }
}
