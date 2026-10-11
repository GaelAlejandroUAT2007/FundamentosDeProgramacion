import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_020 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String crearEnMonticulo(String texto) {
        return new String(texto);
    }

    static String obtenerCanonica(String texto) {
        return texto.intern();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        obtenerCanonica(texto);
        String cadena1 = crearEnMonticulo(texto);
        String cadena2 = obtenerCanonica(cadena1);
        String cadena3 = obtenerCanonica(crearEnMonticulo(texto));
        System.out.println("cadena1 == cadena2? " + (cadena1 == cadena2));
        System.out.println("cadena2 == cadena3? " + (cadena2 == cadena3));
        entrada.close();
    }
}
