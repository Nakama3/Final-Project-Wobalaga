import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public int timer;
    public boolean AR;
    public boolean R;
    public Type2(int x, int y){ //gets intial x y coordinates
        this.y = y;
        this.x = x;
    }
    public void act(){
        //Attack();
        //shoot(z);
        Spawncheck();
    }
    public void Attack(){ // dashes at player
        Actor player = (Actor)((Background)getWorld()).getObjects(Player.class).get(0);
        int playerx = player.getX();
        int playery = player.getY();
        if(AR==true){    
            if(timer>0){
                move(5);
                turnTowards(playerx, playery);
                timer--;
            }
            if(timer==0){
                move(5);
            }
        }
    }
    public void Spawncheck(){ //returns to spawn when it hits end of screen
        if(getY()>700){
            turnTowards(0,710);
            move(5);
            AR=false;
        }
        if(getX()==0){
            turnTowards(0,0);
            move(5);
        }
        if(getX()==0&&getY()==0){
            setLocation(x,y);
            R=true;
        }
        if(getX()!=x&&getY()!=y&&R==true){
            turnTowards(x,y);
            move(5);
        }
        if(getX()==x&&getY()==y){
            timer=20;
            R=false;
            AR=true;
        }
    }
}
