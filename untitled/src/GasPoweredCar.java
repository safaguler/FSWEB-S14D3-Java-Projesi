public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    // Constructor
    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    // GasPoweredCar'a özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("GasPoweredCar'ın motoru çalıştırılıyor");
        return "GasPoweredCar'ın motoru çalıştırılıyor";
    }

    @Override
    public String drive() {
        System.out.println("GasPoweredCar sürüyor");
        runEngine(); // Buradan protected metodu çağır
        return "GasPoweredCar sürüyor";
    }
}
