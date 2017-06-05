
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends Actor
{
    GifImage spaceGif = new GifImage("space.gif");
    /**
     * Act - do whatever the Space wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(spaceGif.getCurrentImage());
    }    
}
