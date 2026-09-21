import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area, perimetro;

           System.out.println("Ingrese la base del rectángulo: ");
           base = entrada.nextDouble();
           System.out.println("Ingrese la altura del rectángulo: ");
           altura = entrada.nextDouble();

           area = base * altura;
           perimetro = 2 * (base + altura);

           System.out.println("El área es: " + area);
           System.out.println("El perímetro es: " + perimetro);
     }
}
