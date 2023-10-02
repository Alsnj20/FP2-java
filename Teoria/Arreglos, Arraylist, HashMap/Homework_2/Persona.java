/*Ejercicio 1: crear un arreglo de n Personas,
almacenando datos que ingresemos para cada una.
Luego que los muestre */
/*Ejercicio 2: mostrar los datos del amigo más joven y
del mayor de todos */
import java.util.Scanner;
public class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String toString(){
        return "Nombre: "+nombre+ " |Edad: "+edad;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//cantidad de personas
        Persona[] persons= fillData(n, sc);
        printData(persons);
        System.out.println("El mas joven es:");
        System.out.println((isYounger(persons)).toString());
        System.out.println("El mas adulto es:");
        System.out.println((isMoreAdult(persons)).toString());
    }
    public static Persona[] fillData(int n, Scanner key){
        Persona[] people = new Persona[n];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Ingrese los datos para Persona: "+(i+1));
            String name = key.next();
            int age = key.nextInt();
            people[i] = new Persona(name, age);
        }
        return people;
    }
    public static void printData(Persona[] people){
        for(Persona p: people){
            System.out.println(p.toString());
        }
    }
    public static Persona isYounger(Persona[] people){
        Persona young = people[0];
        for (int i = 0; i < people.length; i++) {
            if(people[i].getEdad() < young.getEdad())
                young = people[i]; 
        }
        return young;
    }
    public static Persona isMoreAdult(Persona[] people){
        Persona adult = people[0];
        for (int i = 0; i < people.length; i++) {
            if(people[i].getEdad() > adult.getEdad())
                adult = people[i]; 
        }
        return adult;
    }
}
