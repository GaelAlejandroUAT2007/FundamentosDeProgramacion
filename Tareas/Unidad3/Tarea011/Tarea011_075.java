import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarea011_075 {

    static String leerTexto(BufferedReader entrada, String mensaje) throws IOException {
        System.out.print(mensaje);
        return entrada.readLine();
    }

    static boolean estaEnElCentro(String texto, String buscada) {
        int inicio = texto.indexOf(buscada);
        while (inicio != -1) {
            int izquierda = inicio;
            int derecha = texto.length() - (inicio + buscada.length());
            if (Math.abs(izquierda - derecha) <= 1) {
                return true;
            }
            inicio = texto.indexOf(buscada, inicio + 1);
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String texto = leerTexto(entrada, "Ingrese la cadena: ");
        String buscada = leerTexto(entrada, "Ingrese la subcadena: ");
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Aparece " + buscada + " en el centro? " + estaEnElCentro(texto, buscada));
        entrada.close();
    }
}
