import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Enemy extends Actor
{
    public int x;
    public int y;
    public int w = 500;
    public int h = 712;
    public int timer=50;
    public int btimer = 150;
    public boolean ready = false;
    public boolean pos = true;
    public boolean a = false;
    public void spawnMove(int x, int y){ // in case wanted enemies to move to spawn
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
    public void shoot(Actor z){ //shoot bullet in 1/15 of a chance every frame
       double m = Math.random()*30;
       int n = (int) m;
       if(btimer>0){
           btimer--;
        }
       if(btimer==0){
           if(n==1){
               for(int i=0; i<3; i++){
                   getWorld().addObject(new BType1(), getX(), getY()+16);
               }
               btimer=150;
            }
        }
    }
    public void swimp(){ //swim in the pos direction for 40 frames then go neg
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
    public void swimn(){ //swim in the neg direction for 40 frames then go pos
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
