import java.util.Scanner;

public class Tarea011_091 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean terminaEnMOrN(String palabra) {
        char ultimo = Character.toLowerCase(palabra.charAt(palabra.length() - 1));
        return ultimo == 'm' || ultimo == 'n';
    }

    static int contarPalabras(String texto) {
        int total = 0;
        String limpio = texto.trim();
        if (limpio.isEmpty()) {
            return 0;
        }
        for (String palabra : limpio.split("\\s+")) {
            if (terminaEnMOrN(palabra)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese el texto: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero de palabras que terminan en m o n es: " + contarPalabras(texto));
        entrada.close();
    }
}
