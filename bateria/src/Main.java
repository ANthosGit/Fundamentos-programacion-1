import java.util.Scanner;

public class Main {

    public static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        int bateria = porcentajeInicial;

        while (bateria < 100) {
            bateria += 8;
            minutos++;
        }

        return minutos;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguirSimulando = true;

        while (seguirSimulando) {
            System.out.print("Ingrese el porcentaje inicial de batería (0 - 100): ");
            int porcentaje = scanner.nextInt();

            if (porcentaje < 0 || porcentaje > 100) {
                System.out.println("Error: El porcentaje debe estar estrictamente entre 0 y 100.");
            } else {
                int minutosTotales = calcularMinutos(porcentaje);

                System.out.println("Porcentaje inicial  : " + porcentaje + "%");
                System.out.println("Minutos necesarios  : " + minutosTotales + " minuto(s)");

            }
            System.out.print("¿Desea realizar otra simulación? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);

            if (respuesta != 's') {
                seguirSimulando = false;
            }
        }

    }
}