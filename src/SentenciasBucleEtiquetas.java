public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        //se asigna la etiqueta con nombre: y tiene que estar pegado al ciclo for
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("-------------------------------");

        //bucle para asignar 8 horas a 7 días de la semana sin contar sábado y domingo
        bucle:
        for (int i = 1; i <=7; i++) {
            System.out.println();

            for (int j = 1; j <= 8; j++) {
                if (i == 6 ||
                        i == 7) {
                    System.out.println("Día " + i + ": descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Día " + i + ": trabajando a las " + j + " hrs.");
            }
        }


        System.out.println("-----------------------------");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
