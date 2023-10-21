public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,
                8,9,10,11,12,13,14,15};

        //autoboxing
        //boxing viene de empaquetar o wrapper de anidar
        //Se anidará un primitivo en la clase Integer y viceversa
        int suma = 0;
        for (Integer i : enteros
             ) {
                if (i.intValue() % 2 == 0){
                    suma+= i.intValue();
                }
        }
        System.out.println("suma = " + suma);

        //forma unboxing
        suma = 0;
        for (Integer i : enteros
        ) {
            if (i % 2 == 0){
                suma+= i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
