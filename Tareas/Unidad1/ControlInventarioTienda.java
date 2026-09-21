package programas;

import javax.swing.JOptionPane;

public class ControlInventarioTienda {
    public static void main(String[] args) {
        int stockActual = 100;
        int opcion = 0;
        
        while (opcion != 3) {
            String menu = "=== CONTROL DE INVENTARIO (Stock: " + stockActual + ") ===\n"
                    + "1. Registrar entrada (Surtir)\n"
                    + "2. Registrar salida (Vender)\n"
                    + "3. Salir\n\n"
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
                    int entra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a agregar:"));
                    if (entra > 0) {
                        stockActual += entra;
                        JOptionPane.showMessageDialog(null, "Stock actualizado. Nuevo stock: " + stockActual);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                    }
                    break;
                case 2:
                    int sale = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad a retirar:"));
                    if (sale > 0) {
                        if (sale <= stockActual) {
                            stockActual -= sale;
                            JOptionPane.showMessageDialog(null, "Salida registrada. Nuevo stock: " + stockActual);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: Stock insuficiente.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de inventario. ¡Adiós!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}
