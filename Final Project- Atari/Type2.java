import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public char D;
    public Type2(int x, int y, char D){
        this.x=x;
        this.y=y;
        this.D=D;
    }
    public void act(){
        move(x,y,D);
    }
}
