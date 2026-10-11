import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_039 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char primerNoRepetido(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            if (texto.indexOf(actual) == texto.lastIndexOf(actual)) {
                return actual;
            }
        }
        return '\0';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char resultado = primerNoRepetido(texto);
        System.out.println("La cadena dada es: " + texto);
        if (resultado == '\0') {
            System.out.println("No existe un caracter no repetido en la cadena");
        } else {
            System.out.println("El primer caracter no repetido en la cadena es: " + resultado);
        }
        entrada.close();
    }
}
