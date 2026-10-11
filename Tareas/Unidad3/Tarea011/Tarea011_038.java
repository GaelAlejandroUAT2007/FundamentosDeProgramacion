import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Tarea011_038 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarDuplicados(String texto) {
        Set<Character> vistos = new LinkedHashSet<>();
        for (int i = 0; i < texto.length(); i++) {
            vistos.add(texto.charAt(i));
        }
        StringBuilder resultado = new StringBuilder();
        for (char c : vistos) {
            resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Despues de quitar los caracteres duplicados la nueva cadena es: " + quitarDuplicados(texto));
        entrada.close();
    }
}
