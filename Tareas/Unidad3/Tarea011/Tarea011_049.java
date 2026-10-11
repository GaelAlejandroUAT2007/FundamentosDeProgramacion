import java.util.ArrayDeque;
import java.util.Deque;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_049 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char primerNoRepetido(Deque<Character> candidatos, int[] frecuencias) {
        while (!candidatos.isEmpty() && frecuencias[candidatos.peekFirst()] > 1) {
            candidatos.pollFirst();
        }
        if (candidatos.isEmpty()) {
            return '#';
        }
        return candidatos.peekFirst();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int[] frecuencias = new int[65536];
        Deque<Character> candidatos = new ArrayDeque<>();
        System.out.println("Cadena: " + texto);
        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);
            frecuencias[actual]++;
            if (frecuencias[actual] == 1) {
                candidatos.addLast(actual);
            }
            System.out.println("Leyendo: " + actual);
            System.out.println("El primer caracter no repetido hasta ahora es:  " + primerNoRepetido(candidatos, frecuencias));
        }
        entrada.close();
    }
}
