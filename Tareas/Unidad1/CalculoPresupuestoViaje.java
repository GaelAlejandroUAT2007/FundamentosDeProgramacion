package programas;

import javax.swing.JOptionPane;

public class CalculoPresupuestoViaje {
    public static void main(String[] args) {
        String destino = JOptionPane.showInputDialog("Ingrese el destino del viaje:");
        double presupuestoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto total disponible ($):"));
        double hospedaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese gasto estimado en hospedaje:"));
        double alimentacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese gasto estimado en alimentación:"));
        double transporte = Double.parseDouble(JOptionPane.showInputDialog("Ingrese gasto estimado en transporte:"));
        double varios = Double.parseDouble(JOptionPane.showInputDialog("Ingrese gastos varios:"));
        
        double totalGastos = hospedaje + alimentacion + transporte + varios;
        double restante = presupuestoTotal - totalGastos;
        
        String estado = (restante >= 0) ? "Presupuesto suficiente. Resta: $" + String.format("%.2f", restante)
                                        : "DÉFICIT. Falta dinero por: $" + String.format("%.2f", restante * -1);
        
        String reporte = "=== REPORTE DE PRESUPUESTO ===\n"
                + "Destino: " + destino + "\n"
                + "Presupuesto Total: $" + String.format("%.2f", presupuestoTotal) + "\n"
                + "Gastos Totales: $" + String.format("%.2f", totalGastos) + "\n"
                + "Estado: " + estado;
                
        JOptionPane.showMessageDialog(null, reporte);
    }
}
