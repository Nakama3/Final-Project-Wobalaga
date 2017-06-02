import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public boolean down=true;
    public void act() 
    {
        move();
        shoot();
    }    
    public void move()
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
        if(Greenfoot.isKeyDown("space")==true&& down==true){
            getWorld().addObject(new PBullet(), getX(), getY()-16);
            down = false;
        }
        if(Greenfoot.isKeyDown("space")==false){
                down=true;
            }
    }
}
