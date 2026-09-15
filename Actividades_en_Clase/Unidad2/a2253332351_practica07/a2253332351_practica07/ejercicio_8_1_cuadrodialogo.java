package a2253332351_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
	public static void main(String args[]) {
		double n, montoConIva, total;
		int tipo;
		n = Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del servicio (n pesos)"));
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de cliente: 1-Normal  2-Profesor  3-Alumno"));

		montoConIva = n * 1.16;

		if (tipo == 2)
			total = montoConIva * 0.80;
		else
			if (tipo == 3)
				total = montoConIva * 0.90;
			else
				total = montoConIva;

		JOptionPane.showMessageDialog(null, "Monto con IVA (16%): " + montoConIva
				+ "\nTotal a pagar: " + total);
	}
}
