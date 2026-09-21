package programas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
    public static void main(String[] args) {
        String menu = "=== CONVERSOR DE TEMPERATURA ===\n"
                + "1. Celsius a Fahrenheit\n"
                + "2. Fahrenheit a Celsius\n"
                + "3. Celsius a Kelvin\n"
                + "4. Kelvin a Celsius\n\n"
                + "Ingrese su opción (1-4):";
                
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        double tempOrigen, tempResultado;
        String mensaje = "";
        
        switch (opcion) {
            case 1:
                tempOrigen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Celsius:"));
                tempResultado = (tempOrigen * 9.0 / 5.0) + 32.0;
                mensaje = String.format("%.2f °C equivalen a %.2f °F", tempOrigen, tempResultado);
                break;
            case 2:
                tempOrigen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit:"));
                tempResultado = (tempOrigen - 32.0) * 5.0 / 9.0;
                mensaje = String.format("%.2f °F equivalen a %.2f °C", tempOrigen, tempResultado);
                break;
            case 3:
                tempOrigen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Celsius:"));
                tempResultado = tempOrigen + 273.15;
                mensaje = String.format("%.2f °C equivalen a %.2f K", tempOrigen, tempResultado);
                break;
            case 4:
                tempOrigen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Kelvin:"));
                tempResultado = tempOrigen - 273.15;
                mensaje = String.format("%.2f K equivalen a %.2f °C", tempOrigen, tempResultado);
                break;
            default:
                mensaje = "Opción no válida.";
                break;
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
