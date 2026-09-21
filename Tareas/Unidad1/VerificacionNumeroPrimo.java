package programas;

import javax.swing.JOptionPane;

public class VerificacionNumeroPrimo {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo:"));
        
        int contadorDivisores = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contadorDivisores++;
                }
            }
            
            boolean esPrimo = (contadorDivisores == 2);
            String res = "=== ANÁLISIS DE PRIMALIDAD ===\n"
                    + "Número: " + num + "\n"
                    + "Resultado: " + (esPrimo ? "SÍ es un número primo." : "NO es primo (es compuesto).");
                    
            JOptionPane.showMessageDialog(null, res);
        } else {
            JOptionPane.showMessageDialog(null, "El número debe ser mayor a 1.");
        }
    }
}
