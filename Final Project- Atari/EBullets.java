import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class EBullets extends Actor
{
    int x;
    int y;
    int speed;
    boolean Death=false;
    Actor z;
    public EBullets(int x, int y, Actor z, int speed){
        this.x = x;
        this.y = y;
        this.z = z;
        this.speed = speed;
    }
    public void act(){
        shoot(x,y,z,speed);
    }
    public void shoot(int x, int y, Actor z, int speed){
        setLocation(x,y);
        turnTowards(x,0);
        move(speed);
        if(intersects(z)){
            Hit();
        }
    }    
    public abstract boolean Hit();
}
