import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
public class Player extends Actor
{
    public int x;
    public int m=3; //movement speed
    public int cool; //cooldown time
    public boolean down=true; //spacebar pressed?
    public boolean F;
    public Player(int move, int x, boolean F){
        this.m = m;
        this.x = x;
        this.F = F;
    }
    public void act(){
        move();
        set(x,F);
        //shoot();
        beam();
        beam2();
        beam3();
        beam4();
        beam5();
    }    
    public void set(int x, boolean F){
        if(F==true){
            setLocation(x,getY());
        }
    }
    public void move(){ //player movement controls
        if (Greenfoot.isKeyDown("left"))
       {
           move (-m);
       }   
       if (Greenfoot.isKeyDown("right"))
       {
           move (m);
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
    public void beam2(){ //just so that it can be a bit easier, shoots a bullet every frame
        if(Greenfoot.isKeyDown("p")){
            getWorld().addObject(new PBullet(), getX()-10, getY()-16);
        }
    }
    public void beam3(){ //just so that it can be a bit easier, shoots a bullet every frame
        if(Greenfoot.isKeyDown("q")){
            getWorld().addObject(new PBullet(), getX()+10, getY()-16);
        }
    }
    public void beam4(){ //just so that it can be a bit easier, shoots a bullet every frame
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new PBullet(), getX()-20, getY()-16);
        }
    }
    public void beam5(){ //just so that it can be a bit easier, shoots a bullet every frame
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new PBullet(), getX()+20, getY()-16);
        }
    }
}
