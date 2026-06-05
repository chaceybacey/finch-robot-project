package com.chaceybacey;

public class TesterFinch {
   public static void main(String[] args) {
       FinalFinch bird = new FinalFinch("A");
          
      // sets the colors of the robot to green.
         bird.setColors();

      // this loop makes Finch moveforward and turn right or left based on the index of i. 
      // for example if i is 0, it will turn left. If i is 1, it will turn right.
      for(int i = 0; i < 4; i++){
        if(i % 2 == 0){
         bird.moveForward(57,50);
         bird.turnDirection("L");
         bird.moveForward(23,50);
         bird.turnDirection("L");  
        }
        if(i % 2 == 1){   
         bird.moveForward(57,50);
         bird.turnDirection("R");
         bird.moveForward(25,50);
         bird.turnDirection("R");
        }
      }
      
       // turns the robot left after reaching checkpoint 1 and moves it forward.
       bird.turnDirection("R");
       bird.moveForward(55,70);

       
       bird.stopAll();

       
   
   }

}