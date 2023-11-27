package tr.com.workintech.model.company;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return "GasPowered engine started";
    }

    @Override
    public String drive() {
        return "GasPowered is driving.";
    }
}
