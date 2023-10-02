/*EJERCICIO 1: realizar un programa utilizando ArrayList
donde se añadan N nombres de personas, luego que
se vayan eliminando uno por uno aleatoriamente, para
cada eliminación que se imprima el nombre del
eliminado y de los que quedan con vida, y finalmente
se imprima el nombre del ganador del reality de
supervivencia!!! */
import java.util.*;
class Program_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> people = new ArrayList<>();
        fillName(people,n);
        int large = people.size();
        String removeName = people.get(0);
        while(large !=1){
            removeName = people.remove(generateN(large));
            System.out.println("El nombre eliminado es: "+removeName);
            System.out.println("Queda: "+people);
            large--;
        }
        System.out.println("El ganador de la Supervivencia es: "+people.get(0));
    }
    public static void fillName(ArrayList<String> people, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            String name = sc.next();
            people.add(name);
        }
    }
    public static int generateN(int n){
        return (int)(Math.random()*n);
    }
}