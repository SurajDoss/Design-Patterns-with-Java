import AbstractFactoryPattern.CarSuggestor;
import AbstractFactoryPattern.ICar;
import AbstractFactoryPattern.TeslaModelS;
import AbstractFactoryPattern.ToyotaVellFire;

public class Main {
    public static void main(String[] args) {
        executeAbstractFactoryPattern();
    }

    private static void executeAbstractFactoryPattern(){
        System.out.println("Abstract Factory Pattern");
        boolean needToyota = Boolean.TRUE;
        ICar car = needToyota ? new ToyotaVellFire() : new TeslaModelS();

        CarSuggestor carSuggestor = new CarSuggestor(car);
        carSuggestor.whatCarsIsThis();
    }
}