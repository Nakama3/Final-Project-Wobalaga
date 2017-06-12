import greenfoot.*;
public class EBullet extends Actor
{
    public boolean hit = false;
    public void act(){
        Shot();
    }
    public void Shot(){ //when called checks if hit player, or it goes away when at end of screen
         setRotation(90);
         move(2);
         if(hit==false&&getOneIntersectingObject(Player.class)!=null){
             hit=true;
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             //hit=true;
           }
         if(hit==false&&getY()>700){
             hit=true;
             getWorld().removeObject(this);
            }
    }
}
