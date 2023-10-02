import java.util.*;
class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] flightTime = new int[5][5];
        String answer;
        do{
            mostrarTablaTiempoVuelo(flightTime);
            System.out.println("1 = AQP\n2 = JUL\n3 = CUZ\n4 = TCQ\n5 = LIM");
            System.out.print("Ingrese el numero de ciudad de partida: ");
            int departure = sc.nextInt();
            System.out.print("Ingrese el numero de ciudad de llegada: ");
            int arrival = sc.nextInt();
            int totalTime = preguntarPorTiempoVuelo(flightTime, departure, arrival);
            System.out.println("Tiempo de vuelo: "+totalTime+" minutos.");
            System.out.println("Desea continuar con otra ruta? (s/n)");
            answer = sc.next();
        }while(answer.equals("s"));
    }
    public static void mostrarTablaTiempoVuelo(int flightTime[][]) {
        String[] place = { "AQP", "JUL", "CUZ", "TCQ", "LIM" };
        int[] flightTime1 = { 0, 22, 30, 42, 57 };
        int[] flightTime2 = { 23, 0, 15, 25, 58 };
        int[] flightTime3 = { 31, 17, 0, 24, 30 };
        int[] flightTime4 = { 45, 27, 25, 0, 95 };
        int[] flightTime5 = { 59, 58, 30, 97, 0 };
        for (int i = 0; i < flightTime.length; i++) {
            for (int j = 0; j < flightTime[0].length; j++) {
                if (i == 0) {
                    flightTime[i][j] = flightTime1[j];
                } else if (i == 1) {
                    flightTime[i][j] = flightTime2[j];
                } else if (i == 2) {
                    flightTime[i][j] = flightTime3[j];
                } else if (i == 3) {
                    flightTime[i][j] = flightTime4[j];
                } else {
                    flightTime[i][j] = flightTime5[j];
                }

            }
        }
        printflightTime(flightTime, place);
    }

    public static void printflightTime(int[][] n, String[] place) {
        for (int i = 0; i < place.length; i++) {
            System.out.print("    " + "\t" + place[i]);
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.print(place[i]);
            for (int j = 0; j < n[0].length; j++) {
                System.out.print("\t" + n[i][j]);
            }
            System.out.println();
        }
    }

    public static int preguntarPorTiempoVuelo(int[][] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == a - 1 && j == b - 1) {
                    return array[i][j];
                }
            }
        }
        return -1;
    }
}
