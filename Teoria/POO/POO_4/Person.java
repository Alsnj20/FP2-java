public class Person {
    private String name;
    public Person(){
        setName(null);
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void swapPerson(Person p){
        String nam = p.name;
        p.name = this.name;
        this.name = nam;
    }

    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Jonathan");
        person2.setName("Benji");
        System.out.println(person1.getName()
        + ", " + person2.getName());
        person1.swapPerson(person2);
        System.out.println(person1.getName()
        + ", " + person2.getName());
        }   
}
