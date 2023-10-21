import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double notas;
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese 20 notas (entre 1 y 7) N°" + (i + 1) + ": ");
            notas = scanner.nextDouble();

            if(notas == 0){
                error = true;
                break;
            }
            if (notas == 1){
                contNotas1++;
            }else {
                if(notas>5){
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += notas;
                } else if (notas<4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 +=notas;
                }
            }
            sumaTotal +=notas;
        }
        if (error){
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5; //calculamos el promedio
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4; //calculamos el promedio
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // calculamos el promedio total de las 20 notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}