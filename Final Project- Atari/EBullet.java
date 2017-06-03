import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class EBullet extends Actor
{
    public boolean hit = false;
    public void act(){
        Shot();
    }
    public void Shot(){ //when called checks if hit player, or it goes away when at end of screen
         setRotation(90);
         move(2);
         if(getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             hit = true;
           }
         if(hit == false && getY()>700){
             getWorld().removeObject(this);
            }
        }
}
