import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    BType2 z = new BType2();
    public void act(){
        //Attack();
        //shoot(z);
    }
    public void Attack(){
        double m = Math.random()*20;
        int n = (int)m;
                move(1);
                turnTowards(new Player().getX(), new Player().getY());
    }
}
