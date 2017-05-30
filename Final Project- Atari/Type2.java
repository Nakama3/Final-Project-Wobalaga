import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    BType2 z = new BType2();
    /*public Type2(int x, int y){
        super(x, y);
    }*/
    public void act(){
        //spawnMove(x,y);
        shoot(z);
    }
}
