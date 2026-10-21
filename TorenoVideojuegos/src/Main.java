import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalPartidas=7;
        int puntosAcumulados=0;
        int puntosMas1000=0;
        int partidasMenos1000=0;
        for (int i = 1; i <= totalPartidas; i++) {
            System.out.print("Ingresa la puntuación de la partida " + i + ": ");
            int puntuacion=scanner.nextInt();
            puntosAcumulados+=puntuacion;
            if (puntuacion > 1000) {
                puntosMas1000++;
            } else {
                partidasMenos1000++;
            }
        }

        double promedio = (double) puntosAcumulados / totalPartidas;
        System.out.println("resultados");
        System.out.println("puntos acumulados= " + puntosAcumulados);
        System.out.println("promedio de puntuación= " + promedio);
        System.out.println("partidas con más de 1000 puntos= " + puntosMas1000);
        System.out.println("partidas con 1000 puntos o menos= " + partidasMenos1000);
    }
}

