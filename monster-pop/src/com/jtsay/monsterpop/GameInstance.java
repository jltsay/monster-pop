package com.jtsay.monsterpop;

import com.jtsay.monsterpop.grid.Grid;

public class GameInstance {

	public static GameInstance instance;
	Player player;
	Grid grid;
	int currentLevel;
	
	
	public static GameInstance getInstance() {
		if (instance == null) {
			instance = new GameInstance();
		}
		return instance;
	}
	
	public void update(float delta) {
		
	}
	
}
