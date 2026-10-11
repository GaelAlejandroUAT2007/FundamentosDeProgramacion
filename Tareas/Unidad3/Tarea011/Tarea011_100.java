import java.util.Scanner;

public class Tarea011_100 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean contiene(String texto, String buscada) {
        return texto.contains(buscada);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese el texto: ");
        String primera = leerTexto(entrada, "Ingrese la primera palabra a buscar: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda palabra a buscar: ");
        System.out.println("Cadena original:");
        System.out.println(texto);
        System.out.println();
        System.out.println("Esta '" + primera + "' presente en el texto?");
        System.out.println(contiene(texto, primera));
        System.out.println();
        System.out.println("Esta '" + segunda + "' presente en el texto?");
        System.out.println(contiene(texto, segunda));
        entrada.close();
    }
}
