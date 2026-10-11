import java.util.Scanner;

public class Tarea011_054 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String ventanaMinima(String texto, String buscados) {
        if (buscados.isEmpty() || texto.length() < buscados.length()) {
            return "";
        }
        int[] necesarios = new int[65536];
        for (int i = 0; i < buscados.length(); i++) {
            necesarios[buscados.charAt(i)]++;
        }
        int faltantes = buscados.length();
        int izquierda = 0;
        int mejorInicio = 0;
        int mejorLongitud = Integer.MAX_VALUE;
        for (int derecha = 0; derecha < texto.length(); derecha++) {
            if (necesarios[texto.charAt(derecha)]-- > 0) {
                faltantes--;
            }
            while (faltantes == 0) {
                if (derecha - izquierda + 1 < mejorLongitud) {
                    mejorLongitud = derecha - izquierda + 1;
                    mejorInicio = izquierda;
                }
                if (++necesarios[texto.charAt(izquierda)] > 0) {
                    faltantes++;
                }
                izquierda++;
            }
        }
        if (mejorLongitud == Integer.MAX_VALUE) {
            return "";
        }
        return texto.substring(mejorInicio, mejorInicio + mejorLongitud);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena principal: ");
        String buscados = leerTexto(entrada, "Ingrese los caracteres a buscar: ");
        String ventana = ventanaMinima(texto, buscados);
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los caracteres a buscar en la cadena principal son: " + buscados);
        if (ventana.isEmpty()) {
            System.out.println("No existe una ventana que contenga todos los caracteres");
        } else {
            System.out.println("La ventana mas pequena que contiene los caracteres es : " + ventana);
        }
        entrada.close();
    }
}
