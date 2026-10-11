import java.util.Scanner;

public class Tarea011_036 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean esIntercalado(String objetivo, String primera, String segunda) {
        if (primera.length() + segunda.length() != objetivo.length()) {
            return false;
        }
        boolean[][] tabla = new boolean[primera.length() + 1][segunda.length() + 1];
        tabla[0][0] = true;
        for (int i = 0; i <= primera.length(); i++) {
            for (int j = 0; j <= segunda.length(); j++) {
                if (i > 0 && tabla[i - 1][j] && primera.charAt(i - 1) == objetivo.charAt(i + j - 1)) {
                    tabla[i][j] = true;
                }
                if (j > 0 && tabla[i][j - 1] && segunda.charAt(j - 1) == objetivo.charAt(i + j - 1)) {
                    tabla[i][j] = true;
                }
            }
        }
        return tabla[primera.length()][segunda.length()];
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String objetivo = leerTexto(entrada, "Ingrese la cadena a verificar: ");
        String primera = leerTexto(entrada, "Ingrese la primera cadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda cadena: ");
        System.out.println("La cadena dada es: " + objetivo);
        System.out.println("Las cadenas intercaladas son " + primera + " y " + segunda);
        System.out.println("La cadena dada es un intercalado: " + esIntercalado(objetivo, primera, segunda));
        entrada.close();
    }
}
