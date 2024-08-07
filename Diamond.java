public class Diamond {
    public static void main(String[] args) {
       makeDiamond(5); 
  }
    private static void makeDiamond(int numberOfStars){
         int spaceCount = numberOfStars;
         for (int x = 0; x <= numberOfStars; x++){
         repeat(spaceCount, " ");
          repeat(x,"*");
          repeat(x - 1,"*");
         consoleLog("\n");
          spaceCount--;
        } 
        
        for (int x = numberOfStars; x > -2; x--) {
            repeat(spaceCount, " ");
            repeat(x, "*");
            repeat(x + 1, "*");
            consoleLog("\n");
            spaceCount++;
        }

    }
 private static void consoleLog(String characterToRepeat){
        System.out.print(characterToRepeat);
    }
    
    private static void repeat(int numberOfRepeat, String characterToRepeat){
    
        for (int x = 0; x <= numberOfRepeat; x++){
            consoleLog(characterToRepeat);
        }
    }

           
}

