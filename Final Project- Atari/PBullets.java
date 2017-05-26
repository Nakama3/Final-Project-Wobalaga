import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullets extends Actor
{
    int x;
    int y;
    boolean Death=false;
    Actor z;
    public PBullets(int x, int y, Actor z){
        
    }
    public boolean Destroyed(){
        return Death = true;
    }
}
