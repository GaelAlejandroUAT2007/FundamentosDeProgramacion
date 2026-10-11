import java.util.Scanner;

public class Tarea011_058 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean terminaConDosCaracteres(String texto, String sufijo) {
        return sufijo.length() == 2 && texto.endsWith(sufijo);
    }

    static void mostrarResultado(String texto, String sufijo) {
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena termina con " + sufijo + ": " + terminaConDosCaracteres(texto, sufijo));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        String sufijo = leerTexto(entrada, "Ingrese el sufijo de 2 caracteres: ");
        if (sufijo.length() != 2) {
            System.out.println("El sufijo debe tener exactamente 2 caracteres");
        } else {
            mostrarResultado(primera, sufijo);
            mostrarResultado(segunda, sufijo);
        }
        entrada.close();
    }
}
