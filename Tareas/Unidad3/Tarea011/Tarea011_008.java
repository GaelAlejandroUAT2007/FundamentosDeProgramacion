import java.util.Scanner;

public class Tarea011_008 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean contiene(String texto, CharSequence secuencia) {
        return texto.contains(secuencia);
    }

    static void mostrarResultado(String texto, String secuencia, boolean resultado) {
        System.out.println("Cadena original: " + texto);
        System.out.println("Secuencia de caracteres buscada: " + secuencia);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String secuencia = leerTexto(entrada, "Ingrese la secuencia a buscar: ");
        mostrarResultado(texto, secuencia, contiene(texto, secuencia));
        entrada.close();
    }
}
