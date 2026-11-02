import java.util.Scanner;

public class Main {

    public static double calcularTiempo(double tamanoMb, double velocidadMbS) {
        return tamanoMb / velocidadMbS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el tamaño del archivo en MB: ");
        double tamano = scanner.nextDouble();

        if (tamano < 0) {
            System.out.println("Error: el tamaño del archivo no puede ser negativo.");
            scanner.close();
            return;
        }
        System.out.print("ingresa la velocidad de descarga en MB/s: ");
        double velocidad = scanner.nextDouble();

        if (velocidad <= 0) {
            System.out.println("error: La velocidad de descarga debe ser mayor que cero");
            scanner.close();
            return;
        }

        double tiempoEstimado = calcularTiempo(tamano, velocidad);

        System.out.println("El tiempo estimado de descarga es de: " + tiempoEstimado + " segundos.");
    }
}