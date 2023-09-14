import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargoTresPersonas {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null, "Primer persona, Ingresa tu nombre completo");

        String nombre2 = JOptionPane.showInputDialog(null, "Segunda persona, Ingresa tu nombre completo");

        String nombre3 = JOptionPane.showInputDialog(null, "Tercera persona, Ingresa tu nombre completo");

        String resultado = nombre1.split("")[0].length() > nombre2.split("")[0].length() ? nombre1 : nombre2;
        resultado = resultado.split("")[0].length() > nombre3.split("")[0].length() ? resultado : nombre3;

        JOptionPane.showInputDialog(null, "El nombre más largo es" + resultado);
    }
}
