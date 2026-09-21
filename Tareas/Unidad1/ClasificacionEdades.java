package programas;

import javax.swing.JOptionPane;

public class ClasificacionEdades {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        
        String categoria = "";
        if (edad >= 0 && edad <= 12) {
            categoria = "Niño / Niña";
        } else if (edad >= 13 && edad <= 17) {
            categoria = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            categoria = "Adulto";
        } else if (edad >= 60) {
            categoria = "Adulto Mayor";
        } else {
            categoria = "Edad no válida";
        }
        
        String res = "=== CLASIFICACIÓN ETARIA ===\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + " años\n"
                + "Categoría: " + categoria;
                
        JOptionPane.showMessageDialog(null, res);
    }
}
