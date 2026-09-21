import java.util.Scanner;

public class NominaSemanal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldoPorHora, horasTrabajadas, pagoTotal;

           System.out.println("Ingrese el sueldo por hora: ");
           sueldoPorHora = entrada.nextDouble();
           System.out.println("Ingrese las horas trabajadas: ");
           horasTrabajadas = entrada.nextDouble();

           pagoTotal = sueldoPorHora * horasTrabajadas;

           System.out.println("El pago total de la semana es: " + pagoTotal);
     }
}
