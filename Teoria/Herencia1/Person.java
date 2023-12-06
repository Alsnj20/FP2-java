package Herencia1;
public class Person {
    private String name;
    public Person(){
        this(null);
    }
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
