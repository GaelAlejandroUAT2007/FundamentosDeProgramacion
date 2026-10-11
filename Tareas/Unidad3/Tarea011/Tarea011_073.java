import java.util.Scanner;

public class Tarea011_073 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static boolean apareceAntesDelPunto(String texto, String buscada) {
        int punto = texto.indexOf('.');
        if (punto == -1) {
            return false;
        }
        return texto.substring(0, punto).contains(buscada);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String buscada = leerTexto(entrada, "Ingrese la subcadena a buscar: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece '" + buscada + "' antes del punto? " + apareceAntesDelPunto(texto, buscada));
        entrada.close();
    }
}
