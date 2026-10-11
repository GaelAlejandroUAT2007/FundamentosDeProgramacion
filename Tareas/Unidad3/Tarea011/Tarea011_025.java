import java.util.Scanner;

public class Tarea011_025 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String reemplazarPorExpresion(String texto, String expresion, String reemplazo) {
        return texto.replaceAll(expresion, reemplazo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String expresion = leerTexto(entrada, "Ingrese la expresion regular a buscar: ");
        String reemplazo = leerTexto(entrada, "Ingrese el reemplazo: ");
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena nueva: " + reemplazarPorExpresion(texto, expresion, reemplazo));
        entrada.close();
    }
}
