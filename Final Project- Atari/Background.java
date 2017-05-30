import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int row2x = 75;
   int row1x = 350;
   int Lives = 3;
    public Background(){    
        super(500, 710, 1); 
        int numofEnemies = 10;
        int Lives = 2;
        for(int i= 0; i<6; i++){
            addObject(new Type1(), row2x, 200);
            row2x=row2x+75;
            Greenfoot.delay(5);
       }
        for(int i= 0; i<4; i++){
            Greenfoot.delay(5);
            addObject(new Type1(), row1x, 400);
            row1x=row1x-75;
            Greenfoot.delay(5);
       }
        //addObject(new Type3(), 250,200);
        addObject(new Player(), 250,670);
        addObject(new Life1(), 50, 50);
        addObject(new Life2(), 100, 50);
   }
   public void act(){
       spawn();
    }
   public void spawn(){
       
    }
   public void minusLives(){
       if(Lives==3){
           Lives--;
           removeObject(new Life2());
        }
       if(Lives==2){
           Lives--;
           removeObject(new Life1());
        }
    }
}
