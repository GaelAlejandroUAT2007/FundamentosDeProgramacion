import java.util.Scanner;

public class Tarea011_070 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean estaBalanceada(String texto) {
        int ultimaP = texto.lastIndexOf('p');
        if (ultimaP == -1) {
            return true;
        }
        return texto.lastIndexOf('q') > ultimaP;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena esta balanceada pq? " + estaBalanceada(texto));
        entrada.close();
    }
}
