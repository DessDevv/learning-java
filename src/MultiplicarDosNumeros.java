import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo o negativo");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro número entero positivo o negativo");
        int num2 = scanner.nextInt();

        int multi = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = num2 > -1;
        boolean positivoA = num1 > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? num1: -num1; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, según el valor de a.
        for (int i = 0; i <absolutoA; i++){
            multi = multi + num2;
        }
        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            multi = -multi;
        }
        System.out.println("el resultado es " + multi);

    }
}
