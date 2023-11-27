public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    // Constructor
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    // ElectricCar'a özgü metotları override et
    @Override
    public String startEngine() {
        System.out.println("ElectricCar'ın motoru çalıştırılıyor");
        return "ElectricCar'ın motoru çalıştırılıyor";
    }

    @Override
    public String drive() {
        System.out.println("ElectricCar sürüyor");
        runEngine(); // Buradan protected metodu çağır
        return "ElectricCar sürüyor";
    }
}