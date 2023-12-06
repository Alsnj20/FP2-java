/*Crear la clase Fraccion como en el anterior ejemplo, pero que
permita el encadenamiento de llamadas a métodos (f1 puede
cambiar su valor)*/
package POO_4;
public class OperationFraction_2 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 5);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 2);
        Fraction f4 = new Fraction(6, 2);
        Fraction f = f1.addV(f2).subtractV(f2).multiplyV(f3).divideV(f4).simplifyV();
        System.out.println("El valor de f1 es: "+print(f1));
        System.out.println("El valor de f es: "+print(f));
    }
    public static String print(Fraction f){
        return f.format1()+" o "+f.format2();
    }
}
