import java.util.Scanner;

public class SumaNotaFor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int suma = 0;

        for(int i = 1; i <=10; i++){
            System.out.println("Introduce nota : " + i);
            int nota = s.nextInt();
            suma += nota;
        }

        System.out.println("La suma de notas es: " + suma);

    }
}
