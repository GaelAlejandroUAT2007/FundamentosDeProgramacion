import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea011_042 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int contar(String texto, char buscado) {
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == buscado) {
                total++;
            }
        }
        return total;
    }

    static boolean contieneTodasLasLetras(String elemento, String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (contar(elemento, letra) < contar(palabra, letra)) {
                return false;
            }
        }
        return true;
    }

    static List<String> filtrar(String[] elementos, String palabra) {
        List<String> resultado = new ArrayList<>();
        for (String elemento : elementos) {
            if (contieneTodasLasLetras(elemento, palabra)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linea = leerTexto(entrada, "Ingrese los elementos separados por espacio: ");
        String palabra = leerTexto(entrada, "Ingrese la palabra: ");
        String[] elementos = linea.trim().split("\\s+");
        System.out.println("Las cadenas dadas son: " + linea);
        System.out.println("La palabra dada es: " + palabra);
        System.out.println();
        System.out.println("Las cadenas que contienen todas las letras de la palabra son:");
        for (String elemento : filtrar(elementos, palabra)) {
            System.out.println(elemento);
        }
        entrada.close();
    }
}
