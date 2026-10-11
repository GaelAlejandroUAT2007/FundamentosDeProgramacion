import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Tarea011_049 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
