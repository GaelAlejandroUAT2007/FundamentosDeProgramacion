import java.util.Scanner;

public class Tarea011_064 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarInicioRepetido(String texto) {
        if (texto.length() >= 2 && texto.endsWith(texto.substring(0, 2))) {
            return texto.substring(2);
        }
        return texto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarInicioRepetido(texto));
        entrada.close();
    }
}
