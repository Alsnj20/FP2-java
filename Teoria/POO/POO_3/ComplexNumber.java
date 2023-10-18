/*Crear la clase Imaginario con constructores sobrecargados, usar this para
llamadas entre ellos. Crear sets, gets. También que permita mostrar en
diferentes formatos: (a, b) a+bi. Y que permita retornar la suma, resta
y multiplicación (el objeto llamado queda intacto). Además que permita
retornar la módulo de un imaginario y su conjugado. Evitar duplicar código.
Usar 3 formas de implementación para cada operación.
suma = i1.sumar(i2);
suma = Imaginario.sumar(i1, i2);
suma = sumar(i1, i2); */
package POO_3;
public class ComplexNumber {
    private double real;
    private double image;

    // overloaded builder
    public ComplexNumber() {
        this(0.0, 0.0);
    }
    public ComplexNumber(double r, double img) {
        setReal(r);
        setImaginary(img);
    }
    public ComplexNumber(double real) {
        this(real, 0.0);
    }
    // set and get
    public void setReal(double r) {
        this.real = r;
    }
    public void setImaginary(double img) {
        this.image = img;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return image;
    }
    // formats
    public String format1() {
        return "("+real+", "+image+")";
    }
    public String format2() {
        if (image > 0) {
            return (real+" + "+image+"i");
        } else {
            return (real +" - "+Math.abs(image)+"i");
        }
    }
    // Operations
    public ComplexNumber add(ComplexNumber number2) {
        double preal = this.real + number2.real;
        double pimg = this.image + number2.image;
        return new ComplexNumber(preal, pimg);
    }
    public ComplexNumber subtract(ComplexNumber number2) {
        double preal = this.real - number2.real;
        double pimg = this.image - number2.image;
        return new ComplexNumber(preal, pimg);
    }
    public ComplexNumber multiply(ComplexNumber number2) {
        double preal = (this.real * number2.real) + (this.image * number2.image * -1);
        double pimg = (this.real * number2.image) + (this.image * number2.real);
        return new ComplexNumber(preal, pimg);
    }
    public double mod() {
        return Math.sqrt(Math.pow(real, 2)+Math.pow(image, 2));
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -1.0 * image);
    }
    //class method
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return num1.add(num2);
    }

    public static ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        return num1.subtract(num2);
    }

    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        return num1.multiply(num2);
    }
    public static double mod(ComplexNumber c){
        return c.mod();
    }
    public static ComplexNumber conjugate(ComplexNumber c){
        return c.conjugate();
    }
}
