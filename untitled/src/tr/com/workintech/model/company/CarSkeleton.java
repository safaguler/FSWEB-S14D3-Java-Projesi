package tr.com.workintech.model.company;

public class CarSkeleton {
    private  String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        return "CarSelectons engine is starting";
    }
    public String drive(){
        runEngine();
        return "CarSelectons is driving.";
    }
    protected void runEngine() {
        System.out.println("CarSelectons engine is running.");
    }

    protected  void runEngine(CarSkeleton carSkeleton){
        if (carSkeleton instanceof GasPoweredCar){
            System.out.println("GasPoweredCar is running with "+ ((GasPoweredCar) carSkeleton).getAvgKmPerLitre());
        } else if (carSkeleton instanceof  ElectricCar) {
            System.out.println("ElectricCar is running with"+ ((ElectricCar) carSkeleton).getAvgKmPerCharge());
        }

    }
}
