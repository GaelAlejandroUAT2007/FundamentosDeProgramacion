import java.util.Scanner;

public class Tarea011_030 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String aMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena en mayusculas: " + aMayusculas(texto));
        entrada.close();
    }
}
