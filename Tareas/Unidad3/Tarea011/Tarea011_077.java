import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_077 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String repetirConSeparador(String texto, String separador, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(texto);
            if (i < veces - 1) {
                resultado.append(separador);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena a repetir: ");
        String separador = leerTexto(entrada, "Ingrese el separador: ");
        int veces = leerEntero(entrada, "Ingrese el numero de repeticiones: ");
        System.out.println("Las cadenas dadas son: " + texto + "  y  " + separador);
        System.out.println("Numero de veces a repetir: " + veces);
        System.out.println("La nueva cadena es: " + repetirConSeparador(texto, separador, veces));
        entrada.close();
    }
}
