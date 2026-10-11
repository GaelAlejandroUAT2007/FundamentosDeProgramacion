import java.util.Scanner;

public class Tarea011_088 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String reemplazarIs(String texto) {
        return texto.replaceAll("\\bis\\b", "is not");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + reemplazarIs(texto));
        entrada.close();
    }
}
