import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Actor
{
    public int HP=1;
    public int timer=40;
    public int x = 1;
    public boolean pos=true;
    public void act() 
    {
        swim();
        Dcheck();
    }
    public void swimm(){  
            move(x);
            if(timer>0){
                timer--;
                if(timer==0){
                    x=-x;
                    swim();
                }
            }
    }
    public void shoot(){
        
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
