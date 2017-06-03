import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public boolean hit=false;
    public void act(){
        Shot();
    }
    public void Shot(){
         Actor boss = (Actor)getWorld().getObjects(Boss.class).get(0);
         BHPm() = boss.HPd();
         turnTowards(getX(),0);
         move(5);
         if(hit==false&&getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
             ((Background)getWorld()).minusE();
             remove();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(Boss.class)!=null){
             remove();
             BHPm();
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