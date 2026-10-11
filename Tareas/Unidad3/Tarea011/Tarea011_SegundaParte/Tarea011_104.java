import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_104 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String[] ordenarPorLongitud(String[] original, boolean ascendente) {
        String[] copia = Arrays.copyOf(original, original.length);
        Comparator<String> criterio = Comparator.comparingInt(String::length);
        if (!ascendente) {
            criterio = Collections.reverseOrder(criterio);
        }
        Arrays.sort(copia, criterio);
        return copia;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String linea = leerTexto(entrada, "Ingrese las cadenas separadas por espacio: ");
        String[] colores = linea.trim().split("\\s+");
        System.out.println("Colores originales sin ordenar: " + Arrays.toString(colores));
        System.out.println();
        System.out.println("Colores ordenados (descendente): " + Arrays.toString(ordenarPorLongitud(colores, false)));
        System.out.println();
        System.out.println("Colores ordenados (ascendente): " + Arrays.toString(ordenarPorLongitud(colores, true)));
        entrada.close();
    }
}
