import java.util.Scanner;

public class Main {

    public static double calcularRenta(double tarifa, double horas) {
        return tarifa * horas;
    }

    public static void mostrarComprobante(double total) {


        System.out.println("Costo total a pagar: $" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CENTRO DE PRODUCCIÓN AUDIOVISUAL");

        System.out.print("Ingrese la tarifa de alquiler por hora: ");
        double tarifa = scanner.nextDouble();

        if (tarifa <= 0) {
            System.out.println("Error: La tarifa debe ser mayor que cero.");
            scanner.close();
            return;
        }

        System.out.print("Ingrese la cantidad de horas de uso: ");
        double horas = scanner.nextDouble();

        if (horas <= 0) {
            System.out.println("Error: Las horas de uso deben ser mayores que cero.");
            scanner.close();
            return;
        }

        double totalRenta = calcularRenta(tarifa, horas);

        mostrarComprobante(totalRenta);

        scanner.close();
    }
}