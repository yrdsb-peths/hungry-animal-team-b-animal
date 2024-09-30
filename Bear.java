import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * 
 * 
 * @author 
 * @version
 */
public class Bear extends Actor implements Destructable
{
GreenfootSound eatingSound = new GreenfootSound("eating-sound-effect-36186.mp3");
GreenfootImage[] idleRight = new GreenfootImage[4];
GreenfootImage[] idleLeft = new GreenfootImage[4];

// Direction the elephant is facing
String facing = "right";
SimpleTimer animationTimer = new SimpleTimer();


public Bear()
{
    for(int i = 0; i < idleRight.length; i++)
    {
        idleRight[i] = new GreenfootImage("images/bear_idle/idle" + i + ".png");
        idleRight[i].scale(100, 100);
    }
    
    for(int i = 0; i < idleLeft.length; i++)
    {
        idleLeft[i] = new GreenfootImage("images/bear_idle/idle" + i + ".png");
        idleLeft[i].mirrorHorizontally();
        idleLeft[i].scale(100, 100);            
    }
    
    animationTimer.mark();
    
    // Initial bear image
    setImage(idleRight[0]);
}

/**
 * Animate the bear
 */
int imageIndex = 0;
public void animateBear()
{
    if(animationTimer.millisElapsed() < 100)
    {
        return;
    }
    animationTimer.mark();
    
    if(facing.equals("right"))
    {
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;
    }
    else
    {
        setImage(idleLeft[imageIndex]);
        imageIndex = (imageIndex + 1) % idleLeft.length;
    }
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
        
        // Remove apple if bear eats it
        destruct();
        
        // Animate the bear
        animateBear();
    }
    public void destruct() {
    if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            MyWorld world = (MyWorld)getWorld();
            world.createFood();
            world.increaseScore();
            eatingSound.play();
        }
    }
    
}
