import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PBullet extends Actor
{
    public void act(){
        Shot();
    }
    public void Shot(){
         setRotation(270);
         move(10);
         if(getOneIntersectingObject(Enemy.class)!=null){
             removeTouching(Enemy.class);
           }
         if(getY()<5){
             getWorld().removeObject(new PBullet());
            }
        }
    }
