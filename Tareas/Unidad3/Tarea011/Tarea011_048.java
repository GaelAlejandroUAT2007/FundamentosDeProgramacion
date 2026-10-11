import java.util.Scanner;

public class Tarea011_048 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarBYAc(String texto) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < texto.length()) {
            if (texto.charAt(i) == 'b') {
                i++;
            } else if (texto.startsWith("ac", i)) {
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
        System.out.println("Despues de quitar, la nueva cadena es: " + quitarBYAc(texto));
        entrada.close();
    }
}
