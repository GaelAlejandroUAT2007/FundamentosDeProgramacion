package a2253332351_practica07;

import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		String salida = "";

		System.out.println("Introduce el lado 1 del triangulo");
		a = entrada.nextDouble();
		System.out.println("Introduce el lado 2 del triangulo");
		b = entrada.nextDouble();
		System.out.println("Introduce el lado 3 del triangulo");
		c = entrada.nextDouble();

		if (a == b && b == c)
			salida = "Triangulo Equilatero";
		if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a))
			salida = "Triangulo Isoceles";
		if (a != b && b != c && a != c)
			salida = "Triangulo Escaleno";

		System.out.println(salida);
		entrada.close();
	}
}
