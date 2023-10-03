import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();

        entrada.close();

        float media = (nota1 + nota2 + nota3)/3;

        String mensaje = (media >= 5) ? "APROBADO" : "SUSPENSO";

        System.out.printf("La nota media es %f, el alumno está %s", media, mensaje);

    }
}