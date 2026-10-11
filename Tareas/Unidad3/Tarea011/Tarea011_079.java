import java.util.Scanner;

public class Tarea011_079 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarCentro(String texto) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < texto.length()) {
            if (i + 2 < texto.length() && texto.charAt(i) == 'z' && texto.charAt(i + 2) == 'g') {
                resultado.append('z');
                i += 2;
            } else {
                resultado.append(texto.charAt(i));
                i++;
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarCentro(texto));
        entrada.close();
    }
}
