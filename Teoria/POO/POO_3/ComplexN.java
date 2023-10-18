/*1. Crear ArrayList de Imaginarios
2. Mostrar todos los Imaginarios creados
3. Realizar operaciones (de 2 primeros Imaginarios almacenados): sumar,
restar y multiplicar. Módulo y conjugado (del primer Imaginario). En cada
operación mostrar el resultado usando todas las formas posibles
4. Salir */
package POO_3;
import java.util.*;
public class ComplexN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ComplexNumber> numbercomplex = new ArrayList<>();
        boolean play = true;
        while(play){
            System.out.println("Menú:");
            System.out.println("1. Crear número complejo");
            System.out.println("2. Mostrar números complejos");
            System.out.println("3. Realizar operaciones");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int n = sc.nextInt();
            switch(n){
                case 1: fillArrayList(numbercomplex);
                        break;
                case 2: displayArrayList(numbercomplex);
                        break;
                case 3: operation(numbercomplex);
                        break;
                case 4: play=false;
                        break;
            }
        }
    }
    public static void fillArrayList(ArrayList<ComplexNumber> imaginary) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese un numero complejo(real/imaginaria)");
            double real = sc.nextDouble();
            double img =  sc.nextDouble();
            ComplexNumber c = new ComplexNumber(real, img);
            imaginary.add(c);
            System.out.print("Desea generar otro numero imaginario?(s/n)");
            String answer = sc.next();
            if (answer.equals("n"))
                break;
        }
    }
    public static void displayArrayList(ArrayList<ComplexNumber> imaginary) {
        for (ComplexNumber c : imaginary) {
            printComplex(c);
        }
    }
    public static void printComplex(ComplexNumber c){
        System.out.println(c.format1()+"   |   "+c.format2());
    }
    public static void operation(ArrayList<ComplexNumber> imaginary) {
        ComplexNumber num1 = imaginary.get(0);
        ComplexNumber num2 = imaginary.get(1);

        ComplexNumber suma1 = num1.add(num2);
        ComplexNumber suma2 = ComplexNumber.add(num1, num2);
        ComplexNumber suma3 = add(num1, num2);
        ComplexNumber resta1 = num1.subtract(num2);
        ComplexNumber resta2 = ComplexNumber.subtract(num1, num2);
        ComplexNumber resta3 = subtract(num1, num2);
        ComplexNumber mult1 = num1.multiply(num2);
        ComplexNumber mult2 = ComplexNumber.multiply(num1, num2);
        ComplexNumber mult3 = multiply(num1, num2);        
        System.out.println("Suma:");
        printComplex(suma1);
        printComplex(suma2);
        printComplex(suma3);
        System.out.println("Resta:");
        printComplex(resta1);
        printComplex(resta2);
        printComplex(resta3);
        System.out.println("Multiplicación:");
        printComplex(mult1);
        printComplex(mult2);
        printComplex(mult3);
        double modulo = num1.mod();
        System.out.println("Módulo del primer número complejo: "+modulo);
        double modulo1 = ComplexNumber.mod(num1);
        System.out.println("Módulo del primer número complejo: "+modulo1);
        double modulo2 = mod(num1);
        System.out.println("Módulo del primer número complejo: "+modulo2);
        ComplexNumber conjug = num1.conjugate();
        ComplexNumber conjug2 = ComplexNumber.conjugate(num1);
        ComplexNumber conjug3 = conjugate(num1);
        System.out.println("Conjugado del primer número complejo:");
        printComplex(conjug);
        printComplex(conjug2);
        printComplex(conjug3);
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        return c1.add(c2);
    }
    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2){
        return c1.subtract(c2);
    }
    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2){
        return c1.multiply(c2);
    }
    public static double mod(ComplexNumber c){
        return c.mod();
    }
    public static ComplexNumber conjugate(ComplexNumber c){
        return c.conjugate();
    }
}
