import java.util.Scanner;

public class Tarea011_028 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char[] crearArreglo(String texto) {
        char[] arreglo = new char[texto.length()];
        texto.getChars(0, texto.length(), arreglo, 0);
        return arreglo;
    }

    static void mostrarArreglo(char[] arreglo) {
        System.out.println(String.copyValueOf(arreglo));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char[] arreglo = crearArreglo(texto);
        System.out.println("Tamano del arreglo: " + arreglo.length);
        mostrarArreglo(arreglo);
        entrada.close();
    }
}
