package a2253332351_practicas06;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        int numero;
        int dm, um, c, d, u;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        numero = entrada.nextInt();

        dm = (int) numero / 10000;
        numero = numero % 10000;

        um = (int) numero / 1000;
        numero = numero % 1000;

        c = (int) numero / 100;
        numero = numero % 100;

        d = (int) numero / 10;
        numero = numero % 10;
        u = numero;

        System.out.println("( " + u + " " + d + " " + c + " " + um + " " + dm + " )");

        numero = numero + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(numero);
    }
}