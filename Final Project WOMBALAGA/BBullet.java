import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BBullet extends Actor
{
    public boolean hit = false;
    public void act(){
        Shot();
    }
    public void Shot(){ //when called moves towards bottom of screen and if hits player subtracts lives
         setRotation(90);
         move(5);
         if(hit==false&&getOneIntersectingObject(Player.class)!=null){
             hit=true;
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
           }
         if(hit==false&&getOneIntersectingObject(PBullet.class)!=null){
             hit = true;
             removeTouching(PBullet.class);
             getWorld().removeObject(this);
           }
         if(hit==false&&getY()>700){
             hit=true;
             getWorld().removeObject(this);
            }
    }
}
