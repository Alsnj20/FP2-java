import java.util.ArrayList;
public class University {
    public static void main(String[] args) {
        int studentCount = (int)(Math.random()*(50-20)+20);
        System.out.println("Cantidad de estudiantes: "+studentCount);
        ArrayList<Student> students = new ArrayList<>();
        int cantU = 0; int cantP = 0;
        fillStudents(students, studentCount);
        printStudent(students);
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i) instanceof Undergraduate){cantU++;} 
            if(students.get(i) instanceof Postgraduate) {cantP++;}
        }
        int sumaU =0; int sumaP = 0;
        for (Student student : students) {
            if(student instanceof Undergraduate) {sumaU +=student.getAverage();}
            if(student instanceof Postgraduate) {sumaP +=student.getAverage();}
        }
        double promedioU = (sumaU*1.0)/cantU;
        double promedioP = (sumaP*1.0)/cantP;
        System.out.println("\nCantidad de estudiante de Pregrado: "+cantU);
        System.out.println("Promedio ponderado de Pregrado :"+promedioU);
        System.out.println("Cantidad de estudiante de Posgrado: "+cantP);
        System.out.println("Promedio ponderado de Posgrado :"+promedioP);
        String best = (promedioU > promedioP)?"Pregado":"Posgrado";
        System.out.println("Los estudiante con mayor promedio son los de "+best.toUpperCase());

    }
    public static void fillStudents(ArrayList<Student> students, int c){
        Student s = null; 
        for (int i = 0; i < c; i++) {
            int n = (int)(Math.random()*2+1);
            if(n == 1)
                s = new Undergraduate();
            if(n == 2)
                s = new Postgraduate();
            students.add(s);
        }
    }
    public static void printStudent(ArrayList<Student> students){
        for (Student student : students)
            System.out.println(student);
    }
}
