import java.util.Scanner;

public class Tarea011_021 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int[] calcularUltimosIndices(String texto) {
        int[] indices = new int[26];
        for (int i = 0; i < 26; i++) {
            indices[i] = texto.lastIndexOf((char) ('a' + i));
        }
        return indices;
    }

    static void mostrarFila(int[] indices, int desde, int hasta) {
        StringBuilder letras = new StringBuilder();
        StringBuilder valores = new StringBuilder();
        for (int i = desde; i <= hasta; i++) {
            letras.append(String.format("%-4c", (char) ('a' + i)));
            valores.append(String.format("%-4d", indices[i]));
        }
        System.out.println(letras);
        System.out.println("=".repeat(4 * (hasta - desde + 1)));
        System.out.println(valores);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese una cadena con el alfabeto: ");
        int[] indices = calcularUltimosIndices(texto);
        mostrarFila(indices, 0, 9);
        mostrarFila(indices, 10, 19);
        mostrarFila(indices, 20, 25);
        entrada.close();
    }
}
