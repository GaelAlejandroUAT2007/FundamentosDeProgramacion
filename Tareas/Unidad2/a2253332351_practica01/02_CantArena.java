import java.util.Scanner;

public class CantArena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double metros, largo, ancho, arena;

            System.out.println("Ingrese el largo de la pared en metros: ");
            largo = entrada.nextDouble();
            System.out.println("Ingrese el ancho de la pared en metros: ");
            ancho = entrada.nextDouble();

            metros = 0.5;
            arena = largo * ancho * metros;

            System.out.println("La cantidad de arena necesaria es de: " + arena);
     }
}
