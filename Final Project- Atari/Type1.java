import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type1 extends Enemy
{
    public String name;
    public int x;
    public int y;
    public char D;
    public boolean ready;
    public Type1(String name, int x, int y, char D){
        super(name, x, y, D);
    }
    public void act(){
        spawn(x,y,D);
    }
}
