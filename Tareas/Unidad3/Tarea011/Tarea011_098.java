import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_098 {

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

    static boolean primeraAparicionSeguida(String texto, char caracter) {
        int posicion = texto.indexOf(caracter);
        if (posicion == -1 || posicion + 1 >= texto.length()) {
            return false;
        }
        return texto.charAt(posicion + 1) == caracter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece '" + caracter + "' dos veces seguidas en su primera aparicion? "
                + primeraAparicionSeguida(texto, caracter));
        entrada.close();
    }
}
