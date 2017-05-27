import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type3 extends Enemy{
    public int x;
    public int y;
    public Type3(int x, int y){
        super(x, y);
    }
    public void act(){
        spawn(x,y);
    }
}
