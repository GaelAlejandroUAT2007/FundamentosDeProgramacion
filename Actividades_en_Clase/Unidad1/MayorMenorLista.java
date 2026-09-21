package programas;

import javax.swing.JOptionPane;

public class MayorMenorLista {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a evaluar:"));
        
        if (n > 0) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número 1:"));
            int mayor = num;
            int menor = num;
            
            for (int i = 2; i <= n; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));
                if (num > mayor) {
                    mayor = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
            
            String res = "=== RESULTADOS DE EVALUACIÓN ===\n"
                    + "Total de números evaluados: " + n + "\n"
                    + "Número MAYOR: " + mayor + "\n"
                    + "Número MENOR: " + menor;
                    
            JOptionPane.showMessageDialog(null, res);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.");
        }
    }
}
