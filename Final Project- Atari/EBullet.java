import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class EBullet extends Actor
{
    public void act(){
        Shot();
    }
    public void Shot(){
         setRotation(90);
         move(2);
         if(getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
           }
         if(getY()>700){
             getWorld().removeObject(new EBullet());
            }
        }
}
