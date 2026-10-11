import java.util.Scanner;

public class Tarea011_098 {

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

    static boolean primeraAparicionSeguida(String texto, char caracter) {
        int posicion = texto.indexOf(caracter);
        if (posicion == -1 || posicion + 1 >= texto.length()) {
            return false;
        }
        return texto.charAt(posicion + 1) == caracter;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece '" + caracter + "' dos veces seguidas en su primera aparicion? "
                + primeraAparicionSeguida(texto, caracter));
        entrada.close();
    }
}
