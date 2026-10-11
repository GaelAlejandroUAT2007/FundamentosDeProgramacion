import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_080 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char leerCaracter(BufferedReader entrada, String mensaje) throws IOException {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.readLine();
        } while (linea.isEmpty());
        return linea.charAt(0);
    }

    static boolean vecinosIguales(String texto, char marca) {
        for (int i = 1; i < texto.length() - 1; i++) {
            if (texto.charAt(i) == marca && texto.charAt(i - 1) != texto.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char marca = leerCaracter(entrada, "Ingrese el caracter a verificar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los caracteres anterior y posterior son iguales: " + vecinosIguales(texto, marca));
        entrada.close();
    }
}
