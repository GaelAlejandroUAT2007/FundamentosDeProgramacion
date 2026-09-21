// Nota: la entrada de datos se realiza con BufferedReader / InputStreamReader; no se utiliza la clase Scanner.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MuroLadrillosCastillos {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new
InputStreamReader(System.in));

           System.out.print("Introduce la longitud del muro (X) en metros: ");
           double lMuro = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce la altura del muro (Y) en metros: ");
           double aMuro = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce el numero de castillos (N): ");
           double n = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce la longitud de cada castillo (P) en metros: ");
           double pCastillo = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce el largo del ladrillo en metros: ");
           double largoLadrillo = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce la altura del ladrillo en metros: ");
           double altoLadrillo = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce el espesor de la junta horizontal en metros: ");
           double juntaH = Double.parseDouble(entrada.readLine());

           System.out.print("Introduce el espesor de la junta vertical en metros: ");
           double juntaV = Double.parseDouble(entrada.readLine());

           double areaMuro = lMuro * aMuro;
           double areaCastillos = n * pCastillo * aMuro;
           double areaNeta = areaMuro - areaCastillos;
           double areaLadrilloJunta = (altoLadrillo + juntaH) * (largoLadrillo +
juntaV);
           double numLadrillos = areaNeta / areaLadrilloJunta;

           System.out.println("El area del muro es: " + areaMuro + " m2");
           System.out.println("El area ocupada por los castillos es: " + areaCastillos +
" m2");
           System.out.println("El area neta a cubrir con ladrillo es: " + areaNeta + "
m2");
           System.out.println("El numero de ladrillos necesarios es: " + numLadrillos);
    }
}
