import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalAutos = 0;
        int autosConDescuento = 0;
        double totalRecaudado = 0.0;

        final double TARIFA_HORA = 15.0;
        final double DESCUENTO_EXTRA = 10.0;
        for (;;) {
            System.out.print("ingrese las horas estacionado (ingresa 0 para terminar): ");
            double horas = teclado.nextDouble();
            if (horas == 0) {
                break;
            }
            if (horas < 0) {
                System.out.println("error: Las horas no pueden ser negativas, intente nuevamente.");
                continue;
            }

            double pago = horas * TARIFA_HORA;

            if (horas > 5) {
                pago -= DESCUENTO_EXTRA;
                autosConDescuento++;
            }
            totalAutos++;
            totalRecaudado += pago;
            System.out.printf("el vehículo debe pagar:", pago);
        }
        System.out.println("Total de automóviles atendidos: " + totalAutos);
        System.out.printf("Total de dinero recaudado: ", totalRecaudado);
        System.out.println("Automóviles que recibieron descuento: " + autosConDescuento);

        double promedio = (totalAutos > 0) ? (totalRecaudado / totalAutos) : 0.0;
        System.out.printf("Promedio pagado por automóvil:"+promedio);
    }
}