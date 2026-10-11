import java.util.Scanner;

public class Tarea011_069 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String entreToasts(String texto) {
        int primero = texto.indexOf("toast");
        int ultimo = texto.lastIndexOf("toast");
        if (primero == -1 || primero == ultimo) {
            return "";
        }
        return texto.substring(primero + 5, ultimo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + entreToasts(texto));
        entrada.close();
    }
}
