import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Bullets extends Actor
{
    int x;
    int y;
    boolean PDeath=false;
    Actor z;
    public Bullets(int x, int y, Actor z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void act(){
        shoot(x,y,z);
    }
    public void shoot(int x, int y, Actor z){
        setLocation(x,y);
        turnTowards(x,0);
        move(10);
        if(intersects(z)){
            Destroyed();
        }
    }    
    public abstract boolean Destroyed();
}
