import java.util.Scanner;

public class Tarea011_061 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static String tomarExtremos(String texto, int cantidad) {
        return texto.substring(0, cantidad) + texto.substring(texto.length() - cantidad);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int cantidad = leerEntero(entrada, "Ingrese la cantidad de caracteres: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero dado es: " + cantidad);
        if (cantidad < 0 || cantidad > texto.length()) {
            System.out.println("La cantidad debe estar entre 0 y " + texto.length());
        } else {
            System.out.println("La nueva cadena es: " + tomarExtremos(texto, cantidad));
        }
        entrada.close();
    }
}
