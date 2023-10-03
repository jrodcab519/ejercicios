import java.util.Scanner;
public class Reserva {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" introduce la capacidad de del deposito: ");
        int capacidad = entrada.nextInt();

        System.out.println(" introduce litros consumidos por viaje: ");
        int consumo = entrada.nextInt();

        int viajes = capacidad/consumo;
        int litrosSobrantes = capacidad % consumo;

        System.out.println("Con el depósito lleno se pueden realizar " + viajes + " viajes");
        System.out.println("Nos sobrarían " + litrosSobrantes + " litros");

    }
}
