package cars;

import interfaces.EngineRoarBehavior;
import interfaces.HeadLightBehavior;
import models.Car;

public class Golf extends Car {
    public Golf(
        String marca, 
        String modelo, 
        String anoDeFabricacao, 
        String cor,
        EngineRoarBehavior ronco,
        HeadLightBehavior farol
        ){
        super(marca, modelo, anoDeFabricacao, cor,  ronco, farol);
    }
}