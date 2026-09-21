import java.util.Scanner;

public class AreaTrapecio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double baseMayor;
        double baseMenor;
        double altura;
        double area;

        System.out.print("Ingrese la base mayor del trapecio: ");
        baseMayor = entrada.nextDouble();
        System.out.print("Ingrese la base menor del trapecio: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        altura = entrada.nextDouble();

        area = ((baseMayor + baseMenor) * altura) / 2;

        System.out.println("El área del trapecio es: " + area);
    }
}
