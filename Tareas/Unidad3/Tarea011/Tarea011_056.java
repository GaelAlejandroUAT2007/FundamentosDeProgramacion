import java.util.Scanner;

public class Tarea011_056 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String unirSinDobles(String primera, String segunda) {
        if (primera.isEmpty() || segunda.isEmpty()) {
            return primera + segunda;
        }
        if (primera.charAt(primera.length() - 1) == segunda.charAt(0)) {
            return primera + segunda.substring(1);
        }
        return primera + segunda;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y  " + segunda);
        System.out.println("La cadena despues de concatenar es: " + unirSinDobles(primera, segunda));
        entrada.close();
    }
}
