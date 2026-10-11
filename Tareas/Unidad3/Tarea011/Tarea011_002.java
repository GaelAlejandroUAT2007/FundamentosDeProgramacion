import java.util.Scanner;

public class Tarea011_002 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerPosicion(Scanner entrada, String texto, String mensaje) {
        int posicion;
        do {
            System.out.print(mensaje);
            posicion = Integer.parseInt(entrada.nextLine().trim());
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int primera = leerPosicion(entrada, texto, "Ingrese la primera posicion: ");
        int segunda = leerPosicion(entrada, texto, "Ingrese la segunda posicion: ");
        System.out.println("Cadena original : " + texto);
        mostrarResultado(obtenerCodigo(texto, primera));
        mostrarResultado(obtenerCodigo(texto, segunda));
        entrada.close();
    }
}
