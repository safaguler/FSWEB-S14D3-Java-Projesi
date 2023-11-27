package tr.com.workintech.model.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
                CarSkeleton carSkeleton = new CarSkeleton("Generic Car","");
        System.out.println(carSkeleton.drive());
        System.out.println(carSkeleton.startEngine());

        ElectricCar electricCar = new ElectricCar("Generic Car","",300,200);
        System.out.println(electricCar.drive());
        System.out.println(electricCar.startEngine());

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Generic Car","",300,200);
        System.out.println(gasPoweredCar.drive());
        System.out.println(gasPoweredCar.startEngine());

        gasPoweredCar.runEngine();
        gasPoweredCar.runEngine(new GasPoweredCar("Generic Car","",30,200));
        gasPoweredCar.runEngine(electricCar);

        CarSkeleton carSkeleton1 = new ElectricCar("Emre", "lorem",10,5);
        carSkeleton1.runEngine(carSkeleton1);


    }

}
