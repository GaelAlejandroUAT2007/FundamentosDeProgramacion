import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_011 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char[] convertirAArreglo(String texto) {
        char[] arreglo = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            arreglo[i] = texto.charAt(i);
        }
        return arreglo;
    }

    static String construirCadena(char[] arreglo) {
        return new String(arreglo);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese una frase: ");
        char[] arreglo = convertirAArreglo(texto);
        String resultado = construirCadena(arreglo);
        System.out.println("Cantidad de caracteres en el arreglo: " + arreglo.length);
        System.out.println(resultado);
        entrada.close();
    }
}
