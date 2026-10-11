import java.util.Scanner;

public class Tarea011_041 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static String quitarCaracteresDeMascara(String texto, String mascara) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            if (mascara.indexOf(texto.charAt(i)) == -1) {
                resultado.append(texto.charAt(i));
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String mascara = leerTexto(entrada, "Ingrese la cadena mascara: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena mascara es: " + mascara);
        System.out.println();
        System.out.println("La nueva cadena es:");
        System.out.println(quitarCaracteresDeMascara(texto, mascara));
        entrada.close();
    }
}
