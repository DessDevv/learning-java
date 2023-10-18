import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        /*
        Algunas formas de declarar un arreglo:
        String[] nombres = new String[6];  // con new String[numero de datos del arreglo]
        String nombres[] = new String[6]; //con los corchetes en el nombre de la variable
        String[] nombres = {"Dessiré", "Hugo", "Luis", "Alberto", "Luisa", "Rochaba", "Rosario", "Rey"};
         */

        String[] nombres = {"Dessiré", "Hugo", "Luis", "Alberto", "Luisa", "Rochaba", "Rosario", "Rey"};
        int count = nombres.length;

        //ciclo para imprimir los nombres con su número de posición
        for(int i = 0; i < count; i++){
            System.out.println(i + " - "+nombres[i]);
        }

        //ciclo para imprimir solo algunos nombres y con la condición if()ignore o salte algunos nombres
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("dessiré") || //se utiliza el .equalsIgnoreCase para que tome el string sin importar las mayúsculas
            nombres[i].equalsIgnoreCase("luis") ||
            nombres[i].equalsIgnoreCase("hugo")){
                continue;
            }
            System.out.println(i + " - "+nombres[i]);
        }

        //buscar un nombre dentro del arreglo con la condición if() y el método equalsIgnoreCase
        //también utilizando un valor boolean para definir que antes de buscar el nombre en el ciclo for sea falso y si es encontrado sea true (verdadero)
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar:");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i< count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("buscando = " + nombres[i]);
        }
        if (encontrado){
                JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + "No fue encontrado en el arreglo");
        }

    }
}
