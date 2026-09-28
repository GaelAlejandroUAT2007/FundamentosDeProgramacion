package a2253332351_practica09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1_MC_mientras {
	public static void main(String args[]) throws IOException {
		int num, ciclo;
		String salida;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduce el numero de la tabla a desplegar");
		num = Integer.parseInt(entrada.readLine());
		ciclo = 0;
		salida = "";
		while (ciclo < 10) {
			ciclo++;
			salida = salida + num + " * " + ciclo + " = " + (ciclo * num) + "\n";
		}
		System.out.println(salida);
		System.exit(0);
	}
}
