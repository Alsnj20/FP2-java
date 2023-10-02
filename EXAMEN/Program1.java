import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> estudiante = new ArrayList<>();
        fillList(estudiante);
        System.out.println("Lista de alumnos original: ");
        printList(estudiante);
        String answer = "";
        while(true){
            System.out.println("Lista de alumno a participar: ");
            generateSort(estudiante);
            printList(estudiante);
            System.out.println("Desea generar otro orden? (S/N)");
            answer = sc.next();
            if(answer.equals("N")){break;}
        }
        System.out.println("Lista de alumno a participar descendente");
        sortDesc(estudiante);
    }
    public static void fillList(ArrayList<Alumno> alum){
        Scanner sc = new Scanner(System.in);
        int i= 1;
        while(true){
            int n = i;
            System.out.println("Ingrese su nombre (000) para salir");
            String name = sc.next();
            if(name.equals("000")){break;}
            System.out.println("Ingrese CUI para el alumno");
            String cui =  sc.next();
            Alumno alumN = new Alumno(n, name, cui);
            alum.add(alumN);
            i++;
        }
    }
    public static void generateSort(ArrayList<Alumno> alum){
        for (int i = 0; i < alum.size(); i++) {
            int n = (int)(Math.random()*alum.size());
            Alumno tempo = alum.get(i);
            alum.set(n, tempo);
        }
    }
    public static void generateSort(ArrayList<Alumno> alum) {
        int n = alum.size();
        for (int i = n - 1; i > 0; i--) {
            int j = (int)(Math.random()*i+1);
            Alumno temp = alum.get(i);
            alum.set(i, alum.get(j));
            alum.set(j, temp);
        }
    
    public static void printList(ArrayList<Alumno> alum){
        for (int i = 0; i < alum.size(); i++) {
            System.out.println(alum.get(i));
        }
    }
    public static void sortDesc(ArrayList<Alumno> alum){
        for (int i = 0; i < alum.size(); i++) {
            for (int j = 0; j < alum.size()-i-1; j++) {
                if(alum.get(j).getN()<alum.get(j+1).getN()){
                    Alumno tempo = alum.get(j);
                    alum.set(j, alum.get(j+1));
                    alum.set(j+1, tempo);
                }
            }
            
        }
        printList(alum);
    }   
}




