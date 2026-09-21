// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompararNumeros {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce el primer numero: ");
        int numero1 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce el segundo numero: ");
        int numero2 = Integer.parseInt(entrada.readLine());

        if (numero1 >= numero2) {
            if (numero1 == numero2) {
                 System.out.println("Los numeros " + numero1 + " y " + numero2 + " son
iguales");
            } else {
                 System.out.println(numero1 + " es el mayor de los dos");
            }
        } else {
            System.out.println(numero2 + " es el mayor de los dos");
        }
    }
}
