/*Deseamos implementar un Sistema Académico para la UNSA, debe
manejar estudiantes tanto de pregrado como de postgrado
◼ Es obligatorio seguir un curso de programación para ambos tipos de
estudiantes
◼ Cada estudiante debe almacenar su nombre y 3 notas parciales del curso
[0..20]
◼ El cálculo de la nota final del curso es diferente según sea el estudiante
de pregrado o postgrado
◼ Pregrado: promedio simple
◼ Postgrado: 25% + 35% + 40%
◼ Crear un ArrayList donde se almacenen objetos de ambos tipos de
estudiantes [20..50]. No permitir objetos de la superclase
◼ Calcular las notas finales de todos los estudiantes y mostrar sus datos
completos. Además mostrar la cantidad de cada tipo de estudiante y su
promedio ponderado por cada tipo. ¿Qué tipo fue mejor?
◼Quetodoslosdatosdelosestudiantesseanaleatorios */
public abstract class Student{
    private String name;
    private int[] grades = new int[3];
    public Student(){
        String names[] =  {"Juan", "Maria", "Lucia", "Mateo", "Adrian", "Adriana"};
        name = names[(int)(Math.random()*names.length)];
        grades[0] = (int)(Math.random()*20+1);
        grades[1] = (int)(Math.random()*20+1);
        grades[2] = (int)(Math.random()*20+1);
    }
    public String getName(){
        return name;
    }
    protected int[] getGrades(){
        return grades;
    }
    public abstract double getAverage();
    public String toString(){
        return "\nNombre: "+name+
        "\nNotas: "+grades[0]+" "+grades[1]+" "+grades[2]+
        "\nPromedio: "+getAverage();
    }
}
