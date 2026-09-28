package a2253332351_practica09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicioparaciclo {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int num, ciclo;
		String salida = "";
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduce el numero de la tabla a desplegar");
		num = Integer.parseInt(entrada.readLine());
		for (ciclo = 1; ciclo <= 10; ciclo++)
			salida = salida + num + " * " + ciclo + " = " + (ciclo * num) + "\n";
		System.out.println(salida);
		System.exit(0);
	}
}
