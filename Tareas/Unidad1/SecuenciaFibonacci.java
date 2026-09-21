package programas;

import javax.swing.JOptionPane;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de Fibonacci:"));
        
        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Ingrese un número mayor a 0.");
            return;
        }
        
        long a = 0, b = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("Serie Fibonacci (").append(n).append(" términos):\n");
        
        for (int i = 1; i <= n; i++) {
            sb.append(a).append(" ");
            long c = a + b;
            a = b;
            b = c;
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
