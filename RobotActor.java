/*
 * Max Goodrich
 * Period 3
 * 5/2/2018
 */

import mayflower.*;

public class RobotActor extends Actor
{
    public RobotActor()
    {
        setImage("img/robot.png");
    }

    @Override
    public void act()
    {
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT))
            turn(5);
        if(Mayflower.isKeyDown(Keyboard.KEY_LEFT))
            turn(-5); 
        if(Mayflower.isKeyDown(Keyboard.KEY_UP))
            move(10);
        if(Mayflower.isKeyDown(Keyboard.KEY_DOWN))
            move(-10);
    }
}
