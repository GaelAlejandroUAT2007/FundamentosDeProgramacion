import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_072 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean contienePatron(String texto) {
        for (int i = 0; i + 2 < texto.length(); i++) {
            if (texto.charAt(i) == 'p' && texto.charAt(i + 2) == 'p') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece p?p en la cadena? " + contienePatron(texto));
        entrada.close();
    }
}
