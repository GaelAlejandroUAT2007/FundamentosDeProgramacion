// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaterialLosa {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

        System.out.print("Introduce la longitud de la losa (X) en metros: ");
        double x = Double.parseDouble(entrada.readLine());

        System.out.print("Introduce el ancho de la losa (Y) en metros: ");
        double y = Double.parseDouble(entrada.readLine());

        System.out.print("Introduce el espesor de la losa (N) en metros: ");
        double n = Double.parseDouble(entrada.readLine());

        double volumenLosa = x * y * n;
        double volCemento = volumenLosa * (1.0 / 6);
        double volArena = volumenLosa * (2.0 / 6);
        double volGrava = volumenLosa * (3.0 / 6);
        double volAgua = volCemento * 0.5;

        System.out.println("El volumen de la losa es: " + volumenLosa + " m3");
        System.out.println("Cemento necesario: " + volCemento + " m3");
        System.out.println("Arena necesaria: " + volArena + " m3");
        System.out.println("Grava necesaria: " + volGrava + " m3");
        System.out.println("Agua necesaria: " + volAgua + " m3");
    }
}
