import java.util.Scanner;

public class Main {

    public static void mostrarEtiqueta(String numeroGuia, String destino, double peso) {
        System.out.println("envoa los datos del paquete 1");
        System.out.println("Número de guía : " + numeroGuia);
        System.out.println("Ciudad destino : " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos para el primer paquete:");
        System.out.print("Número de guía: ");
        String guia1 = scanner.nextLine();
        System.out.print("Ciudad de destino: ");
        String destino1 = scanner.nextLine();
        System.out.print("Peso en kg: ");
        double peso1 = scanner.nextDouble();

        System.out.println("ngrese los datos para el segundo paquete:");
        System.out.print("Número de guía: ");
        String guia2 = scanner.nextLine();
        System.out.print("Ciudad de destino: ");
        String destino2 = scanner.nextLine();
        System.out.print("Peso en kg: ");
        double peso2 = scanner.nextDouble();

        mostrarEtiqueta(guia1, destino1, peso1);
        mostrarEtiqueta(guia2, destino2, peso2);
    }
}