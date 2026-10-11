import java.util.Scanner;

public class Tarea011_060 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String unirConLongitudIgual(String primera, String segunda) {
        int menor = Math.min(primera.length(), segunda.length());
        String ajustadaPrimera = primera.substring(primera.length() - menor);
        String ajustadaSegunda = segunda.substring(segunda.length() - menor);
        return ajustadaPrimera + ajustadaSegunda;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + " y " + segunda);
        System.out.println("La nueva cadena es: " + unirConLongitudIgual(primera, segunda));
        entrada.close();
    }
}
