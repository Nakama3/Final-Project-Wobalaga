import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public int cool; //cooldown time
    public boolean down=true; //spacebar pressed?
    public void act(){
        move();
        //shoot();
        beam();
    }    
    public void move(){ //player movement controls
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
    public void shoot(){  //shoots abullet and waits 15 frames after the space has been
        if(Greenfoot.isKeyDown("space")==true&& down==true){//lifted to prevent beam()
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
    public void beam(){ //just so that it can be a bit easier, shoots a bullet every frame
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new PBullet(), getX(), getY()-16);
        }
    }
}
