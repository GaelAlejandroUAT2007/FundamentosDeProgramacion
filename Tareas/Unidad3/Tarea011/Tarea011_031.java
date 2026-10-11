import java.util.Scanner;

public class Tarea011_031 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarEspacios(String texto) {
        return texto.trim();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena con espacios al inicio o al final: ");
        System.out.println("Cadena original: [" + texto + "]");
        System.out.println("Cadena nueva: " + quitarEspacios(texto));
        entrada.close();
    }
}
