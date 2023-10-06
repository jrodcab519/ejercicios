import java.util.Scanner;

public class PrecioJusto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int precio1 = entrada.nextInt();
        int precio2 = entrada.nextInt();
        int precioJusto = entrada.nextInt();

        entrada.close();

        boolean ganador1 = precio1 <= precioJusto && (precio2 > precioJusto || precio1 >= precio2) ? true : false;
        boolean ganador2 = precio2 <= precioJusto && (precio1 > precioJusto || precio2 >= precio1) ? true : false;

        System.out.printf("J1: %d, J2: %d, Precio: %d. ¿Gana J1? %s ¿Gana J2? %s",
                precio1, precio2, precioJusto,(ganador1)? "Verdadero":"Falso",(ganador2)? "Verdadero":"Falso");

        System.out.println("J1: " + precio1 + ", J2: " + precio2 + ", Precio: " + precioJusto + ". ¿Gana J1? " + ganador1 + " ¿Gana J2? " + ganador2);

    }
}
