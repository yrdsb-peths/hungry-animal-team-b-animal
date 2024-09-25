import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * 
 * 
 * @author 
 * @version
 */
public class Bear extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];
    
    // Direction the elephant is facing
    String facing = "right";

    /**
     * Constructor - The code that gets run one time when object is created
     */
    public Bear()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/bear_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);            
        }
        
        setImage(idleRight[0]);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        
        //Remove apple if bear eats it
        eatFood();
    }
    /**
     * Eats the apple and then spawns a new apple.
     */
    public void eatFood()
    {
        if(isTouching(Strawberry.class))
        {
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld)getWorld();
            world.createStrawberry();
            world.increaseScore();
        }
    }
}
