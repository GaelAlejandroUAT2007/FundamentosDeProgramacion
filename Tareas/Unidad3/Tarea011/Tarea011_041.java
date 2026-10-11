import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_041 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String quitarCaracteresDeMascara(String texto, String mascara) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (mascara.indexOf(texto.charAt(i)) == -1) {
                resultado.append(texto.charAt(i));
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String mascara = leerTexto(entrada, "Ingrese la cadena mascara: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena mascara es: " + mascara);
        System.out.println();
        System.out.println("La nueva cadena es:");
        System.out.println(quitarCaracteresDeMascara(texto, mascara));
        entrada.close();
    }
}
