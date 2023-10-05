import java.util.Scanner;
class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soldado s1 = fillSoldado();
        Soldado s2 = fillSoldado();
        System.out.println(s1);
        System.out.println(s2);
        
    }
    public static Soldado fillSoldado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String name = sc.next();
        int nLife = (int)(Math.random()*5+1);
        System.out.print("Ingrese columna: ");
        String column = sc.next();
        System.out.println("Ingrese fila: ");
        String row = sc.next();
        return new Soldado(name, nLife, column, row);
    }
}