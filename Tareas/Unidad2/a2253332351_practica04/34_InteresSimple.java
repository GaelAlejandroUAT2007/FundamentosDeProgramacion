import java.util.Scanner;

public class InteresSimple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double capital;
        double tasa;
        double tiempo;
        double interes;
        double monto;

        System.out.print("Ingrese el capital inicial: ");
        capital = entrada.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        tasa = entrada.nextDouble();
        System.out.print("Ingrese el tiempo en años: ");
        tiempo = entrada.nextDouble();

        interes = (capital * tasa * tiempo) / 100;
        monto = capital + interes;

        System.out.println("El interés generado es: " + interes);
        System.out.println("El monto final es: " + monto);
    }
}
