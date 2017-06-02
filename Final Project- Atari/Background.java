import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int H = 710;
   int W = 500;
   int row;
   int Lives = 3;
   int Level = 0;
   int numE;
   int BHP;
   boolean hit;
   boolean S = false;
   boolean R = true;
   boolean R1 = false;
   boolean R2 = false;
   boolean R3 = false;
   boolean L;
   String x = new String();
    public Background(){    
        super(500, 710, 1);
   }
   public void act(){
       Echeck();
       Lcheck();
       Scheck();
    }
   public void minusE(){
       numE=numE-1;
    }
   public void minusLives(){
       hit=true; 
       if(hit=true){
           if(Lives==3&&hit==true){
               Lives--;
               removeObjects(getObjects(Life2.class));
               Prespawn();
               hit=false;
            }
           if(Lives==2&&hit==true){
               Lives--;
               removeObjects(getObjects(Life1.class));
               Prespawn();
               hit=false;
            }
           if(Lives==1&&hit==true){
               Lives--;
               GameOver();
               hit=false;
            }
        }
    }
   public void Echeck(){
       if(numE==0&&S==true){
           Level++;
           if(Level==1){
               numE=10;
               R1=true;
            }
           if(Level==2){
               numE=18;
               R2=true;
            }
           if(Level==3){
               numE=24;
            }
           if(Level==4){
               numE=1;
            }
        }
    }
   public void Scheck(){
       if(Level==0&&R==true){
           setBackground(new GreenfootImage("startscreen.png"));
           if(Greenfoot.isKeyDown("s")){
               R=false;
               addObject(new Player(), 250, 670);
               addObject(new Life1(), 50, 50);
               addObject(new Life2(), 100, 50);
               S=true;
            }
        }
    }
   public void Lcheck(){
       if(Level==1&&R1==true){
           setBackground(new GreenfootImage("level1text.png"));
           if(Greenfoot.isKeyDown("1")){
               Erespawn();
               R1=false;
            }
        }
       if(Level==2&&R2==true){
           setBackground(new GreenfootImage("level2text.png"));
           if(Greenfoot.isKeyDown("2")){
               Erespawn();
               R2=false;
            }
        }
       if(Level==3&&R3==true){
           setBackground(new GreenfootImage("level3text.png"));
           if(Greenfoot.isKeyDown("3")){
               Erespawn();
               R3=false;
            }
        }
    }           
   public void Prespawn(){
       removeObjects(getObjects(EBullet.class));
       removeObjects(getObjects(PBullet.class));
       addObject(new Player(), 250, 670);
    }
   public void Erespawn(){
       if(Level==1){
                   setBackground(new GreenfootImage("space.jpg"));
                   for(int i= 1; i<7; i++){
                       addObject(new Type1(), 75*i, 200);
                    }
                   for(int i= 1; i<5; i++){
                       addObject(new Type1(), (75*i)+75, 300);
                    }
            }
       if(Level==2){
                  setBackground(new GreenfootImage("space.jpg"));
                  for(int i= 1; i<9; i++){
                       addObject(new Type1(), 50*i, 200);
                   }
                  for(int i= 1; i<7; i++){
                       addObject(new Type1(), (50*i)+50, 300);
                   }
                  for(int i= 1; i<5; i++){
                       addObject(new Type2(), (75*i)+75, 100);
                   }
        }
       if(Level==3){
                   setBackground(new GreenfootImage("space.jpg"));
                   for(int i= 1; i<7; i++){
                       addObject(new Type1(), 75*i, 200);
                    }
                   for(int i= 1; i<5; i++){
                       addObject(new Type1(), (75*i)+75, 300);
                    }
                   for(int i= 1; i<5; i++){
                       addObject(new Type2(), (75*i)+75, 100);
                    }
        }
       if(Level==4){
                   setBackground(new GreenfootImage("space.jpg"));
                   addObject(new Boss(), 250, 50);
        }
    }
   public void minusBHP(){
       BHP=BHP-1;
    }
   public void GameOver(){
       
    }
}
