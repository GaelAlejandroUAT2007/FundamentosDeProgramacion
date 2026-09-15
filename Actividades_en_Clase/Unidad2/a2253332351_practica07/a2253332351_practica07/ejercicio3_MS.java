package a2253332351_practica07;

import java.util.Scanner;

public class ejercicio3_MS {
	public static void main(String args[]) {
		int num;
		String salida;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un Numero");
		num = entrada.nextInt();
		salida = "";
		if ((num > 0) && (num % 2 == 0))
			salida = "Es Positivo y Par";
		if ((num > 0) && (num % 2 > 0))
			salida = "Es Positivo e Impar";
		if ((num < 0) && (num % 2 == 0))
			salida = "Es Negativo y Par";
		if ((num < 0) && (num % 2 != 0))
			salida = "Es Negativo e ImPar";
		System.out.println(salida);
		entrada.close();
		System.exit(0);
	}
}
