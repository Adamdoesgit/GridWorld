//Adam Barszczak, Alex Bulanov

import info.gridworld.actor.Bug;

public class TriangleBug extends Bug{
	private int steps;
	private int sideLength;
	private int counter = 0;

	public TriangleBug(int baseSteps) {
		steps = 0;
		sideLength = baseSteps;
	}

	public void act() {
		if (counter == 0) {
			if (steps < sideLength && canMove()) {
				move();
				steps++;
			}
			else {
				counter = 1;
				steps = 0;
				turn();
				turn();
				turn();
			}
		}
		else if (counter == 1) {
			if (steps < sideLength/2 && canMove()) {
				move();
				steps++;
			}
			else {
				counter = 2;
				steps = 0;
				turn();
				turn();
			}
		}
		else if (counter == 2) {
			if (steps < sideLength/2 && canMove()) {
				move();
				steps++;
			}
			else {
				counter = 0;
				steps = 0;
				turn();
				turn();
				turn();
			}
		}
	}
}
