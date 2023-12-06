public class Test {
    public static void main(String[] args) {
        PorComision empleado1 = new PorComision("Juan", "Perez", 12345678, 10000, 5);
        System.out.println(empleado1);
        SueldoFijo empleado2 = new SueldoFijo("Maria", "Lopez", 23456789, 3000);
        System.out.println(empleado2);
        PorHoras empleado3 = new PorHoras("Carlos", "Gonzalez", 34567890, 10, 40);
        System.out.println(empleado3);
        ComisionMinimo empleado4 = new ComisionMinimo("Laura", "Martinez", 45678901, 8000, 4, 2000);
        System.out.println(empleado4);
    }
}

