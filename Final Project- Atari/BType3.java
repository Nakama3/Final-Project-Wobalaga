import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BType3 extends EBullets
{
    int x;
    int y;
    int speed;
    boolean Death=false;
    Actor z;
    public BType3(int x, int y, Actor z, int speed){
        super(x,y,z,speed);
    }
    public boolean Hit(){
        return Death = true;
    }
}
