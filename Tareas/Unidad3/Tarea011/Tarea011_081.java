import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_081 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int contarApariciones(String texto, String buscada) {
        int total = 0;
        int posicion = texto.indexOf(buscada);
        while (posicion != -1) {
            total++;
            posicion = texto.indexOf(buscada, posicion + 1);
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String primera = leerTexto(entrada, "Ingrese la primera subcadena (3 caracteres): ");
        String segunda = leerTexto(entrada, "Ingrese la segunda subcadena (4 caracteres): ");
        System.out.println("La cadena dada es: " + texto);
        if (primera.length() != 3 || segunda.length() != 4) {
            System.out.println("Las subcadenas deben tener 3 y 4 caracteres");
        } else {
            boolean iguales = contarApariciones(texto, primera) == contarApariciones(texto, segunda);
            System.out.println("La aparicion de " + primera + " y " + segunda + " es igual: " + iguales);
        }
        entrada.close();
    }
}
