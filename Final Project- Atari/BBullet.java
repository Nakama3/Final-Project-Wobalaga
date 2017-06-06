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
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             remove();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(PBullet.class)!=null){
             removeTouching(PBullet.class);
             remove();
             hit = true;
           }
         if(hit==false&&getY()>700){
             remove();
            }
    }
    public void ShotL(){ //when called moves towards bottom of screen and if hits player subtracts lives
         if(hit==false&&getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
             remove();
             hit = true;
           }
         if(hit==false&&getOneIntersectingObject(PBullet.class)!=null){
             removeTouching(PBullet.class);
             remove();
             hit = true;
           }
         if(hit==false&&getY()>700){
             remove();
            }
    }
    public void remove(){ //removes bullet to not overkill player
        getWorld().removeObject(this);
    }
}
