package programas;

import javax.swing.JOptionPane;

public class ContadorParesImpares {
    public static void main(String[] args) {
        int totalNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 1; i <= totalNumeros; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + " de " + totalNumeros + ":"));
            
            if (num % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        String resultado = "=== RESULTADO DEL CONTEO ===\n"
                + "Total de números procesados: " + totalNumeros + "\n"
                + "Cantidad de números PARES: " + contadorPares + "\n"
                + "Cantidad de números IMPARES: " + contadorImpares;
                
        JOptionPane.showMessageDialog(null, resultado);
    }
}
