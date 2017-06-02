import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public boolean hit=false;
    public void act(){
        Shot();
    }
    public void Shot(){
         turnTowards(getX(),0);
         move(10);
         if(getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
             ((Background)getWorld()).minusE();
             getWorld().removeObject(this);
             hit = true;
           }
         /*if(getOneIntersectingObject(Boss.class)!=null){
             ((Background)getWorld()).minusBHP();
             getWorld().removeObject(this);
             hit = true;
         */  
         if(hit == false && getY()<5){
             getWorld().removeObject(this);
            }
      }
}
