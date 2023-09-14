public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto  = "Creando un objeto de la clase String... qué tal?";

        Integer num = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("El texto es de tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("El texto es de tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es de tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es de tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es de tipo Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Object;
        System.out.println("Decimal es de tipo Object = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("Decimal es de tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es de tipo Boolean = " + b1);
    }
}
