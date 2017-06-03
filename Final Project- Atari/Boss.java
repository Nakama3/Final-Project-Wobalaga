import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Actor
{
    public int HP=1;
    public int timer=40;
    public boolean pos=true; //is the direction positive?
    BBullet z = new BBullet();
    public void act() 
    {
        swimp();
        swimn();
        Dcheck();
        shoot(z);
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
    public void shoot(Actor z){ //shoot a bullet
        
                getWorld().addObject(z, getX(), getY()+16);
            
        
    }
    public void HPd(){ // minus 1 HP
        HP--;
    }
    public void Dcheck(){ //when HP=0, remove
        if(HP==0){
            getWorld().removeObject(this);
        }
    }
}
