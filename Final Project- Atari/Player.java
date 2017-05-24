import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public void act() 
    {
        move();
    }    
    public void move()//The movement of the bar
    {
        if (Greenfoot.isKeyDown("A"))
       {
           move (-3);
       }   
       if (Greenfoot.isKeyDown("D"))
       {
           move (3);
       }
    }
}
