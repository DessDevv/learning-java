import java.util.Scanner;

public class BuscarNumeroMenorMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a comparar");
        int comparar = scanner.nextInt();

        //se verifica que el número sea mayor a 10
        if(comparar < 10){
            System.out.println("Por favor, ingresa 10 números enteros a comparar");
        }else {
            int porDefecto = Integer.MAX_VALUE; //asigno un valor máximo por defecto para comenzar
            int numero;

            for (int i = 0; i < comparar; i++){
                System.out.println("Ingrese el número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                porDefecto = (numero < porDefecto ) ? numero : porDefecto; //se hace la comparación para encontrar el número menor
            }
            System.out.println("El número menor es: " + porDefecto);

            //si el número menor es menor a 10
            if (porDefecto < 10){
                System.out.println("El número " + porDefecto + " es menor que 10");
            }else {
                System.out.println("El número " + porDefecto + " es igual o mayor que 10");
            }
        }

    }
}
