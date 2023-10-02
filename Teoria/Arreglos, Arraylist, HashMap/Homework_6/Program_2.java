/*EJERCICIO 2: crear un ArrayList de contactos, permitir
llenarlo con contactos hasta que se desee. Imprimir todo
el ArrayList, luego buscar dentro del ArrayList usando la
búsqueda binaria por nombre e imprimir todos los datos
del contacto encontrado */
import java.util.*;
class Program_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacto> contacts = new ArrayList<>();
        fillContact(contacts);
        bubbleSort(contacts);
        System.out.println(contacts);
        System.out.println("------------------");
        System.out.println("Ingrese el nombre de su contacto: ");
        String name = sc.next();
        int n = searchBinaryContact(contacts, name);
        if(n != -1){
            System.out.println(contacts.get(n).toString());
        }else{
            System.out.println("Contacto no encontrado");
        }  
    }
    public static void fillContact(ArrayList<Contacto> contacts){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese sus datos (0 en nombre para salir)");
            String name = sc.next();
            if(name.equals("0")) break;
            int age = sc.nextInt();
            String status = sc.next();
            Contacto contc = new Contacto(name, age, status);
            contacts.add(contc);   
        }   
    }
    public static void bubbleSort(ArrayList<Contacto> contacts){
        for (int i = 0; i < contacts.size(); i++) {
            for (int j = 0; j < contacts.size()-1-i; j++) {
                Contacto cont1 = contacts.get(j);
                Contacto cont2 = contacts.get(j+1);
                if(cont1.getNombre().compareToIgnoreCase(cont2.getNombre())>0){
                    contacts.set(j, cont2);
                    contacts.set(j+1, cont1);
                }
            }    
        }
    }
    public static int searchBinaryContact(ArrayList<Contacto> contc, String cont1){
        int left = 0;//<--
        int right = contc.size()-1;//-->
        while(left <= right){
            int mid = (left + right)/2;
            String name = contc.get(mid).getNombre();
            int comp = name.compareTo(cont1);
            if(comp == 0){
                return mid;
            }else if(comp < 0 ){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}