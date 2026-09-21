package programas;

import javax.swing.JOptionPane;

public class MatrizNotasAlumnos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        
        double[] calificaciones = new double[n];
        double suma = 0;
        
        calificaciones[0] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del alumno 1 de " + n + ":"));
        double notaAlta = calificaciones[0];
        double notaBaja = calificaciones[0];
        suma += calificaciones[0];
        
        for (int i = 1; i < n; i++) {
            calificaciones[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del alumno " + (i + 1) + " de " + n + ":"));
            suma += calificaciones[i];
            
            if (calificaciones[i] > notaAlta) {
                notaAlta = calificaciones[i];
            }
            if (calificaciones[i] < notaBaja) {
                notaBaja = calificaciones[i];
            }
        }
        
        double promedio = suma / n;
        
        String res = "=== ESTADÍSTICAS GRUPALES ===\n"
                + "Alumnos evaluados: " + n + "\n"
                + "Promedio general: " + String.format("%.2f", promedio) + "\n"
                + "Nota más alta: " + notaAlta + "\n"
                + "Nota más baja: " + notaBaja;
                
        JOptionPane.showMessageDialog(null, res);
    }
}
