public class CarSkeleton {
    private String name;
    private String description;

    // Constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Public metotlar
    public String startEngine() {
        System.out.println("CarSkeleton'ın motoru çalıştırılıyor");
        return "CarSkeleton'ın motoru çalıştırılıyor";
    }

    public String drive() {
        System.out.println("CarSkeleton sürüyor");
        runEngine(); // Buradan protected metodu çağır
        return "CarSkeleton sürüyor";
    }

    // Protected metot
    protected void runEngine() {
        System.out.println("CarSkeleton'ın motoru çalışıyor");
    }
}