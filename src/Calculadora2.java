import java.util.Scanner;

public class Calculadora2 {

    static  double a = 30;
    static  double b = 40;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 2 números: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();

        entrada.close();

        double suma = suma(a, b);
        double resta = resta(a, b);
        double division = division(a, b);
        double multiplicacion = multiplicacion(a, b);

        System.out.println("La suma de a y b da como resultado: " + suma);
        System.out.println("La resta de a y b da como resultado: " + resta);
        System.out.println("La división de a entre b da como resultado: " + division);
        System.out.println("La multiplicación de a y b da como resultado: " + multiplicacion);

    }

    public static double suma(double a, double b){
        a++; // a = a + 1; postincremeto
        b--;
        --b;

        return a + b;
    }

    public static double resta(double x, double y){

        a = a + b;
        return a - b;
    }

    public static double multiplicacion(double x, double y){
        return x * y;
    }

    public static double division(double x, double y){
        return x / y;
    }

}
