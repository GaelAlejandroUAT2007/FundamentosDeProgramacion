import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_074 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static boolean prefijoAparecePosteriormente(String texto, int longitud) {
        String prefijo = texto.substring(0, longitud);
        return texto.indexOf(prefijo, 1) != -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int longitud = leerEntero(entrada, "Ingrese la longitud del prefijo: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La longitud del prefijo es: " + longitud);
        if (longitud < 1 || longitud > texto.length()) {
            System.out.println("La longitud debe estar entre 1 y " + texto.length());
        } else {
            System.out.println("Aparece '" + texto.substring(0, longitud) + "' en otra parte de la cadena? "
                    + prefijoAparecePosteriormente(texto, longitud));
        }
        entrada.close();
    }
}
