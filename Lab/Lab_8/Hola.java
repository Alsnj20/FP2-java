import java.util.HashMap;
import java.util.TreeMap;
public class Hola {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Mariel", "Jara");
        map.put("Hola", "Como");
        map.put("1234", "hola");
        System.out.println(map);
        TreeMap<String, String> t = new TreeMap<>();
        t.putAll(map);
        for (String key : t.keySet()) {
            System.out.println(key+": "+t.get(key));
        }
    }
}
