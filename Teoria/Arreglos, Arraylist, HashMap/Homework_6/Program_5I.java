/*Ejemplo: crear un HashMap de 3 cursos(código,
nombre), mostrar todos, eliminar un curso,
mostrar todos, mostrar el nombre dado un
código, verificar si contiene cierta entrada dado
un código. Recorrer todo el HashMap mostrando
sus datos con el formato:
IS001 : Introducción a la Computación */
import java.util.*;
public class Program_5I {
    public static void main(String[] args) {
        HashMap<String, String> course = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        course.put("MA001", "Matematica");
        course.put("ES001", "Escructuras Discretas");
        course.put("PW001", "Programacion Web");
        mostrar(course);
        System.out.println("Ingrese el curso a eliminar: ");
        String codeRemove = sc.next();
        removeKey(course, codeRemove);
        System.out.println("------------------------------");
        mostrar(course);
        System.out.println("---------------------------");
        System.out.println("Ingrese el codigo a buscar: ");
        String code = sc.next();
        if(course.containsKey(code)){
            System.out.println("Clave encontrada: ");
            searchKey(course, code);
        }else{
            System.out.println("Clave no encontrada");
        }
        System.out.println("---------------------------");
        removeAll(course);
        mostrar(course);
    }
    public static void mostrar(HashMap<String, String> cur){
        Iterator<Map.Entry<String, String>> iter = cur.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void removeKey(HashMap<String, String> cur, String key){
        Iterator<Map.Entry<String, String>> iter = cur.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            if(entry.getKey().equals(key)){
                iter.remove();
                break;
            }
        }
    }
    public static void searchKey(HashMap<String, String> cur, String key){
        Iterator<Map.Entry<String, String>> iter = cur.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            if(entry.getKey().equals(key)){
                System.out.println(entry.getKey()+": "+entry.getValue());
                break;
            }
        }
    }
    public static void removeAll(HashMap<String, String> cur){
        Iterator<Map.Entry<String, String>> iter = cur.entrySet().iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }
    }
}

