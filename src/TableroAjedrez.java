import java.util.Scanner;
public class TableroAjedrez {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char caracter;

        System.out.println("Introduce el tamaño de la casilla (>3): ");
        int tamano = s.nextInt();
        System.out.println("Introduce carácter de relleno: ");
        caracter = s.next().charAt(0);

        char delimitador1 = '+';
        char relleno = caracter;
        char blanco = ' ';
        char delimitador2 = '|';

        System.out.println("+-+-+-+-+-+-+-+-+");
        System.out.println(delimitador2 + blanco + delimitador2 + relleno + delimitador2 + relleno +"| |"+relleno+"| |"+relleno+"|");
    }
}
