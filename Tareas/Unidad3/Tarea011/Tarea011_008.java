import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_008 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean contiene(String texto, CharSequence secuencia) {
        return texto.contains(secuencia);
    }

    static void mostrarResultado(String texto, String secuencia, boolean resultado) {
        System.out.println("Cadena original: " + texto);
        System.out.println("Secuencia de caracteres buscada: " + secuencia);
        System.out.println(resultado);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String secuencia = leerTexto(entrada, "Ingrese la secuencia a buscar: ");
        mostrarResultado(texto, secuencia, contiene(texto, secuencia));
        entrada.close();
    }
}
