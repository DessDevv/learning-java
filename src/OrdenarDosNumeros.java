import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número entero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa otro número entero");
        int numero2 = scanner.nextInt();

        /*String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);
        */

        if (numero1 > numero2){
            System.out.println("El primer número es mayor " + numero1 +" > "+ numero2);
        }else {
            System.out.println("El segundo número es mayor " + numero2 + " > "+ numero1);
        }

    }
}
