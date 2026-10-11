import java.util.Scanner;

public class Tarea011_045 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String invertirPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i > 0) {
                resultado.append(' ');
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena con las palabras invertidas: " + invertirPalabras(texto));
        entrada.close();
    }
}
