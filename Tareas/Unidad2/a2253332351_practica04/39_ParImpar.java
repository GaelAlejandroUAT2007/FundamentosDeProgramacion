import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, residuo;

        System.out.print("Introduce un numero entero: ");
        numero = entrada.nextInt();

        residuo = numero % 2;

        if (residuo == 0) {
            System.out.println(numero + " es PAR");
        } else {
            System.out.println(numero + " es IMPAR");
        }
    }
}
