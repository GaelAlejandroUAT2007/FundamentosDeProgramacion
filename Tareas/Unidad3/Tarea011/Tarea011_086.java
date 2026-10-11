import java.util.Scanner;

public class Tarea011_086 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int contarTriples(String texto) {
        int total = 0;
        for (int i = 0; i + 2 < texto.length(); i++) {
            if (texto.charAt(i) == texto.charAt(i + 1) && texto.charAt(i) == texto.charAt(i + 2)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El numero de triples en la cadena es: " + contarTriples(texto));
        entrada.close();
    }
}
