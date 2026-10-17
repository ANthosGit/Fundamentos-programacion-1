import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escribe tu Batería inicial:");
        int bateria = scanner.nextInt();
        int minuto = 1;
        System.out.println();
        while (bateria >= 7) {
            bateria -= 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }
    }
}