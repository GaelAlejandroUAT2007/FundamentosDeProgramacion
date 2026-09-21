import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, estatura, imc;

          System.out.println("Ingrese el peso en kilogramos: ");
          peso = entrada.nextDouble();
          System.out.println("Ingrese la estatura en metros: ");
          estatura = entrada.nextDouble();

          imc = peso / (estatura * estatura);

          System.out.println("El índice de masa corporal es: " + imc);
     }
}
