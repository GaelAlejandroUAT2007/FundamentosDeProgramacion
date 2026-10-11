import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_078 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static int leerEntero(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.readLine().trim());
    }

    static String repetirFinal(String texto, int caracteres, int veces) {
        String parte = texto.substring(texto.length() - caracteres);
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(parte);
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int caracteres = leerEntero(entrada, "Cuantos caracteres finales desea tomar: ");
        int veces = leerEntero(entrada, "Cuantas veces desea repetirlos: ");
        System.out.println("La cadena dada es: " + texto);
        if (caracteres < 0 || caracteres > texto.length() || veces < 0) {
            System.out.println("Datos invalidos");
        } else {
            System.out.println("La nueva cadena despues de la repeticion: " + repetirFinal(texto, caracteres, veces));
        }
        entrada.close();
    }
}
