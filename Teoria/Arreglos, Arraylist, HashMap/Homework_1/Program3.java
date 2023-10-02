/*Hacer un programa que cree un arreglo con
capacidad para 100 números de celulares (que
sólo acepte números de 9 dígitos), que permita
ingresar los números requeridos hasta que el
usuario ingrese una “q” y finalmente que
imprima sólo los números ingresados. Verificar
que los números de celular sólo contengan
dígitos. (Investigar al menos 2 formas de
realizar la verificación). */
import java.util.Scanner;
public class Program3 {
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
                try{
                    number = verifica(number);
                    if(number.length() == 9){
                    telefono[i] = number;
                    i++;
                    }else{}
                }catch(NumberFormatException e){
                    System.out.println("ERROR! Usted esta intentado ingresar caracteres no validos. Ingrese solo numeros");
                }    
            }
            System.out.println("Ingrese un numero de telefono: (q) para salir");
            number = sc.next();
        }
        System.out.println("Lista de Telefonos:");
        printArray(telefono,i);
        sc.close();    
    }
    public static String verifica(String word){
        String vacio = "";
        int n = Integer.parseInt(word);
        vacio = String.valueOf(n);
        return vacio;
    }
    public static void printArray(String[] telf, int j){
        for (int i = 0; i < j; i++) {
            System.out.println(telf[i]);
        }
    }  
}