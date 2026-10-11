import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_093 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String subcadenaEnAmbosExtremos(String texto) {
        for (int longitud = texto.length() / 2; longitud >= 1; longitud--) {
            String prefijo = texto.substring(0, longitud);
            String sufijo = texto.substring(texto.length() - longitud);
            if (prefijo.equals(sufijo)) {
                return prefijo;
            }
        }
        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String resultado = subcadenaEnAmbosExtremos(texto);
        System.out.println("La cadena dada es: " + texto);
        if (resultado.isEmpty()) {
            System.out.println("No existe una subcadena que aparezca en ambos extremos");
        } else {
            System.out.println("La subcadena mas larga en ambos extremos es: " + resultado);
        }
        entrada.close();
    }
}
