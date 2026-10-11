import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_089 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static long sumarNumeros(String texto) {
        long suma = 0;
        long actual = 0;
        boolean enNumero = false;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isDigit(c)) {
                actual = actual * 10 + (c - '0');
                enNumero = true;
            } else {
                if (enNumero) {
                    suma += actual;
                }
                actual = 0;
                enNumero = false;
            }
        }
        if (enNumero) {
            suma += actual;
        }
        return suma;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La suma de los numeros en la cadena es: " + sumarNumeros(texto));
        entrada.close();
    }
}
