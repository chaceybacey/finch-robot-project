package com.chaceybacey;

public class TesterFinch {
   public static void main(String[] args) {
       FinalFinch bird = new FinalFinch("A");


       bird.setColors();

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
      
       
       bird.turnDirection("R");
       bird.moveForward(55,70);

       
       System.out.println(bird.getCompass());
       bird.stopAll();

       
   
   }

}