import java.util.Scanner;

public class VelocidadPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distancia, tiempo, velocidad;

          System.out.println("Ingrese la distancia recorrida en km: ");
          distancia = entrada.nextDouble();
          System.out.println("Ingrese el tiempo empleado en horas: ");
          tiempo = entrada.nextDouble();

          velocidad = distancia / tiempo;

          System.out.println("La velocidad promedio es: " + velocidad);
    }
}
