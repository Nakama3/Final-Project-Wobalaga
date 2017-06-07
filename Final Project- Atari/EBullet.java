import greenfoot.*;
public class EBullet extends Actor
{
    public boolean hit = false;
    public void act(){
        Shot();
        remove();
    }
    public void Shot(){ //when called checks if hit player, or it goes away when at end of screen
         setRotation(90);
         move(2);
         if(hit==false&&getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             hit=true;
           }
         if(hit==false&&getY()>700){
             hit=true;
            }
    }
    public void remove(){ //removes bullet to not overkill player
         if(hit==true){
            getWorld().removeObject(this);
            hit=false;
         }
    }
}
