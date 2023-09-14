public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); //método length()
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray(); //tipo char
        System.out.println("arreglo = " + arreglo);
        
        int largoArreglo = arreglo.length; //atributo length
        System.out.println("largoArreglo = " + largoArreglo);

        for(int i = 0; i < largoArreglo; i++){
            //System.out.println("i = " + i); muestra del 0 al 11
            System.out.println(arreglo[i]);
        }

        System.out.println();
        System.out.println("\ntrabalenguas.split((\"a\")) = " + trabalenguas.split(("a"))); //separa la cadena por cada "a" que encuentre, no muestra las a y si se imprime muestra un hash o un identificador del objeto

        String[] arreglo2 = trabalenguas.split(("a")); //tipo string
        int largo2 = arreglo2.length;
        for(int j = 0; j<largo2; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jpeg";
        String[] archivoArray = archivo.split("\\."); // o también entre corchetes "[.]" o "[a]"
        largo2 = archivoArray.length;
        System.out.println("largo2 array = " + largo2);

        for(int j = 0; j<largo2; j++){
            System.out.println(archivoArray[j]);
        }

        System.out.println("archivoArray[largo2-1] = " + archivoArray[largo2-1]);
    }
}
