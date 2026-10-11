import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Tarea011_051 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static Map<Character, Integer> contarCaracteres(String texto) {
        Map<Character, Integer> conteo = new TreeMap<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }
        return conteo;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los caracteres duplicados y sus conteos son:");
        boolean hayDuplicados = false;
        for (Map.Entry<Character, Integer> par : contarCaracteres(texto).entrySet()) {
            if (par.getValue() > 1) {
                System.out.println(par.getKey() + "  aparece  " + par.getValue() + "  veces");
                hayDuplicados = true;
            }
        }
        if (!hayDuplicados) {
            System.out.println("No hay caracteres duplicados");
        }
        entrada.close();
    }
}
