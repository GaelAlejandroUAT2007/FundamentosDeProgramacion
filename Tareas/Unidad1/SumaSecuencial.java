package programas;

import javax.swing.JOptionPane;

public class SumaSecuencial {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a sumar (N):"));
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        String res = "=== RESULTADO DE SUMA ===\n"
                + "N: " + n + "\n"
                + "Suma acumulada (1 al N): " + suma;
                
        JOptionPane.showMessageDialog(null, res);
    }
}
