import java.util.Scanner;

public class Tarea011_044 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String invertir(String texto) {
        if (texto.length() <= 1) {
            return texto;
        }
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena en orden inverso es:");
        System.out.println(invertir(texto));
        entrada.close();
    }
}
