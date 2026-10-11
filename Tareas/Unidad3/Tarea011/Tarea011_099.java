import java.util.Scanner;

public class Tarea011_099 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String caracteresEnPosicionPar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i += 2) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La nueva cadena es: " + caracteresEnPosicionPar(texto));
        entrada.close();
    }
}
