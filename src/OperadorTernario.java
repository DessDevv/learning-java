import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        //variable = condicion ?  si es verdadero devuelve un  valor : si no devuelve otro
        String variable = 7 == 7 ? "es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double programacion = 0.0;
        double basededatos = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la calificación de matemáticas entre 2.0 y 7.0");
        matematicas = scanner.nextDouble();
        System.out.println("Ingresa la calificación de programación entre 2.0 y 7.0");
        programacion = scanner.nextDouble();
        System.out.println("Ingresa la calificación de base de datos entre 2.0 y 7.0");
        basededatos = scanner.nextDouble();

        promedio = (matematicas + programacion + basededatos)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "esta aprobado" : "rechazado";
        System.out.println("estado = " + estado);
    }
}
