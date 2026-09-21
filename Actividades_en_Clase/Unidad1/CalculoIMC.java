package programas;

import javax.swing.JOptionPane;

public class CalculoIMC {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en Kilogramos (ej. 70.5):"));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura en Metros (ej. 1.75):"));
        
        double imc = peso / (estatura * estatura);
        String diagnostico = "";
        
        if (imc < 18.5) {
            diagnostico = "Bajo peso";
        } else if (imc < 25.0) {
            diagnostico = "Peso normal (Saludable)";
        } else if (imc < 30.0) {
            diagnostico = "Sobrepeso";
        } else {
            diagnostico = "Obesidad";
        }
        
        String res = "=== DIAGNÓSTICO DE SALUD ===\n"
                + "Paciente: " + nombre + "\n"
                + "Peso: " + peso + " kg\n"
                + "Estatura: " + estatura + " m\n"
                + "IMC: " + String.format("%.2f", imc) + "\n"
                + "Categoría: " + diagnostico;
                
        JOptionPane.showMessageDialog(null, res);
    }
}
