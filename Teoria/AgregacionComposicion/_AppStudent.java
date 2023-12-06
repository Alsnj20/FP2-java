package AgregacionComposicion;
public class _AppStudent {
    public static void main(String[] args) {
        _Student stu1 = new _Student(2, "Alisson Jara");
        _Student stu2 = new _Student(5, "Elena Subia");
        _Address dir1 = new _Address("Peru", "Arequipa", "Arequipa", "Peru");
        stu1.addAddress(dir1);//agregacion
        stu2.addAddress(new _Address("Peral", "Lima", "Lima", "Peru"));//composicion
        System.out.println("Nro\tNombre\t\tDireccion");
        stu1.printData();
        stu2.printData();  
    }
}