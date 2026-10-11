import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_102 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine().trim();
    }

    static void convertirEntero(String texto) {
        int primitivo = Integer.parseInt(texto);
        Integer envuelto = Integer.valueOf(texto);
        System.out.println("\"" + texto + "\" como int es " + primitivo + " y como Integer es " + envuelto);
    }

    static void convertirLargo(String texto) {
        long primitivo = Long.parseLong(texto);
        Long envuelto = Long.valueOf(texto);
        System.out.println("\"" + texto + "\" como long es " + primitivo + " y como Long es " + envuelto);
    }

    static void convertirFlotante(String texto) {
        float primitivo = Float.parseFloat(texto);
        Float envuelto = Float.valueOf(texto);
        System.out.println("\"" + texto + "\" como float es " + primitivo + " y como Float es " + envuelto);
    }

    static void convertirDoble(String texto) {
        double primitivo = Double.parseDouble(texto);
        Double envuelto = Double.valueOf(texto);
        System.out.println("\"" + texto + "\" como double es " + primitivo + " y como Double es " + envuelto);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String entero = leerTexto(entrada, "Ingrese una cadena para int: ");
        String largo = leerTexto(entrada, "Ingrese una cadena para long: ");
        String flotante = leerTexto(entrada, "Ingrese una cadena para float: ");
        String doble = leerTexto(entrada, "Ingrese una cadena para double: ");
        try {
            System.out.println("Convertir cadena a int/Integer:");
            convertirEntero(entero);
            System.out.println();
            System.out.println("Convertir cadena a long/Long:");
            convertirLargo(largo);
            System.out.println();
            System.out.println("Convertir cadena a float/Float:");
            convertirFlotante(flotante);
            System.out.println();
            System.out.println("Convertir cadena a double/Double:");
            convertirDoble(doble);
        } catch (NumberFormatException e) {
            System.out.println("Alguna de las cadenas no tiene un formato numerico valido");
        }
        entrada.close();
    }
}
