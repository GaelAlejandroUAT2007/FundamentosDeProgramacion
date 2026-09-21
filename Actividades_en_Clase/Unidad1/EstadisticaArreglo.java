package programas;

import javax.swing.JOptionPane;

public class EstadisticaArreglo {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos a registrar:"));
        
        int[] valores = new int[n];
        double suma = 0;
        
        for (int i = 0; i < n; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la posición [" + i + "]:"));
            suma += valores[i];
        }
        
        double promedio = suma / n;
        
        int elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para buscar dentro del arreglo:"));
        boolean encontrado = false;
        
        for (int i = 0; i < n; i++) {
            if (valores[i] == elementoBuscar) {
                encontrado = true;
                break;
            }
        }
        
        String res = "=== RESULTADOS DEL ARREGLO ===\n"
                + "Total de elementos: " + n + "\n"
                + "Suma total: " + suma + "\n"
                + "Promedio: " + String.format("%.2f", promedio) + "\n\n"
                + "Búsqueda del número " + elementoBuscar + ": " + (encontrado ? "¡ENCONTRADO!" : "NO ENCONTRADO");
                
        JOptionPane.showMessageDialog(null, res);
    }
}
