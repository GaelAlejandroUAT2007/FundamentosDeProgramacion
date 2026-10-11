import java.util.Scanner;

public class Tarea011_096 {

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

    static String quitarSalvoExtremos(String texto, char caracter) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            boolean esExtremo = i == 0 || i == texto.length() - 1;
            if (esExtremo || texto.charAt(i) != caracter) {
                resultado.append(texto.charAt(i));
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarSalvoExtremos(texto, caracter));
        entrada.close();
    }
}
