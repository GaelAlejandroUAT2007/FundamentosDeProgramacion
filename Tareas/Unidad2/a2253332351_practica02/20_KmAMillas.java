import java.util.Scanner;

public class KmAMillas {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         double kilometros, millas;

          System.out.println("Ingrese la distancia en kilómetros: ");
          kilometros = entrada.nextDouble();

          millas = kilometros * 0.621371;

          System.out.println("La distancia equivalente en millas es: " + millas);
     }
}
