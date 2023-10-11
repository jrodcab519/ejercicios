import java.util.Scanner;

public class ComparacionNumeros {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println(" introduce numero entero: ");
        int n1 = s.nextInt();
        System.out.println(" introduce numero entero: ");
        int n2 = s.nextInt();

        if(n1 > n2) {
            System.out.println(" el numero mayor es " + n1);
        }
        else {
            System.out.println(" el numero mayor es " + n1);
        }
    }
}
