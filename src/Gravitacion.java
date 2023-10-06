import java.util.Scanner;

class Gravitacion {
  static final double CONSTANTE_GRAVITACIONAL = 6.673*(Math.pow(10,-8));

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduce la masa del cuerpo 1 (en gramos): ");
    double masa1 = entrada.nextDouble();
    
    System.out.println("Introduce la masa del cuerpo 2 (en gramos): ");
    double masa2 = entrada.nextDouble();
    
    System.out.println("Introduce la distancia entre ellos (en cm): ");
    double distancia = entrada.nextDouble();

    entrada.close();

    double atraccion = getAtraccion(masa1, masa2, distancia);

    System.out.println(atraccion + "dinas");
    
  }

  public static double getAtraccion(double masa1, double masa2, double distancia) {
    return (CONSTANTE_GRAVITACIONAL * masa1 * masa2) / Math.pow(distancia, 2);
  }

}
