import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa un número 2");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa un número 3");
        int num3 = scanner.nextInt();

        System.out.println("Ingresa un número 4");
        int num4 = scanner.nextInt();
        
        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("El número mayor es = " + max);
    }
}
