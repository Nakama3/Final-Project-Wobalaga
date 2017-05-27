import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    public int w = 500;
    public int h = 712;
    public boolean ready = false;
    public boolean a = false;
    public Enemy(int x, int y){
        setRotation(270);
        this.x = x;
        this.y = y;

    }
    public void act() 
    {
        spawn(x,y);
        shoot();
    }
    public void spawn(int x,int y){//(Starting x and y coordinate, and Spawn position(L or R)
            while(a=false){ //Move towards the spin point from spawn
               move(20);
               turnTowards(w/2,h/2);
               Greenfoot.delay(1);
               if(getX()==w/2&&getY()==h/2){
                   a=true;
                }
           }
           /*for(int i=0; i<5;i++){ //spin
               turn(50);
               Greenfoot.delay(2);
            }*/
            while(getX()!=x&&getY()!=y){ //move into formation postion assigned (x,y)
               move(20);
               turnTowards(x,y);
               Greenfoot.delay(1);
           }
           //if(getX()==x&&getY()==y){ //aim at the bootom of the screen
                move(0);
                turnTowards(x,0);
           //}
           ready=true;
    }
    public void shoot(){
        while(ready==true){
            for(int i=0; i<3; i++){
                
                Greenfoot.delay(20);
            }
            Greenfoot.delay(30);
        }
    }
}
