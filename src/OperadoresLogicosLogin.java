import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] userNames = new String[2];
        String[] passwords = new String[2];
        userNames[0] = "Dessiré";
        passwords[0] = "12345";

        userNames[1] = "admin";
        passwords[1] = "123";*/
        String[] userNames = {"Dessiré", "admin"};
        String[] passwords = {"12345", "123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Username");
        String usuario = scanner.next();

        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;

        /*
        for(int i = 0; i< userNames.length; i++){
            if( (userNames[i].equals(usuario) && passwords[i].equals(pass))){
                esAutenticado = true;
                break;
            }
        }
        */

        for(int i = 0; i< userNames.length; i++){
            esAutenticado = (userNames[i].equals(usuario) && passwords[i].equals(pass)) ? true : esAutenticado;

        }
        String mensaje = esAutenticado ? "Bienvenida ".concat(usuario).concat("!") :
                "Username o password incorrecto \nLo sentimos, se requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        /*
        if (esAutenticado){
            System.out.println("Bienvenida ".concat(usuario).concat("!"));
        }else {
            System.out.println("Username o password incorrecto");
            System.out.println("Lo siento, se requiere autenticación");
        }
         */

    }
}
