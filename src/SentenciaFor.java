public class SentenciaFor {
    public static void main(String[] args) {

        //imprimir i mientras i sea menor a 5
        for(int i= 0; i< 5;i++){
            System.out.println("i1 = " + i);
        }

        //imprimir i mientras i sea menos a 10 y decrementar uno en uno
        for(int i = 10; i>=0; i--){
            System.out.println("i2 = " + i);
        }

        //tener dos variables i y j, compararlos mientras i sea menor a j, i incrementará uno en uno y j decrementará uno en uno
        for(int i = 1, j = 10; i<j; i++, j--){
            System.out.println(i + " -  "  + j);

        }

        /*
        En un ciclo for, i incrementará hasta que sea menor o igual a 10
        dentro del ciclo, se encuentra una condición para imprimir solo números pares
         */
        for(int i= 0;i<=10;i++){
            if (!(i % 2 == 0)){
                continue;
            }
            System.out.println("i4 = " + i);
        }
    }
}
