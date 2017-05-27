import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullets extends Actor
{
    public void act(){
        Shot();
    }
    public void Shot(){
         setRotation(90);
         move(10);
         if(getOneIntersectingObject(Enemy.class)!=null){
             getWorld().remove(Enemy.class);
         }
    }
}
