import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_105 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int contarApariciones(String texto, String buscada) {
        int total = 0;
        int posicion = texto.indexOf(buscada);
        while (posicion != -1) {
            total++;
            posicion = texto.indexOf(buscada, posicion + buscada.length());
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena principal: ");
        String buscada = leerTexto(entrada, "Ingrese la cadena a contar: ");
        if (buscada.isEmpty()) {
            System.out.println("La cadena a contar no debe estar vacia");
        } else {
            System.out.println("'" + buscada + "' aparece " + contarApariciones(texto, buscada) + " veces en '" + texto + "'");
        }
        entrada.close();
    }
}
