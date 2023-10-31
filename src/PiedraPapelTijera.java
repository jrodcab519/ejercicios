import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Elija una opción \n A. Piedra \n B. Papel \n C. Tijera \n X. Para salir");
            opcion = s.next().charAt(0);
            int ordenador;
            ordenador = (int) (Math.random() * 3)+1;
            // si el número aleatorio es 1 será Piedra, si es 2 será Papel y si es 3 será Tijera.
            if (opcion == 'A' && ordenador == 3) {
                System.out.println("Ordenador elige Tijera \nPiedra vs Tijera. Has ganado");
            }
            else if (opcion == 'A' && ordenador == 2) {
                System.out.println("Ordenador elige Papel \nPiedra vs Papel. Has perdido");
            }
            else if (opcion == 'A' && ordenador == 1) {
                System.out.println("Ordenador elige Piedra \nPiedra vs Piedra. Empate");
            }
                else if (opcion == 'B' && ordenador == 3) {
                    System.out.println("Ordenador elige Tijera \nPapel vs Tijera. Has perdido");
                }
                else if (opcion == 'B' && ordenador == 2) {
                    System.out.println("Ordenador elige Papel \nPapel vs Papel. Empate");
                }
                else if (opcion == 'B' && ordenador == 1) {
                    System.out.println("Ordenador elige Piedra \nPapel vs Piedra. Has ganado");
                }
                    else if (opcion == 'C' && ordenador == 3) {
                        System.out.println("Ordenador elige Tijera \nTijera vs Tijera. Empate");
                    }
                    else if (opcion == 'C' && ordenador == 2) {
                        System.out.println("Ordenador elige Papel \nTijera vs Papel. Has ganado");
                    }
                    else if (opcion == 'C' && ordenador == 1) {
                        System.out.println("Ordenador elige Piedra \nTijera vs Piedra. Has perdido");
                    }
        } while (opcion != 'X');
        s.close();
    }

}
