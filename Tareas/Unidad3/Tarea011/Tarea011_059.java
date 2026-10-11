import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_059 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
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

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
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
