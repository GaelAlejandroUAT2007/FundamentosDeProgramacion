import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_084 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String prefijosDecrecientes(String texto, int cantidad) {
        StringBuilder resultado = new StringBuilder();
        for (int p = cantidad; p > 0; p--) {
            resultado.append(texto, 0, p);
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int cantidad = leerEntero(entrada, "Ingrese el numero de caracteres iniciales (p): ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Numero de caracteres de repeticion: " + cantidad);
        if (cantidad < 0 || cantidad > texto.length()) {
            System.out.println("El numero debe estar entre 0 y " + texto.length());
        } else {
            System.out.println("La nueva cadena es: " + prefijosDecrecientes(texto, cantidad));
        }
        entrada.close();
    }
}
