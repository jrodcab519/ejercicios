public class Piramide
{
    public static void main(String[] a)
    {
        final int numlineas = 5;
        final char blanco = ' ';
        final char asterisco = '*';
        System.out.println(" ");


        for (int fila = 1; fila <= numlineas; fila++)
        {
            System.out.print("\t");

            for (int blancos = numlineas - fila; blancos > 0; blancos--)
            System.out.print(blanco);
            for (int cuenta_as = 1; cuenta_as < 2 * fila;
                 cuenta_as++)
                System.out.print(asterisco);
            System.out.println(" ");
        }
    }
}