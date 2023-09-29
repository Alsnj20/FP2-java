import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args) {
        Soldier[] navy_1 = new Soldier[generateSoldier()];
        Soldier[] navy_2 = new Soldier[generateSoldier()];
        System.out.println("----------Ejercito 1--------");
        startArmy(navy_1);
        displayArmy(navy_1);
        System.out.println("----------Ejercito 2--------");
        startArmy(navy_2);
        displayArmy(navy_2);
        System.out.println("----------El Ganador es--------");
        displayArmyWon(navy_1, navy_2);
    }
    public static void startArmy(Soldier[] army){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < army.length; i++) {
            String name = "Soldado"+i;
            army[i] = new Soldier(name);
        }
        sc.close();
    }
    public static int generateSoldier(){
        return (int)(Math.random()*5+1);
    }
    public static void displayArmy(Soldier[] army){
        for (int i = 0; i < army.length; i++) {
            System.out.println(army[i].getName());
        }
    }
    public static void displayArmyWon(Soldier[] army1, Soldier[] army2){
        if(army1.length == army2.length){
            System.out.println("EMPATE!");
        }else if(army1.length>army2.length){
            System.out.println("El ejercito 1 gana!");
            System.out.println("Integrantes: ");
            displayArmy(army2);
        }else{
            System.out.println("El ejercito 2 gana!");
            System.out.println("Integrantes: ");
            displayArmy(army2);
        }
    }
}
