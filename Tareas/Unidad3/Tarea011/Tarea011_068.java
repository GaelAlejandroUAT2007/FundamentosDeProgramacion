import java.util.Scanner;

public class Tarea011_068 {

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

    static String quitarConVecinos(String texto, char marca) {
        boolean[] eliminar = new boolean[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == marca) {
                eliminar[i] = true;
                if (i > 0) {
                    eliminar[i - 1] = true;
                }
                if (i < texto.length() - 1) {
                    eliminar[i + 1] = true;
                }
            }
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (!eliminar[i]) {
                resultado.append(texto.charAt(i));
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char marca = leerCaracter(entrada, "Ingrese el caracter a quitar junto con sus vecinos: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarConVecinos(texto, marca));
        entrada.close();
    }
}
