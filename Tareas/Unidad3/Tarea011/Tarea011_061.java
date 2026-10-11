import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_061 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String tomarExtremos(String texto, int cantidad) {
        return texto.substring(0, cantidad) + texto.substring(texto.length() - cantidad);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int cantidad = leerEntero(entrada, "Ingrese la cantidad de caracteres: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero dado es: " + cantidad);
        if (cantidad < 0 || cantidad > texto.length()) {
            System.out.println("La cantidad debe estar entre 0 y " + texto.length());
        } else {
            System.out.println("La nueva cadena es: " + tomarExtremos(texto, cantidad));
        }
        entrada.close();
    }
}
