import java.util.Scanner;

public class Baldosas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ancho del local: ");
        double ancho = entrada.nextDouble();

        System.out.println("Largo del local: ");
        double largo = entrada.nextDouble();

        System.out.println("Dimension baldosa (m2): ");
        double dimensionBaldosa = entrada.nextDouble();

        System.out.println("Nª de baldosas: ");
        double numeroBaldosas = entrada.nextDouble();


        entrada.close();

        double superficieLocal = largo * ancho;

        double totalBaldosa = dimensionBaldosa *numeroBaldosas;

        System.out.println((totalBaldosa >= superficieLocal) ? "Verdadero" : "Falso");

    }
}
