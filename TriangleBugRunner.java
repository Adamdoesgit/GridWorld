//Adam Barszczak, Alex Bulanov

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class TriangleBugRunner {

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		TriangleBug adam = new TriangleBug(6);
		adam.setColor(Color.ORANGE);
		adam.setDirection(Location.WEST);
		TriangleBug alex = new TriangleBug(4);
		alex.setDirection(Location.WEST);
		world.add(new Location(7, 4), adam);
		world.add(new Location(6, 5), alex);
		world.show();
	}

}
