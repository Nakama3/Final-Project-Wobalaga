import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BType1 extends EBullets
{
    int x;
    int y;
    int speed;
    boolean Death=false;
    Actor z;
    public BType1(int x, int y, Actor z, int speed){
        super(x,y,z,speed);
    }
    public boolean Hit(){
        return Death = true;
    }
     
}
