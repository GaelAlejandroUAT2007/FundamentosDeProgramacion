// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CelsiusAFahrenheit {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

          System.out.print("Introduce los grados Celsius: ");
          int c = Integer.parseInt(entrada.readLine());

          double f = (9.0 / 5) * c + 32;

          System.out.println("Los grados Celsius " + c + " a grados Fahrenheit son " +
f);
      }
}
