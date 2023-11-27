import tr.com.workintech.model.car.Car;
import tr.com.workintech.model.car.Ford;
import tr.com.workintech.model.car.Holden;
import tr.com.workintech.model.car.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        // tr.com.workintech.model.car.Car sınıflarını test et
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "tr.com.workintech.model.car.Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "tr.com.workintech.model.car.Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // CarSkeleton sınıflarını test et
        CarSkeleton carSkeleton = new CarSkeleton("Generic tr.com.workintech.model.car.Car", "Generic description");
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());

        GasPoweredCar gasCar = new GasPoweredCar("Gas tr.com.workintech.model.car.Car", "Gas description", 10.5, 4);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        ElectricCar electricCar = new ElectricCar("Electric tr.com.workintech.model.car.Car", "Electric description", 300, 200);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        HybridCar hybridCar = new HybridCar("Hybrid tr.com.workintech.model.car.Car", "Hybrid description", 8.5, 150, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}