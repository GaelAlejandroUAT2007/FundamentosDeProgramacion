package a2253332351_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
	public static void main(String args[]) {
		double a, b, c;
		String salida = "";

		a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1 del triangulo"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2 del triangulo"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3 del triangulo"));

		if (a == b && b == c)
			salida = "Triangulo Equilatero";
		if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a))
			salida = "Triangulo Isoceles";
		if (a != b && b != c && a != c)
			salida = "Triangulo Escaleno";

		JOptionPane.showMessageDialog(null, salida);
	}
}
