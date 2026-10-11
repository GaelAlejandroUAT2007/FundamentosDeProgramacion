import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_040 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String[] dividir(String texto, int partes) {
        String[] resultado = new String[partes];
        int tamano = texto.length() / partes;
        for (int i = 0; i < partes; i++) {
            resultado[i] = texto.substring(i * tamano, (i + 1) * tamano);
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int partes = leerEntero(entrada, "Ingrese el numero de partes: ");
        System.out.println("La cadena dada es: " + texto);
        if (partes <= 0 || texto.length() % partes != 0) {
            System.out.println("La cadena no se puede dividir en " + partes + " partes iguales");
        } else {
            System.out.println("La cadena dividida en " + partes + " partes es:");
            System.out.println();
            for (String parte : dividir(texto, partes)) {
                System.out.println(parte);
            }
        }
        entrada.close();
    }
}
