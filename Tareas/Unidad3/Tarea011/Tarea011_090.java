import java.util.Scanner;

public class Tarea011_090 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static int contarApariciones(String texto, String buscada) {
        int total = 0;
        int posicion = texto.indexOf(buscada);
        while (posicion != -1) {
            total++;
            posicion = texto.indexOf(buscada, posicion + 1);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String primera = leerTexto(entrada, "Ingrese la primera subcadena: ");
        String segunda = leerTexto(entrada, "Ingrese la segunda subcadena: ");
        System.out.println("La cadena dada es: " + texto);
        if (primera.isEmpty() || segunda.isEmpty()) {
            System.out.println("Las subcadenas no deben estar vacias");
        } else {
            boolean iguales = contarApariciones(texto, primera) == contarApariciones(texto, segunda);
            System.out.println("Las apariciones de '" + primera + "' y '" + segunda + "' son iguales? " + iguales);
        }
        entrada.close();
    }
}
