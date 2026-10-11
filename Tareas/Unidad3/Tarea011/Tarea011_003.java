import java.util.Scanner;

public class Tarea011_003 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerPosicion(Scanner entrada, String texto, String mensaje) {
        int posicion;
        do {
            System.out.print(mensaje);
            posicion = Integer.parseInt(entrada.nextLine().trim());
            if (posicion < 1 || posicion > texto.length()) {
                System.out.println("Posicion invalida. Debe estar entre 1 y " + texto.length());
            }
        } while (posicion < 1 || posicion > texto.length());
        return posicion;
    }

    static int obtenerCodigoAnterior(String texto, int posicion) {
        return texto.codePointBefore(posicion);
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
        mostrarResultado(obtenerCodigoAnterior(texto, primera));
        mostrarResultado(obtenerCodigoAnterior(texto, segunda));
        entrada.close();
    }
}
