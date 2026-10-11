import java.util.Scanner;

public class Tarea011_087 {

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

    static boolean esFeliz(String texto, char caracter) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                boolean izquierda = i > 0 && texto.charAt(i - 1) == caracter;
                boolean derecha = i < texto.length() - 1 && texto.charAt(i + 1) == caracter;
                if (!izquierda && !derecha) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a verificar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Es " + caracter + " feliz en la cadena: " + esFeliz(texto, caracter));
        entrada.close();
    }
}
