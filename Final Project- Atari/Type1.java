import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type1 extends Enemy
{
    public int x;
    public int y;
    public char D;
    public Type1(int x, int y, char D){
        this.x=x;
        this.y=y;
        this.D=D;
    }
    public void act(){
        move(x,y,D);
    }
}
