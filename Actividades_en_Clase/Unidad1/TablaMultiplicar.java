package programas;

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numeroBase = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número base para la tabla:"));
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el límite de la tabla (ej. 10 o 12):"));
        
        StringBuilder tabla = new StringBuilder();
        tabla.append("Tabla del ").append(numeroBase).append(" (1 al ").append(limite).append("):\n\n");
        
        for (int i = 1; i <= limite; i++) {
            int resultado = numeroBase * i;
            tabla.append(numeroBase).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, tabla.toString());
    }
}
