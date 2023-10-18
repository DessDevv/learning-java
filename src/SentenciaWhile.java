public class SentenciaWhile {
    public static void main(String[] args) {

        //imprimir i mientras sea menor a 10 en un ciclo while
        int i = 0;
        while (i < 10){
            System.out.println("i = " + i);
            i++;
        }

        //imprimir i hasta que sea igual a 7 con una variable booleana inicializando en true
        i= 0;
        boolean prueba = true;
        while (prueba){
            if (i ==7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        //prueba de do while, donde el do primero ejecuta y luego pasa a while que es la determinante
        prueba = false;
        do{
            System.out.println("Se ejecuta al menos una vez");
        }while (prueba);

        //prueba de pasar while a do while,
        //se puede notar que dentro del do es donde se realizan todas las operaciones
        prueba = true;
        i=0;
        do{
            if(i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;

        }while (prueba);
    }
}
