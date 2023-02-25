package headlights;

import interfaces.HeadLightBehavior;

public class HeadLight implements HeadLightBehavior {

  public void on(){
    System.out.println("HeadLight On");
  } 

  public void off(){
    System.out.println("HeadLight Off");
  } 
}