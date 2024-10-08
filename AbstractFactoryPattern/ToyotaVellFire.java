package AbstractFactoryPattern;

public class ToyotaVellFire implements ICar {
    public String aboutCar= "The Toyota VellFire is";
    @Override
    public ICarEnergySource getEnergy() {
        return new ToyotaVellFireEnergySource();
    }

    @Override
    public ICarType getCarType() {
        return new ToyotaVellFireType();
    }

    @Override
    public String getCarDetails() {
        return aboutCar;
    }

    public class ToyotaVellFireEnergySource implements ICarEnergySource{

        @Override
        public String getEnergyType() {
            return "Petrol and Electric";
        }
    }

    public class ToyotaVellFireType implements ICarType{

        @Override
        public String getType() {
            return "MUV";
        }
    }
}
