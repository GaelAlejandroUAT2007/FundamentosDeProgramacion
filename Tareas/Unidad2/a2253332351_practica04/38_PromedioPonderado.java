import java.util.Scanner;

public class PromedioPonderado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double peso1 = 0.4;
        final double peso2 = 0.6;
        double nota1;
        double nota2;
        double promedio;

        System.out.print("Ingrese la primera calificación (peso 40%): ");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la segunda calificación (peso 60%): ");
        nota2 = entrada.nextDouble();

        promedio = (nota1 * peso1) + (nota2 * peso2);

        System.out.println("El promedio ponderado es: " + promedio);
    }
}
