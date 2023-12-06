/*Crear la clase Fraccion con constructores sobrecargados, que
se verifique la consistencia de sus datos y le dé valores por
defecto en caso sean erróneos. sets, gets. También que
permita mostrar en diferentes formatos: a/b, x.yzw. Y que
permita retornar la suma, resta, multiplicación y división de la
fracción con otro objeto fracción (el objeto llamado queda
intacto). Además que permita retornar la fracción simplificada
(el objeto llamado queda intacto). Evitar la duplicación de
código */
package POO_4;
class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        this(0, 1);
    }
    public Fraction(int num){
        this(num, 1);
    }
    public Fraction(int num, int denom){
        setNumerator(num);
        setDenominator(denom);
    }
    public void setNumerator(int n){
        this.numerator = n;
    } 
    public void setDenominator(int d){
        this.denominator = d;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public String format1(){
        return "("+this.getNumerator()+" / "+this.getDenominator()+")";
    }
    public String format2(){
        return ""+(double)this.getNumerator()/this.getDenominator();
        
    }
    public String toString(){
        return "("+numerator+" / "+denominator+")";
    }
    //------instance method return un valor el cual NO se actualize el objeto llamado.
    public Fraction add(Fraction f2){
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
    public Fraction simplify(){
        int mcd = mcd(this.numerator, this.denominator);
        int num = this.numerator/mcd;
        int denom = this.denominator/mcd;
        return new Fraction(num, denom);
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
    //encadenamiento de metodos return objeto llamado
    public Fraction addV(Fraction f2 ){
        this.numerator = this.numerator*f2.denominator + f2.numerator*this.denominator; 
        this.denominator = this.denominator * f2.denominator;
        return this;
    }
    public Fraction subtractV(Fraction f2){
        this.numerator = this.numerator*f2.denominator - f2.numerator*this.denominator; 
        this.denominator = this.denominator * f2.denominator;
        return this;
    }
    public Fraction multiplyV(Fraction f2){
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        return this;
    }
    public Fraction divideV(Fraction f2){
        this.numerator = this.numerator * f2.denominator;
        this.denominator = this.denominator * f2.numerator;
        return this;
    }
    public Fraction simplifyV(){
        int mcd = mcd(this.numerator, this.denominator);
        this.numerator /=mcd;
        this.denominator /=mcd;
        return this;
    }
}