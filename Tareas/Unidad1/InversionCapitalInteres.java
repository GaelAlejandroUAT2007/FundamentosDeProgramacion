package programas;

import javax.swing.JOptionPane;

public class InversionCapitalInteres {
    public static void main(String[] args) {
        double capitalInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital inicial ($):"));
        double tasaInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interés anual (%):"));
        int anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el plazo en años:"));
        
        double capitalFinal = capitalInicial;
        for (int i = 1; i <= anios; i++) {
            capitalFinal += capitalFinal * (tasaInteres / 100.0);
        }
        
        double ganancia = capitalFinal - capitalInicial;
        
        String res = "=== REPORTE DE INVERSIÓN ===\n"
                + "Capital Inicial: $" + String.format("%.2f", capitalInicial) + "\n"
                + "Plazo: " + anios + " años\n"
                + "Tasa Anual: " + tasaInteres + "%\n"
                + "Capital Final: $" + String.format("%.2f", capitalFinal) + "\n"
                + "Ganancia Neta: $" + String.format("%.2f", ganancia);
                
        JOptionPane.showMessageDialog(null, res);
    }
}
