public class Postgraduate extends Student{
    public Postgraduate(){
        super();
    }
    public double getAverage(){
        int n1 = getGrades()[0];
        int n2 = getGrades()[1];
        int n3 = getGrades()[2];
        return ((0.25*n1)+(0.35*n2)+(0.40*n3));
    }
}
