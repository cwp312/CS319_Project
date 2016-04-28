package main.gom;

import main.CollisionGrid;
import main.EntityGrid;

public class Wolf extends Enemy {

	public void create(int xLoc, int yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		// TODO SpriteSheet support
		this.graphic = animate(dir, 0, 2);
		this.movementSpeed = 4;
	}

	public void destroy(EntityGrid entities) {
	}

	public void update(CollisionGrid collision, EntityGrid entities) {
		update(collision, entities, "AI", 0 , 2);	
	}


}
