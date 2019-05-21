package pl.sdacademy.classes.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1600, "Ford");
//        car.ccm = 1600;
//        car.make = "Ford";
        car.upgrade();
        System.out.println(car.getCcm());
        System.out.println(car.toString());
    }
}
