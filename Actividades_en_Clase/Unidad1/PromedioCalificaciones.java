package programas;

import javax.swing.JOptionPane;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        
        double cal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación 1 (0-100):"));
        double cal2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación 2 (0-100):"));
        double cal3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación 3 (0-100):"));
        
        double promedio = (cal1 + cal2 + cal3) / 3.0;
        
        String estatus = "";
        if (promedio >= 70) {
            if (promedio >= 90) {
                estatus = "APROBADO CON EXCELENCIA";
            } else {
                estatus = "APROBADO";
            }
        } else {
            estatus = "REPROBADO";
        }
        
        String reporte = "=== REPORTES ACADÉMICO ===\n"
                + "Estudiante: " + nombreEstudiante + "\n"
                + "Calificación 1: " + cal1 + "\n"
                + "Calificación 2: " + cal2 + "\n"
                + "Calificación 3: " + cal3 + "\n"
                + "Promedio Final: " + String.format("%.2f", promedio) + "\n"
                + "Estatus: " + estatus;
                
        JOptionPane.showMessageDialog(null, reporte);
    }
}
