package programas;

import javax.swing.JOptionPane;

public class CalculadoraComisionVentas {
    public static void main(String[] args) {
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base mensual ($):"));
        double ventasTotales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de ventas realizadas ($):"));
        
        double porcentajeComision = 0.0;
        if (ventasTotales > 50000) {
            porcentajeComision = 0.15;
        } else if (ventasTotales > 20000) {
            porcentajeComision = 0.10;
        } else {
            porcentajeComision = 0.05;
        }
        
        double comision = ventasTotales * porcentajeComision;
        double sueldoTotal = sueldoBase + comision;
        
        String res = "=== NÓMINA DE COMISIONES ===\n"
                + "Vendedor: " + nombreVendedor + "\n"
                + "Sueldo Base: $" + String.format("%.2f", sueldoBase) + "\n"
                + "Ventas: $" + String.format("%.2f", ventasTotales) + "\n"
                + "Comisión (" + (int)(porcentajeComision * 100) + "%): $" + String.format("%.2f", comision) + "\n"
                + "Sueldo Total: $" + String.format("%.2f", sueldoTotal);
                
        JOptionPane.showMessageDialog(null, res);
    }
}
