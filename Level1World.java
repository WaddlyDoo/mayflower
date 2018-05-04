/*
 * Max Goodrich
 * Period 3
 * 5/2/2018
 */

import mayflower.*;

public class Level1World extends World
{
    public Level1World()
    {
        setBackground("img/bg_space.png");
        RobotActor robot = new RobotActor();
        addObject(robot, 400, 300);
        addObject(new CookieActor(), 500, 300);
        ScoreLabel score = new ScoreLabel();
        addObject(score,0,0);
    }

    @Override
    public void act()
    {

    }
}