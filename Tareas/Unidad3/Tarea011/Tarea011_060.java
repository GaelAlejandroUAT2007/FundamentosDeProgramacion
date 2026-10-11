import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_060 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static String unirConLongitudIgual(String primera, String segunda) {
        int menor = Math.min(primera.length(), segunda.length());
        String ajustadaPrimera = primera.substring(primera.length() - menor);
        String ajustadaSegunda = segunda.substring(segunda.length() - menor);
        return ajustadaPrimera + ajustadaSegunda;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + " y " + segunda);
        System.out.println("La nueva cadena es: " + unirConLongitudIgual(primera, segunda));
        entrada.close();
    }
}
