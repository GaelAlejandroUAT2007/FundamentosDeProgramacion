package a2253332351_practica07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_6_mc_buffer {
	public static void main(String args[]) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int parcial1, parcial2, parcial3;
		double resultado;
		String salida = "";
		System.out.println("Introduce la calificacion del Parcial 1");
		parcial1 = Integer.parseInt(lectura.readLine());
		System.out.println("Introduce la calificacion del Parcial 2");
		parcial2 = Integer.parseInt(lectura.readLine());
		System.out.println("Introduce la calificacion del Parcial 3");
		parcial3 = Integer.parseInt(lectura.readLine());
		resultado = (parcial1 + parcial2 + parcial3) / 3.0;
		if (resultado >= 7)
			salida = "ALUMNO ACREDITADO";
		else
			salida = "ALUMNO NO ACREDITADO";
		System.out.println("Promedio: " + resultado);
		System.out.println(salida);
	}
}
