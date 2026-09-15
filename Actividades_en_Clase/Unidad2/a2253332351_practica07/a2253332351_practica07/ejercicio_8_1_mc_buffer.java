package a2253332351_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
	public static void main(String args[]) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		double n, montoConIva, total;
		int tipo;
		System.out.println("Introduce el costo del servicio (n pesos)");
		n = Double.parseDouble(entrada.readLine());
		System.out.println("Tipo de cliente: 1-Normal  2-Profesor  3-Alumno");
		tipo = Integer.parseInt(entrada.readLine());

		montoConIva = n * 1.16;

		if (tipo == 2)
			total = montoConIva * 0.80;
		else
			if (tipo == 3)
				total = montoConIva * 0.90;
			else
				total = montoConIva;

		System.out.println("Monto con IVA (16%): " + montoConIva);
		System.out.println("Total a pagar: " + total);
	}
}
