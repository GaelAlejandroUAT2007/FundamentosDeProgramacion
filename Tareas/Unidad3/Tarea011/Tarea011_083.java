import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_083 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String intercalar(String primera, String segunda) {
        StringBuilder resultado = new StringBuilder();
        int menor = Math.min(primera.length(), segunda.length());
        for (int i = 0; i < menor; i++) {
            resultado.append(primera.charAt(i)).append(segunda.charAt(i));
        }
        resultado.append(primera.substring(menor));
        resultado.append(segunda.substring(menor));
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y  " + segunda);
        System.out.println("La nueva cadena es: " + intercalar(primera, segunda));
        entrada.close();
    }
}
