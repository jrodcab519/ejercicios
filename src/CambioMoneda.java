import java.util.Scanner;

public class CambioMoneda {

    static final double EURO_LIBRAS = 0.86;
    static final double EURO_DOLARES = 1.05;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros: ");
        double euros = entrada.nextDouble();

        pasarLibras(euros);
        pasarDolares(euros);

    }

    private static void pasarDolares(double euros) {

        System.out.println(euros + " euros son " + euros * EURO_DOLARES + " dolares ");
    }

    private static void pasarLibras(double euros) {

        System.out.println(euros + " euros son " + euros * EURO_LIBRAS + " libras ");
    }


}
