public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PRE INCREMENTO
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i; // i = i +1, primero se incrementa y luego se aigna el valor
        System.out.println("PRE INCREMENTO j = ++i;");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //PRE DECREMENTO
        i = 3;
        System.out.println("\ni = " + i);
        j = --i;
        System.out.println("PRE DECREMENTO j = --i;");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST INCREMENTO
        i = 2;
        System.out.println("\ni = " + i);
        j = i++;
        System.out.println("POST INCREMENTO j = i++;");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //POST DECREMENTO
        i = 4;
        System.out.println("\ni = " + i);
        j = i--;
        System.out.println("POST DECREMENTO j = i--;");
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        System.out.println("(++j) = " + (++j));
        System.out.println("(++j) = " + (j++));
        System.out.println("j = " + j);
    }
}
