package a2253332351_practica07;

import javax.swing.JOptionPane;

public class ejercicio4_CD {
	public static void main(String args[]) {
		int num;
		String entrada;
		String salida;
		entrada = JOptionPane.showInputDialog("Introduce un Numero");
		num = Integer.parseInt(entrada);
		salida = "";
		if (num > 0)
			salida = "Es positivo";
		else
			if (num < 0)
				salida = "Es Negativo";
			else
				salida = "Es cero";
		JOptionPane.showMessageDialog(null, salida);
		System.exit(0);
	}
}
