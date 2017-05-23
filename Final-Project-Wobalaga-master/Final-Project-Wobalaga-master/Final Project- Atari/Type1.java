import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type1 extends Enemy
{
    public int x;
    public int y;
    public Type1(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void act(){
        move(x,y);
    }
}
