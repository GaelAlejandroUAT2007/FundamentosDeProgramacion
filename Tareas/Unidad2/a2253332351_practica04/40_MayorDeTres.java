import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, mayor;

        System.out.print("Introduce el primer numero: ");
        n1 = entrada.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        n2 = entrada.nextDouble();
        System.out.print("Introduce el tercer numero: ");
        n3 = entrada.nextDouble();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        System.out.println("El numero mayor es: " + mayor);
    }
}
