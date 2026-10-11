import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_066 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarDosPrimeros(String texto) {
        if (texto.length() < 2) {
            return texto;
        }
        StringBuilder resultado = new StringBuilder();
        if (texto.charAt(0) == 'g') {
            resultado.append('g');
        }
        if (texto.charAt(1) == 'h') {
            resultado.append('h');
        }
        resultado.append(texto.substring(2));
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarDosPrimeros(texto));
        entrada.close();
    }
}
