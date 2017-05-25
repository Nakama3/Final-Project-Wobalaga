import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Bullets extends Actor
{
    int x;
    int y;
    boolean PDeath=false;
    public Bullets(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void act(){
        shoot(x,y);
    }
    public void shoot(int x, int y){
        setLocation(x,y);
        turnTowards(x,0);
        move(10);
        if(true){
            PDestroyed();
        }
    }    
    public boolean PDestroyed(){
        return PDeath = true;
    }
}
