public class Main {

    public static void main(String[] args) {
        int[] arr = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        mostrArarreglos(arr);
        LaCurva(arr);
        mostrArarreglos(arr);
        int aprobados = contarAprobados(arr);
        System.out.println("Aprobados después de la curva: " + aprobados);
    }

    public static void mostrArarreglos(int[] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + ",");
        }
        System.out.println();
    }

    public static void LaCurva(int[] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            int nuevaCalificacion = calificaciones[i] + 5;
            if (nuevaCalificacion > 100) {
                nuevaCalificacion = 100;
            }
            calificaciones[i] = nuevaCalificacion;
        }
    }

    public static int contarAprobados(int[] calificaciones) {
        int arr = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion = calificaciones[i];
            if (calificacion >= 70) {
                arr++;
            }
        }
        return arr;
    }
}