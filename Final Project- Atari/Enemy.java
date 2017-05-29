import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    EBullet z = new EBullet();
    public int w = 500;
    public int h = 712;
    public boolean ready = false;
    public boolean a = false;
    public Enemy(int x, int y){
        turnTowards(w/2,h/2);
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        spawnMove(x,y);
        
    }
    public void spawnMove(int x, int y){
       if(getX()!=w/2&&getY()!=h/2&&a==false){ 
            turnTowards(w/2,h/2);
            move(3);
        }
       if(getX()==w/2&&getY()==h/2){ 
            a=true;
        }
       if(getX()!=x&&getY()!=y&&a==true){ 
            turnTowards(x,y);
            move(3);
        }
       //move(0);
    }     
    public void shoot(Actor z){
        if(ready = true){
            for(int i=0; i<3; i++){
                getWorld().addObject(z, getX(), getY()+16);
                Greenfoot.delay(20);
            }
            Greenfoot.delay(30);
        }
    }
}
