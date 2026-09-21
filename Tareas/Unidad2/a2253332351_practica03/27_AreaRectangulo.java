// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaRectangulo {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(entrada.readLine());

        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(entrada.readLine());

        double area = base * altura;

        System.out.println("El area es = " + area);
    }
}
