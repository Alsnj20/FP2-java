/*◼ Crear una aplicación para validar la clase, que
permita crear 2 jarras, insertar algunas monedas a cada
una usando un menú, imprimir el número de monedas
por cada jarra y el número de monedas en total cada
vez que se inserte una moneda */

import java.util.Scanner;
public class PennyJarTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean save = true;
        PennyJar jar1 = new PennyJar();
        PennyJar jar2 = new PennyJar();
        while(save){
            System.out.println("Ingrese una opción: ");
            System.out.println("1.Llenar Jarra");
            System.out.println("2.Imprimir el nro de monedas por cada Jarra");
            System.out.println("3.Numeros de monedas en total");
            System.out.println("4.Salir");
            int n = sc.nextInt();
            switch(n){
                case 1: System.out.println("Ingrese la jarra a llenar (1/2)");
                        int option = sc.nextInt();
                        if (option == 1){
                            fillJar(jar1, jar2, 1, 2);
                        }else{
                            fillJar(jar2, jar1, 2, 1);
                        }
                        break;
                case 2: 
                        printJar(jar1, jar2, 1, 2);
                        break;
                case 3: 
                        int m = PennyJar.getAllPennies();
                        System.out.println("Su ahorro total es: "+m);
                        break;
                case 4:
                        save = false;
            }
        }
    }
    public static void fillJar(PennyJar jar, PennyJar jar2, int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monedas para la jarra "+a);
        boolean fill = true;
        while(fill){
            System.out.print("Ingrese monedas: ");
            int m = sc.nextInt();
            jar.addPenny(m);
            printJar(jar,jar2,a,b);
            if(PennyJar.getAllPennies() >= PennyJar.GOAL) break;
            System.out.print("Desea seguir ingresando? (s/n)");
            String answer = sc.next();
            if(answer.equals("n"))
              fill = false;
        }
    }
    public static void printJar(PennyJar jar, PennyJar jar2, int a, int b ){
        System.out.print("Jarra"+a+": "+jar.getPennies()+" | ");
        System.out.println("Jarra"+b+": "+jar2.getPennies());
    }
}