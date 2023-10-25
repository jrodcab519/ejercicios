import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int numero;
        do {
            System.out.println("Introduce un número para calcular su factorial (-1 para salir)");
            numero = s.nextInt();

            long factorial = 1;

            if (numero <0) {
                System.out.println("El factorial no está definido para número negativos.");
            } else {
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial de " + numero + " es " + factorial);
            }

        } while (numero != -1);
    }
}
