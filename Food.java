import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int value;
    
    public Food(int value)
    {
        this.value = value;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void move() {
        
    }

}
