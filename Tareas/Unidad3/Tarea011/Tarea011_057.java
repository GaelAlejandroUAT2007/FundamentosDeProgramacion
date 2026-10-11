import java.util.Scanner;

public class Tarea011_057 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String intercambiarUltimosDos(String texto) {
        int n = texto.length();
        return texto.substring(0, n - 2) + texto.charAt(n - 1) + texto.charAt(n - 2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena (minimo 2 caracteres): ");
        System.out.println("La cadena dada es: " + texto);
        if (texto.length() < 2) {
            System.out.println("La cadena debe tener dos o mas caracteres");
        } else {
            System.out.println("La cadena despues de intercambiar los ultimos dos caracteres es: " + intercambiarUltimosDos(texto));
        }
        entrada.close();
    }
}
