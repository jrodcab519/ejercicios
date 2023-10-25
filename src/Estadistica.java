import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int mediaEdad;
        int mediaEstatura;
        int contadorEdad = 0;
        int contadorEstatura = 0;
        int edad;
        int estatura;
        int sumaEdad = 0;
        int sumaEstatura = 0;
        int contadorPersonas = 0;

        do {
            System.out.println("Introduce la edad :");
            edad = s.nextInt();
            if (edad != -1) {
                System.out.println("Introduce la estatura :");
                estatura = s.nextInt();

                sumaEdad = sumaEdad + edad;
                sumaEstatura = sumaEstatura + estatura;

                if(edad >= 18) {
                    contadorEdad++;
                }
                if(estatura >= 175){
                    contadorEstatura++;
                }
                contadorPersonas++;
            }

        } while (edad != -1);

        mediaEdad = sumaEdad/contadorPersonas;
        mediaEstatura = sumaEstatura/contadorPersonas;

        System.out.println("Hay " + contadorEdad + " personas mayores de edad.");
        System.out.println("Hay " + contadorEstatura + " personas más altas de 175 cm.");
        System.out.println("La media de edad es de: " + mediaEdad);
        System.out.println("La media de estatura es de " + mediaEstatura);
    }
}
