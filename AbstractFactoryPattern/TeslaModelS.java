package AbstractFactoryPattern;

public class TeslaModelS implements ICar {
    public String aboutCar = "The Tesla Model S is";
    @Override
    public ICarEnergySource getEnergy() {
        return new TeslaModelSEnergySource();
    }

    @Override
    public ICarType getCarType() {
        return new TeslaModelSType();
    }

    @Override
    public String getCarDetails() {
        return aboutCar;
    }

    public class TeslaModelSEnergySource implements ICarEnergySource{

        @Override
        public String getEnergyType() {
            return "Electric";
        }
    }

    public class TeslaModelSType implements ICarType{

        @Override
        public String getType() {
            return "Sedan";
        }
    }
}
