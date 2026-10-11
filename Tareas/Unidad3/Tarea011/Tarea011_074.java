import java.util.Scanner;

public class Tarea011_074 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int leerEntero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static boolean prefijoAparecePosteriormente(String texto, int longitud) {
        String prefijo = texto.substring(0, longitud);
        return texto.indexOf(prefijo, 1) != -1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        int longitud = leerEntero(entrada, "Ingrese la longitud del prefijo: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La longitud del prefijo es: " + longitud);
        if (longitud < 1 || longitud > texto.length()) {
            System.out.println("La longitud debe estar entre 1 y " + texto.length());
        } else {
            System.out.println("Aparece '" + texto.substring(0, longitud) + "' en otra parte de la cadena? "
                    + prefijoAparecePosteriormente(texto, longitud));
        }
        entrada.close();
    }
}
