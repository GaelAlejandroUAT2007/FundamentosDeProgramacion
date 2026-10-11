import java.util.Scanner;

public class Tarea011_024 {

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

    static String reemplazarCaracter(String texto, char viejo, char nuevo) {
        return texto.replace(viejo, nuevo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char viejo = leerCaracter(entrada, "Caracter a reemplazar: ");
        char nuevo = leerCaracter(entrada, "Caracter nuevo: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena nueva: " + reemplazarCaracter(texto, viejo, nuevo));
        entrada.close();
    }
}
