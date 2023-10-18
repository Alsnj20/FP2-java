package POO_3;

public class OperationFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 5);
        Fraction f2 = new Fraction(4, 6);
        f2.simplify();
        System.out.println("---------------Add----------------");
        Fraction sum = f1.add(f2);
        Fraction sum2 = Fraction.add(f1, f2);
        Fraction sum3 = add(f1, f2);
        System.out.println(f1+" + "+f2+" = "+sum);
        System.out.println(f1+" + "+f2+" = "+sum2);
        System.out.println(f1+" + "+f2+" = "+sum3);
        sum.simplify();
        OperationFraction.simplify(sum2);
        simplify(sum3);
        System.out.println("--------------Subtract------------");
        Fraction rest = f1.subtract(f2);
        Fraction rest2 = Fraction.subtract(f1, f2);
        Fraction rest3 = subtract(f1, f2);
        System.out.println(f1+" - "+f2+" = "+rest);
        System.out.println(f1+" - "+f2+" = "+rest2);
        System.out.println(f1+" - "+f2+" = "+rest3);
        rest.simplify();
        OperationFraction.simplify(rest2);
        simplify(rest3);
        System.out.println("--------------Multiply------------");
        Fraction mult = f1.multiply(f2);
        Fraction mult2 = Fraction.multiply(f1, f2);
        Fraction mult3 = multiply(f1, f2);
        System.out.println(f1+" * "+f2+" = "+mult);
        System.out.println(f1+" * "+f2+" = "+mult2);
        System.out.println(f1+" * "+f2+" = "+mult3);
        mult.simplify();
        Fraction.simplify(mult2);
        simplify(mult3);
        System.out.println("--------------Divide--------------");
        Fraction div = f1.divide(f2);
        Fraction div2 = Fraction.divide(f1, f2);
        Fraction div3 = divide(f1,f2);
        System.out.println(f1+" / "+f2+" = "+div);
        System.out.println(f1+" / "+f2+" = "+div2);
        System.out.println(f1+" / "+f2+" = "+div3);
        div.simplify();
        Fraction.simplify(div2);
        simplify(div3);
    }
    public static Fraction add(Fraction f1, Fraction f2){
        return f1.add(f2);
    }
    public static Fraction subtract(Fraction f1, Fraction f2){
        return f1.subtract(f2);
    }
    public static Fraction multiply(Fraction f1, Fraction f2){
        return f1.multiply(f2);
    }
    public static Fraction divide(Fraction f1, Fraction f2){
        return f1.divide(f2);
    }
    public static void simplify(Fraction f1){
        f1.simplify();
    }
}
