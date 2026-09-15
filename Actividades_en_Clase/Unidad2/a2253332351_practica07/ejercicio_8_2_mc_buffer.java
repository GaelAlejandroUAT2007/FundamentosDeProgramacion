package a2253332351_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_2_mc_buffer {

    public static void main(String args[]) throws IOException {

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        double a, b, c;
        String salida = "";

        System.out.println("Introduce el lado 1 del triangulo");
        a = Double.parseDouble(entrada.readLine());

        System.out.println("Introduce el lado 2 del triangulo");
        b = Double.parseDouble(entrada.readLine());

        System.out.println("Introduce el lado 3 del triangulo");
        c = Double.parseDouble(entrada.readLine());

        if (a == b && b == c)
            salida = "Triangulo Equilatero";

        if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a))
            salida = "Triangulo Isoceles";

        if (a != b && b != c && a != c)
            salida = "Triangulo Escaleno";

        System.out.println(salida);
    }
}

