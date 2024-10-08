package AbstractFactoryPattern;

public interface ICar {
    //What is the energy source for car
    ICarEnergySource getEnergy();

    //WhatType of Car
    ICarType getCarType();

    //about the car
    String getCarDetails();
}
