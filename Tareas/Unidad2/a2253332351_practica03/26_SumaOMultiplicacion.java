// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaOMultiplicacion {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce el primer numero: ");
        int numero1 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce el segundo numero: ");
        int numero2 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce el tercer numero: ");
        int numero3 = Integer.parseInt(entrada.readLine());

        int resultado;
        if (numero1 < 0) {
            resultado = numero1 + numero2 + numero3;
        } else {
            resultado = numero1 * numero2 * numero3;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
