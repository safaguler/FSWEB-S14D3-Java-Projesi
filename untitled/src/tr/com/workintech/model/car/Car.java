package tr.com.workintech.model.car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    // Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; // Motorun varsayılan değeri
    }

    // Getter metotları
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // toString ve equals metotlarını override et
    @Override
    public String toString() {
        return "tr.com.workintech.model.car.Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    // Metotlar
    public String startEngine() {
        System.out.println("Araç motoru çalıştırılıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "Araç motoru çalıştırılıyor";
    }

    public String accelerate() {
        System.out.println("Araç hızlanıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "Araç hızlanıyor";
    }

    public String brake() {
        System.out.println("Araç fren yapıyor");
        System.out.println("Sınıf: " + this.getClass().getSimpleName());
        return "Araç fren yapıyor";
    }
}
