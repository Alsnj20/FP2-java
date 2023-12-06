/*Crear la clase Fraccion con constructores sobrecargados, que
se verifique la consistencia de sus datos y le dé valores por
defecto en caso sean erróneos. sets, gets. También que
permita mostrar en diferentes formatos: a/b, x.yzw. Y que
permita retornar la suma, resta, multiplicación y división de la
fracción con otro objeto fracción (el objeto llamado queda
intacto). Además que permita retornar la fracción simplificada
(el objeto llamado queda intacto). Evitar la duplicación de
código
suma = f1.sumar(f2);
 */
package POO_4;
public class OperationFraction_1 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 8);
        Fraction f2 = new Fraction(2, 3);
        System.out.println("---------------Add----------------");
        Fraction sum = f1.add(f2);
        System.out.println(f1+" + "+f2+" = "+print(sum));
        Fraction simpl1 = sum.simplify();
        System.out.println(print(simpl1));
        System.out.println("--------------Subtract------------");
        Fraction rest = f1.subtract(f2);
        System.out.println(f1+" - "+f2+" = "+print(rest));
        Fraction simpl2 = rest.simplify();
        System.out.println(print(simpl2));
        System.out.println("--------------Multiply------------");
        Fraction mult = f1.multiply(f2);
        System.out.println(f1+" * "+f2+" = "+print(mult));
        Fraction simpl3 = mult.simplify();
        System.out.println(print(simpl3));
        System.out.println("--------------Divide--------------");
        Fraction div = f1.divide(f2);
        System.out.println(f1+" / "+f2+" = "+print(div));
        Fraction simpl4 = div.simplify();
        System.out.println(print(simpl4));
    }
    public static String print(Fraction f){
        return f.format1()+" o "+f.format2();
    }
}