import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    EBullet z = new EBullet();
    public int w = 500;
    public int h = 712;
    public boolean ready = false;
    public boolean pos = false;
    public boolean a = false;
    
    public void act() 
    {
        //spawnMove(x,y);
        shoot(z);
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
        double m = Math.random()*10;
        int n = (int)m;
        if(n==5){
            for(int i=0; i<3; i++){
                getWorld().addObject(z, getX(), getY()+16);
            }
        }
    }
    public void swim(){
        int i=5;
        if(getX()!=getX()-i&&pos==false){
            move(-1);
            i--;
        }
        int j=5;
        if(getX()!=getX()+j&&pos==true){
            move(-1);
            i--;
        }
    }
}
