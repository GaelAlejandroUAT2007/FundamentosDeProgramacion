import java.util.Scanner;

public class Tarea011_080 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char leerCaracter(Scanner entrada, String mensaje) {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.nextLine();
        } while (linea.isEmpty());
        return linea.charAt(0);
    }

    static boolean vecinosIguales(String texto, char marca) {
        for (int i = 1; i < texto.length() - 1; i++) {
            if (texto.charAt(i) == marca && texto.charAt(i - 1) != texto.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char marca = leerCaracter(entrada, "Ingrese el caracter a verificar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los caracteres anterior y posterior son iguales: " + vecinosIguales(texto, marca));
        entrada.close();
    }
}
