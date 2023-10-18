public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        /*
        buscar en una frase una letra en específico y cuantas veces se repite en la frase esa letra
        mediante un ciclo for e if-con continue;

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';

        for(int i = 0; i < max; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter " + letra + " en la frase");
        */

        //encontrar una palabra en una frase mediante 2 ciclos for, uno para recorrer la frase y otro para recorrer la palabra
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "tr";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra; //se resta el máximo de la frase menos el máximo de la palabra para que se tenga mejor el largo de la frase
        int cantidad = 0;

        buscar:
        for(int i = 0; i < maxFrase; ){ //se quita el incremento de i
            //incializo k para que tome el valor de i para después k ir incrementando sin utilizar i, ya que i ya pertenece a una iteración
            int k = i;
            for(int j = 0; j<maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    /*se incrementa k para que busque posición por posición en la frase pero que vaya siendo aumentado todo este for por i

                     */
                    i++; //se agrega el incremento de i después de que encontró la palabra
                    continue buscar;
                }
            }
            cantidad++;
            i = i+maxPalabra; //i toma el valor de la posición i más el máximo de la palabra para que tome la posición de donde
            // encontró la palabra y ya no empiece desde el principio a iterar, sino, desde donde encontró la palabra
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
