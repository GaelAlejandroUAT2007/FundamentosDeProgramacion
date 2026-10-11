import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_103 {

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

    static String quitarCaracter(String texto, char caracter) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != caracter) {
                resultado.append(texto.charAt(i));
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar: ");
        System.out.println("Cadena original:");
        System.out.println(texto);
        System.out.println();
        System.out.println("Segunda cadena:");
        System.out.println(quitarCaracter(texto, caracter));
        entrada.close();
    }
}
