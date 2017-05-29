import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int row2x = 50;
   int row1x = 500;
    public Background(){    
        super(500, 713, 1); 
        int numofEnemies = 10;
        int Lives = 2;
        addObject(new Type1(100,100), 0, 710);
        addObject(new Player(), 250, 690);
   }
   public void act(){
       
    }
   public void spawn(){
       for(int i= 0; i<6; i++){
            addObject(new Type1(row2x,50), 0, 710);
            row2x=row2x+50;
            Greenfoot.delay(5);
       }
        for(int i= 0; i<4; i++){
            Greenfoot.delay(5);
            addObject(new Type1(row1x,100), 500, 710);
            row1x=row1x-50;
            Greenfoot.delay(5);
       }
        addObject(new Player(), 250,690);
    }
}
