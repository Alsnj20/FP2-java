/*ArrayList bidimensional de alumnos EPIS
◼ Para los 5 años y cada año debe tener espacio los alumnos que sea
necesario
◼ Alumno: nombre, edad y promedioPonderado
Al ejecutar el programa:
1. Ingresar datos 2. Consultar año
3. Consultar todos 4. Promedio ponderado por año
5. Promedio ponderado de todos 6. Mayor año
7. Menor año 8. Mayor todos
9. Menor todos 10. Rankear año
11. Rankear todos 12. Salir */
import java.util.ArrayList;
import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Alumno>> studentList = new ArrayList<ArrayList<Alumno>>();
        enterYear(studentList);
        Boolean finished = false;
        while (!finished) {
            System.out.println(
                    "1.Ingresar datos\n2.Consultar por año\n3.Consultar todos\n4.Promedio ponderado por año\n5.Promedio ponderado de todos\n6.Mayor promedio por año\n7.Menor promedio por año\n8.Mayor promedio de todos\n9.Menor promedio de todos\n10.Rankear por año\n11.Rankear todos\n12.Salir");
            int point = sc.nextInt();
            switch (point) {
                case 1:
                    System.out.print("Ingrese el año que cursa(1/2/3/4/5): ");
                    int yearSchool = sc.nextInt();
                    enterData(studentList, yearSchool);
                    break;
                case 2:
                    System.out.print("Ingrese el año que desea consultar: ");
                    int yearConsult = sc.nextInt();
                    consultByYear(studentList, yearConsult);
                    break;
                case 3:
                    System.out.println("Lista de todos los estudiantes de la EPIS: ");
                    consultAll(studentList);
                    break;
                case 4:
                    System.out.println("Ingrese el año a promediar de los estudiantes: ");
                    int averageYear = sc.nextInt();
                    System.out.println("El promedio de los estudiantes del " + averageYear + " año: "
                            + averagePerYear(studentList, averageYear));
                    break;
                case 5:
                    System.out.println("El promedio de todos los estudiantes es: " + averageAll(studentList));
                    break;
                case 6:
                    System.out.println("Ingrese el año para consultar el mayor promedio: ");
                    int bestAverage = sc.nextInt();
                    bestAverageYear(studentList, bestAverage);
                    break;
                case 7:
                    System.out.println("Ingrese el año para consultar el menor promedio: ");
                    int lowestAverage = sc.nextInt();
                    lowestAverageYear(studentList, lowestAverage);
                    break;
                case 8:
                    bestAverageAll(studentList);
                    break;
                case 9:
                    lowestAverageAll(studentList);
                    break;
                case 10:
                    System.out.println("Ingrese un año para rankear a los estudiantes:");
                    int n = sc.nextInt();
                    rankYear(studentList, n);
                    break;
                case 11:
                    rankAll(studentList);
                    break;
                case 12:
                    finished = true;
                    break;
            }
        }
    }
    public static void enterYear(ArrayList<ArrayList<Alumno>> lista) {
        for (int i = 0; i < 5; i++) {
            lista.add(new ArrayList<>());
        }
    }
    public static void enterData(ArrayList<ArrayList<Alumno>> alum, int year) {
        Scanner sc = new Scanner(System.in);
            while(true){
            System.out.println("Ingrese sus datos (nombre/edad/promedio)(0 en nombre para salir)");
            String name = sc.next();
            if(name.equals("0")) break;
            int age = (int) (Math.random() * 25 + 1);
            int average = (int) (Math.random() * 20 + 1);
            Alumno alu = new Alumno(name, age, average);
            alum.get(year-1).add(alu);
            }
    }
    public static void consultByYear(ArrayList<ArrayList<Alumno>> alum, int year) {
        System.out.println("Lista de los estudiante de "+year+" año:");
        for (int j = 0; j < alum.get(year-1).size(); j++) {
            System.out.println((j + 1) + "." + alum.get(year-1).get(j));
        }
    }
    public static void consultAll(ArrayList<ArrayList<Alumno>> alum) {
        for (int i = 0; i < alum.size(); i++) {
            System.out.println("Lista de los estudiantes de " + (i + 1) + " año:");
            for (int j = 0; j < alum.get(i).size(); j++) {
                System.out.println((j + 1) + "." + alum.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static double averagePerYear(ArrayList<ArrayList<Alumno>> alum, int year) {
        int average = 0;
        for (int j = 0; j < alum.get(year-1).size(); j++) {
            average += alum.get(year-1).get(j).getPromedio();
        }
        return (average * 1.0) / (alum.get(year-1).size());
    }
    public static double averageAll(ArrayList<ArrayList<Alumno>> alum) {
        int studentTotal = 0;
        int total = 0;
        for (int i = 0; i < alum.size(); i++) {
            for (int j = 0; j < alum.get(i).size(); j++) {
                studentTotal += alum.get(i).get(j).getPromedio();
                total++;
            }
        }
        return (studentTotal * 1.0) / total;
    }
    public static void bestAverageYear(ArrayList<ArrayList<Alumno>> alum, int year) {
        Alumno stud = alum.get(year-1).get(0);
        System.out.println("Mayor promedio de los Alumno del " +(year)+" año: ");
        for (int j = 0; j < alum.get(year-1).size(); j++) {
            if (stud.getPromedio() < alum.get(year-1).get(j).getPromedio()) {
                stud = alum.get(year-1).get(j);
            }
        }
        System.out.println(stud.toString());
    }
    public static void lowestAverageYear(ArrayList<ArrayList<Alumno>> alum, int year) {
        Alumno stud = alum.get(year-1).get(0);
        System.out.println("Menor promedio de los Alumno del " +(year)+" año: ");
        for (int j = 0; j < alum.get(year-1).size(); j++) {
            if (stud.getPromedio() > alum.get(year-1).get(j).getPromedio()) {
                stud = alum.get(year-1).get(j);
            }
        }
        System.out.println(stud.toString());
    }
    public static void bestAverageAll(ArrayList<ArrayList<Alumno>> alum) {
        int yearAll = 0;
        Alumno bestAll = alum.get(0).get(0);
        for (int i = 0; i < alum.size(); i++) {
            for (int j = 0; j < alum.get(i).size(); j++) {
                if (alum.get(i).get(j).getPromedio() > bestAll.getPromedio()) {
                    bestAll = alum.get(i).get(j);
                    yearAll = i;
                }
            }
        }
        System.out.println("El mayor promedio le pertenece a " +(yearAll+1)+" año: "+bestAll);
    }
    public static void lowestAverageAll(ArrayList<ArrayList<Alumno>> alum) {
        int yearAll = 0;
        Alumno lowestAll = alum.get(0).get(0);
        for (int i = 0; i < alum.size(); i++) {
            for (int j = 0; j < alum.get(i).size(); j++) {
                if (alum.get(i).get(j).getPromedio() < lowestAll.getPromedio()) {
                    lowestAll = alum.get(i).get(j);
                    yearAll = i;
                }
            }
        }
        System.out.println("El menor promedio le pertenece a " +(yearAll+1)+" año: "+lowestAll);
    }
    public static void rankYear(ArrayList<ArrayList<Alumno>> alum, int year) {
        for (int j = 0; j < alum.get(year-1).size(); j++) {
            for (int i = 0; i < alum.get(year-1).size()- 1 - j; i++) {
                Alumno alu1 = alum.get(year-1).get(i);
                Alumno alu2 = alum.get(year-1).get(i+1);
                if (alu1.getPromedio() < alu2.getPromedio()) {
                    Alumno tempo = alu1;
                    alum.get(year-1).set(i, alu2);
                    alum.get(year-1).set(i+1, tempo);    
                }
            }
        }
        consultByYear(alum, year);
    }
    public static void rankAll(ArrayList<ArrayList<Alumno>> alum) {
        ArrayList<Alumno> stud = bidToUni(alum);
        for (int j = 0; j < stud.size(); j++) {
            for (int i = 0; i < stud.size()- 1- j; i++) {
                if (stud.get(i).getPromedio() < stud.get(i+1).getPromedio()) {
                    Alumno temp = stud.get(i);
                    stud.set(i, stud.get(i+1));
                    stud.set(i+1, temp);
                }
            }
        }
        for (int i = 0; i < stud.size(); i++) {
            System.out.println((i+1)+"."+stud.get(i));}
    }
    public static ArrayList<Alumno> bidToUni(ArrayList<ArrayList<Alumno>> alum){//bidimensional a unidimensional
        ArrayList<Alumno> student = new ArrayList<>();
        for (int i = 0; i < alum.size(); i++) {
            for (int j = 0; j < alum.get(i).size(); j++) {
                student.add(alum.get(i).get(j));
            }
        }
        return student;
    }
}
