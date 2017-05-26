import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BType2 extends Bullets
{
    int x;
    int y;
    boolean Death=false;
    Actor z;
    public BType2(int x, int y, Actor z){
        super(x,y,z);
    }
    public boolean Destroyed(){
        return Death = true;
    }
     
}