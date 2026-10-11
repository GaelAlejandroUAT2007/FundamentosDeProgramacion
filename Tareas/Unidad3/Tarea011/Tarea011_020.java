import java.util.Scanner;

public class Tarea011_020 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String crearEnMonticulo(String texto) {
        return new String(texto);
    }

    static String obtenerCanonica(String texto) {
        return texto.intern();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        obtenerCanonica(texto);
        String cadena1 = crearEnMonticulo(texto);
        String cadena2 = obtenerCanonica(cadena1);
        String cadena3 = obtenerCanonica(crearEnMonticulo(texto));
        System.out.println("cadena1 == cadena2? " + (cadena1 == cadena2));
        System.out.println("cadena2 == cadena3? " + (cadena2 == cadena3));
        entrada.close();
    }
}
