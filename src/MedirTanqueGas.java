import java.util.Scanner;

public class MedirTanqueGas {
    public static void main(String[] args) {
        double tanqueLleno = 70;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la medida en litros de tu tanque");
        double medida = scanner.nextDouble();

        if(medida == tanqueLleno){
            System.out.println("Tanque lleno");
        } else if (medida >= 60 && medida <= tanqueLleno) {
            System.out.println("Tanque casi lleno");
        }else if (medida >= 40 && medida <= 60){
            System.out.println("Tanque 3/4");
        } else if (medida >= 35 && medida <= 40) {
            System.out.println("Medio tanque");
        } else if (medida >= 20 && medida <= 35) {
            System.out.println("Suficiente");
        }else if(medida >= 1 && medida<= 20) {
            System.out.println("Insuficiente");
        }else {
            System.out.println("Ingresa una medida válida entre 70-1");
        }
    }
}
