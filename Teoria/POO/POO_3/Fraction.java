/*Diagrama de clases UML y programa que utilice objetos de clases
creadas
2. Crear la clase Fracción. Constructores sobrecargados usando
llamadas a this entre ellos.
Implementar las operaciones de suma, resta, multiplicación, división
y simplificación.
3 formas: método en clase principal, método de clase, método de
instancia para cada operación.
Evitar duplicación de código.*/
package POO_3;
class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom){
        this.numerator = num;
        denominator = denom;
    }
    public Fraction(){
        this(0, 1);
    }
    public Fraction(int num){
        this(num, 1);
    }
    public Fraction(Fraction f2){
        this(f2.numerator, f2.denominator); //se esta copiando la referencia
    }
    public String toString(){
        return "("+numerator+" / "+denominator+")";
    }
    //------instance method
    public Fraction add(Fraction f2 ){
        int num = this.numerator*f2.denominator + f2.numerator*this.denominator; 
        int den = this.denominator * f2.denominator;
        return new Fraction(num, den);
    }
    public Fraction subtract(Fraction f2){
        int num = this.numerator*f2.denominator - f2.numerator*this.denominator; 
        int den = this.denominator * f2.denominator;
        return new Fraction(num, den);
    }
    public Fraction multiply(Fraction f2){
        int num = this.numerator * f2.numerator;
        int den = this.denominator * f2.denominator;
        return new Fraction(num, den);
    }
    public Fraction divide(Fraction f2){
        int num = this.numerator * f2.denominator;
        int den = this.denominator * f2.numerator;
        return new Fraction(num, den);
    }
    public void simplify(){
        Fraction temp = new Fraction(numerator, denominator);
        int mcd = mcd(numerator, denominator);
        numerator /=mcd;
        denominator /=mcd;
        System.out.println(temp+" => "+this);
    }
    public int mcd(int a, int b) {
        int residuo = 1;
        while (residuo != 0) {
            residuo = a % b;
            a = b;
            b = residuo;
        }
        return a;
    }
    //-------class method
    public static Fraction add(Fraction f1, Fraction f2){
         return f1.add(f2);
    }
    public static Fraction subtract(Fraction f1, Fraction f2){
        return f1.subtract(f2);
    }
    public static Fraction multiply(Fraction f1, Fraction f2){
        return f1.multiply(f2);    
    }
    public static Fraction divide(Fraction f1,Fraction f2){
        return f1.divide(f2);
    }
    public static void simplify(Fraction f1){
        f1.simplify();
    }  
}