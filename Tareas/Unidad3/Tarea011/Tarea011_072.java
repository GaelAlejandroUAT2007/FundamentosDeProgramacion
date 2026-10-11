import java.util.Scanner;

public class Tarea011_072 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean contienePatron(String texto) {
        for (int i = 0; i + 2 < texto.length(); i++) {
            if (texto.charAt(i) == 'p' && texto.charAt(i + 2) == 'p') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece p?p en la cadena? " + contienePatron(texto));
        entrada.close();
    }
}
