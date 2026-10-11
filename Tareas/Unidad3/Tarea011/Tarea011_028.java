import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_028 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char[] crearArreglo(String texto) {
        char[] arreglo = new char[texto.length()];
        texto.getChars(0, texto.length(), arreglo, 0);
        return arreglo;
    }

    static void mostrarArreglo(char[] arreglo) {
        System.out.println(String.copyValueOf(arreglo));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char[] arreglo = crearArreglo(texto);
        System.out.println("Tamano del arreglo: " + arreglo.length);
        mostrarArreglo(arreglo);
        entrada.close();
    }
}
