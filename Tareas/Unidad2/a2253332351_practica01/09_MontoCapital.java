import java.util.Scanner;

public class MontoCapital {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double capital, interes, monto;

           System.out.println("Ingrese el capital: ");
           capital = entrada.nextDouble();
           System.out.println("Ingrese la tasa de interés: ");
           interes = entrada.nextDouble();

           monto = capital * (1 + (interes / 100));

           System.out.println("El monto es: " + monto);
     }
}
