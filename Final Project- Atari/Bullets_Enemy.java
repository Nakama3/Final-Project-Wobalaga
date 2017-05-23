import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bullets_Enemy extends Actor
{
    public Bullets_Enemy(){
        setLocation(Enemy.getX(), Enemy.getY());
        setDirection(90);
    }
    public void act() 
    {
        move();
    }    
    public void move(){
        move(5);
    }
}
