public class OperadoresUnarios {
    public static void main(String[] args) {
         //Se utilizan los operadores unarios para invertir el signo del entero o del número
        //cualquier número multiplicado por positivo mantiene su signo
        //cualquier número multiplicado por negativo da negativo excepto negativo por negativo
        int i = -5;

        int j = +i; // j = (+1)*i => -5 i vale -5
        System.out.println("j = " + j);

        int k = -i; // k = (-1)* i => 5, i vale -5
        System.out.println("k = " + k);
    }
}
