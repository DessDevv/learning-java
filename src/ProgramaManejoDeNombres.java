import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = "Vichugo";
        String nombre2 = "Dessiré";
        String nombre3 = "Rochaba";

        String nombreV = nombre1.substring(1,2);
        System.out.println(nombreV.toUpperCase() + "." + nombre1.substring(nombre1.length()-2));

        String nombreD = nombre2.substring(1,2);
        System.out.println(nombreD.toUpperCase() + "." + nombre2.substring(nombre2.length()-2));

        String nombreR = nombre3.substring(1,2);
        System.out.println(nombreR.toUpperCase() + "." + nombre3.substring(nombre3.length()-2));

        //CÓDIGO EJEMPLO USANDO SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}
