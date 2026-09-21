package programas;

import javax.swing.JOptionPane;

public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroSecreto = 42;
        int contadorIntentos = 0;
        int intento = 0;
        
        JOptionPane.showMessageDialog(null, "=== JUEGO DE ADIVINAR EL NÚMERO (1 al 100) ===");
        
        while (intento != numeroSecreto) {
            String input = JOptionPane.showInputDialog("Ingresa tu suposición:");
            if (input == null) break;
            
            try {
                intento = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
                continue;
            }
            
            contadorIntentos++;
            
            if (intento < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número secreto es MAYOR.");
            } else if (intento > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número secreto es MENOR.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número secret en " + contadorIntentos + " intentos.");
            }
        }
    }
}
