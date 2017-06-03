import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public int cool;
    public boolean down=true;
    public void act(){
        move();
        //shoot();
        beam();
    }    
    public void move(){
        if (Greenfoot.isKeyDown("left"))
       {
           move (-3);
       }   
       if (Greenfoot.isKeyDown("right"))
       {
           move (3);
       }
        if (Greenfoot.isKeyDown("a"))
       {
           move (-3);
       }   
       if (Greenfoot.isKeyDown("d"))
       {
           move (3);
       }
    }
    public void shoot(){
        if(Greenfoot.isKeyDown("space")==true&& down==true){
            getWorld().addObject(new PBullet(), getX(), getY()-16);
            down = false;
            cool=15;
        }
        if(Greenfoot.isKeyDown("space")==false){
            if(cool>0){
                cool--;
                if(cool==0){
                    down=true;
                }
            }
        }
    }
    public void beam(){
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new PBullet(), getX(), getY()-16);
        }
    }
}
