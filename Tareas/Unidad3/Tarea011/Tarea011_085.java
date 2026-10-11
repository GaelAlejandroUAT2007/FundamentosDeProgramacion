import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_085 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String caracteresAlrededor(String texto, String buscada) {
        StringBuilder resultado = new StringBuilder();
        int posicion = texto.indexOf(buscada);
        while (posicion != -1) {
            if (posicion > 0) {
                resultado.append(texto.charAt(posicion - 1));
            }
            int despues = posicion + buscada.length();
            if (despues < texto.length()) {
                resultado.append(texto.charAt(despues));
            }
            posicion = texto.indexOf(buscada, despues);
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String buscada = leerTexto(entrada, "Ingrese la subcadena (no vacia): ");
        System.out.println("Las cadenas dadas son: " + texto + "  y " + buscada);
        if (texto.isEmpty() || buscada.isEmpty()) {
            System.out.println("Las cadenas no deben estar vacias");
        } else {
            System.out.println("La nueva cadena es: " + caracteresAlrededor(texto, buscada));
        }
        entrada.close();
    }
}
