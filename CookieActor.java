/*
 * Max Goodrich
 * Period 3
 * 5/2/2018
 */

import mayflower.*;

public class CookieActor extends Actor
{
    public CookieActor()
    {
        setImage("img/cookie.png");
    }

    @Override
    public void act()
    {
        if(isTouching(RobotActor.class))
            getWorld().removeObject(this);
    }
}
