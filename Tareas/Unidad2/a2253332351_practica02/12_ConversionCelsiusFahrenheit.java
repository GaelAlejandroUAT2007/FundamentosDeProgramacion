import java.util.Scanner;

public class ConversionCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, fahrenheit;

          System.out.println("Ingrese la temperatura en grados Celsius: ");
          celsius = entrada.nextDouble();

          fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " +
fahrenheit);
    }
}
