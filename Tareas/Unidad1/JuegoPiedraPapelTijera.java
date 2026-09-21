package programas;

import javax.swing.JOptionPane;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        String menu = "=== PIEDRA, PAPEL O TIJERA ===\n"
                + "1. Piedra\n"
                + "2. Papel\n"
                + "3. Tijera\n\n"
                + "Elige tu opción (1-3):";
                
        int usuario = Integer.parseInt(JOptionPane.showInputDialog(menu));
        int sistema = 2; // Papel fijo para simplificar lógica didáctica
        
        String strUsuario = (usuario == 1) ? "Piedra" : (usuario == 2) ? "Papel" : "Tijera";
        String resultado = "";
        
        if (usuario == sistema) {
            resultado = "¡EMPATE!";
        } else if ((usuario == 1 && sistema == 3) || (usuario == 2 && sistema == 1) || (usuario == 3 && sistema == 2)) {
            resultado = "¡GANASTE!";
        } else {
            resultado = "PERDISTE contra el sistema.";
        }
        
        String res = "=== RESULTADO DEL JUEGO ===\n"
                + "Tú elegiste: " + strUsuario + "\n"
                + "Sistema eligió: Papel\n"
                + "Veredicto: " + resultado;
                
        JOptionPane.showMessageDialog(null, res);
    }
}
