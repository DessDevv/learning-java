public class PrimitivosFlotante {
    public static void main(String[] args) {
        
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.0f;
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 2.12e3f; //2120f;
        System.out.println("realFloat3 = " + realFloat3);

        float realFloat4 = 0.00000000015f; //1.5e-10f;;
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bits a = " + Float.SIZE);
        System.out.println("el valor máximo para float " + Float.MAX_VALUE);
        System.out.println("el valor mínimo para float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bits a = " + Double.SIZE);
        System.out.println("el valor máximo para double " + Double.MAX_VALUE);
        System.out.println("el valor mínimo para double " + Double.MIN_VALUE);
        
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
