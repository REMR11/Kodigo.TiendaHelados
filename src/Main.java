import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * @author REMR11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;
        int nuevoHelado = 0;
        TamanioHelado  tamanioHelado = null;

        while (true) {

            System.out.println("Hola! que sabor quieres ahora? ");
            System.out.println("1. Chocolate");
            System.out.println("2. Vainilla");
            System.out.println("3. Fresa");

            int opcion = Validaciones.getValidInput();

            switch (opcion){
                case 1:
                    System.out.println("Compraste un helado de chocolate!");
                    tamanioHelado = pedirTamanio();
                    precio += tamanioHelado.getCosto();
                    break;
                case 2:
                    System.out.println("Compraste un helado de Vainilla!");
                    tamanioHelado = pedirTamanio();
                    precio += tamanioHelado.getCosto();
                    break;
                case 3:
                    System.out.println("Compraste un helado de Fresa");
                    tamanioHelado = pedirTamanio();
                    precio += tamanioHelado.getCosto();
                    break;
            }
            System.out.println("Quieres comprar otro helado? (1)SI, (2)NO");
            nuevoHelado = sc.nextInt();

            if(nuevoHelado == 2){
                break;
            }

        }

        System.out.println("Me debes: $" + precio);


    }

    /**
     * Pide el tamaño del helado al usuario y devuelve el tamaño seleccionado.
     *
     * @return el tamaño del helado seleccionado
     */
    public static  TamanioHelado  pedirTamanio(){
        Scanner sc = new Scanner(System.in);
        TamanioHelado tn = null;

        System.out.println("Selecciona el tamanio ");
        System.out.println("1.PEQUENIO $2,\n" +
                "2.MEDIANIO $3,\n" +
                "3. GRANDE $4;");

        int result = Validaciones.getValidInput();

        switch (result){
            case 1:
                tn = TamanioHelado.PEQUENIO;
                break;
            case 2:
                tn = TamanioHelado.MEDIANIO;
                break;
            case 3:
                tn = TamanioHelado.GRANDE;
                break;
        }
        return tn;
    }
}