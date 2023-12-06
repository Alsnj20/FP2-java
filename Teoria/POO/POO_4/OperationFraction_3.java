/*Crear la clase Fraccion como en el anterior ejemplo, pero que
permita el encadenamiento de llamadas a métodos (f1 NO
puede cambiar su valor)
 */
package POO_4;
public class OperationFraction_3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 5);
        Fraction f2 = new Fraction(2, 3);
        Fraction f = f1.add(f2).subtract(f2).multiply(f1).divide(f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f);
        Fraction fg = f.add(f1).subtract(f1).simplify();
        System.out.println(fg);
    }
}
