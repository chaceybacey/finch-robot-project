package com.chaceybacey;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {

    public FinalFinch(String device) {
        super(device);
    }
    

     public void setColors(){
        int patternArray[] = {0,1,1,1,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,1,1,0};
        setDisplay(patternArray);
        setBeak(0,100,0);
        for(int i = 1; i <= 4; i++){
            setTail(i,0,100,0);
        }
      }

    public void moveForward(double distance, double speed){
        setMotors(50, 50);
        setMove("F", distance, speed);
        pause(0.5);
    }

    public void turnDirection(String direction){
        int finchRight = 25;
        int finchNorth = 350;
        if(getCompass()< finchNorth || getCompass() > finchRight) {
            setTurn(direction, 90, 50);
        }
    }
    
    // public void stopRobot() {

    // }
      



    

}