import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduce un número (-1 para salir)");
            numero = s.nextInt();

            if(numero !=-1){
                System.out.println("Tabla de multiplicar del " + numero+ ":");
                for (int i=1; i <=10; i++){
                    int resultado = numero *i;
                    System.out.println(numero + "x" + i + "=" + resultado);
                }
            }
        }while (numero !=-1);

        s.close();
    }
}
