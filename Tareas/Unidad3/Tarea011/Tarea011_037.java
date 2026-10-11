import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_037 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String buscarSubcadenaMasLarga(String texto) {
        Map<Character, Integer> ultimaPosicion = new HashMap<>();
        int inicioVentana = 0;
        int mejorInicio = 0;
        int mejorLongitud = 0;
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            if (ultimaPosicion.containsKey(actual) && ultimaPosicion.get(actual) >= inicioVentana) {
                inicioVentana = ultimaPosicion.get(actual) + 1;
            }
            ultimaPosicion.put(actual, i);
            if (i - inicioVentana + 1 > mejorLongitud) {
                mejorLongitud = i - inicioVentana + 1;
                mejorInicio = inicioVentana;
            }
        }
        return texto.substring(mejorInicio, mejorInicio + mejorLongitud);
    }

    static List<Character> convertirALista(String texto) {
        List<Character> lista = new ArrayList<>();
        for (char c : texto.toCharArray()) {
            lista.add(c);
        }
        return lista;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String resultado = buscarSubcadenaMasLarga(texto);
        System.out.println("Cadena de entrada : " + texto);
        System.out.println("La subcadena mas larga : " + convertirALista(resultado));
        System.out.println("Longitud de la subcadena mas larga : " + resultado.length());
        entrada.close();
    }
}
