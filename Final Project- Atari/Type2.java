import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public Type2(String name, int x, int y){
        super(x, y);
    }
    public void act(){
        spawn(x,y);
    }
}
