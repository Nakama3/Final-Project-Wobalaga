import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class EBullet extends Actor
{
    public boolean hit = false;
    public void act(){
        Shot();
    }
    public void Shot(){
         setRotation(90);
         move(2);
         if(getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
             getWorld().removeObject(this);
             hit = true;
           }
         if(hit == false && getY()>700){
             getWorld().removeObject(this);
            }
        }
}
