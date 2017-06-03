import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public boolean hit=false;
    Boss boss= new Boss();
    public void act(){
        Shot();
    }
    public void Shot(){
         turnTowards(getX(),0);
         move(5);
         if(hit==false&&getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
             ((Background)getWorld()).minusE();
             remove();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(Boss.class)!=null){
             boss.HPd();
             remove();
             hit = true;
           }
         if(hit == false && getY()<5){
             remove();
            }
      }
    public void remove(){
        getWorld().removeObject(this);
    }
}