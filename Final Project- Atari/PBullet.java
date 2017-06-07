import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public boolean hit = false; //did the bullet hit something?
    public void act(){
        Shot();
        remove();
    }
    public void Shot(){ //when called, checks to see if it intersects enemy or boss
         turnTowards(getX(),0); //destroys enemies, minus 1 hp to boss
         move(5);
         if(hit==false&&getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
             ((Background)getWorld()).minusE();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(Boss.class)!=null){
             ((Background)getWorld()).minusBHP();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(BBullet.class)!=null){
             removeTouching(BBullet.class);
             hit = true;
           }
         if(getY()<5){
             hit=true;
            }
      }
    public void remove(){ //removes bullet to not have it do excess damage to boss or kill more enemies than it should
        if(hit==true){
            getWorld().removeObject(this);
            hit=false;
        }
    }
}