public class WrapperInteger {

    public static void main(String[] args) {
        int intPrimitivo = 32768; //segunda forma de convertir un int a un objeto
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);//de esta forma valurOf recibe un string

        Integer intObjeto = Integer.valueOf(32768); //forma explícita de crear un objeto integer, convierte el valor de 32168 a un objeto
        Integer intObjeto2 = 32768; //forma más sencilla de convertir un entero a un objeto, automáticamente convierte 32168 a un objeto
        System.out.println("intObjeto = " + intObjeto);


        //------------------------------------------------
        //convertir un objeto integer a un entero primitivo
        int num = intObjeto; //forma automática implícita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //forma explícita, este método retorna el entero primitivo del objeto
        System.out.println("num2 = " + num2);

        //------------------------------------------------
        //convertir un String a un entero primitivo
        String valorToInt = "67000";
        Integer valor = Integer.valueOf(valorToInt);
        System.out.println("valor = " + valor);

        //------------------------------------------------
        //convertir un Short de referencia integer a un entero primitivo
        Short shortObjeto = intObjeto3.shortValue(); //no marcará error, pero habrá pérdida de datos ya que 32168 supera el valor de un short
        System.out.println("shortObjeto = " + shortObjeto);

        //------------------------------------------------
        //convertir un Byte de referencia integer a un entero
        Byte byteObjeto = intObjeto.byteValue(); //también habrá pérdida de información, ya que, el valor del entero es mayor que el de un Byte
        System.out.println("byteObjeto = " + byteObjeto);

        //------------------------------------------------
        //convertir un Long de referencia integer a un entero
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }

}
