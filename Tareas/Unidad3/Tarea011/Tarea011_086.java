import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_086 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int contarTriples(String texto) {
        int total = 0;
        for (int i = 0; i + 2 < texto.length(); i++) {
            if (texto.charAt(i) == texto.charAt(i + 1) && texto.charAt(i) == texto.charAt(i + 2)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero de triples en la cadena es: " + contarTriples(texto));
        entrada.close();
    }
}
