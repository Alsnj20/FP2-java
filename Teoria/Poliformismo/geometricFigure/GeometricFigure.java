package Poliformismo.geometricFigure;

public class GeometricFigure {
    private String nameFigure;
    public GeometricFigure(){
        nameFigure = "";
    }
    public void setNameGeometricFigure(String n){
        nameFigure = n;
    }
    public String getNameGeometricFigure(){
        return nameFigure;
    }
    public String toString(){
        return "--"+getNameGeometricFigure().toUpperCase()+"--";
    }  
}
