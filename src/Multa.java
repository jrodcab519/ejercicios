import java.util.Scanner;

public class Multa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.next();
        cadena.charAt(0);
        char tipo = entrada.next().charAt(0);
        int velocidad = entrada.nextInt();

        entrada.close();

        String resultado = (tipo == 'T' && velocidad > 120 ) ? "Verdadero" : (tipo == 'C' && velocidad > 100) ? "Verdadero" : (tipo == 'M' && velocidad > 50) ? "Verdadero" : "Falso";

        System.out.println(resultado);
    }
}