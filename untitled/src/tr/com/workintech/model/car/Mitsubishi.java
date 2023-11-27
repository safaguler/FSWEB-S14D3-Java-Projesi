package tr.com.workintech.model.car;

import tr.com.workintech.model.car.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    // tr.com.workintech.model.car.Mitsubishi'ye özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("tr.com.workintech.model.car.Mitsubishi'nin özel motoru çalıştırılıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Mitsubishi'nin özel motoru çalıştırılıyor";
    }

    @Override
    public String accelerate() {
        System.out.println("tr.com.workintech.model.car.Mitsubishi'nin özel hızlanması");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Mitsubishi'nin özel hızlanması";
    }

    @Override
    public String brake() {
        System.out.println("tr.com.workintech.model.car.Mitsubishi'nin özel freni");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Mitsubishi'nin özel freni";
    }
}
