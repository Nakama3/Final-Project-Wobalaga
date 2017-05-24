import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    public char D;
    public boolean ready =false;
    public Enemy(){
        setRotation(315);
        this.x = x;
        this.y = y;
        this.ready = ready;
    }
    public void act() 
    {
        move(x,y,D);
    }
    int getx(){
        return x;
    }
    public void move(int x, int y, char D){
       if(D=='L'){
        while(getX()!=100&&getY()!=150){
           move(10);
           turnTowards(100,150);
           Greenfoot.delay(10);
       }
       for(int i=0; i<5;i++){
           turn(50);
           Greenfoot.delay(2);
        }
        while(getX()!=x&&getY()!=y){
           move(10);
           turnTowards(x,y);
           Greenfoot.delay(10);
       }
       if(getX()==x&&getY()==y){
            move(0);
            turnTowards(x,0);
       }
       ready=true;
    }
    if(D=='R'){
        while(getX()!=400&&getY()!=150){
           move(10);
           turnTowards(400,150);
           Greenfoot.delay(10);
       }
       for(int i=0; i<5;i++){
           turn(50);
           Greenfoot.delay(2);
        }
        while(getX()!=x&&getY()!=y){
           move(10);
           turnTowards(x,y);
           Greenfoot.delay(10);
       }
       if(getX()==x&&getY()==y){
            move(0);
            turnTowards(x,0);
       }
       ready=true;
    }
    }
}
