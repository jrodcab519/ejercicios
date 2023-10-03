import java.util.Scanner;

public class ComparacionNumerica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();

        entrada.close();

        String menorCero = "El número %d es menor que cero.%n";
        String ceroCien = "El número %d está entre 0 y 100.%n";
        String mayorCien = "El número %d es mayor que 100.%n";

        System.out.printf((x < 0) ? menorCero : ( ( x > 100) ? mayorCien : ceroCien), x);

        System.out.printf("Hola %d, que tal", x);

    }
}