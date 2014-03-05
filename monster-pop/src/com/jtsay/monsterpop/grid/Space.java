package com.jtsay.monsterpop.grid;


public class Space {

	private GridObject gameObject;
	
	public boolean isEmpty() {
		return gameObject == null;
	}
	
	public GridObject getGameObject() {
		return gameObject;
	}
	
}
