import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Actor
{
    public int timer=10;
    public int Stimer=10;
    public boolean pos=true; //is the direction positive?
    public void act() 
    {
        if(((Background)getWorld()).getBHP()>300){
            swimp();
            swimn();
            beam();
            beam2();
            beam3();
        }
        if(((Background)getWorld()).getBHP()<300){
            set();
            beam4();
            beam2();
        }
    }
    public void swimp(){ //swim in the pos direction for 40 frames then go neg
        if(pos==true){    
            move(20);
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
            move(-20);
            if(timer<100){
                timer++;
                if(timer==100){
                    swimp();
                    pos=true;
                }
            }
        }
    }
    public void set(){
        setLocation(250,getY());
    }
    public void beam(){ //shoot a bullet         
            getWorld().addObject(new BBullet(), getX()-30, getY()+100);
    }
    public void beam2(){ //shoot a bullet         
            getWorld().addObject(new BBullet(), getX(), getY()+100);
    }
    public void beam3(){ //shoot a bullet         
            getWorld().addObject(new BBullet(), getX()+30, getY()+100);
    }
    public void beam4(){ //shoot a bullet         
            getWorld().addObject(new BBullet(), getX(), getY()+100);
    }
    public void ST(){
        double n = Math.random()*300;
        double q = Math.random()*100;
        int m = (int) n;
        int p = (int) q;
        if(Stimer>0){
            Stimer--;
        }
        if(Stimer==0){
            getWorld().addObject(new SType2(m+100, p+300),m+100, p+300);
            Stimer=10;
        }
    }
}
