import java.util.Scanner;

public class Tarea011_050 {

    static String leerTexto(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static long calcularRango(String texto) {
        long rango = 1;
        int longitud = texto.length();
        for (int i = 0; i < longitud; i++) {
            int menores = 0;
            for (int j = i + 1; j < longitud; j++) {
                if (texto.charAt(j) < texto.charAt(i)) {
                    menores++;
                }
            }
            rango += menores * factorial(longitud - i - 1);
        }
        return rango;
    }

    static boolean tieneRepetidos(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.indexOf(texto.charAt(i)) != i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = leerTexto(entrada, "Ingrese la cadena (sin caracteres repetidos, maximo 20): ");
        System.out.println("La cadena dada es: " + texto);
        if (texto.length() > 20 || tieneRepetidos(texto)) {
            System.out.println("La cadena debe tener maximo 20 caracteres y no tener repetidos");
        } else {
            System.out.println("El rango lexicografico de la cadena es: " + calcularRango(texto));
        }
        entrada.close();
    }
}
