package programas;

import javax.swing.JOptionPane;

public class ValidacionClaveAcceso {
    public static void main(String[] args) {
        final String CLAVE_CORRECTA = "1234Sistemas";
        int intentos = 0;
        int maxIntentos = 3;
        boolean accesoConcedido = false;
        
        while (intentos < maxIntentos && !accesoConcedido) {
            String claveIngresada = JOptionPane.showInputDialog(
                    "Ingrese la clave de acceso (Intento " + (intentos + 1) + " de " + maxIntentos + "):"
            );
            
            if (claveIngresada == null) break;
            
            intentos++;
            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta. Intentos restantes: " + (maxIntentos - intentos));
            }
        }
        
        if (accesoConcedido) {
            JOptionPane.showMessageDialog(null, "¡ACCESO CONCEDIDO! Bienvenido al sistema.");
        } else {
            JOptionPane.showMessageDialog(null, "ACCESO BLOQUEADO. Ha superado el número máximo de intentos.");
        }
    }
}
