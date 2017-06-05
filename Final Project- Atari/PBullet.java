import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public boolean hit=false; //did the bullet hit something?
    public void act(){
        Shot();
    }
    public void Shot(){ //when called, checks to see if it intersects enemy or boss
         turnTowards(getX(),0); //destroys enemies, minus 1 hp to boss
         move(5);
         if(hit==false&&getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
             ((Background)getWorld()).minusE();
             remove();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(Boss.class)!=null){
             Actor boss = (Actor)getWorld().getObjects(Boss.class).get(0);
             ((Background)getWorld()).minusBHP();
             remove();
             hit = true;
           }
         if(hit == false && getY()<5){
             remove();
            }
      }
    public void remove(){ //removes bullet to not have it do excess damage to boss or kill more enemies than it should
        getWorld().removeObject(this);
    }
}