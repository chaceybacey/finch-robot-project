package com.chaceybacey;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {

    public FinalFinch(String device) {
        super(device);
    }
    
     /* The method setColors() sets the LED lights on the body and tail of the Finch robot to green. 
      * It also sets the display on the robot to the number 8. 
      */

     public void setColors(){
        int patternArray[] = {0,1,1,1,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,1,1,0};
        setDisplay(patternArray);
        setBeak(0,100,0);
        for(int i = 1; i <= 4; i++){
            setTail(i,0,100,0);
        }
      }

    /* The method moveForward() makes the Finch robot move forward based on parameters distance & speed
     * @param distance - the amount of centimeters Finch will travel
     * @param speed - the speed of the Finch motors and how fast you want it to travel
     */
    public void moveForward(double distance, double speed){
        setMotors(50, 50);
        setMove("F", distance, speed);
        pause(0.5);
    }
    
    /*
     * The method turnDirection() utilizes the getCompass() method from the Finch library. 
     * if the compass value is less than or over a certain threshold, it will turn in the direction in parameters. 
     * @param direction - the directions "R" or "L" to turn right or left
     */ 
    public void turnDirection(String direction){
        int finchRight = 25;
        int finchNorth = 350;
        // this conditional statement will make it turn if the value return by getcompass is less than 350 or more than 25.
        if(getCompass()< finchNorth || getCompass() > finchRight) {
            setTurn(direction, 90, 50);
        }
    }
    
   
      



    

}