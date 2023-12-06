public class AplicacionAuto {
    public static void main(String[] args) {
        Car stacyCar = new Car("Mercedes_Benz", 1835, "grey");
        Car johnCar = new Car("Mercedes_Benz", 1834, "grey");
        if (johnCar.equals(stacyCar)){
            System.out.println("iguales");
            System.out.println(stacyCar);
            System.out.println(johnCar);
        }else{
            System.out.println("diferentes");
            System.out.println(stacyCar);
            System.out.println(johnCar);
        }

    }
}