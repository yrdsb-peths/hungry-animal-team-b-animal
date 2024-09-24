import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * @author Kholly Li
 * @version September 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,100,200);
        elephant.setLocation(494, 120);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,220,257);
        label.setLocation(297, 243);
        label.setLocation(305, 240);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,249,331);
        label2.setLocation(326, 319);
        label.setLocation(328,253);
        label2.setLocation(395,326);
        label.setLocation(300,261);
        label2.setLocation(190,318);
        label2.setLocation(300,319);
        elephant.setLocation(300,190);
    }
}
