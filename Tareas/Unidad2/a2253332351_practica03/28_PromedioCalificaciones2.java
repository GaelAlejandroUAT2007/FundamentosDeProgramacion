// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioCalificaciones {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce la calificacion 1: ");
        int c1 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce la calificacion 2: ");
        int c2 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce la calificacion 3: ");
        int c3 = Integer.parseInt(entrada.readLine());

        double promedio = (c1 + c2 + c3) / 3.0;

        System.out.println("El promedio es = " + promedio);
    }
}
