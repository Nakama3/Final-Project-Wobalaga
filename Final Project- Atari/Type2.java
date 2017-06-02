import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    BType2 z = new BType2();
    Player P = new Player();
    /*public Type2(int x, int y){
        super(x, y);
    }*/
    public void act(){
        Attack();
        shoot(z);
    }
    public void Attack(){
        double m = Math.random()*20;
        int n = (int)m;
        //if(n==5){
            while(getObjectsInRange(100, Player.class)==null){
                move(1);
                turnTowards(P.getX(), P.getY());
            }
        //}
    }
}
