import java.util.Scanner;

public class Tarea011_043 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char masFrecuente(String texto) {
        int[] frecuencias = new int[65536];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }
        char resultado = texto.charAt(0);
        for (int i = 0; i < texto.length(); i++) {
            if (frecuencias[texto.charAt(i)] > frecuencias[resultado]) {
                resultado = texto.charAt(i);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        if (texto.isEmpty()) {
            System.out.println("La cadena esta vacia");
        } else {
            System.out.println("La cadena dada es: " + texto);
            System.out.println("El caracter que mas se repite en la cadena es: " + masFrecuente(texto));
        }
        entrada.close();
    }
}
