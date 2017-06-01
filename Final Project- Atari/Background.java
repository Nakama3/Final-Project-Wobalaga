import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int E2x = 75;
   int E1x = 350;
   int Lives = 3;
   int numE;
   boolean R = false;
   boolean R1 = false;
   boolean R2 = false;
   boolean R3 = false;
    public Background(){    
        super(500, 710, 1); 
   }
   public void act(){
       Begin();
       getE();
    }
   public void Begin(){
       setBackground(new GreenfootImage("startscreen.png"));
       if(Greenfoot.isKeyDown("s")==true||R==true){
           Level1();
           R=true;
        }
    }
   public void Level1(){
       setBackground(new GreenfootImage("level1text.png"));
       numE=10;
       R=false;
       if(Greenfoot.isKeyDown("1")==true||R1==true){
           setBackground(new GreenfootImage("space.jpg"));
            for(int i= 0; i<4; i++){
                addObject(new Type1(), E2x, 200);
                E2x=E2x+75;
           }
            for(int i= 0; i<6; i++){
                addObject(new Type1(), E1x, 300);
                E1x=E1x-75;
           }
            addObject(new Player(), 250,670);   
            addObject(new Life1(), 50, 50);
            addObject(new Life2(), 100, 50);
            R1=true;
        }
       if(numE==0){
           Greenfoot.stop();
        }
    }
   public void Level2(){
       setBackground(new GreenfootImage("space.jpg"));
       numE=14;
       R=false;
       if(Greenfoot.isKeyDown("2")==true){    
            for(int i= 0; i<6; i++){
                addObject(new Type1(), E2x, 200);
                E2x=E2x+75;
           }
            for(int i= 0; i<4; i++){
                addObject(new Type1(), E1x, 300);
                E1x=E1x-75;
           }
           for(int i= 0; i<4; i++){
                addObject(new Type2(), E1x, 400);
                E1x=E1x-75;
           }
        }
    }
   public void Level3(){
       setBackground(new GreenfootImage("space.jpg"));
       if(Greenfoot.isKeyDown("3")==true){    
            for(int i= 0; i<6; i++){
                addObject(new Type1(), E2x, 200);
                E2x=E2x+75;
           }
            for(int i= 0; i<4; i++){
                addObject(new Type1(), E1x, 400);
                E1x=E1x-75;
           }
        }
    }
   public void Boss(){
       addObject(new Boss(), 250, 10);
    }
   public void minusE(){
       numE=numE-1;
    }
   public int getE(){
       return numE;
    }
   public void minusLives(){
       if(Lives==3){
           Lives--;
           removeObject(new Life2());
           respawn();
        }
       if(Lives==2){
           Lives--;
           removeObject(new Life1());
        }
    }
   public void respawn(){
           addObject(new Player(), 250, 670);
    }
}
