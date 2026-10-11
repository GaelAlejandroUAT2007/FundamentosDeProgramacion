import java.util.Scanner;

public class Tarea011_053 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean coincide(String texto, String patron) {
        boolean[][] tabla = new boolean[texto.length() + 1][patron.length() + 1];
        tabla[0][0] = true;
        for (int j = 1; j <= patron.length(); j++) {
            if (patron.charAt(j - 1) == '*') {
                tabla[0][j] = tabla[0][j - 1];
            }
        }
        for (int i = 1; i <= texto.length(); i++) {
            for (int j = 1; j <= patron.length(); j++) {
                char p = patron.charAt(j - 1);
                if (p == '*') {
                    tabla[i][j] = tabla[i][j - 1] || tabla[i - 1][j];
                } else if (p == '?' || p == texto.charAt(i - 1)) {
                    tabla[i][j] = tabla[i - 1][j - 1];
                }
            }
        }
        return tabla[texto.length()][patron.length()];
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String patron = leerTexto(entrada, "Ingrese el patron (use * y ?): ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("El patron dado es: " + patron);
        if (coincide(texto, patron)) {
            System.out.println("El patron coincide.");
        } else {
            System.out.println("El patron no coincide.");
        }
        entrada.close();
    }
}
