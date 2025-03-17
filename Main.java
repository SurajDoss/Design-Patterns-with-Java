import AbstractFactoryPattern.CarSuggestor;
import AbstractFactoryPattern.ICar;
import AbstractFactoryPattern.TeslaModelS;
import AbstractFactoryPattern.ToyotaVellFire;

public class Main {
    public static void main(String[] args) {
        executeAbstractFactoryPattern();
        executeSingletonPattern();
    }

    private static void executeAbstractFactoryPattern(){
        System.out.println("Abstract Factory Pattern");

        ICar car = CarFactory.carFactory(CarFactory.Cartype.Tesla);
        CarSuggestor carSuggestor = new CarSuggestor(car);
        carSuggestor.whatCarsIsThis();
    }

    private static void executeSingletonPattern(){
        System.out.println("Singleton Pattern");

        ConfigurationManagement configuration = ConfigurationManagement.getInstance();
        String prop = configuration.getProperty("learned");

        System.out.println("Prop is " + prop);
    }
}
