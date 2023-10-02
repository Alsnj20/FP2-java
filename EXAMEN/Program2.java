import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        ingresar(a);
        imprimir(a);
        modificar(a);
        imprimir(a);
        imprimir(a, 3.5);
        System.out.println("El promedio es: " + promedio(a));
    }
    public static void ingresar(ArrayList<Double> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números (0 para salir): ");
        while (true) {
            double num = sc.nextDouble();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
    }
    public static void imprimir(ArrayList<Double> list) {
        for (double elemento : list) {
            System.out.println(elemento);
        }
    }
    public static void modificar(ArrayList<Double> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor por el cual multiplicar los elementos: ");
        double multiplicador = sc.nextDouble();
        for (int i = 0; i < lista.size(); i++) {
            double tempo = lista.get(i) * multiplicador;
            lista.set(i, tempo);
        }
    }
    public static void imprimir(ArrayList<Double> lista, double div) {
        System.out.println("Elementos divisibles por "+div+":");
        for (double elemento : lista) {
            if (elemento % div == 0) {
                System.out.println(elemento);
            }
        }
    }
    public static double promedio(ArrayList<Double> lista) {
        double suma = 0;
        for (double elemento : lista) {
            suma += elemento;
        }
        return suma / lista.size();
    }
}