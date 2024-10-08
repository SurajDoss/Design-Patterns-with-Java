package AbstractFactoryPattern;

public class CarSuggestor {
    private ICar car = null;
    private ICarType carType = null;
    private ICarEnergySource carSource = null;

    public CarSuggestor(ICar car){
        this.car = car;
        carType = car.getCarType();
        carSource = car.getEnergy();
    }

    public void whatCarsIsThis(){
        System.out.println(this.car.getCarDetails() + " " + carSource.getEnergyType() + " vehicle, this car is of " + carType.getType() + " Model");
    }
}
