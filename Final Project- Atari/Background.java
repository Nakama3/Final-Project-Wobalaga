import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int row2x = 75;
   int row1x = 350;
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
       setBackground(new GreenfootImage("bulletplayer.png"));
       if(Greenfoot.isKeyDown("s")==true||R==true){
           Level1();
           R=true;
        }
    }
   public void Level1(){
       setBackground(new GreenfootImage("space.jpg"));
       numE=10;
       R=false;
       if(Greenfoot.isKeyDown("1")==true){    
            for(int i= 0; i<6; i++){
                addObject(new Type1(), row2x, 200);
                row2x=row2x+75;
           }
            for(int i= 0; i<4; i++){
                addObject(new Type1(), row1x, 300);
                row1x=row1x-75;
           }
            addObject(new Player(), 250,670);   
            addObject(new Life1(), 50, 50);
            addObject(new Life2(), 100, 50);
        }
       if(numE==0){
           Level2();
        }
    }
   public void Level2(){
       if(Greenfoot.isKeyDown("2")==true){    
            for(int i= 0; i<6; i++){
                addObject(new Type1(), row2x, 200);
                row2x=row2x+75;
           }
            for(int i= 0; i<4; i++){
                addObject(new Type1(), row1x, 300);
                row1x=row1x-75;
           }
           for(int i= 0; i<4; i++){
                addObject(new Type2(), row1x, 400);
                row1x=row1x-75;
           }
        }
    }
   public void Level3(){
       if(Greenfoot.isKeyDown("3")==true){    
            for(int i= 0; i<6; i++){
                addObject(new Type1(), row2x, 200);
                row2x=row2x+75;
           }
            for(int i= 0; i<4; i++){
                addObject(new Type1(), row1x, 400);
                row1x=row1x-75;
           }
        }
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
        }
       if(Lives==2){
           Lives--;
           removeObject(new Life1());
        }
    }
}
