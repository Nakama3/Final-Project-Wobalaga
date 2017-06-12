import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type1 extends Enemy{
    public int x;
    public int y;
    /*public Type1(int x, int y){
        super(x, y);
    }*/
    public void act(){
        //spawnMove(x,y);
        shoot(new BType1());
        swimp();
        swimn();
    }
}
