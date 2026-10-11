import java.util.Scanner;

public class Tarea011_066 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarDosPrimeros(String texto) {
        if (texto.length() < 2) {
            return texto;
        }
        StringBuilder resultado = new StringBuilder();
        if (texto.charAt(0) == 'g') {
            resultado.append('g');
        }
        if (texto.charAt(1) == 'h') {
            resultado.append('h');
        }
        resultado.append(texto.substring(2));
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarDosPrimeros(texto));
        entrada.close();
    }
}
