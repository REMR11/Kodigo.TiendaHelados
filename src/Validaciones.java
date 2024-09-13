import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que proporciona métodos para validar entradas de usuario en la consola.
 *
 * @author REMR11
 */
public class Validaciones {
    /**
     * Obtiene una entrada válida del usuario en la consola, dentro del rango de [1, 3].
     *
     * @return un entero dentro del rango de [1, 3] ingresado por el usuario
     *
     * @exception  InputMismatchException Si se ingresa un valor diferente a un numerico
     */
    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                num = scanner.nextInt();
                if (1 <= num && num <= 3) {
                    return num;
                } else {
                    System.out.println("Valor no valido. por favor ingresa una respuesta entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("valor no valido. por favor ingresa un valor numerico");
                scanner.next();
            }
        }
    }
}
