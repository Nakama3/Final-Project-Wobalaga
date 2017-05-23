import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public Type2(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void act(){
        move(x,y);
    }
}
