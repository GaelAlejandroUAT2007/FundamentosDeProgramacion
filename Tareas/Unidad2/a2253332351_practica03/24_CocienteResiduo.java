// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CocienteResiduo {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce el valor de divisor: ");
        int divisor = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce el valor del dividendo: ");
        int dividendo = Integer.parseInt(entrada.readLine());

        int residuo = dividendo;
        int ciclo = 0;

        do {
            residuo = residuo - divisor;
            ciclo = ciclo + 1;
        } while (divisor <= residuo);

        System.out.println("El cociente = " + ciclo + " residuo " + residuo);
    }
}
