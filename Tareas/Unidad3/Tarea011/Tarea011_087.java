import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_087 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char leerCaracter(BufferedReader entrada, String mensaje) throws IOException {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.readLine();
        } while (linea.isEmpty());
        return linea.charAt(0);
    }

    static boolean esFeliz(String texto, char caracter) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                boolean izquierda = i > 0 && texto.charAt(i - 1) == caracter;
                boolean derecha = i < texto.length() - 1 && texto.charAt(i + 1) == caracter;
                if (!izquierda && !derecha) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a verificar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Es " + caracter + " feliz en la cadena: " + esFeliz(texto, caracter));
        entrada.close();
    }
}
