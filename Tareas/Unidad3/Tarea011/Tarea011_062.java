import java.util.Scanner;

public class Tarea011_062 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean contieneGood(String texto) {
        return texto.startsWith("good") || texto.startsWith("good", 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("'good' aparece en la posicion 0 o 1: " + contieneGood(texto));
        entrada.close();
    }
}
