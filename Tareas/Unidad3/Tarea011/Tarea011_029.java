import java.util.Scanner;

public class Tarea011_029 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String aMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena en minusculas: " + aMinusculas(texto));
        entrada.close();
    }
}
