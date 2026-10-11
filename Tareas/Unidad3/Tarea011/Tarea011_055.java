import java.util.Scanner;

public class Tarea011_055 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarBloquesAdyacentes(String texto) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < texto.length()) {
            int j = i;
            while (j < texto.length() && texto.charAt(j) == texto.charAt(i)) {
                j++;
            }
            if (j - i == 1) {
                resultado.append(texto.charAt(i));
            }
            i = j;
        }
        return resultado.toString();
    }

    static String quitarRecursivamente(String texto) {
        String reducido = quitarBloquesAdyacentes(texto);
        if (reducido.equals(texto)) {
            return texto;
        }
        return quitarRecursivamente(reducido);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena sin duplicados adyacentes es:");
        System.out.println(quitarRecursivamente(texto));
        entrada.close();
    }
}
