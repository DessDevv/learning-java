import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura o descripción");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa un precio de tipo double");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingresa otro precio de tipo double");
        double precio2 = scanner.nextDouble();

        double total = precio1 + precio2;
        double impuesto = total * 0.19;
        double suma = total + impuesto;

        System.out.println("La factura producto de " + nombre + " tiene un total bruto de " + total + " con un impuesto de " + impuesto + " y el monto después de impuesto es de " + suma);
    }
}
