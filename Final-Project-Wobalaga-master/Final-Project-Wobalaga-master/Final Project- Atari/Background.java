import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background extends World
{
    public Background()
    {    
        super(500, 713, 1); 
        addObject(new Player(), 250,690);
        addObject(new Type1(0,100),0,710);
        addObject(new Type2(200,100),0,710);
        addObject(new Type3(400,100),0,710);
   }
}
