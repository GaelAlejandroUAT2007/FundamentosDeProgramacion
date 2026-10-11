import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_047 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String reorganizar(String texto, int distancia) {
        if (distancia <= 1) {
            return texto;
        }
        int[] frecuencias = new int[65536];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }
        PriorityQueue<int[]> cola = new PriorityQueue<>((a, b) -> a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]);
        for (int c = 0; c < 65536; c++) {
            if (frecuencias[c] > 0) {
                cola.add(new int[]{c, frecuencias[c]});
            }
        }
        Deque<int[]> espera = new ArrayDeque<>();
        StringBuilder resultado = new StringBuilder();
        while (!cola.isEmpty()) {
            int[] actual = cola.poll();
            resultado.append((char) actual[0]);
            actual[1]--;
            espera.add(actual);
            if (espera.size() >= distancia) {
                int[] liberado = espera.poll();
                if (liberado[1] > 0) {
                    cola.add(liberado);
                }
            }
        }
        if (resultado.length() != texto.length()) {
            return "";
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int distancia = leerEntero(entrada, "Ingrese la distancia minima entre caracteres iguales: ");
        String resultado = reorganizar(texto, distancia);
        System.out.println("La cadena dada es: " + texto);
        if (resultado.isEmpty() && !texto.isEmpty()) {
            System.out.println("No es posible reorganizar la cadena con esa distancia");
        } else {
            System.out.println("La cadena despues de reorganizar es:");
            System.out.println(resultado);
        }
        entrada.close();
    }
}
