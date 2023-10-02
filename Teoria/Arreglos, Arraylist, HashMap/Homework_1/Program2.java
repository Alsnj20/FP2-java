/*Hacer un programa que cree un arreglo con
capacidad para 100 números de celulares (que
sólo acepte números de 9 dígitos), que permita
ingresar los números requeridos hasta que el
usuario ingrese una “q” y finalmente que
imprima sólo los números ingresados. Confiar
que el usuario siempre ingresa dígitos. */
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] telefono = new String[100];
        int i=0;
        System.out.println("Ingrese un numero de telefono: (q) para salir");
        String number = sc.next();
        while(i<telefono.length && !number.equals("q")){
            if(number.length() != 9){
               System.out.println("Ingrese un numero de telefono de 9 digitos"); 
            }else{
               if(number.length() == 9){
                telefono[i] = number;
                i++;   
               }else{i--;}
            }
            System.out.println("Ingrese un numero de telefono: (q) para salir");
            number = sc.next();
        }
        System.out.println("Lista de Telefonos:");
        printArray(telefono,i);
        sc.close();     
    }
    public static void printArray(String[] telf, int j){
        for (int i = 0; i < j; i++) {
            System.out.println(telf[i]);
        }
    }  
}
