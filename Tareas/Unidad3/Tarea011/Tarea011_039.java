import java.util.Scanner;

public class Tarea011_039 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char primerNoRepetido(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            if (texto.indexOf(actual) == texto.lastIndexOf(actual)) {
                return actual;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char resultado = primerNoRepetido(texto);
        System.out.println("La cadena dada es: " + texto);
        if (resultado == '\0') {
            System.out.println("No existe un caracter no repetido en la cadena");
        } else {
            System.out.println("El primer caracter no repetido en la cadena es: " + resultado);
        }
        entrada.close();
    }
}
