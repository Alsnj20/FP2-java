/* Ejemplo: crear un equipo de fútbol con 3
jugadores(número, nombre) e imprimir sus datos
completos. Usando HashMap */
import java.util.*;
public class Program_4I {
    public static void main(String[] args) {
        HashMap<Integer, String> course = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        course.put(4, "Juan");
        course.put(20, "Ricardo");
        course.put(2, "Michel");
        mostrar(course);
    }
    public static void mostrar(HashMap<Integer, String> cur){
        Iterator<Map.Entry<Integer, String>> iter = cur.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer, String> entry = iter.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
