import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Tarea011_047 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
