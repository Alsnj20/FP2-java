import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[][] studentList = new Alumno[2][3];
        enterData1(studentList);//iniciar una Lista.
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
    public static void enterData(Alumno[][] alum, int year) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < alum[year - 1].length; j++) {
            System.out.println("Ingrese sus datos (nombre/edad/promedio): ");
            String name = sc.next();
            int age = (int) (Math.random() * 25 + 1);
            int average = (int) (Math.random() * 20 + 1);
            alum[year - 1][j] = new Alumno(name, age, average);
        }
    }

    public static void consultByYear(Alumno[][] alum, int year) {
        System.out.println("Lista de los estudiante de " + year + " año:");
        for (int j = 0; j < alum[year - 1].length; j++) {
            System.out.println((j + 1) + "." + alum[year - 1][j]);
        }
    }

    public static void consultAll(Alumno[][] alum) {
        for (int i = 0; i < alum.length; i++) {
            System.out.println("Lista de los estudiantes de " + (i + 1) + " año:");
            for (int j = 0; j < alum[i].length; j++) {
                System.out.println((j + 1) + "." + alum[i][j]);
            }
            System.out.println();
        }
    }

    public static double averagePerYear(Alumno[][] alum, int year) {
        int average = 0;
        for (int j = 0; j < alum[year - 1].length; j++) {
            average += alum[year - 1][j].getPromedio();
        }
        return (average * 1.0) / (alum[year - 1].length);
    }

    public static double averageAll(Alumno[][] alum) {
        int studentTotal = 0;
        int total = 0;
        for (int i = 0; i < alum.length; i++) {
            for (int j = 0; j < alum[i].length; j++) {
                studentTotal += alum[i][j].getPromedio();
                total++;
            }
        }
        return (studentTotal * 1.0) / total;
    }

    public static void bestAverageYear(Alumno[][] alum, int year) {
        Alumno stud = alum[year - 1][0];
        System.out.println("Mayor promedio de los Alumno del " +(year)+" año: ");
        for (int j = 0; j < alum[year - 1].length; j++) {
            if (stud.getPromedio() < alum[year - 1][j].getPromedio()) {
                stud = alum[year - 1][j];
            }
        }
        System.out.println(stud.toString());
    }
    public static void lowestAverageYear(Alumno[][] alum, int year) {
        Alumno stud = alum[year - 1][0];
        System.out.println("Menor promedio de los Alumno del " + year + " año: ");
        for (int j = 0; j < alum[year - 1].length; j++) {
            if (stud.getPromedio() > alum[year - 1][j].getPromedio()) {
                stud = alum[year - 1][j];
            }
        }
        System.out.println(stud.toString());
    }
    public static void bestAverageAll(Alumno[][] alum) {
        int yearAll = 0;
        Alumno bestAll = alum[0][0];
        for (int i = 0; i < alum.length; i++) {
            for (int j = 0; j < alum[i].length; j++) {
                if (alum[i][j].getPromedio() > bestAll.getPromedio()) {
                    bestAll = alum[i][j];
                    yearAll = i;
                }
            }
        }
        System.out.println("El mayor promedio le pertenece a " +(yearAll+1)+" año: ");
        System.out.println(bestAll);
    }

    public static void lowestAverageAll(Alumno[][] alum) {
        int yearAll = 0;
        Alumno lowestAll = alum[0][0];
        for (int i = 0; i < alum.length; i++) {
            for (int j = 0; j < alum[i].length; j++) {
                if (alum[i][j].getPromedio() < lowestAll.getPromedio()) {
                    lowestAll = alum[i][j];
                    yearAll = i;
                }
            }
        }
        System.out.println("El menor promedio le pertenece a " +(yearAll+1)+" año: ");
        System.out.println(lowestAll);
    }
    public static void rankYear(Alumno[][] alum, int year) {
        for (int j = 0; j < alum[year-1].length; j++) {
            for (int i = 0; i < alum[year-1].length - 1 - j; i++) {
                if (alum[year-1][i].getPromedio() < alum[year-1][i + 1].getPromedio()) {
                    Alumno temp = alum[year-1][i];
                    alum[year-1][i] = alum[year-1][i + 1];
                    alum[year-1][i + 1] = temp;
                }
            }
        }
        consultByYear(alum, year);
    }
    public static void rankAll(Alumno[][] alum) {
        Alumno[] stud = bidToUni(alum);
        for (int j = 0; j < stud.length; j++) {
            for (int i = 0; i < stud.length - 1 - j; i++) {
                if (stud[i].getPromedio() < stud[i + 1].getPromedio()) {
                    Alumno temp = stud[i];
                    stud[i] = stud[i + 1];
                    stud[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < stud.length; i++) {
            System.out.println((i+1)+"."+stud[i]);}
    }
    public static Alumno[] bidToUni(Alumno[][] alum){//bidimensional a unidimensional
        int large = alum.length * alum[0].length;
        Alumno[] student = new Alumno[large];
        int index=0;
        for (int i = 0; i < alum.length; i++) {
            for (int j = 0; j < alum[0].length; j++) {
                student[index++] = alum[i][j];
            }
        }
        return student;
    } 
    public static void enterData1(Alumno[][] alum) {//iniciar una lista metodo adicional
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < alum.length; i++) {
            for (int j = 0; j < alum[i].length; j++) {
            System.out.println("Ingrese sus datos (nombre/edad/promedio): ");
            String name = sc.next();
            int age = (int) (Math.random() * 25 + 1);
            int average = (int) (Math.random() * 20 + 1);
            alum[i][j] = new Alumno(name, age, average);
            }
        }  
    }
}
