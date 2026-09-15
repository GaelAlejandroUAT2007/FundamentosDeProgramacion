package a2253332351_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3_MC {
	public static void main(String args[]) throws IOException {
		int num;
		String salida;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un Numero");
		num = Integer.parseInt(entrada.readLine());
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
		System.exit(0);
	}
}
