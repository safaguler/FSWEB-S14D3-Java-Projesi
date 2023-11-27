package tr.com.workintech.model.car;

import tr.com.workintech.model.car.Car;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    // tr.com.workintech.model.car.Holden'a özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("tr.com.workintech.model.car.Holden'in özel motoru çalıştırılıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Holden'in özel motoru çalıştırılıyor";
    }

    @Override
    public String accelerate() {
        System.out.println("tr.com.workintech.model.car.Holden'in özel hızlanması");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Holden'in özel hızlanması";
    }

    @Override
    public String brake() {
        System.out.println("tr.com.workintech.model.car.Holden'in özel freni");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Holden'in özel freni";
    }
}
