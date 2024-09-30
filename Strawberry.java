import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author 
 * @version
 */
public class Strawberry extends Food 
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Strawberry()
    {
        super(5);
    }
    
    public void act()
    {
        move();
        //Remove apple and input a game over label when food gets to the bottom.
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    public void move() {
        int x = getX();
        int y = getY() + 3;
        setLocation(x, y);        
    }
}
