import java.util.Scanner;

public class Tarea011_063 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean primerosDosAlFinal(String texto) {
        if (texto.length() < 2) {
            return false;
        }
        return texto.endsWith(texto.substring(0, 2));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los primeros dos caracteres aparecen al final: " + primerosDosAlFinal(texto));
        entrada.close();
    }
}
