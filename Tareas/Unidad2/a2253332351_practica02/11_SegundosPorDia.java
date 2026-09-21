import java.util.Scanner;

public class SegundosPorDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dias, segundos;

           System.out.println("Ingrese los días: ");
           dias = entrada.nextDouble();

           segundos = dias * 24 * 60 * 60;

           System.out.println("Los días: " + dias);
           System.out.println("Son equivalentes a: " + segundos + " segundos.");
     }
}
