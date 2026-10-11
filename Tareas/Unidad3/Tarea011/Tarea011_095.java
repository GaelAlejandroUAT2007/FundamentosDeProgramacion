import java.util.Scanner;

public class Tarea011_095 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int sumarDigitos(String texto) {
        int suma = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= '0' && c <= '9') {
                suma += c - '0';
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La suma de los digitos en la cadena es: " + sumarDigitos(texto));
        entrada.close();
    }
}
