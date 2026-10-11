import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_002 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerPosicion(BufferedReader entrada, String texto, String mensaje) throws IOException {
        int posicion;
        do {
            System.out.print(mensaje);
            posicion = Integer.parseInt(entrada.readLine().trim());
            if (posicion < 0 || posicion >= texto.length()) {
                System.out.println("Posicion invalida. Debe estar entre 0 y " + (texto.length() - 1));
            }
        } while (posicion < 0 || posicion >= texto.length());
        return posicion;
    }

    static int obtenerCodigo(String texto, int posicion) {
        return texto.codePointAt(posicion);
    }

    static void mostrarResultado(int codigo) {
        System.out.println("Caracter (punto unicode) = " + codigo);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int primera = leerPosicion(entrada, texto, "Ingrese la primera posicion: ");
        int segunda = leerPosicion(entrada, texto, "Ingrese la segunda posicion: ");
        System.out.println("Cadena original : " + texto);
        mostrarResultado(obtenerCodigo(texto, primera));
        mostrarResultado(obtenerCodigo(texto, segunda));
        entrada.close();
    }
}
