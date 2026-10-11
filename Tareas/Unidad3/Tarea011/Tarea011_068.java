import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_068 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static char leerCaracter(BufferedReader entrada, String mensaje) throws IOException {
        String linea;
        do {
            System.out.print(mensaje);
            linea = entrada.readLine();
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

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        char marca = leerCaracter(entrada, "Ingrese el caracter a quitar junto con sus vecinos: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + quitarConVecinos(texto, marca));
        entrada.close();
    }
}
