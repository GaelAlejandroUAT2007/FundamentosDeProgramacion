import java.util.Scanner;

public class Tarea011_083 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("Las cadenas dadas son: " + primera + "  y  " + segunda);
        System.out.println("La nueva cadena es: " + intercalar(primera, segunda));
        entrada.close();
    }
}
