package programas;

import javax.swing.JOptionPane;

public class CalculoTarifaEstacionamiento {
    public static void main(String[] args) {
        String tipoVehiculo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (Auto / Moto / Camioneta):");
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas de estancia:"));
        
        double tarifaPorHora = 20.0;
        if (tipoVehiculo.equalsIgnoreCase("Moto")) {
            tarifaPorHora = 10.0;
        } else if (tipoVehiculo.equalsIgnoreCase("Camioneta")) {
            tarifaPorHora = 30.0;
        }
        
        double total = horas * tarifaPorHora;
        
        String res = "=== TICKET DE ESTACIONAMIENTO ===\n"
                + "Vehículo: " + tipoVehiculo + "\n"
                + "Horas: " + horas + "\n"
                + "Tarifa por hora: $" + String.format("%.2f", tarifaPorHora) + "\n"
                + "Total a Pagar: $" + String.format("%.2f", total);
                
        JOptionPane.showMessageDialog(null, res);
    }
}
