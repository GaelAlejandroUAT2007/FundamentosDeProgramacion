import java.util.Scanner;

public class Tarea011_077 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static String repetirConSeparador(String texto, String separador, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(texto);
            if (i < veces - 1) {
                resultado.append(separador);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena a repetir: ");
        String separador = leerTexto(entrada, "Ingrese el separador: ");
        int veces = leerEntero(entrada, "Ingrese el numero de repeticiones: ");
        System.out.println("Las cadenas dadas son: " + texto + "  y  " + separador);
        System.out.println("Numero de veces a repetir: " + veces);
        System.out.println("La nueva cadena es: " + repetirConSeparador(texto, separador, veces));
        entrada.close();
    }
}
