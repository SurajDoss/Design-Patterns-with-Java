package AbstractFactoryPattern;

public class CarFactory {
    public enum Cartype{
        Tesla,
        VellFire;
    }

    public static ICar carFactory(Cartype cartype){
        switch (cartype){
            case Tesla:
                return new TeslaModelS();
            case VellFire:
                return new ToyotaVellFire();
        }
        return null;
    }
}
