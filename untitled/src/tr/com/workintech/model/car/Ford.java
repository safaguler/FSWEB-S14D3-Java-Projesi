package tr.com.workintech.model.car;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    // tr.com.workintech.model.car.Ford'a özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("tr.com.workintech.model.car.Ford'un özel motoru çalıştırılıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Ford'un özel motoru çalıştırılıyor";
    }

    @Override
    public String accelerate() {
        System.out.println("tr.com.workintech.model.car.Ford'un özel hızlanması");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Ford'un özel hızlanması";
    }

    @Override
    public String brake() {
        System.out.println("tr.com.workintech.model.car.Ford'un özel freni");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "tr.com.workintech.model.car.Ford'un özel freni";
    }
}