import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

          System.out.println("Ingrese la primera calificación: ");
          nota1 = entrada.nextDouble();
          System.out.println("Ingrese la segunda calificación: ");
          nota2 = entrada.nextDouble();
          System.out.println("Ingrese la tercera calificación: ");
          nota3 = entrada.nextDouble();

          promedio = (nota1 + nota2 + nota3) / 3;

          System.out.println("El promedio es: " + promedio);
    }
}
