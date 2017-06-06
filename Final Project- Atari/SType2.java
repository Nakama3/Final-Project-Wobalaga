import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SType2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SType2 extends Type2
{
    public int x;
    public int y;
    public SType2(int x, int y){
        super(x,y);
    }
    public void act(){
        Attack();
        remove();
    }
    public void remove(){
        if(getY()>700){
            getWorld().removeObject(this);
        }
    }
}
