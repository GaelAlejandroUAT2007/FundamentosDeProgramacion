package programas;

import javax.swing.JOptionPane;

public class SimuladorCajero {
    public static void main(String[] args) {
        double saldo = 5000.00;
        int opcion = 0;
        
        while (opcion != 4) {
            String menu = "=== CAJERO AUTOMÁTICO ===\n"
                    + "1. Consultar Saldo\n"
                    + "2. Depositar Dinero\n"
                    + "3. Retirar Dinero\n"
                    + "4. Salir\n\n"
                    + "Elija una opción:";
                    
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break;
            
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                opcion = 0;
            }
            
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: $" + String.format("%.2f", saldo));
                    break;
                case 2:
                    double dep = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    if (dep > 0) {
                        saldo += dep;
                        JOptionPane.showMessageDialog(null, "Depósito exitoso.\nNuevo saldo: $" + String.format("%.2f", saldo));
                    } else {
                        JOptionPane.showMessageDialog(null, "Monto inválido.");
                    }
                    break;
                case 3:
                    double ret = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    if (ret > 0) {
                        if (ret <= saldo) {
                            saldo -= ret;
                            JOptionPane.showMessageDialog(null, "Retiro exitoso.\nNuevo saldo: $" + String.format("%.2f", saldo));
                        } else {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Monto inválido.");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el cajero automático. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}
