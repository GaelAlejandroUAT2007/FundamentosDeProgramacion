import java.util.Scanner;

public class Tarea011_032 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int expandir(String texto, int izquierda, int derecha) {
        while (izquierda >= 0 && derecha < texto.length() && texto.charAt(izquierda) == texto.charAt(derecha)) {
            izquierda--;
            derecha++;
        }
        return derecha - izquierda - 1;
    }

    static String buscarPalindromoMasLargo(String texto) {
        if (texto.isEmpty()) {
            return "";
        }
        int inicio = 0;
        int mayor = 1;
        for (int centro = 0; centro < texto.length(); centro++) {
            int impar = expandir(texto, centro, centro);
            int par = expandir(texto, centro, centro + 1);
            int longitud = Math.max(impar, par);
            if (longitud > mayor) {
                mayor = longitud;
                inicio = centro - (longitud - 1) / 2;
            }
        }
        return texto.substring(inicio, inicio + mayor);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String palindromo = buscarPalindromoMasLargo(texto);
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La subcadena palindroma mas larga es: " + palindromo);
        System.out.println("La longitud de la subcadena palindroma es: " + palindromo.length());
        entrada.close();
    }
}
