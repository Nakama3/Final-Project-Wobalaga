import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public void act(){
        Attack();
        //shoot(z);
    }
    public void Attack(){
        Actor player = (Actor)((Background)getWorld()).getObjects(Player.class).get(0);
        int playerx = player.getX();
        int playery = player.getY();
        move(5);
        turnTowards(playerx, playery);
    }
}
