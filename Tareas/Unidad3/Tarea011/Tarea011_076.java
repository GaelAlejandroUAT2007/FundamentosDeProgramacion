import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_076 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int contarPatron(String texto) {
        int total = 0;
        for (int i = 0; i + 3 < texto.length(); i++) {
            if (texto.charAt(i) == 'l' && texto.charAt(i + 1) == 'i' && texto.charAt(i + 3) == 'e') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La subcadena life o li?e aparece el siguiente numero de veces: " + contarPatron(texto));
        entrada.close();
    }
}
