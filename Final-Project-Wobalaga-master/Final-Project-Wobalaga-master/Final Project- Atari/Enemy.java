import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Enemy extends Actor
{
    public int x;
    public int y;
    public Enemy(){
        setRotation(315);
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        move(x,y);
    }
    int getx(){
        return x;
    }
    public void move(int x, int y){
       while(getX()!=100&&getY()!=150){
           move(10);
           turnTowards(100,150);
           Greenfoot.delay(10);
       }
       for(int i=0; i<5;i++){
           turn(50);
           Greenfoot.delay(2);
        }
        while(getX()!=50&&getY()!=50){
           move(10);
           turnTowards(x,y);
           Greenfoot.delay(10);
       }
       if(getX()==50&&getY()==50){
            move(0);
            turnTowards(50,0);
       }
    }
}
