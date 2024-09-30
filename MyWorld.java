import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This game has our hero, the Seal, to eat as much food that is falling from the sky.
 * If the food is not caught in time, the game ends.
 * 
 * @author Scarlett Ho
 * @version September 23, 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    Food food;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create the Seal object
        Bear bear = new Bear();
        addObject(bear, 300, 300);
        
        //Create a label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 40, 35);
        
        createFood();
    }
    
    /**
     * Increase the score
     */
    public void increaseAppleScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void increaseStrawberryScore()
    {
        score += 3;
        scoreLabel.setValue(score);
    }
    
    
    public void createFood()
    {
        int rand = Greenfoot.getRandomNumber(2);
        if(rand == 0)
        {
            food = new Apple();
        }
        else
        {
            food = new Strawberry();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    /**
     * End the game and have a 'Game Over' label.
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
