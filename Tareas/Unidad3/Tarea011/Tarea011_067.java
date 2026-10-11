import java.util.Scanner;

public class Tarea011_067 {

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

    static String quitarInicio(String texto, char caracter) {
        if (texto.length() < 2) {
            return texto;
        }
        StringBuilder resultado = new StringBuilder();
        if (texto.charAt(0) != caracter) {
            resultado.append(texto.charAt(0));
        }
        if (texto.charAt(1) != caracter) {
            resultado.append(texto.charAt(1));
        }
        resultado.append(texto.substring(2));
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char caracter = leerCaracter(entrada, "Ingrese el caracter a quitar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarInicio(texto, caracter));
        entrada.close();
    }
}
