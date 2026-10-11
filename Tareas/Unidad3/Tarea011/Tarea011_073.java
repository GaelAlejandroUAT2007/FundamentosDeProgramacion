import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_073 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean apareceAntesDelPunto(String texto, String buscada) {
        int punto = texto.indexOf('.');
        if (punto == -1) {
            return false;
        }
        return texto.substring(0, punto).contains(buscada);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String buscada = leerTexto(entrada, "Ingrese la subcadena a buscar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece '" + buscada + "' antes del punto? " + apareceAntesDelPunto(texto, buscada));
        entrada.close();
    }
}
