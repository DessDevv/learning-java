public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Dessiré";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Dessiré\") = " + nombre.equals("Dessiré"));
        System.out.println("nombre.equals(\"dessiré\") = " + nombre.equals("dessiré"));
        System.out.println("nombre.equalsIgnoreCase(\"dessiré\") = " + nombre.equalsIgnoreCase("dessiré"));
        System.out.println("nombre.compareTo(\"Dessiré\") = " + nombre.compareTo("Dessiré"));
        System.out.println("nombre.compareTo(\"dessiré\") = " + nombre.compareTo("dessiré"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //da como resultado una sola letra pero toma todo el valor de la cadena "Dessiré" pero como el char empieza desde 0, da un error porque lenght toma desde 1, entonces, para que char no dé error, resta uno

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));  //1 inclusive, 4 exclusive o sea que la posición 4 no se muestra
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2)); //toma todo el valor de la cadena y le resta para que se muestren  valores de manera INCLUSIVA

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalengua.replace = " + trabalenguas.replace("a", "u"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf("lenguas")); //también acepta de tipo char o sea un solo valor 'a' o 't'
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));

        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());//quita los espacios



    }
}
