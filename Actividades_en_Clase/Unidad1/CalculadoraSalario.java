package programas;

import javax.swing.JOptionPane;

public class CalculadoraSalario {
    public static void main(String[] args) {
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas en la semana:"));
        double pagoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa de pago por hora normal:"));
        
        int horasNormales = 0;
        int horasExtras = 0;
        
        if (horasTrabajadas > 40) {
            horasNormales = 40;
            horasExtras = horasTrabajadas - 40;
        } else {
            horasNormales = horasTrabajadas;
            horasExtras = 0;
        }
        
        double salarioBase = horasNormales * pagoPorHora;
        double pagoExtras = horasExtras * (pagoPorHora * 1.5);
        double salarioBruto = salarioBase + pagoExtras;
        double impuesto = salarioBruto * 0.10;
        double salarioNeto = salarioBruto - impuesto;
        
        String recibo = "=== RECIBO DE NOMINA SEMANAL ===\n"
                + "Empleado: " + nombreEmpleado + "\n"
                + "Horas Normales: " + horasNormales + "\n"
                + "Horas Extras: " + horasExtras + "\n"
                + "Salario Base: $" + String.format("%.2f", salarioBase) + "\n"
                + "Pago Horas Extras: $" + String.format("%.2f", pagoExtras) + "\n"
                + "Salario Bruto: $" + String.format("%.2f", salarioBruto) + "\n"
                + "Deducción ISR (10%): $" + String.format("%.2f", impuesto) + "\n"
                + "Salario Neto A Cobrar: $" + String.format("%.2f", salarioNeto);
                
        JOptionPane.showMessageDialog(null, recibo);
    }
}
