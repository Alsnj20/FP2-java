import java.util.Scanner;
class Programa1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Primer soldado");
        String soldadoUno = sc.next();
        System.out.println("Ingrese el nombre del Segundo soldado");
        String soldadoDos = sc.next();
        System.out.println("Ingrese el nombre del Tercer soldado");
        String soldadoTres = sc.next();
        System.out.println("Ingrese el nombre del Cuarto soldado");
        String soldadoCuatro = sc.next();
        System.out.println("Ingrese el nombre del Quinto soldado");
        String soldadoCinco = sc.next();
        System.out.println("---------------------------------------");
        System.out.println(soldadoUno);
        System.out.println(soldadoDos);
        System.out.println(soldadoTres);
        System.out.println(soldadoCuatro);
        System.out.println(soldadoCinco);
        sc.close();
    }
}