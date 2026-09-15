package a2253332351_practica07;

import javax.swing.JOptionPane;

public class ejercicio_7_1_cuadrodialogo {
	public static void main(String args[]) {
		int dia;
		dia = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor del dia [1..7]"));
		if (dia == 1) {
			JOptionPane.showMessageDialog(null, "Lunes");
		} else {
			if (dia == 2) {
				JOptionPane.showMessageDialog(null, "Martes");
			} else {
				if (dia == 3) {
					JOptionPane.showMessageDialog(null, "Miercoles");
				} else {
					if (dia == 4) {
						JOptionPane.showMessageDialog(null, "Jueves");
					} else {
						if (dia == 5) {
							JOptionPane.showMessageDialog(null, "Viernes");
						} else {
							if (dia == 6) {
								JOptionPane.showMessageDialog(null, "Sabado");
							} else {
								if (dia == 7) {
									JOptionPane.showMessageDialog(null, "Domingo");
								} else {
									JOptionPane.showMessageDialog(null, "No existe");
								}
							}
						}
					}
				}
			}
		}
	}
}
