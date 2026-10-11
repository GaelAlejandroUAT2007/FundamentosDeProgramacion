import java.util.Scanner;

public class Tarea011_018 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int generarHash(String texto) {
        return texto.hashCode();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("El hash de " + texto + " es " + generarHash(texto));
        entrada.close();
    }
}
