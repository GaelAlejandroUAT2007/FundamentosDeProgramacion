import java.util.Scanner;

public class Tarea011_059 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String colorInicial(String texto) {
        if (texto.startsWith("red")) {
            return "red";
        }
        if (texto.startsWith("black")) {
            return "black";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String color = colorInicial(texto);
        System.out.println("La cadena dada es: " + texto);
        if (color.isEmpty()) {
            System.out.println("La cadena no empieza con ningun color (cadena vacia)");
        } else {
            System.out.println("La cadena empieza con el color: " + color);
        }
        entrada.close();
    }
}
