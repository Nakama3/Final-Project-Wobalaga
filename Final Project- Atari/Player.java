import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public void act() 
    {
        move();
        shoot();
    }    
    public void move()//The movement of the bar
    {
        if (Greenfoot.isKeyDown("left"))
       {
           move (-3);
       }   
       if (Greenfoot.isKeyDown("right"))
       {
           move (3);
       }
        if (Greenfoot.isKeyDown("a"))
       {
           move (-3);
       }   
       if (Greenfoot.isKeyDown("d"))
       {
           move (3);
       }
    }
    public void shoot(){
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new PBullet(), getX(), getY()-16);
        }
    }
}
