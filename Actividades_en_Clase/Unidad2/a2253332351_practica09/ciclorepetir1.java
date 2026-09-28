package a2253332351_practica09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ciclorepetir1 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int num, ciclo;
		String salida = "";
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduce el numero de la tabla a desplegar");
		num = Integer.parseInt(entrada.readLine());
		ciclo = 1;
		do {
			salida = salida + num + " * " + ciclo + " = " + (ciclo * num) + "\n";
			ciclo++;
		} while (ciclo <= 10);
		System.out.println(salida);
		System.exit(0);
	}
}
