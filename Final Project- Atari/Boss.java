import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Actor
{
    public int HP=1;
    public int timer=40;
    public int x = 1;
    public boolean pos=true;
    BBullet z = new BBullet();
    public void act() 
    {
        swimp();
        swimn();
        Dcheck();
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
    public void shoot(Actor z){
        double m = Math.random()*15;
        int n = (int)m;
        if(n==5){
            for(int i=0; i<3; i++){
                getWorld().addObject(z, getX(), getY()+16);
            }
        }
    }
    public void HPd(){
        HP--;
    }
    public void Dcheck(){
        if(HP==0){
            getWorld().removeObject(this);
        }
    }
}
