import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_100 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean contiene(String texto, String buscada) {
        return texto.contains(buscada);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese el texto: ");
        String primera = leerTexto(entrada, "Ingrese la primera palabra a buscar: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda palabra a buscar: ");
        System.out.println("Cadena original:");
        System.out.println(texto);
        System.out.println();
        System.out.println("Esta '" + primera + "' presente en el texto?");
        System.out.println(contiene(texto, primera));
        System.out.println();
        System.out.println("Esta '" + segunda + "' presente en el texto?");
        System.out.println(contiene(texto, segunda));
        entrada.close();
    }
}
