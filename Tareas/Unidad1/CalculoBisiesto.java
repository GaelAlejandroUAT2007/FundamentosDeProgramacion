package programas;

import javax.swing.JOptionPane;

public class CalculoBisiesto {
    public static void main(String[] args) {
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año para verificar:"));
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        String res = "=== VERIFICACIÓN DE AÑO ===\n"
                + "Año ingresado: " + anio + "\n"
                + "Resultado: " + (esBisiesto ? "SÍ es un año bisiesto." : "NO es un año bisiesto.");
                
        JOptionPane.showMessageDialog(null, res);
    }
}
