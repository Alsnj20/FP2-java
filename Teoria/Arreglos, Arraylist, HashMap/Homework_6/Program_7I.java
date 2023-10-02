import java.util.*;
class Program_7I{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> courses = new HashMap<>();
        Boolean keep = true;
        while(keep){
            System.out.println("1.Agregar Curso\n2.Consultar Curso por codigo\n3.Salir");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    fillMap(courses);
                    break;
                case 2:
                    System.out.print("Ingrese el codigo del curso: ");
                    String searchCod = sc.nextLine();
                    searchCode(courses, searchCod);
                    break;
                case 3:
                    keep = false;
                    break;
            }
        }
    }
    public static String generateKey(String word){
       return word.substring(0,2).toUpperCase();
    }
    public static void fillMap(HashMap<String, String> courses){
        Scanner sc = new Scanner(System.in);
        boolean keep = true;
        while(keep){
            System.out.println("--------------------------");
            System.out.println("Ingrese el curso: ");
            String subject = sc.nextLine();
            if(courses.containsKey(generateKey(subject))){
                System.out.println("Ya existe un curso con este codigo");
                System.out.println("Generando un nuevo codigo...  clave: "+solucionarC(subject));
                courses.put(solucionarC(subject), subject);
            }else{
                System.out.println("El codigo generado es: "+generateKey(subject));
               courses.put(generateKey(subject), subject);
            }
            System.out.println("Desea ingresar otra asignatura: (s/n)");
            String answer = sc.nextLine();
            if(answer.equals("n")) keep = false; 
        }
    }
    public static void searchCode(HashMap<String, String> course, String code) {
        Iterator<Map.Entry<String, String>> iter = course.entrySet().iterator();
        boolean found = false;
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (entry.getKey().equals(code)) {
                System.out.println("Clave encontrada\n" +code+ ": "+entry.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Clave no encontrada");
        }
    }
    public static String solucionarC(String s){
        int n = (int)(Math.random()*(58-48+1)+48);
        return generateKey(s)+ (char) n;
    }
}
