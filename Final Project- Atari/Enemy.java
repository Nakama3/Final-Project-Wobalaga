import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    EBullet z = new EBullet();
    public int w = 500;
    public int h = 712;
    public int timer=50;
    public boolean ready = false;
    public boolean pos = true;
    public boolean a = false;
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
    }     
    public void shoot(Actor z){
        double m = Math.random()*15;
        int n = (int)m;
        if(n==5){
            for(int i=0; i<3; i++){
                getWorld().addObject(z, getX(), getY()+16);
            }
        }
    }
    public void swimp(){
        if(pos==true){    
            move(1);
            if(timer>0){
                timer--;
                if(timer==0){
                    swimn();
                    pos=false;
                }
            }
        }
    }
    public void swimn(){
        if(pos==false){    
            move(-1);
            if(timer<100){
                timer++;
                if(timer==100){
                    swimp();
                    pos=true;
                }
            }
        }
    }
}
