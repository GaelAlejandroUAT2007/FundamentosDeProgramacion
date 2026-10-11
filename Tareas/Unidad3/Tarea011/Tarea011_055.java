import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_055 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
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

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena sin duplicados adyacentes es:");
        System.out.println(quitarRecursivamente(texto));
        entrada.close();
    }
}
