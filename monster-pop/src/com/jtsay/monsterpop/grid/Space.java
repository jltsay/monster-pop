package com.jtsay.monsterpop.grid;

import com.jtsay.monsterpop.gameobjects.GameObject;


public class Space {

	public final int gridIndex;
	private GameObject gameObject;
	
	public Space(int gridIndex) {
		this.gridIndex = gridIndex;
	}
	
	public boolean isEmpty() {
		return gameObject == null;
	}
	
	public GameObject getGridObject() {
		return gameObject;
	}
	
	public void update(float delta) {
		if (gameObject != null) {
			gameObject.update(delta);
		}
	}
	
	void setObject(GameObject obj) {
		gameObject = obj;
	}
	
	void removeObject() {
		this.gameObject = null;
		this.gameObject.setSpace(null);
	}
	
}
