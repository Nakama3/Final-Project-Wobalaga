import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 713, 1); 
        addObject(new Player(), 250,690);
        int a=5;
        int x=200;
        int y=50;
        for(int i=0; i<a; i++){
            addObject(new Enemy(x+10,y),0,710);
            
            x=x+10;
        }
   }
}
