import java.util.Scanner;

public class Tarea011_093 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String subcadenaEnAmbosExtremos(String texto) {
        for (int longitud = texto.length() / 2; longitud >= 1; longitud--) {
            String prefijo = texto.substring(0, longitud);
            String sufijo = texto.substring(texto.length() - longitud);
            if (prefijo.equals(sufijo)) {
                return prefijo;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String resultado = subcadenaEnAmbosExtremos(texto);
        System.out.println("La cadena dada es: " + texto);
        if (resultado.isEmpty()) {
            System.out.println("No existe una subcadena que aparezca en ambos extremos");
        } else {
            System.out.println("La subcadena mas larga en ambos extremos es: " + resultado);
        }
        entrada.close();
    }
}
