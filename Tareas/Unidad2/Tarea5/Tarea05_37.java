import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_37
 *
 * Enunciado: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
 * media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * más de 1.75.
 */
public class Tarea05_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = 0, edad = 0, c18 = 0, c175 = 0;
        double est = 0.0, se = 0.0, sh = 0.0;

        se = 0;
        sh = 0;
        c18 = 0;
        c175 = 0;
        for (i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i + " - edad:");
            edad = sc.nextInt();
            System.out.println("Alumno " + i + " - estatura (m):");
            est = sc.nextDouble();
            se = se + edad;
            sh = sh + est;
            if (edad > 18) {
                c18 = c18 + 1;
            }
            if (est > 1.75) {
                c175 = c175 + 1;
            }
        }
        System.out.println("Edad media: " + (se / 5));
        System.out.println("Estatura media: " + (sh / 5));
        System.out.println("Mayores de 18 años: " + c18);
        System.out.println("Miden más de 1.75: " + c175);

        sc.close();
    }
}
