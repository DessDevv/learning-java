public class HolaMundo {
    public static void main(String[] args){

        String mundo = "Hola Mundo desde Java";
        System.out.println(mundo);
        System.out.println("mundo.toUpperCase() = " + mundo.toUpperCase());


        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        String nombre;

        nombre = "Dessiré";
        if(numero>9){
            nombre = "Carmen";
        }
        System.out.println(("nombre = " + nombre));
    }
}
