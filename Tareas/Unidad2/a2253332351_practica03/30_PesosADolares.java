// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PesosADolares {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce el valor del dolar: ");
        double vdolar = Double.parseDouble(entrada.readLine());

        System.out.print("Cuantos pesos vas a convertir: ");
        double pconvertir = Double.parseDouble(entrada.readLine());

        double ndolares = pconvertir / vdolar;

        System.out.println(pconvertir + " pesos son " + ndolares + " dolares");
    }
}
