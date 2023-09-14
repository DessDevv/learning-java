import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5;
        int j = 4;
        
        int suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);
        System.out.println(i + j + " = i + j ");
        System.out.println("i + j = " + (i + j));


        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j)); //("i - j = " + i - j) no se puede poner de esa forma porque las comillas indican que es un string y al agregar un - o una resta no encuentra cómo relacionarse a eso, es por eso que se debe de agregar paréntesis al hacer la operación

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int divi = i/j;
        System.out.println("divi = " + divi);
        
        float divi2 = (float) i / j; // no da como resultado como debe de ser ya que el tipo divi es flotante pero i y j no, entonces se hace la conversión de i y j a flotante en la operación que se está realizando para que dé el resultado correcto
        System.out.println("divi2 = " + divi2);
        
        int resto = i % j; //de la división que dé, lo que sobra de la división lo muestra
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){
            System.out.println("El número ingresado es par = " + numero);
        }else {
            System.out.println("El número ingresado es impar = " + numero);
        }
    }
}
