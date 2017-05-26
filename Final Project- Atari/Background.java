import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
public class Background extends World
{
    public Background()
    {    
        super(500, 713, 1); 
        int row2x = 50;
        int row1x = 500;
        int numofEnemies = 10;
        int Lives = 2;
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        for(int i= 0; i<6; i++){
            addObject(new Type1("blue"+i, row2x,200,'L'), 0, 710);
            row2x=row2x+50;
       }
        for(int i= 0; i<4; i++){
            addObject(new Type1("red"+i, row1x,400,'R'), 500, 710);
            row1x=row1x-50;
       }
        addObject(new Player(), 250,690);
   }
}
