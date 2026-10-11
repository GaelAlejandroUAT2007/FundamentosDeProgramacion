import java.util.Scanner;

public class Tarea011_040 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static String[] dividir(String texto, int partes) {
        String[] resultado = new String[partes];
        int tamano = texto.length() / partes;
        for (int i = 0; i < partes; i++) {
            resultado[i] = texto.substring(i * tamano, (i + 1) * tamano);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int partes = leerEntero(entrada, "Ingrese el numero de partes: ");
        System.out.println("La cadena dada es: " + texto);
        if (partes <= 0 || texto.length() % partes != 0) {
            System.out.println("La cadena no se puede dividir en " + partes + " partes iguales");
        } else {
            System.out.println("La cadena dividida en " + partes + " partes es:");
            System.out.println();
            for (String parte : dividir(texto, partes)) {
                System.out.println(parte);
            }
        }
        entrada.close();
    }
}
