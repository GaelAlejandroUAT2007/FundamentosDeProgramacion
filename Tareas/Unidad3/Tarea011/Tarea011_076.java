import java.util.Scanner;

public class Tarea011_076 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int contarPatron(String texto) {
        int total = 0;
        for (int i = 0; i + 3 < texto.length(); i++) {
            if (texto.charAt(i) == 'l' && texto.charAt(i + 1) == 'i' && texto.charAt(i + 3) == 'e') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La subcadena life o li?e aparece el siguiente numero de veces: " + contarPatron(texto));
        entrada.close();
    }
}
