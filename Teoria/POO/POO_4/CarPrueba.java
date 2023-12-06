public class CarPrueba {
    public static void main(String[] args) {
        Car stacyCar;
        Car johnCar = new Car();
        johnCar.setMake("Honda");
        johnCar.setYear(2003);
        johnCar.setColor("silver");
        System.out.println(johnCar);
        //stacyCar = johnCar;
        stacyCar = johnCar.makeCopy();
        stacyCar.setColor("peach");
        System.out.println(stacyCar);
        System.out.println(johnCar);
    }
}
