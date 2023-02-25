package models;

import interfaces.EngineRoarBehavior;
import interfaces.HeadLightBehavior;

public abstract class Car {
    private EngineRoarBehavior roncoBehavior;
    private HeadLightBehavior farolBehavior;
    private String brand;
    private String model;
    private String yearManufacture;
    private String color;

    public Car(
        String brand, 
        String model, 
        String yearManufacture, 
        String color,
        EngineRoarBehavior roar,
        HeadLightBehavior headlight
        ){
        this.brand = brand;
        this.model = model;
        this.yearManufacture = yearManufacture;
        this.color = color;
        this.roncoBehavior = roar;
        this.farolBehavior = headlight;
    }

    public void performRoar(){
        roncoBehavior.roar();
    }

    public void turnHeadlightOn(){
        farolBehavior.on();
    }

    public void turnHeadlightOff(){
        farolBehavior.off();
    }

    public void setHeadLight(HeadLightBehavior headlight){
       this.farolBehavior = headlight;
    }

    public void setRoar(EngineRoarBehavior roar){
        this.roncoBehavior = roar;
    }

    public String toString(){
        String info = "Brand: " + this.brand + "\n" 
            + "Model: " + this.model + "\n" 
            + "Year Manufacture: " + this.yearManufacture + "\n" 
            + "Color: " + this.color + "\n";
        return info;
    }
}