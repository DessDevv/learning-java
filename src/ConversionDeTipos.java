public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        //CONVERSIÓN CADENA A PRIMITIVO
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realString = "98765.43e-3";
        double realDoble = Double.parseDouble(realString);
        System.out.println("realDoble = " + realDoble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //CONVERSIÓN PRIMITIVO A CADENA
        int otroNumeroInt = 100;
        System.out.println("otroNumeroINT = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        //CONVERSIÓN PRIMITIVO A PRIMITIVO
        int i = 22768;

        short s= (short) i;
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
