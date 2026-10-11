import java.util.Scanner;

public class Tarea011_011 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static char[] convertirAArreglo(String texto) {
        char[] arreglo = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            arreglo[i] = texto.charAt(i);
        }
        return arreglo;
    }

    static String construirCadena(char[] arreglo) {
        return new String(arreglo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese una frase: ");
        char[] arreglo = convertirAArreglo(texto);
        String resultado = construirCadena(arreglo);
        System.out.println("Cantidad de caracteres en el arreglo: " + arreglo.length);
        System.out.println(resultado);
        entrada.close();
    }
}
