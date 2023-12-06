public class Undergraduate extends Student{
    public Undergraduate(){
        super();
    }
    public double getAverage(){
        double suma = 0.0;
        for (int n : getGrades()) suma +=(double)n;
        return suma/getGrades().length;
    }
}
