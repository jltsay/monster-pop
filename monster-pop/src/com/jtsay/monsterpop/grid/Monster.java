package com.jtsay.monsterpop.grid;

public abstract class Monster extends GridObject {
	
	int currentHealth;
	int maxHealth;

	public Monster(int index) {
		super(index);
	}

}
