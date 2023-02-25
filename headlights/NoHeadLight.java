package headlights;

import interfaces.HeadLightBehavior;

public class NoHeadLight implements HeadLightBehavior {

  public void on(){
    System.out.println("No HeadLight");
  } 

  public void off(){
    System.out.println("No HeadLight");
  } 
}