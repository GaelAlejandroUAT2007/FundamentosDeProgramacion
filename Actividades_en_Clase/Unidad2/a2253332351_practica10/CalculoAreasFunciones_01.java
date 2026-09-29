package a2253332351_practica10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoAreasFunciones_01 {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String mostrarMenu() throws IOException {
        String opc;
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
        opc = lectura.readLine();
        return opc;
    }

    public static double pedirDato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }
    
    public static double calcularAreaCirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) throws IOException {
        String opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case "c":
                case "C": {
                    double radio = pedirDato("Ingresa el radio del círculo: ");
                    double areaCirculo = calcularAreaCirculo(radio);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                }
                case "t":
                case "T": {
                    double base = pedirDato("Ingresa la base del triángulo: ");
                    double altura = pedirDato("Ingresa la altura del triángulo: ");
                    double areaTriangulo = calcularAreaTriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                }
                case "s":
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!(opcion.equals("s") || opcion.equals("S")));
    }
}
