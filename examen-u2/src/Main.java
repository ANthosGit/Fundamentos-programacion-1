import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("registro de paquetes con peso entero kg");
        System.out.println("el programa termina si se escribe 0");
        int peso;
        int opcion;
        for (;;) {
            System.out.print("ingrese el peso: ");
            int pesoPaquete = teclado.nextInt();
            if (pesoPaquete == 0) {
                break;
            }
            if (pesoPaquete < 0) {
                System.out.println("el peso no puede ser negativo. intente nuevamente.");
                continue;
            }
            if (pesoPaquete > 0) {
                System.out.println("ingresa el numero del tipo de lugar de envio");
                System.out.println("1.Local");
                System.out.println("2.Nacional");
                System.out.println("3. Express");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        if (pesoPaquete > 12) {
                            System.out.println("paquete rechazado");
                            break;
                        } else {
                            System.out.println("paquete aceptado");
                            pesoPaquete = 30 + 8 * pesoPaquete;
                            System.out.println("ES fragil? escribe s o n");
                        }
                    case 2:
                        if (pesoPaquete > 20) {
                            System.out.println("paquete rechazado");
                            break;
                        } else {
                            System.out.println("paquete aceptado");
                            pesoPaquete = 50 + 12 * pesoPaquete;
                            System.out.println("ES fragil? escribe s o n");
                        }
                    case 3:
                        if (pesoPaquete > 5) {
                            System.out.println("paquete rechazado");
                            break;
                        } else {
                            System.out.println("paquete aceptado");
                            pesoPaquete = 80 + 20 * pesoPaquete;
                            System.out.println("ES fragil? escribe s o n");
                        }
                }
                System.out.println("total de recaducacion"+pesoPaquete);
            }
        }
    }
}
