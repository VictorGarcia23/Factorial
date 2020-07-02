import java.util.Scanner;

    public class Main
    {

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Dame un valor");
            int valor= s.nextInt();

            int contador= 1;
            double resultado = 1;

            while (contador <= valor) {
                resultado = resultado * contador;
                contador = contador + 1;
            }
            System.out.println("El valor factorial de tu número es: " + resultado);
        }

    }
}
