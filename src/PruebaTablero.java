import java.util.Scanner;

public class PruebaTablero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el tamaño del escaque: ");
        int tamano = s.nextInt();
        System.out.println("Introduce el carácter de relleno: ");
        char relleno = s.next().charAt(0);

        borde(tamano);
        System.out.print("\n");

        for(int fila = 0; fila < 8; fila++){
            for(int i = 0; i < tamano -2; i++) {
                System.out.print("|");
                for (int columna = 0; columna < 8; columna++){
                    if((fila + columna) % 2 !=0){
                        repetir(relleno, tamano - 2);
                    }else{
                        repetir(' ',tamano - 2);
                    }
                    System.out.print("|");
                }
                System.out.print("\n");
            }
            borde(tamano);
            System.out.print("\n");
        }
    }

    public static void borde(int tamano){
        System.out.print("+");
        for(int columna = 0; columna < 8; columna++){
            repetir('-',tamano-2);
            System.out.print("+");
        }
    }

    public static void repetir(char relleno, int veces) {
        while(veces > 0){
            System.out.print(relleno);
            veces--;
        }
    }
}
