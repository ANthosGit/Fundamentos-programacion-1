import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 100;
        int opcion;
        do {
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción del 1 al 4 del menu ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    puntos = puntos+20;
                    System.out.println("Ganaste 20 puntos, Ahora tienes: " + puntos);
                    break;
                case 2:
                    if (puntos >= 15) {
                        puntos = puntos-15;
                        System.out.println("Gastaste 15 puntos, quedan: " + puntos);
                    } else {
                        System.out.println("Puntos insuficientes, Necesitas al menos 15 puntos para gastar (Tienes: " + puntos + ").");
                    }
                    break;
                case 3:
                    System.out.println(" Puntos actuales: " + puntos);
                    break;
                case 4:
                    System.out.println("Saliendo del juego");
                    break;
                default:
                    System.out.println("Opción no válida, Intenta de nuevo");
                    break;
            }
        } while (opcion != 4);
        System.out.println("Juego terminado, tus puntos restantes: " + puntos);
        scanner.close();
    }
}