package com.jtsay.monsterpop.grid;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class GridObject {

	int index;
	float lifetimeSeconds;
	
	public GridObject(int index) {
		this.index = index;
	}
	
	public Vector2 getPosition() {
		// TODO: return a position vector given this object's grid index.
		return null;
	}
	
}
