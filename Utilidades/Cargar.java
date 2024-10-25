import java.util.Scanner;

/**
 * Clase para crear objetos de otras clases.
 * Tambien verifica si un valor ingresado es entero, decimal, o tiene la
 * longitud máxima de caracteres.
 * 
 * @author Daniel Lima
 */
public class Cargar {
    static Scanner entrada = new Scanner(System.in);

    /**
     * Toma un valor de entrada del usuario, verifica si es un entero, si lo es lo
     * devuelve, si no lo es imprime un mensaje de error y pide otro valor
     * 
     * @return Devuelve un valor entero.
     * @author Daniel Lima
     */
    public static int entero() {
        int salida = 0;
        boolean comprobacion = false;
        while (!comprobacion) {
            try {
                salida = entrada.nextInt();
                entrada.nextLine();
                comprobacion = true;
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("Error, solo puede ingresar números.");
            }
        }
        return salida;
    }

    public static int numOrden() {
        int salida = entero();
        while (salida < 111111 || salida > 999999) {
            System.out.println("Error, solo puede ingresar números de 6 dígitos.");
        }
        return salida;
    }

    public static String textoCorto() {
        String salida = new String();
        boolean comprobacion = false;
        while (!comprobacion) {
            salida = entrada.nextLine();
            if (salida.length() <= 90)
                comprobacion = true;
            else
                System.out.println("Error, el texto no puede tener más de 90 caracteres.");
        }
        return salida;
    }
}
