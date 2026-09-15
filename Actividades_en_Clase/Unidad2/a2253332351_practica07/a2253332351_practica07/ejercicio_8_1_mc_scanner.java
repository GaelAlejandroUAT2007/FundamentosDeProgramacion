package a2253332351_practica07;

import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double n, montoConIva, total;
		int tipo;
		System.out.println("Introduce el costo del servicio (n pesos)");
		n = entrada.nextDouble();
		System.out.println("Tipo de cliente: 1-Normal  2-Profesor  3-Alumno");
		tipo = entrada.nextInt();

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
		entrada.close();
	}
}
