package a2253332351_practica07;

import java.util.Scanner;

public class ejercicio2_MS {
	public static void main(String args[]) {
		int num;
		String salida;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un Numero");
		num = entrada.nextInt();
		salida = "";
		if (num > 0)
			salida = "Es positivo";
		else
			salida = "Es Negativo";
		if (num == 0)
			salida = "Es cero";
		System.out.println(salida);
		entrada.close();
		System.exit(0);
	}
}
