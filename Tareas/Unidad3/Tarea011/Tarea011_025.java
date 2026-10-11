import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_025 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String reemplazarPorExpresion(String texto, String expresion, String reemplazo) {
        return texto.replaceAll(expresion, reemplazo);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String expresion = leerTexto(entrada, "Ingrese la expresion regular a buscar: ");
        String reemplazo = leerTexto(entrada, "Ingrese el reemplazo: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena nueva: " + reemplazarPorExpresion(texto, expresion, reemplazo));
        entrada.close();
    }
}
