import java.util.LinkedHashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Tarea011_038 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarDuplicados(String texto) {
        Set<Character> vistos = new LinkedHashSet<>();
        for (int i = 0; i < texto.length(); i++) {
            vistos.add(texto.charAt(i));
        }
        StringBuilder resultado = new StringBuilder();
        for (char c : vistos) {
            resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Despues de quitar los caracteres duplicados la nueva cadena es: " + quitarDuplicados(texto));
        entrada.close();
    }
}
