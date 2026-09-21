package programas;

import javax.swing.JOptionPane;

public class TablaCuadradosCubos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta qué número desea calcular:"));
        
        StringBuilder sb = new StringBuilder();
        sb.append("Número\tCuadrado\tCubo\n");
        sb.append("-----------------------------\n");
        
        for (int i = 1; i <= n; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            sb.append(i).append("\t").append(cuadrado).append("\t\t").append(cubo).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
