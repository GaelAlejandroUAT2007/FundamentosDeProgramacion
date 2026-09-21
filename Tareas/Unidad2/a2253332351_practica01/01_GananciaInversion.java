import java.util.Scanner;

public class GananciaInversion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias;
        double capital, ganancia, interes;

          System.out.println("Ingrese el monto a invertir: ");
          capital = entrada.nextDouble();
          System.out.println("Ingrese el número de días del mes: ");
          dias = entrada.nextInt();

          interes = 0.02;
          ganancia = capital * dias * interes;

          System.out.println("La ganancia es: " + ganancia);
    }
}
