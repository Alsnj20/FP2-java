import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Primer soldado");
        String soldadoUno = sc.next();
        int nVida1 = generateLife();
        System.out.println("Ingrese el nombre del Segundo soldado");
        String soldadoDos = sc.next();
        int nVida2 = generateLife();
        System.out.println("Ingrese el nombre del Tercer soldado");
        String soldadoTres = sc.next();
        int nVida3 = generateLife();
        System.out.println("Ingrese el nombre del Cuarto soldado");
        String soldadoCuatro = sc.next();
        int nVida4 = generateLife();
        System.out.println("Ingrese el nombre del Quinto soldado");
        String soldadoCinco = sc.next();
        int nVida5 = generateLife();
        System.out.println("-------------------");
        System.out.println("Nombre: "+soldadoUno+ " Nivel de vida: "+nVida1);
        System.out.println("Nombre: "+soldadoDos+ " Nivel de vida: "+nVida2);
        System.out.println("Nombre: "+soldadoTres+ " Nivel de vida: "+nVida3);
        System.out.println("Nombre: "+soldadoCuatro+ " Nivel de vida: "+nVida4);
        System.out.println("Nombre: "+soldadoCinco+ " Nivel de vida: "+nVida5);   
        sc.close();
    }
    public static int generateLife(){
        return (int)(Math.random()*5+1);
    }   
}
