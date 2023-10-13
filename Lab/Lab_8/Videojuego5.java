//Lab5 - Mariel Jara
import java.util.*;
public class Videojuego5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (true) {
            System.out.println("Ingrese las dimensiones del tablero (fila/columna)");
            int f = sc.nextInt();
            int c = sc.nextInt();
            HashMap<Integer, Soldado> navy1 = new HashMap<>();
            HashMap<Integer, Soldado> navy2 = new HashMap<>();
            fillSoldier(navy1, navy2, f, c);
            fillSoldier(navy2, navy1, f, c);
            displaySoldierNavy(navy1, navy2, f, c);
            System.out.println(navy1);
            System.out.println(navy2);
            displaySoldier(navy1);
            displaySoldier(navy2);
            /*System.out.println("-----------------------------");
            System.out.println("EJERCITO 1: El soldado con mayor vida es: \n" + mostlifeN(navy1));
            System.out.println("EJERCITO 2: El soldado con mayor vida es: \n" + mostlifeN(navy2));
            System.out.println("-----------------------------");
            System.out.println("EJERCITO 1: El promedio de nivel de vida de los soldados es: " + averageLifeN(navy1));
            System.out.println("EJERCITO 2: El promedio de nivel de vida de los soldados es: " + averageLifeN(navy2));
            System.out.println("-----------------------------");
            System.out.println("EJERCITO 1: Nivel de vida de todo el ejercito es: " + displayLifeN(navy1));
            System.out.println("EJERCITO 2: Nivel de vida de todo el ejercito es: " + displayLifeN(navy2));*/
            System.out.println("-----------------------------");
            System.out.println("Desea generar otro batalla? (s/n)");
            answer = sc.next();
            if(answer.equalsIgnoreCase("n")) break;
        }
        sc.close();
    }

    /*
     * Cada soldado tendrá un nombre autogenerado: Soldado0X1, Soldado1X1, etc., un
     * valor de puntos de vida autogenerado aleatoriamente [1..5], la fila y columna
     * también
     * autogenerados aleatoriamente (no puede haber 2 soldados en el mismo
     * cuadrado).
     */
    public static void fillSoldier(HashMap<Integer, Soldado> army1, HashMap<Integer, Soldado> army2, int f, int c) {
        int n = generateSoldier();
        int i = 0;
        System.out.println(n);
        while (i <= n) {
            int lifeN = (int) (Math.random() * 5 + 1);
            int row = (int) (Math.random() * f);
            int col = (int) (Math.random() * c);
            String name = "Soldado" + row + "X" + col;
            Soldado sol = new Soldado(name, lifeN, row, col);
            if(!army1.containsValue(sol) && !army2.containsValue(sol)){
                army1.put(i, sol);
                i++;
            }
        }
    }
    /* Inicializar el tablero con n soldados aleatorios entre 1 y 10 */
    public static int generateSoldier() {
        return (int) (Math.random() * 10 + 1);
    }
    /* Además de los datos del Soldado con mayor vida de cada ejército, */
    public static Soldado mostlifeN(HashMap<Integer, Soldado> army) {
        Soldado tempo = new Soldado("", 0, 0, 0);
        for (Map.Entry<Integer, Soldado> entry : army.entrySet()) {
            Soldado soldado = entry.getValue();
            if (soldado.getLifeN() > tempo.getLifeN()){
                tempo = soldado;
            }
        }
        return tempo;
    }
    /* el promedio de puntos de vida de todos los soldados creados por ejército */
    public static double averageLifeN(HashMap<Integer, Soldado> army) {
        int suma = 0;
        for (Map.Entry<Integer, Soldado> entry : army.entrySet()) {
            Soldado soldado = entry.getValue();
            suma += soldado.getLifeN();
        }
        return (suma * 1.0) / army.size();
    }
    /* El nivel de vida de todo el ejército */
    public static int displayLifeN(HashMap<Integer, Soldado> army) {
        int lifeT = 0;
        for (Map.Entry<Integer, Soldado> entry : army.entrySet()) {
            Soldado soldado = entry.getValue();
            lifeT += soldado.getLifeN();
        }
        return lifeT;
    }
    /* los datos de todos los soldados en el orden que fueron creados */
    public static void displaySoldier(HashMap<Integer, Soldado> army) {
        TreeMap<Integer, Soldado> order = new TreeMap<>();
        order.putAll(army);
        for (int n : order.keySet()) {
            System.out.println(n+": "+order.get(n));
        }
    }
    /*
     * Se debe mostrar el tablero con todos los soldados creados (distinguir los de
     * un ejército de los del otro
     * ejército)
     */
    public static void displaySoldierNavy(HashMap<Integer, Soldado> army1, HashMap<Integer, Soldado> army2, int f, int c) {
        for (int i = 0; i < c; i++) {
            System.out.print("     " + i);
        }
        System.out.println();
        for (int i = 0; i < f; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < c; j++) {
                int posicion = i*j;
                if (army1.containsKey(posicion)) {
                    System.out.print("|E1:" + army1.get(posicion).getLifeN() + "|");
                } else if (army2.containsKey(posicion)) {
                    System.out.print("|E2:" + army2.get(posicion).getLifeN() + "|");
                } else {
                    System.out.print("|____|");
                }
            }
            System.out.println();
        }
    }
    /*
     * un ranking de poder de todos los soldados creados, mayor al menor (usar al
     * menos 2 algoritmos de ordenamiento).
     */
    public static void rankSoldierBubbleSort(Soldado[][] army) {
        ArrayList<Soldado> sold = bidToUni(army);
        for (int i = 0; i < sold.size(); i++) {
            for (int j = 0; j < sold.size() - 1 - i; j++) {
                if (sold.get(j).getLifeN() < sold.get(j + 1).getLifeN()) {
                    Soldado tempo = sold.get(j);
                    sold.set(j, sold.get(j + 1));
                    sold.set(j + 1, tempo);
                }
            }
        }
        for (int i = 0; i < sold.size(); i++) {
            System.out.println(sold.get(i));
        }
    }
    public static ArrayList<Soldado> bidToUni(Soldado[][] army) {
        ArrayList<Soldado> sold = new ArrayList<>();
        for (int i = 0; i < army.length; i++) {
            for (int j = 0; j < army[0].length; j++) {
                if (army[i][j] != null) {
                    sold.add(army[i][j]);
                }
            }
        }
        return sold;
    }
    public static void rankSoldierSelectionSort(Soldado[][] army) {
        ArrayList<Soldado> sold = bidToUni(army);
        for (int i = 0; i < sold.size(); i++) {
            int idx = i;
            for (int j = i + 1; j < sold.size(); j++) {
                if (sold.get(j).getLifeN() > sold.get(idx).getLifeN()) {
                    idx = j;
                }
            }
            Soldado tempo = sold.get(i);
            sold.set(i, sold.get(idx));
            sold.set(idx, tempo);

        }
        for (int i = 0; i < sold.size(); i++) {
            System.out.println(sold.get(i));
        }
    }
    /*
     * Finalmente, que muestre qué ejército ganará la batalla (indicar la métrica
     * usada para decidir al ganador
     * de la batalla).
     */
    /*public static void betterWonArmy(Soldado[][] army1, Soldado[][] army2) {
        //int pointArmy1 = displayLifeN(army1);
        //int pointArmy2 = displayLifeN(army2);
        if (pointArmy1 == pointArmy2) {
            System.out.println("EMPATE");
        } else if (pointArmy1 > pointArmy2) {
            System.out.println("El Ejercito 1 gana");
        } else {
            System.out.println("El Ejercito 2 gana");
        }
    } */
}
