public class SentenciaForEach {
    public static void main(String[] args) {
        
        //ciclo foreach para recorrer con la variable numero cada posición del arreglo numeros
        int[] numeros = {1,3,5,7,9,11,13,15};
        for (int numero : numeros
             ) {
            System.out.println("numero = " + numero);
        }

        //Dado un arreglo de String[] utilizar foreach para imprimir cada atributo del arreglo
        String[] nombres = {"Dessiré", "Hugo", "Luis", "Alberto", "Luisa", "Rochaba", "Rosario", "Rey"};
        for (String nombre: nombres
             ) {
            System.out.println("nombre = " + nombre);
        }
    }
}
