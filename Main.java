import cars.*;
import engineRoar.*;
import headlights.*;

public class Main {
  public static void main(String[] args){
    
    Nice niceRoar = new Nice();

    NoHeadLight noHeadLight = new NoHeadLight();

    Golf carro = new Golf("Volks", "Golf", "2001", "Azul", niceRoar, noHeadLight);

    carro.performRoar();

    carro.setRoar(new Regular());

    carro.performRoar();
    carro.turnHeadlightOn();

    carro.setHeadLight(new HeadLight());

    carro.turnHeadlightOn();
    carro.turnHeadlightOff();
  }
}