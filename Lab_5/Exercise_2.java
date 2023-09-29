import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Soldier[] navy = new Soldier[5];
        fillArmyData(navy);
        System.out.println("------------------");
        printArmyData(navy);
    }
    public static void fillArmyData(Soldier[] army){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < army.length; i++) {
            System.out.println("Llenar datos para el Soldado "+(i+1));
            String name = sc.next();
            int lifeL = generateLife();
            army[i] = new Soldier(name, lifeL);
        }
        sc.close();
    }
    public static int generateLife(){
        return (int)(Math.random()*5+1);
    }
    public static void printArmyData(Soldier[] army){
        for (int i = 0; i < army.length; i++) {
            System.out.println("Soldado "+(i+1));
            System.out.println(army[i].toString());
        }
    }
}
