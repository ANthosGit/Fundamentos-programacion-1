import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] calificaciones = capturarCalificaciones();
        mostrarCalificaciones(calificaciones);
        int aprobados = contarAprobados(calificaciones);
        int reprobados = contarReprobados(calificaciones);

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }

    public static int[] capturarCalificaciones() {
        Scanner tc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Captura la calificación del alumno " + (i + 1) + ": ");
            int cal = tc.nextInt();

            while (cal < 0 || cal > 100) {
                System.out.print("Calificacion inválida. Captura nuevamente la calificación del alumno " + (i + 1) + ": ");
                cal = tc.nextInt();
            }

            arr[i] = cal;
        }

        return arr;
    }

    public static void mostrarCalificaciones(int[] arr) {
        System.out.println("Calificaciones capturadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + arr[i]);
        }
    }

    public static int contarAprobados(int[] arr) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 70) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarReprobados(int[] array) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] < 70) {
                contador++;
            }
        }
        return contador;
    }
}