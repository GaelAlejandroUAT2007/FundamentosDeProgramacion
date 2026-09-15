package a2253332351_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio4_MC {
	public static void main(String args[]) throws IOException {
		int num;
		String salida;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un Numero");
		num = Integer.parseInt(entrada.readLine());
		salida = "";
		if (num > 0)
			salida = "Es positivo";
		else
			if (num < 0)
				salida = "Es Negativo";
			else
				salida = "Es cero";
		System.out.println(salida);
		System.exit(0);
	}
}
