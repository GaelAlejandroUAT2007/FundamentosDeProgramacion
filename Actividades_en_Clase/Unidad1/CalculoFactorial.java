package programas;

import javax.swing.JOptionPane;

public class CalculoFactorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero no negativo:"));
        
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "Error: No existe el factorial de un número negativo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            
            String res = "=== RESULTADO FACTORIAL ===\n"
                    + num + "! = " + factorial;
                    
            JOptionPane.showMessageDialog(null, res);
        }
    }
}
