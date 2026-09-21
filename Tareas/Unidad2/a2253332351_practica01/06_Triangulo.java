import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3, distancia1, distancia2, distancia3,
perimetro;

           System.out.println("Ingresa la coordenada de x1: ");
           x1 = entrada.nextDouble();
           System.out.println("Ingresa la coordenada de y1: ");
           y1 = entrada.nextDouble();
           System.out.println("Ingresa la coordenada de x2: ");
           x2 = entrada.nextDouble();
           System.out.println("Ingresa la coordenada de y2: ");
           y2 = entrada.nextDouble();
           System.out.println("Ingresa la coordenada de x3: ");
           x3 = entrada.nextDouble();
           System.out.println("Ingresa la coordenada de y3: ");
           y3 = entrada.nextDouble();

           distancia1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
           distancia2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
           distancia3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
           perimetro = distancia1 + distancia2 + distancia3;

           System.out.println("El perímetro del triángulo es: " + perimetro);
     }
}
