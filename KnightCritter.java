//Adam Barczszak, Alex Bulanov

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KnightCritter extends Critter {
	
	public void processActors(ArrayList<Actor> actors) {
		
	}
	
	public void makeMove(Location loc) {
		setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
	}

	public Location selectMoveLocation(ArrayList<Location> locs) //This is where we define motion relative to current posX, posY
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }
}
