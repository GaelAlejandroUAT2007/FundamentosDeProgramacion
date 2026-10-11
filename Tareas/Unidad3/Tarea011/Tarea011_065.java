import java.util.Scanner;

public class Tarea011_065 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char leerCaracter(Scanner entrada, String mensaje) {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.nextLine();
        } while (linea.isEmpty());
        return linea.charAt(0);
    }

    static String quitarExtremos(String texto, char caracter) {
        if (texto.length() == 0) {
            return texto;
        }
        if (texto.length() == 1) {
            return texto.charAt(0) == caracter ? "" : texto;
        }
        if (texto.charAt(0) == caracter) {
            texto = texto.substring(1);
        }
        if (texto.length() > 0 && texto.charAt(texto.length() - 1) == caracter) {
            texto = texto.substring(0, texto.length() - 1);
        }
        return texto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar de los extremos: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarExtremos(texto, caracter));
        entrada.close();
    }
}
