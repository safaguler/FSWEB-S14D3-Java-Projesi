public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    // Constructor
    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    // HybridCar'a özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("HybridCar'ın motoru çalıştırılıyor");
        return "HybridCar'ın motoru çalıştırılıyor";
    }

    @Override
    public String drive() {
        System.out.println("HybridCar sürüyor");
        runEngine(); // Buradan protected metodu çağır
        return "HybridCar sürüyor";
    }
}
