import java.util.Scanner;

public class Tarea011_094 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String espejoEnExtremos(String texto) {
        int n = texto.length();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (texto.charAt(i) == texto.charAt(n - 1 - i)) {
                resultado.append(texto.charAt(i));
            } else {
                break;
            }
        }
        if (resultado.length() == n) {
            return texto;
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena espejo mas larga en los extremos es: " + espejoEnExtremos(texto));
        entrada.close();
    }
}
