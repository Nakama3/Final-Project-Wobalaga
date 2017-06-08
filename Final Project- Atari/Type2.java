import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Type2 extends Enemy{
    public int x;
    public int y;
    public int timerW=30;
    public int timerA=5;
    public boolean A = true;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    BType2 z = new BType2();
    public Type2(int x, int y){ //gets intial x y coordinates
        this.y = y;
        this.x = x;
    }
    public void act(){
        Attack();
        shoot(z);
        Recall();
        //test();
    }
    public void Attack(){ // dashes at player
        Actor player = (Actor)((Background)getWorld()).getObjects(Player.class).get(0);
        int Px = player.getX();
        int Py = player.getY();
        if(A==true){
            a=true;
            b=true;
            c=true;
            if(timerW>0){
                timerW--;
            }
            if(timerW==0){
                if(timerA>0){
                    turnTowards(Px,Py);
                    move(5);
                    timerA--;
                }
                if(timerA==0){
                    move(5);
                }
            }
        }
        if(getY()>705||A==false){
                A=false;
                Recall();
        }
        if(getOneIntersectingObject(Player.class)!=null){
             removeTouching(Player.class);
             ((Background)getWorld()).minusLives();
           }
    }
    public void Recall(){ //returns to spawn when it hits end of screen
        if(A==false&&a==true&&getX()>5){
            turnTowards(0,getY());
            move(5);
        }
        if(a==true&&getX()<10){
            a=false;
        }
        if(a==false&&b==true&&getY()>5){
            turnTowards(getX(),0);
            move(5);
        }
        if(b==true&&getY()<10){
            b=false;
        }
        if(b==false&&c==true&&getX()!=x&&getY()!=y){
            turnTowards(x,y);
            move(5);
            timerW=30;
            timerA=5;
        }
        if(A==false&&c==true&&getX()==x&&getY()==y){
            setLocation(x,y);
            setRotation(0);
            A=true;
            c=false;
            Attack();
        }
    }
    public void test(){
        if(getX()!=x&&getY()!=y){
            turnTowards(x,y);
            move(5);
        }
        if(getX()==x&&getY()==y){
            setLocation(x,y);
            setRotation(0);
        }
    }
}
