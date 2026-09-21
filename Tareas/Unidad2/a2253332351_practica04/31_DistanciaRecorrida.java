// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanciaRecorrida {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce la velocidad promedio en km/h: ");
        double velocidad = Double.parseDouble(entrada.readLine());

        System.out.print("Introduce el tiempo del recorrido en horas: ");
        double tiempo = Double.parseDouble(entrada.readLine());

        double distancia = velocidad * tiempo;

        System.out.println("La distancia recorrida fue " + distancia + " km");
    }
}
