import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
   int H = 710;
   int W = 500;
   int row;
   int Lives = 3;
   int Level = 1;
   int numE;
   boolean hit;
   boolean R = false;
   boolean R1 = false;
   boolean R2 = false;
   boolean R3 = false;
    public Background(){    
        super(500, 710, 1);
       setBackground(new GreenfootImage("startscreen.png"));
       //if(Greenfoot.isKeyDown("s")==true||R==true){
           R=true;
           setBackground(new GreenfootImage("level1text.png"));
          // if(Greenfoot.isKeyDown("1")==true||R1==true){
               numE=10;
               setBackground(new GreenfootImage("space.jpg"));
               for(int i= 1; i<7; i++){
                   addObject(new Type1(),75*i , 200);

                }
               for(int i= 1; i<5; i++){
                    addObject(new Type1(),(75*i)+75, 300);
               }
               addObject(new Player(), 250,670);   
               addObject(new Life1(), 50, 50);
               addObject(new Life2(), 100, 50);
           // }
        //}
   }
   public void act(){
       getE();
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
   public void getE(){
       if(numE==0){
           Level++;
           Erespawn();
           if(Level==2){
               numE=18;
            }
           if(Level==3){
               numE=24;
            }
           if(Level==4){
               numE=1;
            }
        }
    }
   public void Prespawn(){
       removeObjects(getObjects(EBullet.class));
       removeObjects(getObjects(PBullet.class));
       addObject(new Player(), 250, 670);
    }
   public void Erespawn(){
       if(Level==2){
           setBackground(new GreenfootImage("level2text.png"));
           while(Greenfoot.isKeyDown("2")==false){
               setBackground(new GreenfootImage("level2text.png"));
            }
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
       if(Level==3){
           setBackground(new GreenfootImage("level3text.png"));
           if(Greenfoot.isKeyDown("3")==true||R2==true){
               R2=true;
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
        }
       if(Level==4){
           setBackground(new GreenfootImage("level3text.png"));
           if(Greenfoot.isKeyDown("b")==true||R2==true){
               R2=true;
               setBackground(new GreenfootImage("space.jpg"));
               addObject(new Boss(), 250, 50);
            }
        }
    }
   public void GameOver(){
       
    }
}
