import java.util.Scanner;

public class Tarea011_092 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarTodas(String principal, String quitar) {
        if (quitar.isEmpty()) {
            return principal;
        }
        return principal.replace(quitar, "");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String principal = leerTexto(entrada, "Ingrese la cadena principal: ");
        String quitar = leerTexto(entrada, "Ingrese la cadena a quitar: ");
        System.out.println("La cadena principal es: " + principal);
        System.out.println("La cadena a quitar es: " + quitar);
        System.out.println("La nueva cadena es: " + quitarTodas(principal, quitar));
        entrada.close();
    }
}
