import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_067 {

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

    static String quitarInicio(String texto, char caracter) {
        if (texto.length() < 2) {
            return texto;
        }
        StringBuilder resultado = new StringBuilder();
        if (texto.charAt(0) != caracter) {
            resultado.append(texto.charAt(0));
        }
        if (texto.charAt(1) != caracter) {
            resultado.append(texto.charAt(1));
        }
        resultado.append(texto.substring(2));
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarInicio(texto, caracter));
        entrada.close();
    }
}
