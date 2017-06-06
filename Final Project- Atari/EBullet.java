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
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             getWorld().removeObject(this);
             hit=true;
           }
         if(hit==false && getY()>700){
             getWorld().removeObject(this);
             hit=true;
            }
    }
    public void remove(){ //removes bullet to not overkill player
        getWorld().removeObject(this);
    }
}
